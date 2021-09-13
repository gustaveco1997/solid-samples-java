package liskov_substituition.exemplo1;

public class Vehicle implements VehicleInterface {
    private boolean isMoving;
    private Gear gear;

    @Override
    public void move() {
        isMoving = true;
    }

    @Override
    public void stop() {
        isMoving = false;
    }

    @Override
    public boolean isMoving() {
        return isMoving;
    }

    @Override
    public void changeGear(Gear gear) {
        this.gear = gear;
    }

    @Override
    public Gear getGear() {
        return gear;
    }
}
