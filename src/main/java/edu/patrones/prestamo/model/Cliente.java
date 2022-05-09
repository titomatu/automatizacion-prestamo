package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

    @Id
    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Id
    @Column(name = "numero_documento")
    private Long numeroDocumento;

    @Column(name = "fecha_expedicion")
    private Date fechaExpedicion;

    @Column(name = "nombre_1")
    private String nombre1;

    @Column(name = "nombre_2")
    private String nombre2;

    @Column(name = "apellido_1")
    private String apellido1;

    @Column(name = "apellido_2")
    private String apellido2;


    private Long celular;
    private String correoElectronico;
    private Integer tipoContrato;
    private Double salarioMensual;
    private Integer nivelAcademico;
    private Integer ocupacion;
    private Date fechaNacimiento;
    private Double totalActivos;
    private Double totalPasivos;
    private Integer autorizaCentrales;
}
