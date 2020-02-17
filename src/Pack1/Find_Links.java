package Pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Find_Links {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravindra\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://sujainfo.com/");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id='slider-2-slide-11-layer-10']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@href or @src]"));
		
		int a= list.size();
		System.out.println("Total Links in a WebPage:" + a);
		
		
		
		System.out.println("==================================================================================================");		
		for(WebElement e : list)
		{
	           String link = e.getAttribute("href");
	           if(null==link)
	           link=e.getAttribute("src");
	           String s=e.getTagName() + "=" + link;
	           if(link.contains("dakshat"))
               System.out.println("river delta links===" +link);
	           
	    }
	}
}
