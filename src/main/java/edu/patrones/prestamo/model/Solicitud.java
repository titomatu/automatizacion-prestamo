package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "SOLICITUD_PRESTAMO")
public class Solicitud {

    @Id
    @Column(name = "numero_solicitud")
    private String numeroSolicitud;

    @Column(name = "valor_solicitado")
    private Double valorSolicitado;

    @Column(name = "valor_aprobado")
    private Double valorAprobado;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="cliente_tipo_documento", referencedColumnName="tipo_documento"),
            @JoinColumn(name="cliente_numero_documento", referencedColumnName="numero_documento")
    })
    private Cliente cliente;
}
