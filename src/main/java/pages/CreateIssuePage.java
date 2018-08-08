package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.steps.BaseSteps;

import java.util.List;

public class CreateIssuePage extends BasePageObject {
    public CreateIssuePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(id = "create_link")
    public WebElement createLink;

    @FindBy(xpath = "//div[@id='issuetype-single-select']/input")
    public WebElement issueTypeCompare;

    @FindBy(xpath = "//div[@id='issuetype-single-select']/span")
    public WebElement issueTypeMenu;

    @FindBy(xpath = "//li[@role='option']/a")
    public List<WebElement>  issueItem;

    @FindBy(id = "summary")
    public WebElement nameOfIssue;

    @FindBy(id = "create-issue-submit")
    public WebElement createButton;
}
