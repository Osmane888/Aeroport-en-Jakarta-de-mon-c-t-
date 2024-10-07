package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Plane extends BaseEntity<String>{

    @Column
    private int nb_flights;

    @OneToOne
    private Owner owner;

    @OneToOne
    private PlaneType planeType;
}
