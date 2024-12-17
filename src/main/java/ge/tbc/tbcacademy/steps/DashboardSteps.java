package ge.tbc.tbcacademy.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.tbcacademy.pages.DashboardPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage(); // Could instead be declared in a Test class to expose selectors there.

    public DashboardSteps goToSport() {
        dashboardPage.sportLink.shouldBe(visible).click();

        return this;
    }
}
