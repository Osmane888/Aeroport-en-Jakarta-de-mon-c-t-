package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner extends Person{

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Plane> planes;

    public Owner(){};

    public List<Plane> getPlanes() {
        return new ArrayList<>(this.planes);
    }
}
