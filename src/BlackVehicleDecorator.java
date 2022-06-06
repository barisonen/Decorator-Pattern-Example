public class BlackVehicleDecorator extends VehicleDecorator {

    public BlackVehicleDecorator(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public void info() {
        decoratedVehicle.info();
        addBlackVehicleInfo(decoratedVehicle);
    }

    private void addBlackVehicleInfo(Vehicle decoratedVehicle) {
        System.out.println("with color black");
    }
}
