package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner extends Person{

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Plane> planes;

    public Owner(){};

    public Owner(String firstname, String lastname, String phoneNumber, LocalDateTime birthDate, Address address, List<Plane> planes) {
        super(firstname, lastname, phoneNumber, birthDate, address);
        this.planes = planes;
    }
}
