package ge.tbc.tbcacademy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import ge.tbc.tbcacademy.listeners.CustomTestListener;
import ge.tbc.tbcacademy.steps.CartSteps;
import ge.tbc.tbcacademy.steps.CategorySteps;
import ge.tbc.tbcacademy.steps.DashboardSteps;
import ge.tbc.tbcacademy.steps.OfferSteps;
import ge.tbc.tbcacademy.util.ModdedAllureSelenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Listeners({CustomTestListener.class})
public class PurchaseOfferTests {
    DashboardSteps dashboardSteps;
    CategorySteps categorySteps;
    OfferSteps offerSteps;
    CartSteps cartSteps;

    @BeforeClass
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new ModdedAllureSelenide());
        dashboardSteps = new DashboardSteps();
        categorySteps = new CategorySteps();
        offerSteps = new OfferSteps();
        cartSteps = new CartSteps();
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        WebDriverManager.chromedriver().setup();
        open("https://swoop.ge");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Test(description = "Purchase offer while unauthorized")
    @Description("Try purchase an offer while unauthorized and check if the error message is displayed correctly upon placing the order.")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://fake-jira.com/testcase/SQDTBC-T2727")
    public void purchaseOfferUnauthorized() throws InterruptedException {
        dashboardSteps.goToSport();
        categorySteps.chooseRandomKartingOffer();
        offerSteps
                .clickAddToCart()
                .goToCart();
        cartSteps
                .submitOrder()
                .validateUnauthorizedMessage();
    }
}
