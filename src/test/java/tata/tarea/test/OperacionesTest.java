package tata.tarea.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



import tata.tarea.Operaciones;

public class OperacionesTest {
   Operaciones var;
   @Before
   public void before(){
		System.out.println("ver bedore");
		var=new Operaciones();
   }
	@Test
	public void sumar() {
		
		int resultado=var.suma(0,2);
		int esperado=0;
		assertEquals(esperado, resultado);
		
		int resultado2=var.suma(7,0);
		int esperado2=0;
		assertEquals(esperado2, resultado2);
		
		int resultado3=var.suma(0,0);
		int esperado3=0;
		assertEquals(esperado3, resultado3);
		
		int resultado4=var.suma(8,2);
		int esperado4=10;
		assertEquals(esperado4, resultado4);
			
	}
	
	@Test
	public void restar() {
		
		int resultado=var.resta(0,2);
		int esperado=0;
		assertEquals(esperado, resultado);
		
		int resultado2=var.resta(7,8);
		int esperado2=0;
		assertEquals(esperado2, resultado2);
		
		int resultado3=var.resta(0,0);
		int esperado3=0;
		assertEquals(esperado3, resultado3);
		
		int resultado4=var.resta(8,2);
		int esperado4=6;
		assertEquals(esperado4, resultado4);
			
	}
	
	@Test
	public void multiplica() {
		
		int resultado=var.multiplicar(0,2);
		int esperado=0;
		assertEquals(esperado, resultado);
		
		int resultado2=var.multiplicar(7,8);
		int esperado2=56;
		assertEquals(esperado2, resultado2);
		
		int resultado3=var.multiplicar(3,0);
		int esperado3=1;
		assertEquals(esperado3, resultado3);
			
	}
	@Test
	public void Divide() {
		
		int resultado=var.dividir(0,2);
		int esperado=0;
		assertEquals(esperado, resultado);
		
		int resultado2=var.dividir(6,2);
		int esperado2=3;
		assertEquals(esperado2, resultado2);
		
		int resultado3=var.dividir(3,0);
		int esperado3=0;
		assertEquals(esperado3, resultado3);
			
	}

}
