import static org.junit.Assert.*;

import org.junit.Test;

public class TC1 {
	 Dice d1 = new Dice();
     Dice d2 = new Dice();
     Dice d3 = new Dice();
     Player player =new Player("Fred",100);
     Game game = new Game(d1, d2, d3);
	@Test
	public void test() {
	int actual=	player.getBalance();
	int expected=100;
	assertEquals(actual,expected);
	}

}
