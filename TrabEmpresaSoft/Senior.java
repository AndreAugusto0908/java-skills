
public class Senior extends Analista {

	public Senior(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_SR;
	}

}
