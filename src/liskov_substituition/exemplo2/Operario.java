package liskov_substituition.exemplo2;

public class Operario implements IFuncionario{
    @Override
    public float calcularSalario() {
        return 3200;
    }
}
