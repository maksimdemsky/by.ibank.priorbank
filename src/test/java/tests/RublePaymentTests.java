package tests;

import org.junit.jupiter.api.Test;
import steps.BaseSteps;

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
        steps.checkHeaderInRublePayment();
    }

    @Test
    void createRublePayments() {
        steps.openMainPage();
        steps.insertTestData();
        steps.clickSubmit();
        steps.clickPaymentAndOtherOperationsTab();
        steps.clickPaymentsTab();
        steps.clickPaymentsInBelCurrencyTab();
        steps.clickRublePaymentsTab();
        steps.clickNewPaymentButton();
        steps.insertAmount();
        steps.insertRecipientName();
        steps.insertIBAN();
        steps.insertBankName();
        steps.insertUnp();
        steps.insertCbu();
        steps.insertAccountNumber();
        steps.savePayment();
    }
}
