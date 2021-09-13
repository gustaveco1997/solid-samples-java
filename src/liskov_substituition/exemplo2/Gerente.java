package liskov_substituition.exemplo2;

public class Gerente implements IFuncionario{
    @Override
    public float calcularSalario() {
        return 5100;
    }
}
