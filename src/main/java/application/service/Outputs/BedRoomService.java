package application.service.Outputs;

import application.domain.BedRoom;

import java.util.List;

public interface BedRoomService {

    BedRoom createBedRoom(BedRoom bedRoom);
    BedRoom updateBedRoom(BedRoom bedRoom);
    BedRoom getBedRoomById(int id);
    List<BedRoom> getAllBedRooms();
    void deleteBedRoomById(int id);
}
