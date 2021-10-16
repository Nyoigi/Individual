package com.example.MyIndividual.models;

import javax.persistence.*;

@Entity
@Table(name = "personal_area")
public class Personal_area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String email;
    private String password;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "quest_details_id")
    private Guest_details guest_details;

}
