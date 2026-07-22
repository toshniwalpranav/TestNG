

import org.testng.annotations.Test;



//InvocationCountTest = multiple time test run 



public class testcase2 {
	
		@Test(invocationCount=5)
	      public void test1()
		{
			System.out.println("hii");
		}

}


 
 
//--------------------------------------------------------------------------------------


/*

//Expected exception-we tell testng we expected that exception

public class testcase2{
	@Test(expectedExceptions=NumberFormatException.class)
	public void test2() {
		String x ="121A";
		Integer.parseInt(x);
		
	}
	
}
*/



