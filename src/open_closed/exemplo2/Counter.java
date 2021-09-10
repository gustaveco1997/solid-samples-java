package open_closed.exemplo2;

import java.text.NumberFormat;
import java.util.List;
import java.util.stream.Collectors;

public class Counter implements CounterInterface {
    private final OrderInterface order = new Order();

    @Override
    public void serve(RefeicaoInterface refeicao) {
        order.addItem(refeicao);

        System.out.println("-------------------");
        System.out.println("Servindo: -> " + refeicao.getDetails());
        System.out.println("Valor: -> " + formatMoney((refeicao.getPrice())));
        System.out.println("-------------------\n");
    }

    @Override
    public void pay() {
        System.out.println("-------------------");
        System.out.println("Pagamento Realizado: -> " + formatMoney(order.getTotal()));
        getItensServed().forEach(item -> {
            String data = String.format(" -> %s (%s)", item.getDetails(), formatMoney(item.getPrice()));
            System.out.println(data);
        });
        System.out.println("-------------------\n");
    }

    private List<RefeicaoInterface> getItensServed() {
        return order.getItens();
    }

    private String formatMoney(float value) {
        return NumberFormat.getCurrencyInstance().format(value);
    }

}
