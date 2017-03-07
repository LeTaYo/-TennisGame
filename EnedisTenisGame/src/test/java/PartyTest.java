import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PartyTest {

	Player nadal;
	Player federer;
	Party party;
	
	 	@Before
	    public void beforeGameTest() {
		 	nadal = new Player("rafael");
		 	federer = new Player("roger");
	        party = new Party(nadal, federer);
	}
}
