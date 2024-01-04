import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumbersTest {

	@Test
	void test() 
	{
		//fail("Not yet implemented");
	
	}
	

 @Test
  void testAdd()
{
	Numbers objAdd = new Numbers();
	int expected = 5;
	int actual = objAdd.GetSum(2,3);
	assertEquals(expected,actual);

}
 
 @Test
 void testMult()
{
	Numbers objMult = new Numbers();
	int expected = 6;
	int actual = objMult.GetProduct(2,3,1);
	assertEquals(expected,actual);

}
 
 @Test
 void testDiv()
{
	Numbers objDiv = new Numbers();
	int expected = 2;
	int actual = objDiv.GetRemainder(10,5);
	assertEquals(expected,actual);

}
 }

