package MavenReport;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.DataProvider;

public class TestClass1 {


  @Test(groups = "mygroup")
  public void t1() {
	  Assert.assertTrue(false);
  }
  @Test(groups = "mygroup")
  public void t2() {
	  Assert.assertTrue(false);
  }
  @Test
  public void t3() {
  }
  @Test
  public void t4() {
  }
  @Test(dataProvider ="dp")
  public void t5(String param) {
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
     {"one" },
     {"two" },
    };
  }
}
