import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class GettingStarted {

    private WebDriver driver;

    @Before
    public void setUp() {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/home/vaagn/projects/chromedriver/chromedriver"))
                .build();
        driver = new ChromeDriver(service);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void parentLocator() throws InterruptedException {
        driver.get("https://qa-mesto.praktikum-services.ru/");
    }
}
