import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public abstract class Imovel {

	protected Date contrucao;
	protected String endereco;
	protected double valorVenda;
	protected Set<Beneficio> beneficios = new HashSet<>();

	public Imovel (Date construcao, String endereco, double valorVenda){
		this.contrucao = construcao;
		this.endereco = endereco;
		this.valorVenda = valorVenda;
	}

	public double valorAluguel() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	protected double desconto() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	protected int idadeImovel() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public double valorAcrescimo() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public void addBeneficio(Beneficio beneficio) {
		beneficios.add(beneficio);
	}


}
