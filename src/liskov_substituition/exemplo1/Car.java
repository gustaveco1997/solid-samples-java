package liskov_substituition.exemplo1;

public class Car extends Vehicle {
    @Override
    public void changeGear(Gear gear) {
        Gear currentGear = getGear();
        if (isMovingBackwards(gear, currentGear) || isMovingForwards(gear, currentGear))
            stop();
        super.changeGear(gear);
    }

    private boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }

    private boolean isMovingForwards(Gear gear, Gear actualGear) {
        return isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
}
