package liskov_substituition.exemplo1;

public class Main {
    public static void main(String[] args) {
        //Vehicle or VehicleInterface
        Vehicle car = new Car();
        car.changeGear(Gear.D);
        car.changeGear(Gear.R);

        Vehicle plane = new Plane();
        plane.changeGear(Gear.D);
        plane.changeGear(Gear.R);
        plane.changeGear(Gear.N);
        plane.changeGear(Gear.D);
    }
}
