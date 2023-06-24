package com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTesting {
	@Parameters({"BrowserName"})
  @Test
  public void OpenBrowser(String BrowserName) {
		 System.out.println("browser passed as : - "+ BrowserName );
  }
	@Parameters({"UserName","Passcode"})
	  @Test
	  public void FillLoginForm(String UserName, String Passcode) {
			 System.out.println("Parameters for User Name passed as : - "+ UserName );
			 System.out.println("Parameters for Passcode passed as : - "+ Passcode );
	  }
		
}
