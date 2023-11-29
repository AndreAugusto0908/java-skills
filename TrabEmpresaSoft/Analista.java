

public abstract class Analista extends Funcionario {

	protected int horasExtras;
	private CLT clt;

	public Analista(String nome, String CPF){
		super(nome, CPF);
	}

	public double calcValHorasExtras() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public double calcSalFinal() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void addHorasExtras(int quant) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
