package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.steps.BaseSteps;

import java.util.List;

public class StatusPage extends BasePageObject {
    public StatusPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='aui-flag-container']//a[@class='issue-created-key issue-link']")
    public WebElement linkInWindow;

    @FindBy(xpath = "//div[@id='opsbar-opsbar-transitions']//span[@class='trigger-label']")
    public List<WebElement> statusButton;
}
