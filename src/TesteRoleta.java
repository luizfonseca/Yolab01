import static org.junit.Assert.*;
import lib.Pagar;

import org.junit.Test;


public class TesteRoleta {

	@Test
	public void deveRetornarValorRestanteAdicional(){
		//Pagar pagar = new Pagar();	
		//double saldoTotal = pagar.insere(2);
		
		//assertEquals(2,saldoTotal, 0.0001);
		
		//System.out.print();
		
		Catraca catraca = new Catraca(2.70);
		double resultado = catraca.creditar(3.00);
		
		assertEquals( 0.3, resultado, 0.0001);
		
		
	}
	
		
}

class Catraca
{
	private double valorPassagem;
	public Catraca(double valorPassagem)
	{
		this.valorPassagem = valorPassagem;
	}
	public double creditar(double valor)
	{
		return valor - this.valorPassagem;
	}
	
}
