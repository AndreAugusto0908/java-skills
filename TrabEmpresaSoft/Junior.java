

public class Junior extends Analista {

	private Salarios SALARIO_JR;

	public Junior(String nome, String CPF, Salarios SALARIO_JR){
		super(nome, CPF);
		this.SALARIO_JR = SALARIO_JR;
	}

}
