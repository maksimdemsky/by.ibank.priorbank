package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

import static com.codeborne.selenide.Selenide.sleep;


public class RublePaymentTests extends TestBase {
    public BaseSteps steps = new BaseSteps();

    @Test
    void openRublePayments() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickRublePaymentsTab();
        sleep(2000);
    }
}
