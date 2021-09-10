package open_closed.exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderInterface {
    private final List<RefeicaoInterface> refeicoes = new ArrayList<>();

    @Override
    public void addItem(RefeicaoInterface refeicao) {
        refeicoes.add(refeicao);
    }

    @Override
    public float getTotal() {
        return refeicoes.stream()
                .map(RefeicaoInterface::getPrice)
                .reduce(0f, Float::sum);
    }

    @Override
    public List<RefeicaoInterface> getItens() {
        return refeicoes;
    }
}
