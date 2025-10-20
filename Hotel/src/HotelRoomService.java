public class HotelRoomService<T extends Room> implements RoomService<T> {

    @Override
    public void clean(T room) { 
        System.out.println("Комната " + room.getNumber() + " очищена.");
    }

    @Override
    public void reserve(T room) {
        if (room.isReserved())
            throw new RoomAlreadyReservedException("Комната " + room.getNumber() + " уже забронирована");
        room.setReserved(true);
        System.out.println("Комната " + room.getNumber() + " успешно забронирована.");
    }

    @Override
    public void free(T room) {
        if (!room.isReserved()) {
            System.out.println("Комната " + room.getNumber() + " уже свободна");
        } else {
            room.setReserved(false);
            System.out.println("Комната " + room.getNumber() + " теперь свободна.");
        }
    }
}
