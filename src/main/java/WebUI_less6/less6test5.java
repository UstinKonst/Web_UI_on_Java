package WebUI_less6;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class less6test5 extends Abstract {

    //    Поставить лайк в стаье про сталинград

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[1]/div/div/span[1]/div[1]/button")
    private WebElement like;

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div/div/ul/li[3]/a")
    private WebElement reaction;

    @FindBy(css ="body > div.s-layout.body-content.s-logged-in > div.s-body > div.s-main.b-service > div > div > div > div > div > div.recent-comments-cell.recent-comments-cell-content > div > a")
    public WebElement record;

    public less6test5(WebDriver driver) {
        super(driver);
    }

    public void like() {
        try {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getDriver().get("https://id77.livejournal.com/4858092.html?media&ila_campaign=medius&ila_location=main&ila_context=main_block");
            like.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getDriver().get("https://www.livejournal.com/actions/");
            reaction.click();
        } catch (NoSuchElementException e){
            Screenshot.makeScreenshot(getDriver(),
                    "Screenshot" + System.currentTimeMillis() + ".png");
        }
    }
}
