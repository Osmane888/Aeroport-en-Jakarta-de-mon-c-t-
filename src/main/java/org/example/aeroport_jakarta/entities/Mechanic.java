package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Mechanic extends Person{

    @ManyToMany(targetEntity = Plane.class, fetch = FetchType.LAZY, mappedBy = "id")
    private Set<PlaneType> habilitations;

    public Mechanic() {
        this.habilitations = new HashSet<>();
    }

    public Mechanic(String firstname, String lastname, String phoneNumber, LocalDateTime birthDate, Address address) {
        super(firstname, lastname, phoneNumber, birthDate, address);
        this.habilitations = new HashSet<>();
    }

    public void addHabilitation(PlaneType planeType){
        this.habilitations.add(planeType);
    }

    public void removeHabilitation(PlaneType planeType){
        this.habilitations.remove(planeType);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "habilitations=" + habilitations +
                '}';
    }
}
