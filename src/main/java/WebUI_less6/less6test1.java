package WebUI_less6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class less6test1 extends Abstract{

    //    Поиск категории "спорт"

    @FindBy(xpath ="//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/div[1]/div/div/ul/li[12]/a")
    private WebElement more;

    @FindBy(linkText ="спорт")
    private WebElement sport;

    public less6test1(WebDriver driver) {
        super(driver);
    }

    public void SearchSport() {
        more.click();
        sport.click();
    }

}
