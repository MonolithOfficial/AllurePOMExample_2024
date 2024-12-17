package ge.tbc.tbcacademy.steps;

import com.codeborne.selenide.CollectionCondition;
import ge.tbc.tbcacademy.pages.CategoryPage;
import io.qameta.allure.Step;

import java.util.Random;

import static com.codeborne.selenide.Condition.*;

public class CategorySteps {
    CategoryPage categoryPage = new CategoryPage();

    @Step("Choose random karting offer")
    public CategorySteps chooseRandomKartingOffer() throws InterruptedException {
        Random random = new Random();
        int offerIndex = random.nextInt(1, categoryPage.kartingOffers.size());
        categoryPage.kartingOffers
                .shouldHave(CollectionCondition.size(4))
                .get(offerIndex)
                .shouldBe(interactable)
                .scrollTo()
                .click();

        return this;
    }
}
