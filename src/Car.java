public abstract class Car {
    static Beeper beeper;
    static Engin engin;
    static PassengerSeats passengerseats;
    static Wheel wheel;

    public Car(Beeper beeper, Engin engin, PassengerSeats passengerseats, Wheel wheel) {
        Car.beeper = beeper;
        Car.engin = engin;
        Car.passengerseats = passengerseats;
        Car.wheel = wheel;
    }

}