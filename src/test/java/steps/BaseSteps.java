package steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.AttachmentHelper.*;

public class BaseSteps {
    String
            base_url = "https://www.ibank.priorbank.by/",
            clientName = "ООО \"ФИРМА\"",
            clientUnp = "УНП 111111116",
            userName = "Иванов Иван Иванович",
            sumForRublPayment = "1000",
            RecipientName = "ООО Автотест для Prior",
            iban = "08 PJCB 3012 0000 3610 0000 0933";


    @Step("Открываем страницу входа в Приорбанк для Бизнеса")
    public void openMainPage() {
        open(base_url);
    }

    @Step("Вводим данные в поля логин и пароль")
    public void insertTestData() {
        $("[name=UserName]").setValue("demotest");
        $("[name=Password]").setValue("123/*---");
    }

    @Step("Нажимаем кнопку \"Войти в банк\"")
    public void clickSubmit() {
        $("[type=submit]").click();
    }

    @Step("Проверяем в хэдере данные пользователя")
    public void checkHeader() {
        $("#header").shouldHave(text(clientName),
                text(clientUnp),
                text(userName));
    }

    @Step("Нажимаем кнопку \"Выйти\"")
    public void clickLogout() {
        $("#logout").click();
    }

    @Step("Нажать на вкладку \"Платежи и другие операции\"")
    public void clickPaymentAndOtherOperationsTab() {
        $("#menu-content").$(byText("Платежи и другие операции")).click();
    }

    @Step("Нажать на вкладку \"Платежи\"")
    public void clickPaymentsTab() {
        $("#menu-content").$(byText("Платежи")).click();
    }

    @Step("Нажать на вкладку \"Платежи в белорусских рублях\"")
    public void clickPaymentsInBelCurrencyTab() {
        $("#menu-content").$(byText("Платежи в белорусских рублях")).click();
    }

    @Step("Нажать на вкладку \"9 - Рублевая платежка\"")
    public void clickRublePaymentsTab() {
        $("#menu-content").$(byText("9 - Рублевая платежка")).click();
    }

    @Step("Нажать на вкладку \"45 - Сводное платежное поручение\"")
    public void clickConsolidatedPaymentOrderTab() {
        $("#menu-content").$(byText("45 - Сводное платежное поручение")).click();
    }

    @Step("Нажать на вкладку \"130 - Постоянно действующее платежное поручение (рубли)\"")
    public void clickStandingPaymentOrderInRublesTab() {
        $("#menu-content").$(byText("130 - Постоянно действующее платежное поручение (рубли)")).click();
    }

    @Step("Нажать на кнопку \"Новый\"")
    public void clickNewPaymentButton() {
        $(".document-menu").$(byText("Новый")).click();
    }

    @Step("Проверяем в хэдере данные пользователя")
    public void checkHeaderInRublePayment() {
        $("#content-header").shouldHave(text("Рублевая платежка"));
    }

    @Step("Проверяем в хэдере данные пользователя")
    public void checkHeaderInConsolidatedPaymentOrder() {
        $("#content-header").shouldHave(text("Сводное платежное поручение (СПП)"));
    }

    @Step("Проверяем в хэдере данные пользователя")
    public void checkHeaderInStandingPaymentOrderInRubles() {
        $("#content-header").shouldHave(text("Постоянно действующее платежное поручение (рубли)"));
    }

    @Step("Ввод в поле сумма")
    public void insertAmount() {
        $(".k-formatted-value.text-right.k-input").click();
        $("[name=Amount]").setValue(sumForRublPayment);
    }

    @Step("Ввод в IBAN в поле БЕНЕЦИФАР>")
    public void insertRecipientName() {
        $("#RecipientName").setValue(RecipientName);
    }

    @Step("Ввод в IBAN в поле БЕНЕФИЦИАР")
    public void insertIBAN() {
        $("[name=RecipientAccountNumber]").setValue(iban);
    }

    @Step("Ввод названия банка")
    public void insertBankName() {
        $("[name=RecipientBank]").setValue("ПРИОРБАНК").pressEnter();
    }

    @Step("Ввод УНП")
    public void insertUnp() {
        $("#RecipientUnp").setValue("101457038");
    }

    @Step("Ввод номера ЦБУ")
    public void insertCbu() {
        $("#RecipientBankCbu").setValue("115");
    }

    @Step("Выбор счёта плательщика")
    public void insertAccountNumber() {
        $$("[type=button]").get(13).click();
        $("#dictionaries").shouldHave(text("Счет BY17PJCB34711000002170000933 в 933")).click();
        $$("[role=row]").get(3).click();
        $("#btnDictionarySave").click();
    }

    @Step("Сохранение платежа")
    public void savePayment() {
        $("#btnSave").click();
    }
}