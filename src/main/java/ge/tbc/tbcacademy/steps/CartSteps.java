package ge.tbc.tbcacademy.steps;

import ge.tbc.tbcacademy.pages.CartPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static ge.tbc.tbcacademy.data.Constants.UNAUTHORIZED_MESSAGE;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Step("Submit order")
    public CartSteps submitOrder() {
        cartPage.submitOrderButton.scrollTo().click();

        return this;
    }

    @Step("Validate that the unauthorized user message appears")
    public CartSteps validateUnauthorizedMessage() {
        cartPage.unauthorizedWindow.shouldHave(text(UNAUTHORIZED_MESSAGE));

        return this;
    }
}
