import static org.junit.Assert.*;

import org.junit.Test;

public class TC1 {
	 Dice d1 = new Dice();
     Dice d2 = new Dice();
     Dice d3 = new Dice();
     Player player =new Player("Fred",100);
     Game game = new Game(d1, d2, d3);
     int bet= 5;
     int limit =0;
	@Test
	public void test() {
	int actual=	player.getBalance();
	int expected=100;
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
	assertEquals(actual,expected);
	}
	@Test
	public void test4() {
	int actual=	player.getBalance();
	int expected=100;
	assertEquals(actual,expected);
	}
	@Test
	public void test5() {
	boolean actual=	player.balanceExceedsLimit();
	boolean expected =true;
	assertEquals(actual,expected);
	}
	public void test6() {
		boolean actual=	player.balanceExceedsLimitBy(bet);
		boolean expected =true;
		assertEquals(actual,expected);
		}
	public void test7() {
			player.setLimit(limit);
		int expected =player.getLimit();
		assertEquals(limit,expected);
		}
	
	
}
