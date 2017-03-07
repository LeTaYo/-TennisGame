
public class Party {
	private Player player1;
	private Player player2;

	public Party(Player player1, Player player2) {
	      this.player1 = player1;
	      this.player2 = player2;
	}
	public String getWinner() {
	     if (player1.getScore() >= 3 && player2.getScore() >= 3) {
	    	 if (player1.getScore() == player2.getScore()) {
	             return "deuce";   
	    	 }else{
	    	 return "advantage " + getAdventegePlayer().getName();
	    	 }
	     }else{
	    	 if (Math.abs(player2.getScore() - player1.getScore()) >= 2) { 
	             return getAdventegePlayer().getName() + " won";
	    	 }else{
	    	 return player1.getScoreLabel() + ", " + player2.getScoreLabel();
	    	 }
	     }
	}
	public Player getAdventegePlayer() {
		return (player1.getScore() > player2.getScore()) ? player1 : player2;
	}



	    
}
