
public enum Salarios {
    SALARIO_BASE(1000.00),
    SALARIO_JR(2000.00),
    SALARIO_SR(0),
    SALARIO_GER(3500.00),
    PRO_LABORE(5000.00);

    private double valor;

    Salarios(double valor) {
        this.valor = valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public static void inicializarValores() {
        SALARIO_SR.setValor(SALARIO_JR.getValor() + (SALARIO_JR.getValor() * 0.03));
    }

    public double getValor() {
        return valor;
    }
}
