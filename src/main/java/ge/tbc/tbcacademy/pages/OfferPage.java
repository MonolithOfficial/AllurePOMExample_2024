package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OfferPage extends BasePage {
    public SelenideElement addToCartButton = $x("//p[text()='კალათაში დამატება']/parent::button");
}
