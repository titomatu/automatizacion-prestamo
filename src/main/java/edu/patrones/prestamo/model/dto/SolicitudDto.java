package edu.patrones.prestamo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudDto {
    ClienteDto clienteDto;

    private String numeroSolicitud;
    private Double valorSolicitado;
    private Double valorAprobado;
    private String mensaje;
}
