package com.forohub.dominio.topico;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Estado estadoActualizado
) {
}
