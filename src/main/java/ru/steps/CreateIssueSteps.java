package ru.steps;

import io.qameta.allure.Step;
import pages.CreateIssuePage;

public class CreateIssueSteps {
    CreateIssuePage createIssuePage = new CreateIssuePage();

    @Step("инициируем создание issue")
    public void createClick(){
        createIssuePage.createLink.click();
    }

    @Step("выбираем тип issue")
    public void selectIssueType(String issueType){
        String current = createIssuePage.issueTypeCompare.getAttribute("value");
        if(!issueType.equals(current)){
            createIssuePage.issueTypeMenu.click();
            createIssuePage.selectCollectionItem(issueType,createIssuePage.issueItem);
        }
    }

    @Step("заполняем имя")
    public void fillIssueName(String issueName){
        createIssuePage.fillField(createIssuePage.nameOfIssue,issueName);
    }

    @Step("нажимаем кнопку создать")
    public void clickCreateButton(){
        createIssuePage.createButton.click();
    }
}
