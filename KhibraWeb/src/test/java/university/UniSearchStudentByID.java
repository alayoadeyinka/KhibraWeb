 package university;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import utils.UniversityUtility;
import utils.log;
import utils.utility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileNotFoundException;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class UniSearchStudentByID extends UniversityUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=UniSearchStudentByUniqueID--------------------------------------------------------------");

	  UniversityUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testLoginElements() throws Exception {
		  
 try {
			  
			  
			  String filePath = System.getProperty("user.dir");
		 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
	   
			    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
				  
				  XSSFSheet sheets = workbook.getSheet("University");
				   
				  Row id = sheets.getRow(4);
				  Cell cell1 = id.getCell(1);
				  String ID  = cell1.getStringCellValue();
				  
				  Row wrongid = sheets.getRow(5);
				  Cell cell2 = wrongid.getCell(1);
				  String Wrongid  = cell2.getStringCellValue();
				  
				  
			  
			  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown")));	 
			  log.info("Menu Dropdown Available");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(objectrepo.getProperty("StudentsMenu"))).click();	 
			  log.info("Students Menu   Clicked ");
	     Thread.sleep(2000);
	     
	     
	     driver.findElement(By.xpath(objectrepo.getProperty("StudentSubTitle")));	 
	     
	     driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDRadio"))).click();	 
		  log.info("UniqueID Radio   Clicked ");
    Thread.sleep(2000);
    
   
    driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDTextbox"))).clear();  
  
    driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDTextbox"))).sendKeys(Wrongid);   
    log.info("Wrong Unique ID Entered  ");
    driver.findElement(By.xpath(objectrepo.getProperty("SearchButton"))).click();
    log.info("Search Button Clicked  ");
    Thread.sleep(2000);
    
    
    
    driver.findElement(By.xpath(objectrepo.getProperty("NoResultFound")));
    driver.findElement(By.xpath(objectrepo.getProperty("NoResultText")));
    driver.findElement(By.xpath(objectrepo.getProperty("NoResultImage")));
    
    log.info("No Result was displayed for Wrong Unique ID  ");
    driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDTextbox"))).clear();  
    
    driver.findElement(By.xpath(objectrepo.getProperty("UniqueIDTextbox"))).sendKeys(ID);   
    log.info("Correct Unique ID Entered  ");
    driver.findElement(By.xpath(objectrepo.getProperty("SearchButton"))).click();
    log.info("Search Button Clicked  ");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath(objectrepo.getProperty("OneResultFound")));
    
    driver.getPageSource().contains(ID);
  
    
    log.info("Unique ID Search was successful ");
    
    
    
    
    
    
		  
		 
			    log.info("End TEST-------------------------- UniSearchStudentByUniqueID------------------------");     
	    
			    log.info("END=PASSED");
			 	   

	  } 
  
		  catch (Exception e) {
			  log.info("END=FAILED");
			  Assert.fail(e.getMessage());
			  
		}
  
	  }
      

  
  
  
  @AfterMethod //AfterMethod annotation - This method executes after every test execution
  public void screenShot(ITestResult result){
  //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
  if(ITestResult.FAILURE==result.getStatus()){
  try{
  // To create reference of TakesScreenshot
  TakesScreenshot screenshot=(TakesScreenshot)driver;
  // Call method to capture screenshot
  File src=screenshot.getScreenshotAs(OutputType.FILE);
  // Copy files to specific location 
  // result.getName() will return name of test case so that screenshot name will be same as test case name
  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+new SimpleDateFormat("yyyyMMddhhmm").format(new Date())+".jpg"));

  System.out.println("Successfully captured a screenshot");
  }catch (Exception e){
  System.out.println("Exception while taking screenshot "+e.getMessage());
  } 
  }
  driver.quit();
  }
  
  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
  
  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	   
 
  
}
