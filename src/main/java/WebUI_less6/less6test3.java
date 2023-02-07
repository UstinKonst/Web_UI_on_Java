package WebUI_less6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class less6test3 extends Abstract {

    //    Создание первой записи(Поста) "Привет мир"

    @FindBy(css ="body > div.s-layout.body-content.s-logged-in > header > div.s-header-in.clearfix > nav.s-nav-actions > ul > li.s-header-item.s-header-item--right.s-header-item--user.s-header-item--has-sub.s-header-item--personal.s-drop-master > a > span")
    private WebElement profile1;

    @FindBy(linkText ="Создать первую запись")
    private WebElement createFirstEntry;

    @FindBy(xpath ="//*[@id=\"content\"]/div/div/div[2]/textarea")
    private WebElement header;

    @FindBy(xpath ="//*[@id=\"editorWrapper\"]/div[1]/div[2]/div/div/div[2]/div")
    private WebElement textarea;

    @FindBy(xpath ="/html/body/div[6]/footer/div/div/div[2]/div[2]/button")
    private WebElement create1;

    @FindBy(xpath ="/html/body/div[6]/footer/div/div/div[2]/div[2]/div/footer/div")
    private WebElement create2;

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[3]/header/div[2]/div[1]/span[1]/a[2]")
    private WebElement profile2;

    @FindBy(linkText ="Привет")
    public WebElement hi;

    public less6test3(WebDriver driver) {
        super(driver);
    }

    public void addToBasketUserpics() {
    profile1.click();
    createFirstEntry.click();
    header.sendKeys("Привет");
    textarea.sendKeys("Мир");
    create1.click();
    create2.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    profile2.click();
    }
}
