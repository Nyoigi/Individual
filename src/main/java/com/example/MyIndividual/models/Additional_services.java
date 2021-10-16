package com.example.MyIndividual.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "additional_services")
public class Additional_services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service_name;
    private Integer price;
    private Date date_service;
   
}
