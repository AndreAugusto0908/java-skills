public abstract class Analista extends Funcionario {

	protected int horasExtras;
	protected CLT clt = new CLT();
	protected ImpostoDeRenda imposto = new ImpostoDeRenda();

	public Analista(String nome, String CPF){
		super(nome, CPF);
		this.horasExtras = 0;
		
	}

	public double calcValHorasExtras() {
		double valorHoras = horasExtras * (calcSalFinal() * 0.10);
		return valorHoras;
	}

	public double calcSalarioAnual(){
		return ((salarioBase.getValor() - imposto.valorImpost(this)) * 12) + clt.calcDecimoTerc(this) + clt.calcFerias(this);
	}

	@Override
	public double calcSalFinal() {
		return salarioBase.getValor();
	}

	public void addHorasExtras(int quant) {
		horasExtras += quant;
	}

}
