package org.example.aeroport_jakarta.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
public class Pilot extends Person{

    @Column(unique = true, nullable = false)
    private String plateNumber;

    public Pilot(){};

    public Pilot(String firstname, String lastname, String phoneNumber, LocalDateTime birthday, Address address, String plateNumber){
        super(firstname, lastname, phoneNumber ,birthday, address);
        this.plateNumber = plateNumber;
    }

    //region GET/SET
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    //endregion

    @Override
    public String toString() {
        return "Pilot{" +
                "plateNumber='" + plateNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pilot pilot = (Pilot) o;
        return Objects.equals(plateNumber, pilot.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plateNumber);
    }
}
