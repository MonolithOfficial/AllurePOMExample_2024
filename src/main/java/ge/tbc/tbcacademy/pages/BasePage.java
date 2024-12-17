package ge.tbc.tbcacademy.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public SelenideElement sportLink = $x("//img[@alt='სპორტი ']");
    public SelenideElement cartLink = $x("//a[@href='/basket/']/child::img");
}
