package fpoly;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import graphql.Assert;


public class SaveTestNGResultToExcel {
	 public WebDriver driver;
	 public UIMap  uimap;
	 public UIMap datafile;
	 public String workingDir;
	 HSSFWorkbook workbook;
	 HSSFSheet sheet;
	Map<String, Object> TestNGResult;
	String drivePath = "D:\\FPT Polytechnic\\SPR23\\TestAdvanced\\TaiNguyen\\chromedriver_win32\\chromedriver.exe";
	
	@Test(description="Opens the TestNG demo website for login test", priority=1)
	public void LaunchWebsite() { 
		try {
			System.setProperty("webdriver.chrome.driver", drivePath);
			driver = new ChromeDriver();
			driver.get("https://phptravels.net/login");
			driver.manage().window().maximize();
			TestNGResult.put("2", new Object[] {1d,"Navigate to demo website","Site gets opends","Pass"});
			
		}
		catch (Exception e) {
			// TODO: handle exception
			TestNGResult.put("2", new Object[] {1d,"Navigate to demo website","Site gets opends","Fail"});
			Assert.assertTrue(false);
		}
	}
	@Test(description="Fill the Login Details", priority=2)
	public void FillLoginDetails() { 
		try {
			WebElement user = driver.findElement(uimap.getLocator("Username_field"));
			user.sendKeys(datafile.getData("username"));
			WebElement password = driver.findElement(uimap.getLocator("Password_field"));
			password.sendKeys(datafile.getData("password"));
			Thread.sleep(1000);
			TestNGResult.put("3", new Object[] {2d,"Fill Login form data (Username/Password)","Login details gets filleds ","Pass"});
		}
		catch (Exception e) {
			// TODO: handle exception
			TestNGResult.put("3", new Object[] {2d,"Fill Login form data (Username/Password)","Login details gets filleds ","Fail"});
			Assert.assertTrue(false);
		}
	}
	@Test(description = "Perform Login", priority = 3)
	public void DoLogin() throws Exception{
		try {
			WebElement login = driver.findElement(uimap.getLocator("Login_button"));
			login.click();
			Thread.sleep(10000);
			
			TestNGResult.put("4", new Object[] {3d,"Click Login and verify welcome message","Login success","Pass"});
		} catch (Exception e) {
			TestNGResult.put("4", new Object[] {3d,"Click Login and verify welcome message","Login success","Fail"});
			Assert.assertTrue(false);
		}
		
	}
	@BeforeClass(alwaysRun = true)
	public void suiteSteUp() { 
		workbook = new HSSFWorkbook();
		sheet =workbook.createSheet("TestNG Result Summary");
		TestNGResult = new LinkedHashMap<String, Object>();
		TestNGResult.put("1", new Object[] {"Test Step No.","Action","Expected Output","Actual Output"});
		try {
			workingDir = System.getProperty("user.dir");
			datafile = new UIMap(workingDir + "\\Resources\\datafile.properties");
			uimap = new UIMap(workingDir +"\\Resources\\locator.properties");
		} catch (Exception e) {
			throw new IllegalStateException("Can't start the Firefox web driver",e);
			// TODO: handle exception
		}
	}
	
	@AfterClass
	public void suiteTearDown() { 
		Set<String> keyset = TestNGResult.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = (Object[]) TestNGResult.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof Date) { 
					cell.setCellValue((Date)obj);
				}
				else if(obj instanceof String) { 
					cell.setCellValue( (String)obj);
				}
				else if(obj instanceof Boolean) { 
					cell.setCellValue((Boolean)obj);
				}
				else if(obj instanceof Double) { 
					cell.setCellValue((Double)obj);
				}
				
			}
			
		}
		try {
			FileOutputStream out = new FileOutputStream(new File("SaveTestNGResultToExcel.xls"));
			workbook.write(out);
			out.close();
			System.out.println("Successfully saved Selenium WebDriver TestNG result to Excel File!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi file" + e);
		}

		driver.quit();
	}
	 
}
