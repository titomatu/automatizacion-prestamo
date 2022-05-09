package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ACTIVIDAD_ECONOMICA")
public class ActividadEconomica {

    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "descripcion")
    String descripcion;
}
