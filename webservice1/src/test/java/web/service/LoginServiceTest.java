package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/Users/lijia/Downloads/SIT707-java_project/8.1P-resources/webservice1/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("bruce");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("bruce_pass");
		
		// Find date of birth element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("05/05/2024"); // Updated date of birth
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "success");
		
		driver.close();
	}
	
	@Test
	public void testInvalidPass() {
		 System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			
			// Full path where login.html is located.
			// You can click on html file and copy the path shown in your browser.
			//
			driver.navigate().to(
					"C:/Users/lijia/Downloads/SIT707-java_project/8.1P-resources/webservice1/pages/login.html");
			sleep(5);
	        // Find username element
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("bruce");

	        // Find password element
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("invalid");

	        // Find date of birth element
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("05/05/2024"); // Updated date of birth

	        // Find Submit button and click on it
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        // Check the title of the page after login
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertEquals(title, "fail");

	        driver.close();
	    }
	 
	 @Test
	 public void testInvalidUsername() {
		 System.setProperty(
					"webdriver.chrome.driver", 
					"C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();		
			System.out.println("Driver info: " + driver);
			
			// Full path where login.html is located.
			// You can click on html file and copy the path shown in your browser.
			//
			driver.navigate().to(
					"C:/Users/lijia/Downloads/SIT707-java_project/8.1P-resources/webservice1/pages/login.html");
			sleep(5);
	        // Find username element
	        WebElement ele = driver.findElement(By.id("username"));
	        ele.clear();
	        ele.sendKeys("invalid");

	        // Find password element
	        ele = driver.findElement(By.id("passwd"));
	        ele.clear();
	        ele.sendKeys("bruce_pass");

	        // Find date of birth element
	        ele = driver.findElement(By.id("dob"));
	        ele.clear();
	        ele.sendKeys("05/05/2024"); // Updated date of birth

	        // Find Submit button and click on it
	        ele = driver.findElement(By.cssSelector("[type=submit]"));
	        ele.submit();

	        sleep(5);

	        // Check the title of the page after login
	        String title = driver.getTitle();
	        System.out.println("Title: " + title);

	        Assert.assertEquals(title, "fail");

	        driver.close();
	 }
	 
	@Test
	public void testInvalidDob() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"C:/Users/lijia/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.navigate().to(
				"C:/Users/lijia/Downloads/SIT707-java_project/8.1P-resources/webservice1/pages/login.html");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("bruce");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("bruce_pass");
		
		// Find date of birth element
        ele = driver.findElement(By.id("dob"));
        ele.clear();
        ele.sendKeys("04/05/2020"); // Updated date of birth
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "fail");
		
		driver.close();
	}
}
