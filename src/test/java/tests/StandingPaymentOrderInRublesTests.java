package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

import static com.codeborne.selenide.Selenide.sleep;

public class StandingPaymentOrderInRublesTests extends TestBase {
    public BaseSteps steps = new BaseSteps();

    @Test
    void openStandingPaymentOrderInRubles() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickStandingPaymentOrderInRublesTab();
        steps.checkHeaderInStandingPaymentOrderInRubles();
    }

    @Test
    void createStandingPaymentOrderInRubles() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickStandingPaymentOrderInRublesTab();
        steps.clickNewPaymentButton();
    }
}