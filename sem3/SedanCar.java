package sem3;
import java.awt.*;


public class SedanCar extends Car{

    public SedanCar(String make, String model, Color color, FuelType fuelType, CarType type) {
        super(make, model, color);
        this.fuelType = fuelType;
        this.type = type;
        setWheelsCount(4);
    }

    @Override
    public void movement() {
        System.out.println("Седан начал движение");
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
