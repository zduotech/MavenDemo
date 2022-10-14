import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {
    public static void main(String[] args) {


        System.out.println("Hello");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.id("q")).sendKeys("iphone", Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("iphone"));

        driver.quit();

//        Faker fakeName = new Faker();
//        System.out.println(fakeName.name().fullName());
//
//        Assert.assertTrue(false);

        //FileUtils.copyFile(must pass );


    }
}
