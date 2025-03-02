package com.forohub.controller;


import com.forohub.dominio.topico.DatosActualizarTopico;
import com.forohub.dominio.topico.DatosGeneralTopico;
import com.forohub.dominio.topico.DatosRespuestaTopico;
import com.forohub.dominio.topico.Topico;
import com.forohub.dominio.validaciones.ValidacionUnicoNombreDelTopico;
import com.forohub.infra.errores.ValidacionException;
import com.forohub.repository.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topico")
public class TopicoController {


    @Autowired
    TopicoRepository topicoRepository;

    @Autowired
    private ValidacionUnicoNombreDelTopico validacionUnicoNombreDelTopico;


    @PostMapping
    @Transactional
    public ResponseEntity<Topico> registrarTopico (@RequestBody @Valid DatosGeneralTopico datosGeneralTopico){
        validacionUnicoNombreDelTopico.validar(datosGeneralTopico);
        Topico guardarTopico = topicoRepository.save(new Topico(datosGeneralTopico));
        return ResponseEntity.ok(guardarTopico);
    }


    @GetMapping
    public ResponseEntity<Page<DatosRespuestaTopico>> llamarDatos(@PageableDefault(size = 10) Pageable pageable) {
        Page<Topico> topicos = topicoRepository.findAll(pageable);
        Page<DatosRespuestaTopico> datosRespuesta = topicos.map(DatosRespuestaTopico::new);
        return ResponseEntity.ok(datosRespuesta);
    }


    @PutMapping
    @Transactional
    public void actualiza(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico){
        var topicoActualizado = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topicoActualizado.informacionActualizada(datosActualizarTopico);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void eliminar(@PathVariable Long id) {
        if (!topicoRepository.existsById(id)) {
            throw new ValidacionException("Paciente con ID " + id + " no encontrado");
        }
        topicoRepository.deleteById(id);
    }

}