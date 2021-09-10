package open_closed.exemplo1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Greet(new CasualGreeting()).getGretting());
        System.out.println(new Greet(new FormalGreeting()).getGretting());
        System.out.println(new Greet(new IntimateGreeting()).getGretting());
    }
}
