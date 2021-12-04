import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
    WebDriver driver;


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }
    @org.junit.jupiter.api.Test
    public void addRemoveElementsTest() {
        WebElement button = driver.findElement(By.xpath("//button[text()='Add Element']"));
        button.click();
        button.click();
        driver.findElement(By.className("added-manually")).click();
        int deletedButtonsQuantity = driver.findElements(By.className("added-manually")).size();
        Assertions.assertEquals(deletedButtonsQuantity, 1, "One button is remaining");

//        WebElement login = driver.findElement(By.id("txtUsername"));
//        login.sendKeys("Admin");
//        WebElement password = driver.findElement(By.id("txtPassword"));
//        password.sendKeys("admin123");
//        WebElement button = driver.findElement(By.id("btnLogin"));
//        button.click();

//        authPage.insertLogin("Admin");
//        authPage.insertPassword("admin123");
//        authPage.clickSignInButton();

//        WebElement userName = driver.findElement(By.id("welcome"));

//        Assertions.assertEquals("Welcome Prachika", userName.getText());
    }

//    @org.junit.jupiter.api.Test
//    public void wrongPassword() {
////        WebElement login = driver.findElement(By.id("txtUsername"));
////        login.sendKeys("Admin");
////        WebElement login1 = driver.findElement(By.id("txtPassword"));
////        login1.sendKeys("admin123456");
////        driver.findElement(By.id("btnLogin")).click();
//
//        authPage.insertLogin("Admin");
//        authPage.insertPassword("admin123456");
//        authPage.clickSignInButton();
//        String warningText = driver.findElement(By.id("Invalid credentials")).getText();
//
//        Assertions.assertEquals("Invalid credentials", warningText);
//    }
//
//    @org.junit.jupiter.api.Test
//    public void emptyPassword() {
//        authPage.insertLogin("Admin");
//        authPage.clickSignInButton();
//
//        String warningText = authPage.getErrorMessage();
//        Assertions.assertEquals("Password can not be empty", warningText);
//    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

