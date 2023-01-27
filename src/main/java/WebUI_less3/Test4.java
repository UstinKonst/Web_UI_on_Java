package WebUI_less3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test4 {

//    Создание первой записи(Поста) "Привет мир"
    public static void main( String[] args ) {
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

        WebElement webElement4 = driver.findElement(By.cssSelector("body > div.s-layout.body-content.s-logged-in > header > div.s-header-in.clearfix > nav.s-nav-actions > ul > li.s-header-item.s-header-item--right.s-header-item--user.s-header-item--has-sub.s-header-item--personal.s-drop-master > a > span"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.linkText("Создать первую запись"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/textarea"));
        webElement6.sendKeys("Привет");
        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"editorWrapper\"]/div[1]/div[2]/div/div/div[2]/div"));
        webElement7.sendKeys("Мир");
        WebElement webElement8 = driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button"));
        webElement8.click();
        WebElement webElement9 = driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/div/footer/div"));
        webElement9.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("323");
        WebElement webElement10 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/header/div[2]/div[1]/span[1]/a[2]"));
        webElement10.click();
    }
}
