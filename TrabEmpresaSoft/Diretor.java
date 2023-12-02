

public class Diretor extends Funcionario {

	private double bonus;

	public Diretor(String nome, String CPF){
		super(nome, CPF);
		this.salarioBase = Salarios.PRO_LABORE;
		this.bonus = 0;
	}

	public double calcBonus(Empresa empresa) {
		bonus = 0;
		bonus = 0.3 * empresa.faturamento();
		return bonus;
	}

	@Override	
	public double calcSalFinal() {
		return salarioBase.getValor() + bonus;
	}

}
