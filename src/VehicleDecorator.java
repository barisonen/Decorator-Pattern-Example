public abstract class VehicleDecorator implements Vehicle {

    protected Vehicle decoratedVehicle;

    public VehicleDecorator(Vehicle decoratedVehicle) {
        this.decoratedVehicle = decoratedVehicle;
    }

    public void info() {
        decoratedVehicle.info();
    }
}
