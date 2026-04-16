package application.domain;

import application.domain.enums.BedRoomStatus;
import application.domain.enums.BedRoomType;

public class Service {

    private int id;
    private BedRoomStatus bedRoomStatus;
    private String description;
    private double prince;
    private BedRoomType  bedRoomType;


    public Service() {

    };

    public Service(int id, BedRoomStatus bedRoomStatus, String description, double prince, BedRoomType bedRoomType) {
        this.id = id;
        this.bedRoomStatus = bedRoomStatus;
        this.description = description;
        this.prince = prince;
        this.bedRoomType = bedRoomType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BedRoomStatus getBedRoomStatus() {
        return bedRoomStatus;
    }

    public void setBedRoomStatus(BedRoomStatus bedRoomStatus) {
        this.bedRoomStatus = bedRoomStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public BedRoomType getBedRoomType() {
        return bedRoomType;
    }

    public void setBedRoomType(BedRoomType bedRoomType) {
        this.bedRoomType = bedRoomType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", bedRoomStatus=" + bedRoomStatus +
                ", description='" + description + '\'' +
                ", prince=" + prince +
                ", bedRoomType=" + bedRoomType +
                '}';
    }
}
