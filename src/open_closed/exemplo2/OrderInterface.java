package open_closed.exemplo2;

import java.util.List;

public interface OrderInterface {
    void addItem(RefeicaoInterface refeicao);
    float getTotal();
    List<RefeicaoInterface> getItens();
}
