package org.example.aeroport_jakarta.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Table(
        uniqueConstraints = {
                @UniqueConstraint(name="nomPrenomUnique",
                columnNames = {
                        "firstname",
                        "lastname"
                })
        }
)
@Entity
public class Person extends BaseEntity<Long>{

    private String firstname;

    private String lastname;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Embedded
    private Address address;

    public Person(){
        super();
    }
}
