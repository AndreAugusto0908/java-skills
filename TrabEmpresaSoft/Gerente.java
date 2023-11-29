

public class Gerente extends Funcionario {

	private Salarios SALARIO_GER;
	private int quantProjetos;

	public Gerente(String nome, String CPF, Salarios SALARIO_GER){
		super(nome, CPF);
		this.SALARIO_GER = SALARIO_GER;
	}

	public double calcSalFinal() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
