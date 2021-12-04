import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3 {
    WebDriver driver;


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dropdown");
    }
    @org.junit.jupiter.api.Test
    public void dropdown() {
        WebElement element1 = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='1']"));
        element1.click();
        assertEquals(element1.isSelected(), true, "the 1st el is selected");
        WebElement element2 = driver.findElement(By.xpath("//select[@id='dropdown']/option[@value='2']"));
        element2.click();
        assertEquals(element2.isSelected(), true, "the 2nd el is selected");
    }
    @AfterEach
    public void tearDown() {driver.quit();
    }
}


