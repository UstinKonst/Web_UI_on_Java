package WebUI_less6;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class less6test4 extends Abstract {

    //    Добавить в избранное статью про пенсильванию

    @FindBy(xpath ="//*[@id=\"post-ed_glezin-1712231\"]/dt[1]/span/a[2]/img")
    private WebElement add;

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[21]/div/div/div/div/div/ul/li[1]/label/span")
    private WebElement publ;

    @FindBy(xpath ="//*[@id=\"js\"]/body/header/div[1]/nav[2]/ul/li[2]/a/span")
    private WebElement profile;

    @FindBy(css ="#home > div.body-content > div.j-l-wrapper > div > div.j-l-page-wrapper > div > div > header > div.j-l-nav.ng-scope > div > ul > li.j-journal-nav-item.j-header-nav-item.j-header-nav-item-memories > a")
    private WebElement favorites;

    @FindBy(xpath ="//*[@id=\"lenta-top\"]/article[1]/header/h3/a")
    public WebElement header;

    public less6test4(WebDriver driver) {
        super(driver);
    }

    public void addToFavorites() {
        try {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getDriver().get("https://ed-glezin.livejournal.com/1712231.html");
            add.click();
            publ.click();
            profile.click();
            favorites.click();
        } catch (NoSuchElementException e){
            Screenshot.makeScreenshot(getDriver(),
                    "Screenshot" + System.currentTimeMillis() + ".png");
        }
    }
}
