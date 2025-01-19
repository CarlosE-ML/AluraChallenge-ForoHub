package com.forohub.dominio.validaciones;

import com.forohub.dominio.topico.DatosGeneralTopico;
import com.forohub.infra.errores.ValidacionException;
import com.forohub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacionUnicoNombreDelTopico implements ValidadorNombre{

    @Autowired
    TopicoRepository repository;

    @Override
    public void validar(DatosGeneralTopico datosGeneralTopico) {
        if (repository.findByTitulo(datosGeneralTopico.titulo()).isPresent()){
            throw new ValidacionException("el topico ya existe");
        }
    }

}
