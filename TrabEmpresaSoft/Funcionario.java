import java.time.LocalDate;

public abstract class Funcionario {

	protected String nome;
	protected String CPF;
	protected Salarios salarioBase;
	protected LocalDate dataAdmissao;

	public Funcionario(String nome, String CPF){
		this.nome = nome;
		this.CPF = CPF;
		Salarios.inicializarValores();
		this.salarioBase = Salarios.SALARIO_BASE;
		this.dataAdmissao = LocalDate.now();
	}

	public String getCPF(){
		return CPF;
	}

	public double calcSalFinal() {
		return salarioBase.getValor();
	}

}
