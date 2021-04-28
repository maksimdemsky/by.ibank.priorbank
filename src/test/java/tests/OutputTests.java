package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

public class OutputTests {
    public BaseSteps steps = new BaseSteps();

    @Test
    void demoTestOutput() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickLogout();
    }
}
