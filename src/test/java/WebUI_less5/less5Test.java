package WebUI_less5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class less5Test extends AbstractTest{

    //    Поиск категории "спорт"
    @Test
    void test1() {
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[12]/a")).click();
        driver.findElement(By.linkText("спорт")).click();
        Assertions.assertEquals("Спортивные блоги и аналитика — Живой Журнал — ЖЖ",driver.getTitle(),"Не та страница");
    }

    //    Добавление в корзину 3-ёх пакетов "юзерпиков"
    @Test
    void test2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[1]/div/ul/li[4]/a")).click();
        driver.findElement(By.linkText("Дополнительные юзерпики")).click();
        driver.findElement(By.xpath("//*[@id=\"count_3\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shop_userpics\"]/div[2]/ul[2]/li[1]/form/fieldset/div[2]/button")).click();
        String result = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/form/table/tbody/tr[2]/td[4]")).getText();
        Assertions.assertEquals("357 RUB",result,"не та страница");
    }

    //    Создание первой записи(Поста) "Привет мир"
    @Test
    void test3() {
        driver.findElement(By.cssSelector("body > div.s-layout.body-content.s-logged-in > header > div.s-header-in.clearfix > nav.s-nav-actions > ul > li.s-header-item.s-header-item--right.s-header-item--user.s-header-item--has-sub.s-header-item--personal.s-drop-master > a > span")).click();
        driver.findElement(By.linkText("Создать первую запись")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/textarea")).sendKeys("Привет");
        driver.findElement(By.xpath("//*[@id=\"editorWrapper\"]/div[1]/div[2]/div/div/div[2]/div")).sendKeys("Мир");
        driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/div/footer/div")).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/header/div[2]/div[1]/span[1]/a[2]")).click();
        String result = driver.findElement(By.linkText("Привет")).getText();
        System.out.println(result);
        Assertions.assertEquals("Привет",result,"не та страница");
    }

    //    Добавить в избранное статью про пенсильванию
    @Test
    void test4() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://ed-glezin.livejournal.com/1712231.html");
        driver.findElement(By.xpath("//*[@id=\"post-ed_glezin-1712231\"]/dt[1]/span/a[2]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[21]/div/div/div/div/div/ul/li[1]/label/span")).click();
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/header/div[1]/nav[2]/ul/li[2]/a/span")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#home > div.body-content > div.j-l-wrapper > div > div.j-l-page-wrapper > div > div > header > div.j-l-nav.ng-scope > div > ul > li.j-journal-nav-item.j-header-nav-item.j-header-nav-item-memories > a")).click();
        String result = driver.findElement(By.xpath("//*[@id=\"lenta-top\"]/article[1]/header/h3/a")).getText();
        System.out.println(result);
        Assertions.assertEquals("ed_glezin: Парк Форт-Хантер в городе Гаррисберг, штат Пенсильвания",result,"не та страница");
    }

//    Поставить лайк в стаье про сталинград
    @Test
    void test5() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://id77.livejournal.com/4858092.html?media&ila_campaign=medius&ila_location=main&ila_context=main_block");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[1]/div/div/span[1]/div[1]/button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://www.livejournal.com/actions/");
        driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div/div/ul/li[3]/a")).click();
        String result = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div/div/div/div/div/div[1]/div/a")).getText();
        System.out.println(result);
        Assertions.assertEquals("80-летию Сталинградской битвы посвещается. Книги.",result,"не та страница");
    }
}
