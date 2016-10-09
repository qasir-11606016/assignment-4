import static org.junit.Assert.*;

import org.junit.Test;

public class TC2 {

		 
	     Player player =new Player("Fred",0);
	     int bet= 5;
	     int limit =0;
	     int winning=5;
	     @Test
	 	public void test() {
	 	int actual=	player.getBalance();
	 	int expected=0;
	 	assertEquals(actual,expected);
	 	}

}
