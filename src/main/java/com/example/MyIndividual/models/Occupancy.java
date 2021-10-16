package com.example.MyIndividual.models;


import javax.persistence.*;

@Entity
@Table(name = "occupancy")
public class Occupancy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean room_occupancy;
    @OneToOne(optional = false, mappedBy = "occupancy")
    private Room room;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getRoom_occupancy() {
        return room_occupancy;
    }

    public void setRoom_occupancy(Boolean room_occupancy) {
        this.room_occupancy = room_occupancy;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
