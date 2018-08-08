package ru.steps;

import io.qameta.allure.Step;
import pages.StatusPage;

public class StatusSteps {
    StatusPage statusPage = new StatusPage();

    @Step("нажимаем на ссылку в окне")
    public void clickOnLinkInWindow(){
        statusPage.linkInWindow.click();
    }

    @Step("нажимаем на кнопку статуса")
    public void clickOnStatusButton(String statusItem){
        statusPage.selectCollectionItem(statusItem,statusPage.statusButton);
    }
}
