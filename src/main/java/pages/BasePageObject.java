package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.steps.BaseSteps;

import java.util.List;

public class BasePageObject {
    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(WebElement field, String value){
        field.click();
        field.clear();
        field.sendKeys(value);
    }

    public void selectCollectionItem(String itemName, List<WebElement> collection){
        for (WebElement item : collection ){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
        }
        Assert.fail("Не найден элемент коллеции - " + itemName);
    }
}
