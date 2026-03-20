package com.github.kisd.model;

import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;

@Getter @Setter
public class Room {
    private int roomNo;
    private RoomType roomType;
    private long roomPrice;
    private RoomStatus roomStatus;

    public Room(int roomNo, RoomType roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomPrice = roomType.getDefaultPrice();
        this.roomStatus = RoomStatus.AVAILABLE;
    }

    public String getRoomSummary() {
        DecimalFormat df = new DecimalFormat("###,###");
        return String.format("%d:%s(%s원)",this.roomNo,this.roomType,df.format(this.roomPrice));
    }



//    public boolean isBookingAvailable() {
//        return this.roomStatus == RoomStatus.AVAILABLE;
//    }

}


