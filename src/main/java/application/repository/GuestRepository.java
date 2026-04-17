package application.repository;

import application.domain.Guest;
import application.domain.enums.GuestType;
import application.domain.enums.PersonState;
import application.service.ports.GuestRepositoryPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GuestRepository implements GuestRepositoryPort {

    private List<Guest> guests = new ArrayList<>(
            Arrays.asList(
                    new Guest(1, "Maria", "Gomez", "mg@mail.com", "123456", PersonState.ACTIVE, "Colombia", GuestType.NEW),
                    new Guest(2, "Juan", "Perez", "juan@mail.com", "12345678", PersonState.ACTIVE, "Mexico", GuestType.VIP)
            )
    );


    @Override
    public Guest saveGuest(Guest guest) {
        guests.add(guest);
        return guest;
    }

    @Override
    public Guest updateGuest(int id, Guest guest) {
        for (int i = 0; i < guests.size(); i++) {
            if (guests.get(i).getId() == id) {
                guest.setId(id);
                guests.set(i, guest);
                return guest;
            }
        }
        throw new RuntimeException("Guest with id " + id + " not found");
    }

    @Override
    public Optional<Guest> findGuestById(int id) {
        return guests.stream()
                .filter(g -> g.getId() == id)
                .findFirst();
    }

    @Override
    public List<Guest> findAllGuests() {
        return new ArrayList<>(guests);
    }

    @Override
    public void deleteGuestById(int id) {
        boolean removed = guests.removeIf(g -> g.getId() == id);
        if (!removed) throw new RuntimeException("Guest with id " + id + " not found");
    }




}
