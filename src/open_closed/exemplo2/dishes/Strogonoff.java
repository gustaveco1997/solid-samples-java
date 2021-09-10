package open_closed.exemplo2.dishes;

import open_closed.exemplo2.RefeicaoInterface;

public class Strogonoff implements RefeicaoInterface {
    @Override
    public float getPrice() {
        return 10f;
    }

    @Override
    public String getDetails() {
        return "Strogonoff de frango desfiado";
    }
}
