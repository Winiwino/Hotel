public class EconomyRoom extends Room {
    public EconomyRoom(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        super(number, maxPeople, pricePerNight, isReserved);
    }
    
    public EconomyRoom(int number, int pricePerNight) {
        super(number, pricePerNight);
    }
}
