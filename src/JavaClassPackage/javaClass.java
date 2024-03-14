package JavaClassPackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class javaClass {
	
	
	WebDriver driver = new ChromeDriver();

	@BeforeTest
    public void myBeforeTest() {

		driver.manage().window().maximize();

	}

	@Test()
	public void myfirstTest() throws InterruptedException {

		driver.get("https://www.saucedemo.com/inventory.html");

		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserName.sendKeys("standard_user");
		PasswordInputField.sendKeys("secret_sauce");
		LoginButton.click();
       List<WebElement> addtoCartButtons= driver.findElements(By.className("btn"));  
	//	List<WebElement> addtoCartButtons = driver.findElements(By.className("btn"));
//
//		addtoCartButtons.get(0).click();
//		addtoCartButtons.get(1).click();
//		addtoCartButtons.get(2).click();
//
//		addtoCartButtons.get(3).click();
//		addtoCartButtons.get(4).click();
//		addtoCartButtons.get(5).click();
		

	for(int i = 0 ; i <addtoCartButtons.size();i++) {
		
		addtoCartButtons.get(i).click(); 
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
