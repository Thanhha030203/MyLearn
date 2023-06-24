package fpoly;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SaveTestNGResultToExcel {
	public WebDriver driver;
	public UIMap uimap;
	public UIMap datafile;
	public String workingDir;
	
	HSSFWorkbook workbook;
	
	HSSFSheet sheet;
	
	Map<String, Object[]> TestNGResult;
	public static String driverPath = "D:\\Excel";
	
	@Test(description = "Open the TestNG Demo Website for Login Test", priority = 1)
	public void LaunchWebsite() throws Exception{
		try {
			driver.get("https://accounts.spotify.com/vi-VN/login");
			driver.manage().window().maximize();
			TestNGResult.put("2", new Object[] {1d,"Navigate to demo website","Site gets opened","Pass"});
		} catch (Exception e) {
			TestNGResult.put("2", new Object[] {1d,"Navigate to demo website","Site gets opened","Fail"});
			Assert.assertTrue(false);
		}
	}
	@Test(description = "Fill the Login Details", priority = 2)
	public void FillLoginDetails() throws Exception{
		try {
			WebElement username = driver.findElement(uimap.getLocator("Username_field"));
			username.sendKeys(datafile.getData("username"));	
			WebElement password = driver.findElement(uimap.getLocator("Password_field"));
			password.sendKeys(datafile.getData("password"));
			Thread.sleep(1000);
			TestNGResult.put("3", new Object[] {2d,"Fill Login form data (Username/Password)","Login details get field","Pass"});
		} catch (Exception e) {
			TestNGResult.put("3", new Object[] {2d,"Fill Login form data (Username/Password)","Login details get field","Fail"});
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
	public void suiteSetup() {
		 workbook = new HSSFWorkbook();
		 
		 sheet = workbook.createSheet("TestNG Result Summary");
		 TestNGResult = new LinkedHashMap<String, Object[]>();
TestNGResult.put("1", new Object[] {"Test Step No","Action","Expected Output","Actual Output"});
		 
		 try {
			workingDir = System.getProperty("user.dir");
			datafile = new UIMap(workingDir + "\\resources\\datafile.properties");
			uimap = new UIMap(workingDir + "\\resources\\locator.properties");
			
			System.setProperty("webdriver.chrome.driver", "D:\\FPT Polytechnic\\SPR23\\TestAdvanced\\TaiNguyen\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(Options);
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new IllegalStateException("Can't start the Firefox Web Driver",e);
		}
	}
	@AfterClass
	public void suiteTearDown() throws IOException {
		
		Set<String> keyset = TestNGResult.keySet();
		int rownum = 0;
		 for(String key: keyset) {
			 Row row = sheet.createRow(rownum++);
			 Object [] objArr = TestNGResult.get(key);
			 int cellnum = 0;
			 for(Object obj: objArr) {
				 org.apache.poi.ss.usermodel.Cell cell = row.createCell(cellnum++);
				 if(obj instanceof Date) {
					 ((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((Date) obj);
				 }else if (obj instanceof Boolean) {
					 ((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((Boolean) obj);
				}else if (obj instanceof String) {
					((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((String) obj);
				}else if(obj instanceof Double) {
					((org.apache.poi.ss.usermodel.Cell) cell).setCellValue((Double) obj);
				}
			 }
		 }
		 try {
			 FileOutputStream out = new FileOutputStream(new File("SaveTestNGResultToExcel.xls"));
				workbook.write(out);
				out.close();
				System.out.println("Successfully saved Selenium WebDriver TestNG result to Excel File!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	 
		driver.quit();
	}
}