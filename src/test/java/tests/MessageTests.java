package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

import static com.codeborne.selenide.Selenide.sleep;

public class MessageTests extends TestBase{
    public BaseSteps steps = new BaseSteps();

    @Test
    void openMessage() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.openMessageInHeader();
        steps.checkEqualMessage();
    }
}
