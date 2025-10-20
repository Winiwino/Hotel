// делаем обстрактный, чтобы нельзя было создавать объекты от этого класса
public abstract class Room {

    private int number;
    private int maxPeople;
    private int pricePerNight;
    private boolean isReserved;


    public Room(int number, int maxPeople, int pricePerNight, boolean isReserved) {
        this.number = number;
        this.maxPeople = maxPeople;
        this.pricePerNight = pricePerNight;
        this.isReserved = isReserved;
    }

    // Перегруженный конструктор для генирации случайного количество людей
    public Room(int number, int pricePerNight) {
        this.number = number;
        this.maxPeople = (int)(Math.random() * 4) + 1;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " №" + getNumber() +
                " (мест: " + getMaxPeople() +
                ", цена: " + getPricePerNight() +
                ", забронирована: " + isReserved() + ")";
    }
}