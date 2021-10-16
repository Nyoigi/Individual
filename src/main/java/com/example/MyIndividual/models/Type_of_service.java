package com.example.MyIndividual.models;

import javax.persistence.*;

@Entity
@Table(name = "type_of_service")
public class Type_of_service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service_type;

}
