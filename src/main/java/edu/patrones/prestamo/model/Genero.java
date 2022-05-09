package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Genero")
public class Genero {

    @Id
    @Column(name = "id")
    String id;

    @Column(name = "descripcion")
    String descripcion;

}
