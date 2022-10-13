package TestNG;

import org.testng.annotations.Test;

import common.utilities;
import facebookpages.home;

import org.testng.annotations.DataProvider;

public class Providing extends utilities{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  home obj=new home(driver);
	  obj.emailfield(n);
	  Thread.sleep(1000);
	  obj.passwordfield(s);
	  Thread.sleep(1000);
	  obj.loginbuttonclick();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "tested", "12345" },
      new Object[] { "test", "5678976" },
    };
  }
}
