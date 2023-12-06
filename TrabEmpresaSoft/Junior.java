
public class Junior extends Analista {

	public Junior(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_JR;
		this.horasExtras = 0;
	}

}
