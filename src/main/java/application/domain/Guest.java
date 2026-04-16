package application.domain;

import application.domain.enums.GuestType;
import application.domain.enums.PersonState;

public class Guest  extends Person{

    private String placeOfOrigin;
    private GuestType guestType;

    public Guest() {
        super();
    }


    public Guest(String placeOfOrigin, GuestType guestType) {
        this.placeOfOrigin = placeOfOrigin;
        this.guestType = guestType;
    }

    public Guest(int id, String name, String lastName, String email, String password, PersonState state, String placeOfOrigin, GuestType guestType) {
        super(id, name, lastName, email, password, state);
        this.placeOfOrigin = placeOfOrigin;
        this.guestType = guestType;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public GuestType getGuestType() {
        return guestType;
    }

    public void setGuestType(GuestType guestType) {
        this.guestType = guestType;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "placeOfOrigin='" + placeOfOrigin + '\'' +
                ", guestType=" + guestType +
                '}';
    }
}
