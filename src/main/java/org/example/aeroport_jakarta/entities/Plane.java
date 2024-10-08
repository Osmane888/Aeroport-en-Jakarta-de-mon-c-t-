package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class Plane extends BaseEntity<String>{

    @Column
    private int nb_flights;

    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;

    @ManyToOne(fetch = FetchType.EAGER)
    private PlaneType planeType;
}
