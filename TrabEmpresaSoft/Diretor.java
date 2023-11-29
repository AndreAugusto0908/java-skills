

public class Diretor extends Funcionario {

	private Salarios PRO_LABORE;

	public Diretor(String nome, String CPF, Salarios PRO_LABORE){
		super(nome, CPF);
		this.PRO_LABORE = PRO_LABORE;
	}

	public double calcBonus() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
