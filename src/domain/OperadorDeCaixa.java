package domain;

public class OperadorDeCaixa extends FuncionarioCLT {

	protected Double quebraDeCaixa ;
	
	
	public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco, Double quebraDeCaixa) {
		super (nome, documento, valorSalario, endereco) ;
		this.quebraDeCaixa = quebraDeCaixa;
		
	}


	@Override
	public String toString() {
		return "OperadorDeCaixa [nome=" + nome + ", documento=" + documento + ", valorSalario=" + valorSalario
				+ ", endereco=" + endereco + "]";
	}
	
	
}
