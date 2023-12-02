

public class CLT {

	public double calcDecimoTerc(Analista analista) {
		double decimoTerceiro = 0;
		for(int i = 1; i <= 12; i++){
		  decimoTerceiro += analista.calcSalFinal() / 12.0;
		}
		return decimoTerceiro * 12.0;
		
	}

	public double calcFerias(Analista analista) {
		double ferias = 0;
		ferias = analista.salarioBase.getValor() / 3.0;
		return ferias += analista.salarioBase.getValor();
	}

}
