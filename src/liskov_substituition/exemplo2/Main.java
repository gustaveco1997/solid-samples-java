package liskov_substituition.exemplo2;

public class Main {
    public static void main(String[] args) {
        Financeiro financeiro = new Financeiro();

        IFuncionario gerente = new Gerente();
        System.out.println("--------- Gerente --------- ");
        financeiro.pagarFuncionario(gerente);
        financeiro.simularBonificacao(gerente, 10);

        System.out.println("--------- Operário --------- ");
        IFuncionario operario = new Operario();
        financeiro.pagarFuncionario(operario);
        financeiro.simularBonificacao(operario, 10);

        System.out.println("--------- Recepcionista --------- ");
        IFuncionario recepcionista = new Recepcionista();
        financeiro.pagarFuncionario(recepcionista);
        financeiro.simularBonificacao(recepcionista, 10);
    }
}
