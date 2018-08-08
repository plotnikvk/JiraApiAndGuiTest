package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.steps.BaseSteps;

public class ProjectPage extends BasePageObject {

    public ProjectPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    @FindBy(id = "browse_link")
    public WebElement pojectLink;

    @FindBy(id = "browse_link")
    public WebElement allProjectLink;
}
