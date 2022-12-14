package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import view.*;

class ModelTest {

	@Test
	void test() {
		View v = new View();
		Model m = new Model();
		m.registerView(v);
		// Make a move by player 1 on the center tile
		m.PlayMove(1,1);
		// check if movesCount has reduced from 9 to 8
		assertEquals (8, m.getMovesCount());
		// check that the center tile now contains 'x'
	    assertEquals ('X', m.getBoard()[1][1]);
	    
	    // check if reset is working
	    m.ResetModel();
	    // count of moves should be reset to 9
	    assertEquals (9, m.getMovesCount());
	}

}
