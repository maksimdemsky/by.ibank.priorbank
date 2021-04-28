package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

public class OutputTests extends TestBase {
    public BaseSteps steps = new BaseSteps();

    @Test
    void demoTestOutput() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickLogout();
    }
}
