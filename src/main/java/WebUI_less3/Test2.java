package WebUI_less3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

//    Поиск категории "спорт"
public class Test2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com");


        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[2]/ul/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.id("user"));
        webElement2.sendKeys("uitestweb");
        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("Yamamoto_tsunetomo");
        webElement3.submit();

        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[12]/a"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.linkText("спорт"));
        webElement5.click();
    }
}