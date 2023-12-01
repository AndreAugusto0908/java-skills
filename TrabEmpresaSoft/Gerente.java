

public class Gerente extends Funcionario {
;
	private int quantProjetos;

	public Gerente(String nome, String CPF){
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_GER;
		this.quantProjetos = 0;
	}

	public int addProjetos(int projeto){
		quantProjetos += projeto;
		return quantProjetos;
	}

	private double valorProjeto(){
		return 400.00 * quantProjetos;
	}

	@Override
	public double calcSalFinal() {
		return salarioBase.getValor() + valorProjeto();
	}

}
