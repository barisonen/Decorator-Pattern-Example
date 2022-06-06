public class demo {

    public static void main(String[] args) {

        Vehicle car = new Car();

        Vehicle blackCar = new BlackVehicleDecorator(new Car());

        System.out.println("Vehicle without decorator:");
        car.info();

        System.out.println("Vehicle with decorator:");
        blackCar.info();

    }
}
