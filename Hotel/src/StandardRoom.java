public class StandardRoom extends ProRoom {
    public StandardRoom(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        super(number, maxPeople, pricePerNight, isReserved);
    }

    public StandardRoom(int number, int pricePerNight) {
        super(number, pricePerNight);
    }
}