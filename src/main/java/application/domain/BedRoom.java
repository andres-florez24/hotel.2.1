package application.domain;

import application.domain.enums.BedRoomStatus;
import application.domain.enums.BedRoomType;

public class BedRoom {
    private int rooId;
    private String room;
    private BedRoomType bedRoomType;
    private double price;
    private BedRoomStatus bedRoomStatus;

    public BedRoom (){

    }

    public BedRoom(int rooId, String room, BedRoomType bedRoomType, double price, BedRoomStatus bedRoomStatus) {
        this.rooId = rooId;
        this.room = room;
        this.bedRoomType = bedRoomType;
        this.price = price;
        this.bedRoomStatus = bedRoomStatus;
    }


    public int getRooId() {
        return rooId;
    }

    public void setRooId(int rooId) {
        this.rooId = rooId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public BedRoomType getBedRoomType() {
        return bedRoomType;
    }

    public void setBedRoomType(BedRoomType bedRoomType) {
        this.bedRoomType = bedRoomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BedRoomStatus getBedRoomStatus() {
        return bedRoomStatus;
    }

    public void setBedRoomStatus(BedRoomStatus bedRoomStatus) {
        this.bedRoomStatus = bedRoomStatus;
    }

    @Override
    public String toString() {
        return "BedRoom{" +
                "rooId=" + rooId +
                ", room='" + room + '\'' +
                ", bedRoomType=" + bedRoomType +
                ", price=" + price +
                ", bedRoomStatus=" + bedRoomStatus +
                '}';
    }

}
