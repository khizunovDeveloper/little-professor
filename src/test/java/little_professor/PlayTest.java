package little_professor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayTest {

	@Test
	void getNum() {
		int num = Play.getNum(0);
		assertTrue(num >= 0 && num <=9);
	}
}   
