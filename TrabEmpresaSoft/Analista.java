public abstract class Analista extends Funcionario {

	protected int horasExtras;
	protected CLT clt;
	protected ImpostoDeRenda imposto = new ImpostoDeRenda();

	public Analista(String nome, String CPF){
		super(nome, CPF);
		this.horasExtras = 0;
		
	}

	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (calcSalFinal() * 0.10);
		return valorHoras;
	}

	@Override
	public double calcSalFinal() {
		return salarioBase.getValor();
	}

	public void addHorasExtras(int quant) {
		horasExtras += quant;
	}

}
