package application.service;

import application.repository.GuestRepository;

public class GuestServiceImpl {

    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository){

        this.guestRepository= guestRepository;

    }
}
