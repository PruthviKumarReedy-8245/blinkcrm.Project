package blinkcrm;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBlinkcrm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://blinkcrm.in/");
		System.out.println("Successfully Blinkcrm webbrowser is opened");
		driver.manage().window().maximize();

		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		loginButton.click();
        System.out.println("successfully entered into login field");
        
        WebElement Email=driver.findElement(By.xpath("//input[@id='user_email']"));
        Email.sendKeys("pruthvireddy2120@gmail.com");
        
        WebElement Password=driver.findElement(By.xpath("//input[@id='user_password']"));
        Password.sendKeys("Pruthvi@8245");
        
        System.out.println("Please solve the CAPTCHA manually...");
        Thread.sleep(60000);
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
     	js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println("Scroll down");
        
        WebElement login=driver.findElement(By.xpath("//input[@type='submit' and @value='Log in']"));
        login.click();
        System.out.println("successfully login into a blinkcrrm dashboard");
        
        WebElement dropdownToggle = driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
        dropdownToggle.click();
        
        WebElement campaigns = driver.findElement(By.xpath("//a[@contains(text(),'Campaigns')]"));
        campaigns.click();
        driver.navigate().back();


        
        

	}

}
