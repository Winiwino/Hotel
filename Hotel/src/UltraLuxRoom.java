public class UltraLuxRoom extends LuxRoom {
    public UltraLuxRoom(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        super(number, maxPeople, pricePerNight, isReserved);
    }

    public UltraLuxRoom(int number, int pricePerNight) {
        super(number, pricePerNight);
    }
}
