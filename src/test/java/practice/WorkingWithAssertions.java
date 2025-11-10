package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertions {

	@Test
	public void t1() {
		
		String s=null;
		System.out.println("Start");
		Assert.assertNotNull(s);
		System.out.println("End");
	}

}

//
//System.out.println("Start");
//SoftAssert soft = new SoftAssert();
//soft.assertNotEquals("hdfc", "hfdc");
//System.out.println("End");
//soft.assertAll();
