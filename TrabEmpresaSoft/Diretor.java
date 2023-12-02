public class Diretor extends Funcionario {

	private ImpostoDeRenda imposto = new ImpostoDeRenda();
	private double bonus;

	public Diretor(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.PRO_LABORE;
		this.bonus = 0;
	}

	/**
	 * Calcula o bônus do funcionário com base no faturamento da empresa.
	 * 
	 * @param empresa O objeto do tipo Empresa a partir do qual o bônus será
	 *                calculado.
	 * @return O valor do bônus calculado para o funcionário.
	 */
	public double calcBonus(Empresa empresa) {
		bonus = 0;
		bonus = 0.3 * empresa.faturamento();
		return bonus;
	}

	/**
	 * Calcula o salário mensal do funcionário considerando o salário base,
	 * o bônus recebido e o valor dos impostos.
	 * 
	 * @return O valor do salário mensal do funcionário.
	 */
	@Override
	public double calcSalFinal() {
		return (salarioBase.getValor() + bonus) - imposto.valorImpost(this);
	}

}
