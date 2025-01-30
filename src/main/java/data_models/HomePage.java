package data_models;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {
    private final SelenideElement categoryButton = $x("//button[@aria-controls='category']");
    private final SelenideElement popup = $x("//div[@aria-label='TUTORIALS POINT asks for your consent to:']");
    private final SelenideElement consentButton = $x("//button[@aria-label='Consent']");

    public CategoryPopup clickCategoryButton() {
        if (popup.isDisplayed())
            consentButton.click();
        categoryButton.shouldBe(Condition.interactable, duration).click();
        return new CategoryPopup();
    }
}