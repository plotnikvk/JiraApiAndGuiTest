package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.steps.BaseSteps;

public class MainPage extends BasePageObject {

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(id = "login-form-username")
    public WebElement loginWindow;

    @FindBy(id = "login-form-password")
    public WebElement passwordWindow;

    @FindBy(id = "login")
    public WebElement loginButton;

    @Override
    public void fillField(WebElement field, String value) {
        super.fillField(field, value);
    }
}
