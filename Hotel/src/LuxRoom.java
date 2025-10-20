public class LuxRoom extends ProRoom {
    public LuxRoom(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        super(number, maxPeople, pricePerNight, isReserved);
    }

    public LuxRoom(int number, int pricePerNight) {
        super(number, pricePerNight);
    }
}