package domain;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

	// Vendedor herda da classe FuncionarioCLT
	//
	private Double valorDaBonificacao ;
	
	public Vendedor() {
		
	}
	
	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
		
		this.valorDaBonificacao = super.valorSalario * ( porcentagemBonificacao /100d ) ;
		
	}

	@Override
	public String toString() {
		return " Vendedor [ nome=" + nome + ", documento=" + documento
				+ ", valorSalario=" + valorSalario 
				+ ", endereco=" + endereco.getRua()
				+ ", Valor Bonificacao = " + valorDaBonificacao 
				+  "]";
	}

	
	
	
}
