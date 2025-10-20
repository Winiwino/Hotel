// абстрактный, чтобы запретить создание объектов
public abstract class ProRoom extends Room {
    public ProRoom(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        super(number, maxPeople, pricePerNight, isReserved);
    }

    public ProRoom(int number, int pricePerNight) {
        super(number, pricePerNight);
    }
}
