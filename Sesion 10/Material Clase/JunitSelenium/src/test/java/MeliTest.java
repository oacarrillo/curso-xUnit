import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeliTest {
    static private WebDriver driver;

    @BeforeAll
    static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    void BuscarProduuctoEnMeli(){
        driver.get("https://www.mercadolibre.com.co/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"cb1-edit\"]")).sendKeys("galaxy a30");
        driver.findElement(By.xpath("//*[@id=\"cb1-edit\"]")).sendKeys(Keys.ENTER);
        driver.close();
    }

}
