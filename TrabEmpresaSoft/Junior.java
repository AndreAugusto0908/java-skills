

public class Junior extends Analista {

	

    public Junior(String nome, String CPF) {
        super(nome, CPF);
        this.salarioBase = Salarios.SALARIO_JR;
		this.horasExtras = 0;
    }

	@Override
	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (salarioBase.getValor() * 0.10);
		return valorHoras;
	}
	
	@Override
	public double calcSalFinal() {
		double salario = salarioBase.getValor() + calcValHorasExtras() - imposto.valorImpost(this);
		return salario;
	}



}
