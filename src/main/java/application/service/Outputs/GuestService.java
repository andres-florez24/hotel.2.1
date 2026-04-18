package application.service.Outputs;

import application.domain.Guest;

import java.util.Optional;

public interface GuestService {


    public Guest createGuest(Guest guest);

    public Guest updateGuest(Guest guest);

    public Optional<Guest> getGuestById(int id);

}
