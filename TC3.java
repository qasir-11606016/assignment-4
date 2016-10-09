import static org.junit.Assert.*;

import org.junit.Test;

public class TC3 {

	Player player =new Player("Fred",1);
    int bet= 5;
    int limit =0;
    int winning=5;
    @Test
	public void test() {
	int actual=	player.getBalance();
	int expected=1;
	assertEquals(actual,expected);
	}
	@Test
	public void test2() {
	String actual=	player.getName();
	String expected="Fred";
	assertEquals(actual,expected);
	}
	@Test
	public void test3() {
	int actual=	player.getLimit();
	int expected=0;
	assertEquals(actual,expected);}
	
	@Test
	public void test4() {
		int actual=	player.getBalance();
		int expected=1;
		assertEquals(actual,expected);
		}
		@Test
		public void test5() {
		boolean actual=	player.balanceExceedsLimit();
		boolean expected =true;
		assertEquals(actual,expected);
		}
		@Test
		public void test6() {
			boolean actual=	player.balanceExceedsLimitBy(bet);
			boolean expected =false;
			assertEquals(actual,expected);
			}
		@Test
		public void test7() {
				player.setLimit(limit);
			int expected =player.getLimit();
			assertEquals(limit,expected);
			}
		@Test
		public void test8() {
			player.receiveWinnings(winning,bet);
		int actual =player.getBalance();
		int expected =1+bet;
		assertEquals(actual,expected);
		}
		@Test
		public void test9() {
			player.takeBet(bet);
		int actual =player.getBalance();
		int expected =0;
		assertEquals(actual,expected);
		}

}
