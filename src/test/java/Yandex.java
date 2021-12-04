import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yandex {
    WebDriver driver;


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://yandex.by/");
    }

    @org.junit.jupiter.api.Test
    public void SendTest() {
//        WebElement button = driver.findElement(By.xpath("//div[@a.home-link.desk-notif-card__domik-mail-line.home-link_black_yes]"));
        WebElement button = driver.findElement(By.xpath("//a.home-link.desk-notif-card__domik-mail-line.home-link_black_yes"));
        button.click();
//        driver.findElement(By.className("desk-notif-card_mail-title")).click();
//        int deletedButtonsQuantity = driver.findElements(By.className("desk-notif-card_mail-title")).size();
//        Assertions.assertEquals(deletedButtonsQuantity, 1, "123");

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

//      Assertions.assertEquals("Welcome Prachika", userName.getText());
//    }

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
    }
}
