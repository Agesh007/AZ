package OrangeHRM;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class orange {

	@Test
	
		public  void launchbrowser()throws InterruptedException {
		System.out.print("helloooo...web page launching with firefox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.26.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/auth/login");
		Thread.sleep(1000);
	
		
		
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Ageshms007@");
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(1000);
			System.out.print("Click PIM");
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			Thread.sleep(1000);
			System.out.print("Add Employee");
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("firstName")).sendKeys("Agesh");
			driver.findElement(By.name("middleName")).sendKeys("M");
			driver.findElement(By.name("lastName")).sendKeys("S");
			driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
			driver.close();
	}
	
	}


		
	
	
	
	

	
