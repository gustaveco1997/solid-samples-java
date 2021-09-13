package liskov_substituition.exemplo2;

public class Recepcionista implements IFuncionario{
    @Override
    public float calcularSalario() {
        return 2700;
    }
}
