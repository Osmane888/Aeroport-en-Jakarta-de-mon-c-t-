package org.example.aeroport_jakarta.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;


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
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "Personnes")
public class Person extends BaseEntity<Long>{

    @Column(nullable = false, length = 123)
    private String firstname;

    @Column(nullable = false, length = 80)
    private String lastname;

    @Column(nullable = true, length = 15)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    private LocalDateTime birthDate;

    @Embedded
    private Address address;

    public Person(){
        super();
    }

    public Person(String firstname, String lastname, String phoneNumber, LocalDateTime birthDate, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //region GET/SET

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //endregion


    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(birthDate, person.birthDate) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstname, lastname, phoneNumber, birthDate, address);
    }
}
