

public class Senior extends Analista {

	

	public Senior(String nome, String CPF){
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_SR;
	}

	@Override
	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (salarioBase.getValor() * 0.10);
		return valorHoras;
	}
	
	@Override
	public double calcSalFinal() {
		double salario = salarioBase.getValor() - imposto.valorImpost(this);
		return salario;
	}

}
