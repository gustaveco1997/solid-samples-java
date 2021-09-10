package open_closed.exemplo1;

public class Greet {
    private final GreetingInterface greeting;

    public Greet(GreetingInterface greeting) {
        this.greeting = greeting;
    }

    public String getGretting() {
        return greeting.get();
    }
}
