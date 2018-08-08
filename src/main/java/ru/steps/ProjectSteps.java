package ru.steps;

import io.qameta.allure.Step;
import pages.ProjectPage;

public class ProjectSteps {
    ProjectPage projectPage = new ProjectPage();

    @Step("переход в меню проекты")
    public void selectProjectMenu(){
        projectPage.pojectLink.click();
        projectPage.allProjectLink.click();
    }
}
