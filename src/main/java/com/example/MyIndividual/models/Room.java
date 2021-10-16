package com.example.MyIndividual.models;


import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number_of_rooms;
    private Integer number_of_seats;
    private String name_room;
    private Integer price;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Photo_room photo_room;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "occupancy_id")
    private Occupancy occupancy;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "room_class_id")
    private Room_class room_class;
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "booking_id")
    private Booking_Time booking_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(Integer number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public Integer getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(Integer number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Photo_room getPhoto_room() {
        return photo_room;
    }

    public void setPhoto_room(Photo_room photo_room) {
        this.photo_room = photo_room;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public Room_class getRoom_class() {
        return room_class;
    }

    public void setRoom_class(Room_class room_class) {
        this.room_class = room_class;
    }

    public Booking_Time getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(Booking_Time booking_time) {
        this.booking_time = booking_time;
    }

    public Room(Integer number_of_rooms, Integer number_of_seats, String name_room, Integer price, Photo_room photo_room, Occupancy occupancy, Room_class room_class, Booking_Time booking_time) {
        this.number_of_rooms = number_of_rooms;
        this.number_of_seats = number_of_seats;
        this.name_room = name_room;
        this.price = price;
        this.photo_room = photo_room;
        this.occupancy = occupancy;
        this.room_class = room_class;
        this.booking_time = booking_time;
    }

    public Room() {
    }
}
