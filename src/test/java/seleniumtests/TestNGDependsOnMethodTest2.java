package seleniumtests;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDependsOnMethodTest2 {

	@BeforeClass
	public void beforeClass() {
		Reporter.log("before class execution", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("executing before method block", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("executing after method block", true);
	}

	@BeforeClass
	public void afterClass() {
		Reporter.log("after class execution", true);
	}

	@Test()
	public void test3() {
		Reporter.log("test 3 execution", true);
	}

	@Test(dependsOnMethods = "test3", alwaysRun = true)
	public void test4() {
		Reporter.log("test 4 execution");
		// Assert.assertTrue(false);// failure has happened
	}

	@Test(dependsOnMethods = "test4", enabled = true)
	public void test5() {
		Reporter.log("test 5 execution");
	}

	@Test(dependsOnMethods = "test5")
	public void test6() {
		Reporter.log("test 6 execution");
	}
}
