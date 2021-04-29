package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

public class ConsolidatedPaymentOrderTests extends TestBase {
    public BaseSteps steps = new BaseSteps();

    @Test
    void openConsolidatedPaymentOrder() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickConsolidatedPaymentOrderTab();
        steps.checkHeaderInConsolidatedPaymentOrder();
    }

    @Test
    void createConsolidatedPaymentOrder() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickConsolidatedPaymentOrderTab();
        steps.clickNewPaymentButton();
    }

}
