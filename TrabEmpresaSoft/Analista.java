public abstract class Analista extends Funcionario {

	protected int horasExtras;
	protected CLT clt = new CLT();
	protected ImpostoDeRenda imposto = new ImpostoDeRenda();

	public Analista(String nome, String CPF) {
		super(nome, CPF);
		this.horasExtras = 0;

	}

	/**
	 * Calcula o valor das horas extras com base na quantidade de horas extras
	 * trabalhadas
	 * e no valor do salário final.
	 * 
	 * @return O valor das horas extras calculado.
	 */
	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (salarioBase.getValor() * 0.10);
		return valorHoras;
	}

	/**
	 * Calcula o salário anual do funcionário considerando o salário mensal,
	 * o valor dos impostos, o décimo terceiro e as férias.
	 * 
	 * @return O valor do salário anual calculado.
	 */
	public double calcSalarioAnual() {
		return (calcSalFinal() * 12) + clt.calcDecimoTerc(this) + clt.calcFerias(this);
	}

	/**
	 * Calcula o salário final do mensal.
	 * 
	 * @return O valor do salário final.
	 */
	@Override
	public double calcSalFinal() {
		double salario = salarioBase.getValor() + calcValHorasExtras() - imposto.valorImpost(this);
		return salario;
	}

	/**
	 * Adiciona horas extras ao total de horas extras trabalhadas pelo funcionário.
	 * 
	 * @param quant O número de horas extras a serem adicionadas.
	 */
	public void addHorasExtras(int quant) {
		horasExtras += quant;
	}

}
