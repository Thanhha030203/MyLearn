package MavenReport;

import org.testng.ITest;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import graphql.Assert;

public class FactoryInstantiatedTestClass implements ITest {
	private String param;
	
  public FactoryInstantiatedTestClass(String param) {
		super();
		this.param = param;
	}

@Test
  public void f() {
	if(param.equals("Reports")) {
		Assert.assertTrue(false);
	}
  }

@Override
public String getTestName() {
	// TODO Auto-generated method stub
	return getClass().getSimpleName()+"- "+ param;
}

@Factory
public static Object[] create() {
	return new Object[] {
			new FactoryInstantiatedTestClass("TestNG"),new FactoryInstantiatedTestClass("Reports")
	};
}
}
