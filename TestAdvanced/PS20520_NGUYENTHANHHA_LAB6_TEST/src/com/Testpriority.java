package com;

import org.testng.annotations.Test;

public class Testpriority {
  @Test
  public void registerAccount() {
	  System.out.println("First register your account");
  }
  @Test(priority = 2)
  public void sendmail() {
	  System.out.println("send mail after login");
  }
  @Test(priority = 1)
  public void login() {
	  System.out.println("Login to the account after registration");
  }
}
