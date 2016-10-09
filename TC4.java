import static org.junit.Assert.*;

import org.junit.Test;

public class TC4 {

	Player player =new Player("Fred",5);
    int bet= 5;
    int limit =0;
    int winning=5;
    @Test
	public void test() {
	int actual=	player.getBalance();
	int expected=5;
	assertEquals(actual,expected);
	}
	@Test
	public void test8() {
		player.receiveWinnings(winning);
	int actual =player.getBalance();
	int expected =5+bet;
	assertEquals(actual,expected);
	}
	public void test6() {
		boolean actual=	player.balanceExceedsLimitBy(bet);
		boolean expected =false;
		assertEquals(actual,expected);
		}

}
