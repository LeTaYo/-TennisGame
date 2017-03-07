import java.util.Arrays;
import java.util.List;

public class Player {
	public static final List<String> POINTSNAME = Arrays.asList("love", "fifteen", "thirty", "forty");
	private int score;
	private String namePlayer;
	
	public Player(String namePlayer) {       
	 this.namePlayer = namePlayer;
	}
	public int getScore() {
	     return score;    
	}  
	public String getName() {	      
		  return namePlayer;
	}
	public void winPoint() {	       
		 this.score = this.score + 1;
	} 
}
