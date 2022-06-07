public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        EnginV12 enginV12 = new EnginV12();
        new Lambo(horn, enginV12);

        {
            System.out.println(Lambo.beeper.makeSound());

        }
        {
            System.out.println(Lambo.engin.getSpeed());
        }

        BusSeats busseats = new BusSeats();
        BusWheel buswheel = new BusWheel();
        new Bus(busseats, buswheel);
        {
            System.out.println(Bus.passengerseats.Seats());
        }

        {
            System.out.println(Bus.wheel.Drive());
        }

        MiniBusSeats minibusseats = new MiniBusSeats();
        MiniBusWheel minibuswheel = new MiniBusWheel();
        new Minibus(minibusseats, minibuswheel);

        {
            System.out.println(Minibus.passengerseats.Seats());
        }
        {
            System.out.println(Minibus.wheel.Drive());
        }
    }


}




