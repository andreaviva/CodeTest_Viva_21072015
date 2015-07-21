
/**
 * @author Andrea Viva
 *
 */
public class Match {

	private Giocatore giocatore1;
	private Giocatore giocatore2;
		
	public Match(Giocatore player1, Giocatore player2) 
	{
		giocatore1 = player1;
		giocatore2 = player2;		
	}
	
	public String getResult()
	{
		String result = "";
		
		int p1 = giocatore1.getPunteggio();
		int p2 = giocatore2.getPunteggio();
		int Dp = p1-p2;
		
		// case: Game Win
		if (p1 >= 4 && Dp >=2)
		{
			result = giocatore1.getNome() + " wins game";
		}
		else if (p2 >= 4 && Dp <=-2)
		{
			result = giocatore2.getNome() + " wins game";
		}
		else if (p1>=3 && p2>=3)
		{
			// case: Deuce
			if(p1 == p2)
			{
				result = "deuce";
			}
			// case: Advantage 1
			else if(Dp == 1)
			{
				result =  "advantage " + giocatore1.getNome();
			}	
			// case: Advantage 2
			else if(Dp == -1)
			{
				result =  "advantage " + giocatore2.getNome();
			}				
			
		}
		//Otherwise
		else
		{
			result = giocatore1.getPunteggioString()+ "-" + giocatore2.getPunteggioString();
		}
		
		return result;
	}

}
