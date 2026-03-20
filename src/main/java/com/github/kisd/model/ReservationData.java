package com.github.kisd.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter@Setter
public class ReservationData {
    private String id;
    private String userId;
    private int roomNumber;
    private LocalDateTime date;

    public ReservationData() {}

    public ReservationData(Reservation res) {
        this.id = res.getReservationId();
        this.userId = res.getUser().getUserId();
        this.roomNumber = res.getRoom().getRoomNo();
        this.date = res.getCreatedAt();
    }

}
