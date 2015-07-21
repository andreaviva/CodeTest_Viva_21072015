import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Andrea Viva
 *
 */
public class TestCases {
	
	static Match match;
	static Giocatore giocatore1;
	static Giocatore giocatore2;
	
	@Before
	public void BeforeTest() throws Exception
	{
		giocatore1 = new Giocatore("Giocatore1");
		giocatore2 = new Giocatore("Giocatore2");		
		match = new Match(giocatore1, giocatore2);		
	}
	
	@Test
	public void testLove() throws Exception
	{
		String risultato = match.getResult();	
		assertEquals(risultato,"love-love");
	}	
	@Test
	public void testScore1() throws Exception
	{	
		giocatore1.segnaPunto();
			
		String risultato = match.getResult();
		assertEquals(risultato,"fifteen-love");		
	}	
	@Test
	public void testScore2() throws Exception
	{	
		int points = 3;
		
		for(int i=0; i<points-2; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points; i++)
		{
			giocatore2.segnaPunto();
		}	
		
		String risultato = match.getResult();
		assertEquals(risultato,"fifteen-forty");		
	}		

	@Test
	public void testDeuce() throws Exception
	{	
		int points = 3;
		
		for(int i=0; i<points; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points; i++)
		{
			giocatore2.segnaPunto();
		}	
		
		String risultato = match.getResult();
		assertEquals(risultato,"deuce");		
	}	
	
	@Test
	public void testAdvantage1() throws Exception
	{	
		int points = 5;
		
		for(int i=0; i<points; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points+1; i++)
		{
			giocatore2.segnaPunto();
		}	
		
		String risultato = match.getResult();
		assertEquals(risultato,"advantage Giocatore2");		
	}
	@Test
	public void testAdvantage2() throws Exception
	{
		int points = 4;
		
		for(int i=0; i<points; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points-1; i++)
		{
			giocatore2.segnaPunto();
		}	
		
		String risultato = match.getResult();
		assertEquals(risultato,"advantage Giocatore1");		
	}
	
	@Test
	public void testWins1() throws Exception
	{
		int points = 4;
		
		for(int i=0; i<points; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points-2; i++)
		{
			giocatore2.segnaPunto();
		}	
		
		String risultato = match.getResult();
		assertEquals(risultato,"Giocatore1 wins game");			
	}	
	@Test
	public void testWins2() throws Exception
	{
		int points = 4;
		
		for(int i=0; i<points-3; i++)
		{
			giocatore1.segnaPunto();
		}
		for(int i=0; i<points; i++)
		{
			giocatore2.segnaPunto();
		}	
			
		String risultato = match.getResult();
		assertEquals(risultato,"Giocatore2 wins game");		
	}	

}
