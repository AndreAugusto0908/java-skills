import java.util.Date;

public class Apartamento extends Imovel{

	private double condominio;

	public Apartamento(Date construcao, String endereco, double valorVenda, double condominio) {
        super(construcao, endereco, valorVenda);
		this.condominio = condominio;
    }

	public double valorAluguel() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	protected double desconto() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
