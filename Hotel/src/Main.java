public class Main {
    public static void main(String[] args) {
        RoomService<Room> service = new HotelRoomService();

        EconomyRoom economy = new EconomyRoom(111, 1500);
        StandardRoom standard = new StandardRoom(222, 2, 2500, false);

        System.out.println();

        System.out.println(economy);
        System.out.println(standard);

        System.out.println();

        service.reserve(standard);

        System.out.println();

        service.clean(economy);
        service.reserve(economy);
        service.free(economy);
        service.free(economy); // повторное освобождение комнаты
        service.reserve(economy); // попробуем снова зарезервировать

        System.out.println();
        try {
            service.reserve(economy); // Повторное бронирование
        } catch (RoomAlreadyReservedException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}