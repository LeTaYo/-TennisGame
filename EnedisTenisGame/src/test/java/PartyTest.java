import static org.junit.Assert.*;

import java.util.stream.IntStream;

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
	@Test
    public void advantageShouldbeReturned() {
        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
            nadal.winPoint();
        });
        IntStream.rangeClosed(1, 4).forEach((Integer) -> {
            federer.winPoint();
        });
        assert(party.getWinner()).equals("advantage roger");
}
	 @Test
	    public void deuceShoulBeReturned() {
	        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
	            nadal.winPoint();
	        });
	        IntStream.rangeClosed(1, 3).forEach((Integer) -> {
	            federer.winPoint();
	        });
	        assert(party.getWinner()).equals("deuce");
	 }	
	 	
}
