package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	

	
	public void testSingleInputField() throws InterruptedException {
	// Windows
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");


	// 1. Configure Selenium to talk to Chrome
	System.setProperty("webdriver.chrome.driver","/Users/macstudent/Desktop/chromedriver");
	WebDriver driver = new ChromeDriver();

	// 2. Enter the website you want to go to
	String baseUrl = "https://www.mcdonalds.com/ca/en-ca.html";

	// 3. Open Chrome and go to the base url;
	driver.get(baseUrl);

	// 4. Enter a username
	// ---------------------
	// 4a. Find the box
	Thread.sleep(5000);
	
	WebElement firstnameBox = driver.findElement(By.id("firstname2"));
	// 4b. Put the user name in there
	firstnameBox.sendKeys("kbkakhil");
	Thread.sleep(4000);

	// 5. Enter a password
	// ---------------------
	// 5a. Find the password box
	
	WebElement emailBox = driver.findElement(By.id("email2"));
	// 5b. Put the password in there
	emailBox.sendKeys("kbkakhil459@gmail.com");
	Thread.sleep(4000);
	
	
	WebElement postalBox = driver.findElement(By.id("postalcode2"));
	// 5b. Put the password in there
	postalBox.sendKeys("a1b");
	Thread.sleep(1000);

	// 6. Press the login button
	// ---------------------
	// 6a. Find the login button
	WebElement subscribeButton = driver.findElement(By.id("g-recaptcha-btn-2"));
	// 6b. Click the button
	subscribeButton.click();

	// 7. Close the browser
	Thread.sleep(5000);
	//driver.close();
	
//	WebElement verifyButton = driver.findElement(By.id("recaptcha-verify-button-2"));
//	// 6b. Click the button
//	verifyButton.click();



	// get the actual value of the title
	//actualTitle = driver.getTitle();
	//System.out.println("Title of webpage: " + actualTitle);



	/*
	* compare the actual title of the page with the expected one and print
	* the result as "Passed" or "Failed"
	*/
	//if (actualTitle.contentEquals(expectedTitle)){
	// System.out.println("Test Passed!");
	//} else {
	// System.out.println("Test Failed");
	// }
	//
	// //close Chrome
	// driver.close();

		}
	}

