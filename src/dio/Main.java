package dio;
import domain.Endereco;
import domain.Gerente;
import domain.OperadorDeCaixa;
import domain.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua duzentos e hum","Quadra 3 Casa 6", "Tijucal");
		
		System.out.println(endereco);
		System.out.println("-------------------------------------------------");
		
		Vendedor vendedor = new Vendedor();
		vendedor.setNome("Camila");
		vendedor.setDocumento("123.456.789");
		vendedor.setValorSalario(1000d);
		vendedor.calculaBonificacao( 2d );
		vendedor.setEndereco(endereco);
		
		System.out.println(vendedor);
		System.out.println("---------------------------------------------------------------------");
		
		OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Camila","789.456.123-00",2000d, endereco, 20d) ;
		System.out.println(operadorDeCaixa);
		System.out.println("---------------------------------------------------------------------");
		
		Gerente gerente = new Gerente();
		gerente.setNome("Camila Gerente");
		gerente.setDocumento("123.456.789");
		gerente.setEndereco(endereco);
		gerente.setHorasTrabalhadas(20d);
		gerente.setValorHora(100d);
		gerente.calculaRemuneracao();
		gerente.calculaBonificacao( 3d );
	
		
		System.out.println(gerente);
		System.out.println("---------------------------------------------------------------------");
	}

}
