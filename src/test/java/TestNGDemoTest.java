import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGDemoTest {

    WebDriver driver;


    @BeforeMethod // Configuration method
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


    @Test
    public void googleSearch(){

        driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("iphone"));

    }

    @Test
    public void googleSearch2(){

        driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().contains("iphone"));

    }
}
