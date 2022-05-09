package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.*;
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

    @Column(name = "numero_celular")
    private Long celular;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "salario_mensual")
    private Double salarioMensual;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "total_activos")
    private Double totalActivos;

    @Column(name = "total_pasivos")
    private Double totalPasivos;

    @Column(name = "autoriza_consulta")
    private String autorizaCentrales;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "tipo_residencia_id")
    private TipoResidencia tipoResidencia;

    @ManyToOne
    @JoinColumn(name = "actividad_economica_id")
    private ActividadEconomica actividadEconomica;

    @ManyToOne
    @JoinColumn(name = "tipo_contrato_id")
    private TipoContrato tipoContrato;

    @ManyToOne
    @JoinColumn(name = "nivel_estudios_id")
    private NivelEstudios nivelEstudios;

    @ManyToOne
    @JoinColumn(name = "tipo_inmueble_id")
    private TipoInmueble tipoInmueble;

    @ManyToOne
    @JoinColumn(name = "estado_civil_id")
    private EstadoCivil estadoCivil;
}
