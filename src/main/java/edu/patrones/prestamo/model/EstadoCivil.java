package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "ESTADO_CIVIL")
public class EstadoCivil {

    @Id
    @Column(name = "id")
    String id;

    @Column(name = "descripcion")
    String descripcion;
}
