import static org.junit.Assert.*;

import org.junit.Test;

public class TC4 {

	Player player =new Player("Fred",2);
    int bet= 5;
    int limit =0;
    int winning=5;
    @Test
	public void test() {
	int actual=	player.getBalance();
	int expected=2;
	assertEquals(actual,expected);
	}4@Test
	public void test8() {
		player.receiveWinnings(winning);
	int actual =player.getBalance();
	int expected =2+bet;
	assertEquals(actual,expected);
	}
	public void test6() {
		boolean actual=	player.balanceExceedsLimitBy(bet);
		boolean expected =false;
		assertEquals(actual,expected);
		}

}
