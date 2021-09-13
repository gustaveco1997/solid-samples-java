package liskov_substituition.exemplo1;

public interface VehicleInterface {
    void move();
    void stop();
    boolean isMoving();
    void changeGear(Gear gear);
    Gear getGear();
}
