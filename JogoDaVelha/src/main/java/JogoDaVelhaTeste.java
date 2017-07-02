
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class JogoDaVelhaTeste {
	

	@org.junit.Test
	public void deveTestarValidarPosicao(){
		Jogo j1 = new Jogo();
		boolean p =j1.Validarposicao("15");
		Assert.assertFalse("False", p);	
	}
	
	@org.junit.Test 
	public void deveTestarJogada(){
		Jogo j1 = new Jogo();
		String t = j1.Jogada("10", "O");
		Assert.assertEquals("jogada inválida", t);
		
	}
	 @org.junit.Test
	 public void deveTestarGanhou(){
		 Jogo j1 = new Jogo();
		 String g = j1.GanharJogo(8);
		 Assert.assertEquals("null", g);
		 
	 }
	 @org.junit.Test
	 public void deveTestarEmpate(){
		 Jogo j1 = new Jogo ();
		 String f = j1.GanharJogo(9);
		 Assert.assertEquals("VELHA", f);
		 
	 }

	

}
