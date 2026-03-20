package com.github.kisd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    private String reservationId;
    private User user;
    private Room room;
    private LocalDate stayDate;
    private LocalDateTime createdAt;

    public Reservation(String reservationId, User user, Room room, LocalDateTime createdAt) {
        this.reservationId = reservationId;
        this.user = user;
        this.room = room;
        this.createdAt = (createdAt != null) ? createdAt : LocalDateTime.now();
    }

    //예약정보
    public String getInfo() {
        String formattedPrice = String.format("%, d", room.getRoomPrice());
        String formattedDate = createdAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return String.format(
                "------------------------------------\n" +
                "1. 예약자 성함 : %s\n" +
                "2. 예약하신 객실 : %d호 (%s)\n" +
                "3. 예약 번호   : %s\n" +
                "4. 예약하신 시간 : %s\n" +
                "5. 결제하실 금액 : %s원\n" +
                "------------------------------------",
                user.getName(),
                room.getRoomNo(),
                room.getRoomType(),
                reservationId,
                createdAt,
                formattedPrice
        );
    }
}
