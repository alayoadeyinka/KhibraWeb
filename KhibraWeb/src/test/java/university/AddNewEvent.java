 package university;

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
import org.openqa.selenium.Keys;
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
import org.openqa.selenium.interactions.Actions;
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
 
public class AddNewEvent extends UniversityUtility{
	 
		
	@BeforeMethod
    public void setUp1() throws Exception {
	  log.info("START=AddNewEvent--------------------------------------------------------------");

	  UniversityUtilityclass();
    
    	
    		
}
	
	
	  @SuppressWarnings("rawtypes")
	@Test
	
	public void testAddNewEvent() throws Exception {
	     
try{
	  String filePath = System.getProperty("user.dir");
 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");

	    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		  
		  XSSFSheet sheets = workbook.getSheet("University");
		   
		  Row title = sheets.getRow(15);
		  Cell cell1 = title.getCell(1);
		  String Title  = cell1.getStringCellValue();
		  
		  Row startdate = sheets.getRow(16);
		  Cell cell2= startdate.getCell(1);
		  String Startdate  = cell2.getStringCellValue();
		  
		  Row enddate = sheets.getRow(17);
		  Cell cell3= enddate.getCell(1);
		  String Enddate  = cell3.getStringCellValue();
		  
		  Row employer1 = sheets.getRow(18);
		  Cell cell4= employer1.getCell(1);
		  String Employer1  = cell4.getStringCellValue();
		  
		  Row employer2 = sheets.getRow(19);
		  Cell cell5= employer2.getCell(1);
		  String Employer2  = cell5.getStringCellValue();
		  
		  Row message = sheets.getRow(20);
		  Cell cell6= message.getCell(1);
		  String Message  = cell6.getStringCellValue();
		  
		  Row attach = sheets.getRow(21);
		  Cell cell7= attach.getCell(1);
		  String Attach  = cell7.getStringCellValue();
			  
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(objectrepo.getProperty("MenuDropdown"))).click(); 
			  log.info("Menu Dropdown Available");
	  driver.findElement(By.xpath(objectrepo.getProperty("EventsHubMenuDropdown"))).click();	 
			  log.info("EventsHubMenu Button Clicked ");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath(objectrepo.getProperty("AddNewEventButton"))).click();	 
		  log.info("Add Event  Button Clicked ");
    Thread.sleep(2000);
	     
	     driver.findElement(By.xpath(objectrepo.getProperty("CancButton"))).click();	 
		  log.info("CancButton Button Clicked ");
    Thread.sleep(2000);

    driver.findElement(By.xpath(objectrepo.getProperty("AddNewEventButton"))).click();	 
	  log.info("AddNewEventButton	 Button Clicked ");
Thread.sleep(2000);

driver.findElement(By.xpath(objectrepo.getProperty("AllFieldsAlert")));
driver.findElement(By.xpath(objectrepo.getProperty("NoOfDays")));
driver.findElement(By.xpath(objectrepo.getProperty("EventTitle")));
driver.findElement(By.xpath(objectrepo.getProperty("EventStartDate")));
driver.findElement(By.xpath(objectrepo.getProperty("EventStartTime")));

driver.findElement(By.xpath(objectrepo.getProperty("EventStartTimeIcon")));

driver.findElement(By.xpath(objectrepo.getProperty("EventEndTimeIcon")));

driver.findElement(By.xpath(objectrepo.getProperty("EventEndDate")));
driver.findElement(By.xpath(objectrepo.getProperty("EventEndTime")));
driver.findElement(By.xpath(objectrepo.getProperty("VirtualEventLocation")));
driver.findElement(By.xpath(objectrepo.getProperty("NoEmployersEvent")));
driver.findElement(By.xpath(objectrepo.getProperty("InviteEmployersTextbox")));

driver.findElement(By.xpath(objectrepo.getProperty("EventMessage")));

driver.findElement(By.xpath(objectrepo.getProperty("EventAttachment")));
log.info("All Event Fields Validated");


driver.findElement(By.xpath(objectrepo.getProperty("EventTitle"))).sendKeys(Title);

driver.findElement(By.xpath(objectrepo.getProperty("EventStartDate"))).sendKeys(Startdate);

 
driver.findElement(By.xpath(objectrepo.getProperty("EventStartTimeIcon"))).click();

driver.findElement(By.xpath(objectrepo.getProperty("EventOKButton"))).click();


driver.findElement(By.xpath(objectrepo.getProperty("EventEndDate"))).sendKeys(Enddate);

driver.findElement(By.xpath(objectrepo.getProperty("EventEndTimeIcon"))).click();



driver.findElement(By.xpath(objectrepo.getProperty("EventOKButton"))).click();

driver.findElement(By.xpath(objectrepo.getProperty("InviteEmployersTextbox"))).sendKeys(Employer1);

Actions keyDown = new Actions(driver); 

keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();

driver.findElement(By.xpath(objectrepo.getProperty("InviteEmployersTextbox"))).sendKeys(Employer2);

keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();


driver.findElement(By.xpath(objectrepo.getProperty("TwoEmployerSelected")));



driver.findElement(By.xpath(objectrepo.getProperty("EventMessage"))).sendKeys(Message);

 
driver.findElement(By.xpath(objectrepo.getProperty("EventAttachment"))).sendKeys(System.getProperty("user.dir")+Attach);
log.info("All Event Fields Entered");

Thread.sleep(2000);

driver.findElement(By.xpath(objectrepo.getProperty("CreateEventButton"))).click();
Thread.sleep(2000);
log.info("Create Event Button Clicked");
driver.getPageSource().contains(Title);

log.info("Event Was Created Succesfully ");
				 



			    log.info("End TEST-------------------------- AddNewEvent------------------------");     
	    
			    log.info("END=PASSED");
			 	   

					  } 
				  
						  catch (Exception e) {
							  log.info("END=FAILED");
							  AssertJUnit.fail(e.getMessage());
							  
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
