package com.example.MyIndividual.models;

import javax.persistence.*;

@Entity
@Table(name = "guest_details")
public class Guest_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String surname;
    private Integer passport_series;
    private Integer passport_number;
    private Integer number_phone;
    @OneToOne(optional = false, mappedBy = "guest_details")
    private Personal_area personal_area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPassport_series() {
        return passport_series;
    }

    public void setPassport_series(Integer passport_series) {
        this.passport_series = passport_series;
    }

    public Integer getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(Integer passport_number) {
        this.passport_number = passport_number;
    }

    public Integer getNumber_phone() {
        return number_phone;
    }

    public void setNumber_phone(Integer number_phone) {
        this.number_phone = number_phone;
    }

    public Personal_area getPersonal_area() {
        return personal_area;
    }

    public void setPersonal_area(Personal_area personal_area) {
        this.personal_area = personal_area;
    }
}
