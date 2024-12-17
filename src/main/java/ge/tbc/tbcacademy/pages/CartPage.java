package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CartPage extends BasePage {
    public SelenideElement submitOrderButton = $x("//p[text()='შეკვეთის გაფორმება']/parent::button");
    public SelenideElement unauthorizedWindow = $x("//img[@alt='user']/parent::div//p[contains(@class,'text-center')]");

}
