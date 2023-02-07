package WebUI_less6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class less6test2 extends Abstract {

    //    Добавление в корзину 3-ёх пакетов "юзерпиков"

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[2]/header/div[1]/nav[1]/div/ul/li[4]/a")
    private WebElement shop;

    @FindBy(linkText ="Дополнительные юзерпики")
    private WebElement additionalUserpics;

    @FindBy(xpath ="//*[@id=\"count_3\"]")
    private WebElement userpics15;

    @FindBy(xpath ="//*[@id=\"shop_userpics\"]/div[2]/ul[2]/li[1]/form/fieldset/div[2]/button")
    private WebElement addToBasket;

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/form/table/tbody/tr[2]/td[4]")
    public WebElement check;

    public less6test2(WebDriver driver) {
        super(driver);
    }

    public void addToBasketUserpics() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        shop.click();
        additionalUserpics.click();
        userpics15.click();
        addToBasket.click();
    }
}
