package ru.steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @Step("аутентификация в Jira")
    public void authorisationMethod(String login, String password){
        mainPage.fillField(mainPage.loginWindow,login);
        mainPage.fillField(mainPage.passwordWindow,password);
        mainPage.loginButton.click();
    }
}
