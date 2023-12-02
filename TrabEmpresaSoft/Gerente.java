import java.util.Map;

public class Gerente extends Funcionario {

	private Map<Integer, Projeto> projetos;
	private int quantProjetos;

	public Gerente(String nome, String CPF){
		super(nome, CPF);
		this.salarioBase = Salarios.SALARIO_GER;
		this.quantProjetos = 0;
	}

	public void addProjetos(Projeto projeto){
		this.projetos.put(quantProjetos, projeto);
		quantProjetos++;
	}

	@Override
    public double calcSalFinal() {
        double valorTotalProjetos = 0.0;
		if(projetos != null){
        for (Projeto projeto : projetos.values()) {
            valorTotalProjetos += projeto.valorProjeto();
        }
		}
        return salarioBase.getValor() + valorTotalProjetos;
    }

}
