
public class Junior extends Analista {

	public Junior(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_JR;
		this.horasExtras = 0;
	}

	/**
	 * Calcula o valor total das horas extras considerando 10% do salário base por
	 * hora extra trabalhada.
	 * 
	 * @return O valor total das horas extras calculado.
	 */
	@Override
	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (salarioBase.getValor() * 0.10);
		return valorHoras;
	}

	/**
	 * Calcula o salário mensal do funcionário considerando o salário base, as horas
	 * extras e o valor do imposto.
	 * 
	 * @return O valor do salário mensal do funcionário.
	 */
	@Override
	public double calcSalFinal() {
		double salario = salarioBase.getValor() + calcValHorasExtras() - imposto.valorImpost(this);
		return salario;
	}

}
