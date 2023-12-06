import java.util.Date;

public class Casa extends Imovel {

	private double seguro;

	public Casa(Date construcao, String endereco, double valorVenda, double seguro) {
        super(construcao, endereco, valorVenda);
		this.seguro = seguro;
    }

	public double valorAluguel() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	protected double desconto() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
