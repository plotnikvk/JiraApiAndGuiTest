package ru.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    ProjectSteps projectSteps = new ProjectSteps();
    CreateIssueSteps createIssueSteps = new CreateIssueSteps();
    StatusSteps statusSteps = new StatusSteps();

    @Дано("^аутентификация в Jira с логином \"([^\"]*)\" и паролем \"([^\"]*)\"$")
    public void loginJira (String login, String password)throws Throwable{
        mainSteps.authorisationMethod(login,password);
    }
    @Когда("^переход в меню проекты$")
    public void selectProjectMenu()throws Throwable{
        projectSteps.selectProjectMenu();
    }
    @Когда("^инициируем создание issue$")
    public void initCreateIssue() throws Throwable{
        createIssueSteps.createClick();
    }
    @И("^выбираем тип issue \"([^\"]*)\"$")
    public void selectIssueType(String issueType) throws Throwable {
        createIssueSteps.selectIssueType(issueType);
    }

    @И("^заполняем имя \"([^\"]*)\"$")
    public void fillIssueName(String issueName) throws Throwable {
        createIssueSteps.fillIssueName(issueName);
    }

    @И("^нажимаем кнопку создать$")
    public void clickCreateButton() throws Throwable {
        createIssueSteps.clickCreateButton();
    }

    @Тогда("^нажимаем на ссылку в окне$")
    public void clickOnLinkInWindow() throws Throwable{
       statusSteps.clickOnLinkInWindow();
    }

    @Тогда("^нажимаем на кнопку статуса \"([^\"]*)\"$")
    public void clickOnStatusButton(String status) throws Throwable{
        statusSteps.clickOnStatusButton(status);
    }
}
