package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Links1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravindra\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:4200/Login");
		driver.manage().window().maximize();
		List <WebElement> alllinks = driver.findElements(By.xpath("//*[@href or @src]"));
		int a=alllinks.size();
		System.out.println(a);
		Thread.sleep(5000);
	    for(int i=0;i<alllinks.size();i++){
	    if(alllinks.contains("riverdelta"))
	    alllinks.get(i).click();
	    driver.navigate().back();
	    }
	}
}