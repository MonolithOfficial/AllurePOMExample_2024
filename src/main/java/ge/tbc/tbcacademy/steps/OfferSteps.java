package ge.tbc.tbcacademy.steps;

import ge.tbc.tbcacademy.pages.OfferPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static ge.tbc.tbcacademy.data.Constants.UNAUTHORIZED_MESSAGE;

public class OfferSteps {
    OfferPage offerPage = new OfferPage();

    @Step("Click 'კალათაში დამატება' button")
    public OfferSteps clickAddToCart(){
        offerPage.addToCartButton.shouldBe(visible).scrollTo().click();

        return this;
    }

    @Step("Click on the cart icon")
    public OfferSteps goToCart(){
        offerPage.cartLink.click();

        return this;
    }
}
