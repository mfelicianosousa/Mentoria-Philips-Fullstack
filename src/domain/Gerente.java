package domain;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{

	private Double valorDaBonificacao ;

	public Double getValorDaBonificacao() {
		return valorDaBonificacao;
	}

	public void setValorDaBonificacao(Double valorBonificacao) {
		this.valorDaBonificacao = valorBonificacao;
	}
	
	@Override
	public void calculaBonificacao(Double porcentagemBonificacao) {
		
		this.valorDaBonificacao = super.getValorRemuneracao() * ( porcentagemBonificacao / 100d ) + 100d;
	}
	
	@Override
	public String toString() {
		return "[ Gerente { nome : " + super.getNome() + "', documento : " + super.getDocumento() + ", horasTrabalhadas : "
				+ super.getHorasTrabalhadas()
				+ ", valorHora : " + super.getValorHora() + ", valorRemuneracao : " + super.getValorRemuneracao()
				+ ", endereco : [ { Rua : " +super.getEndereco().getRua()+", Endereco :" + super.getEndereco().getBairro() + " }]"
				+ ", Horas Trabalhada : "+super.getValorHora()+", Valor Hora : "+super.getValorHora()
				+ " Valor da Remuneração : "+super.getValorRemuneracao()
				+ " Valor da Bonificação : "+this.getValorDaBonificacao()+"} ]";
	}

	
	
}
