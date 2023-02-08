import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Exam {

	@Test
    void Selenium ()  {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/demo-site/");
        		
        		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Bowornlak");
              
                driver.findElement(By.id("vfb-7")).sendKeys("Yookong");
                //driver.findElement(By.id("vfb-31-1")).click();
                
                driver.findElement(By.id("vfb-13-address")).sendKeys("-");
                
                driver.findElement(By.id("vfb-13-address-2")).sendKeys("-");
                driver.findElement(By.id("vfb-13-city")).sendKeys("Yangnon");
                driver.findElement(By.id("vfb-13-state")).sendKeys("Supanburi");
                driver.findElement(By.id("vfb-13-zip")).sendKeys("72120");
               // Select option = new Select(driver.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[6]/span/span[1]/span")));
               // option.selectByVisibleText("Thailand");
                driver.findElement(By.id("vfb-14")).sendKeys("6442590398@webmail.npru.ac.th");
                driver.findElement(By.id("vfb-18")).sendKeys("02/08/2023");
                
               // driver.findElement(By.xpath("//*[@id="item-vfb-16"]/span[1]/span/span[1]/span/span[2]")).sendKeys("13");
              //  driver.findElement(By.xpath("//*[@id="item-vfb-16"]/span[2]/span/span[1]/span/span[2]")).sendKeys("30");
                driver.findElement(By.id("vfb-19")).sendKeys("0616387641");
                driver.findElement(By.id("vfb-20-0")).click();
                driver.findElement(By.id("vfb-20-1")).click();
               driver.findElement(By.id("vfb-20-2")).click();
                driver.findElement(By.id("vfb-20-3")).click();
                driver.findElement(By.id("vfb-20-4")).click();
                driver.findElement(By.id("vfb-20-5")).click();
                driver.findElement(By.id("vfb-23")).sendKeys("Why can't click bro kuay");
                driver.findElement(By.id("vfb-3")).sendKeys("99");
                driver.findElement(By.id("vfb-4")).click();
                String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
                assertEquals("Dynamic Transaction Verification", result);
                driver.quit();
                
                
                
    }
}
