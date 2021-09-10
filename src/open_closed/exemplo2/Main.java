package open_closed.exemplo2;

import open_closed.exemplo2.dishes.Feijoada;
import open_closed.exemplo2.dishes.Lasanha;
import open_closed.exemplo2.dishes.Strogonoff;

public class Main {

    public static void main(String[] args) {
        CounterInterface counter = new Counter();
        counter.serve(new Feijoada());
        counter.serve(new Strogonoff());
        counter.serve(new Lasanha());

        counter.pay();
    }
}
