package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import steps.BaseSteps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationTests {
    public BaseSteps steps = new BaseSteps();

    @Test
    void demoTestAuthorization() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.checkHeader();
    }
}
