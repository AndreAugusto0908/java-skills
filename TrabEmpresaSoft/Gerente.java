import java.util.Map;

public class Gerente extends Funcionario {

	private Map<Integer, Projeto> projetos;
	private int quantProjetos;

	public Gerente(String nome, String CPF) {
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_GER;
		this.quantProjetos = 0;
	}

	/**
	 * Adiciona um projeto à lista de projetos da empresa.
	 * Incrementa o contador de projetos após a adição.
	 * 
	 * @param projeto O objeto do tipo Projeto a ser adicionado à lista de projetos.
	 */
	public void addProjetos(Projeto projeto) {
		this.projetos.put(quantProjetos, projeto);
		quantProjetos++;
	}

	/**
	 * Calcula o salário mensal do funcionário considerando o salário base e o valor
	 * total dos projetos em que está envolvido.
	 * 
	 * @return O valor do salário mensal do funcionário, composto pelo salário base e
	 *         o valor total dos projetos.
	 */
	@Override
	public double calcSalFinal() {
		double valorTotalProjetos = 0.0;
		if (projetos != null) {
			for (Projeto projeto : projetos.values()) {
				valorTotalProjetos += projeto.valorProjeto();
			}
		}
		return salarioBase.getValor() + valorTotalProjetos;
	}

}
