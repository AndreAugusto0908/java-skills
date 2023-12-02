
public class Senior extends Analista {

	public Senior(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_SR;
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
	 * Calcula o salário final do funcionário considerando o salário base, o valor
	 * do imposto e o valor das horas extras.
	 * 
	 * @return O valor do salário final do funcionário.
	 */
	@Override
	public double calcSalFinal() {
		double salario = salarioBase.getValor() - imposto.valorImpost(this) + calcValHorasExtras();
		return salario;
	}

}
