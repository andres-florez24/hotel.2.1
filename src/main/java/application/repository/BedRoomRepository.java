package application.repository;

import application.domain.BedRoom;
import application.domain.enums.BedRoomStatus;
import application.domain.enums.BedRoomType;

import application.service.ports.BedRoomRepositoryPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BedRoomRepository  implements BedRoomRepositoryPort {


    private List<BedRoom> bedRooms = new ArrayList<>(
            Arrays.asList(
                    new BedRoom(1, "201", BedRoomType.INDIVIDUAL, 120000, BedRoomStatus.AVAILABLE),
                    new BedRoom(2, "202", BedRoomType.DOUBLE, 180000, BedRoomStatus.AVAILABLE),
                    new BedRoom(3, "203", BedRoomType.SUITE, 240000, BedRoomStatus.OCCUPIED)
            )
    );


    @Override
    public BedRoom saveBedRoom(BedRoom bedRoom) {
        bedRooms.add(bedRoom);
        return bedRoom;
    }

    @Override
    public BedRoom updateBedRoom(int id, BedRoom bedRoom) {
        for (int i = 0; i < bedRooms.size(); i++) {
            if (bedRooms.get(i).getRooId() == id) {
                bedRoom.setRooId(id);
                bedRooms.set(i, bedRoom);
                return bedRoom;
            }
        }
        throw new RuntimeException("BedRoom with id " + id + " not found");
    }

    @Override
    public Optional<BedRoom> findBedRoomById(int id) {
        return bedRooms.stream()
                .filter(b -> b.getRooId() == id)
                .findFirst();
    }

    @Override
    public List<BedRoom> findAllBedRooms() {
        return new ArrayList<>(bedRooms);
    }

    @Override
    public void deleteBedRoomById(int id) {
        boolean removed = bedRooms.removeIf(b -> b.getRooId() == id);
        if (!removed) throw new RuntimeException("BedRoom with id " + id + " not found");
    }


}
