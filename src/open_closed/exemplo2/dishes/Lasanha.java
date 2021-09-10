package open_closed.exemplo2.dishes;

import open_closed.exemplo2.RefeicaoInterface;

public class Lasanha implements RefeicaoInterface {

    @Override
    public float getPrice() {
        return 12.9f;
    }

    @Override
    public String getDetails() {
        return "Lasanha à Bolonhesa";
    }
}
