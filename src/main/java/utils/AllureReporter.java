package utils;

import gherkin.formatter.model.Result;
import io.qameta.allure.cucumberjvm.AllureCucumberJvm;
import ru.steps.BaseSteps;

public class AllureReporter extends AllureCucumberJvm {
    @Override
    public void result(final Result result) {
        if (result.getStatus().equals("failed")){
            BaseSteps.takeScreenshot();
        }
        super.result(result);
    }
}
