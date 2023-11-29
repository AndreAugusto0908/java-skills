

public class Senior extends Analista {

	private Salarios SALARIO_SR;

	public Senior(String nome, String CPF, Salarios SALARIO_SR){
		super(nome, CPF);
		this.SALARIO_SR = SALARIO_SR;
	}

}
