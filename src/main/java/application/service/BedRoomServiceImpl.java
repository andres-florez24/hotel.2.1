package application.service;

import application.domain.BedRoom;
import application.service.Outputs.BedRoomService;
import application.service.ports.BedRoomRepositoryPort;
import application.util.FormValidationUtil;

import java.util.List;

public class BedRoomServiceImpl implements BedRoomService {


    private final BedRoomRepositoryPort bedRoomRepositoryPort  ;


    public BedRoomServiceImpl(BedRoomRepositoryPort bedRoomRepositoryPort) {
        this.bedRoomRepositoryPort = bedRoomRepositoryPort;
    }


    @Override
    public BedRoom createBedRoom(BedRoom bedRoom) {


        String prompt = "Ingrese el numero de la habitacion";
        bedRoom.setRoomId(FormValidationUtil.readInt(prompt));

        bedRoomRepositoryPort.saveBedRoom(bedRoom);

        return bedRoom;
    }

    @Override
    public BedRoom updateBedRoom(BedRoom bedRoom) {
        return null;
    }

    @Override
    public BedRoom getBedRoomById(int id) {
        return bedRoomRepositoryPort.findBedRoomById(id)
                .orElseThrow(() -> new RuntimeException("Habitación no encontrada con ID: " + id));
    }

    @Override
    public List<BedRoom> getAllBedRooms() {
        return List.of();
    }

    @Override
    public void deleteBedRoomById(int id) {

    }


}
