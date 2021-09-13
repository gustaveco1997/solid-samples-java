package liskov_substituition.exemplo2;

import java.text.NumberFormat;

public class Financeiro {

    public void pagarFuncionario(IFuncionario funcionario) {
        float salario = funcionario.calcularSalario();
        System.out.println("Pago: " + NumberFormat.getCurrencyInstance().format(salario));
    }

    public void simularBonificacao(IFuncionario funcionario, float percentual) {
        float salario = funcionario.calcularSalario();
        float bonificacao = salario * (percentual / 100);
        System.out.println("Valor Bonificação: " + bonificacao);
    }

}
