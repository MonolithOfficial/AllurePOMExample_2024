package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class CategoryPage extends BasePage {
    public ElementsCollection kartingOffers = $$x("//a[contains(@href,'karting') and not(contains(@class,'items-center'))]");
}
