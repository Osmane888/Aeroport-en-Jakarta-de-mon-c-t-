package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class PlaneType extends BaseEntity<Long>{

    @OneToMany(mappedBy = "planeType",fetch = FetchType.LAZY)
    private List<Plane> planes;

    public PlaneType(){};

    public List<Plane> getPlanes() {
        return new ArrayList<>(this.planes);
    }
}