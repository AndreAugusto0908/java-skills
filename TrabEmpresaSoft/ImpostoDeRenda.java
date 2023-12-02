
public class ImpostoDeRenda {

	public ImpostoDeRenda(){}



	public double valorImpost(Funcionario funcionario) {
		double imposto = 0;

		if(funcionario.salarioBase.getValor() < 1903){
			imposto = 0;
		}
		
		if(funcionario.salarioBase.getValor() > 1903 && funcionario.salarioBase.getValor() <= 2825){
			imposto = funcionario.salarioBase.getValor() * 0.075;
		}

		if(funcionario.salarioBase.getValor() > 2825 && funcionario.salarioBase.getValor() <= 3750){
			imposto = funcionario.salarioBase.getValor() * 0.15;
		}

		if(funcionario.salarioBase.getValor() > 3750 && funcionario.salarioBase.getValor() <= 4663){
			imposto = funcionario.salarioBase.getValor() * 0.22;
		}

		if(funcionario.salarioBase.getValor() > 4663){
			imposto = funcionario.salarioBase.getValor() * 0.0275;
		}

		return imposto;
	}

}
