import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test6 {
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/typos");
    }
    @org.junit.jupiter.api.Test

    public void typosTest() {
            for (int i = 0; i < 10; i++) {
                driver.navigate().refresh();
                String withOrWithoutTypoText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
                assertEquals(withOrWithoutTypoText, "Sometimes you'll see a typo, other times you won't.", "Error: the word 'won,t' is misspelled");
            }
    }
    @AfterEach
    public void tearDown() {driver.quit();
    }
}
