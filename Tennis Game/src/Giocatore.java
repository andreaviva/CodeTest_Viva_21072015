/**
 * @author Andrea Viva
 *
 */

public class Giocatore {

	private String nome;
	private int punteggio;
	
	public Giocatore(String player) 
	{
		nome = player;
		punteggio = 0;		
	}
	
	public void segnaPunto()
	{
		punteggio = punteggio + 1;		
	}

	public int getPunteggio(){
		return punteggio;
	}
	public String getPunteggioString()
	{
		String punteggioString = "";
		
		if (punteggio == 0) punteggioString = "love";
		else if (punteggio == 1) punteggioString = "fifteen";
		else if (punteggio == 2) punteggioString = "thirty";
		else if (punteggio == 3) punteggioString = "forty";
		
		return punteggioString;
	}
	
	public String getNome()
	{
		return nome;
	}
}
