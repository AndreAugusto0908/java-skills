public class CLT {

	/**
	 * Calcula o décimo terceiro salário do analista com base no salário final
	 * mensal.
	 * 
	 * @param analista O objeto do tipo Analista para o qual o décimo terceiro será
	 *                 calculado.
	 * @return O valor total do décimo terceiro salário calculado para o ano.
	 */
	public double calcDecimoTerc(Analista analista) {
		double decimoTerceiro = 0;
		for (int i = 1; i <= 12; i++) {
			decimoTerceiro += analista.calcSalFinal() / 12.0;
		}
		return decimoTerceiro * 12.0;

	}

	/**
	 * Calcula o valor total das férias do analista, considerando um terço do
	 * salário base
	 * acrescido do próprio salário base.
	 * 
	 * @param analista O objeto do tipo Analista para o qual o valor das férias será
	 *                 calculado.
	 * @return O valor total das férias calculado.
	 */
	public double calcFerias(Analista analista) {
		double ferias = 0;
		ferias = analista.salarioBase.getValor() / 3.0;
		return ferias += analista.salarioBase.getValor();
	}

}
