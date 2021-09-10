package open_closed.exemplo2.dishes;

import open_closed.exemplo2.RefeicaoInterface;

public class Feijoada implements RefeicaoInterface {
    @Override
    public float getPrice() {
        return 24.50f;
    }

    @Override
    public String getDetails() {
        return "Feijoada com linguiça e frango";
    }
}
