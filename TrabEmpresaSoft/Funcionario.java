
import java.time.LocalDate;


public abstract class Funcionario {

	protected String nome;
	protected String CPF;
	protected Salarios salarioBase;
	protected LocalDate dataAdmissao;

	public Funcionario(String nome, String CPF){
		this.nome = nome;
		this.CPF = CPF;
		this.dataAdmissao = LocalDate.now();
	}

	public String getCPF(){
		return CPF;
	}

	public double calcSalFinal() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
