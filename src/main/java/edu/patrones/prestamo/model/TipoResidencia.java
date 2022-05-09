package edu.patrones.prestamo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TIPO_RESIDENCIA")
public class TipoResidencia {

    @Id
    @Column(name = "id")
    String id;

    @Column(name = "descripcion")
    String descripcion;
}
