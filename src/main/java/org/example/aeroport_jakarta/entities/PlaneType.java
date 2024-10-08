package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PlaneType extends BaseEntity{

    @OneToMany(mappedBy = "planeType",fetch = FetchType.LAZY)
    private List<Plane> planes;

    public PlaneType(){};

    public List<Plane> getPlanes() {
        return new ArrayList<>(this.planes);
    }
}
