package data_models;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CategoryPopup extends BasePage {
    private final SelenideElement categoryDropdown = $x("//div[@id='categories']");
    private final SelenideElement categoriesMenu = $x(" //div[@class='categories-menu-content']");

    public CategoryPopup chooseCategory(String category) {
        categoryDropdown.shouldBe(Condition.interactable, duration);
        SelenideElement categoryBtn = $x("//li[@class='category-button' and contains(text(),'" + category + "')]");
        categoryBtn.shouldBe(Condition.interactable, duration).click();
        return this;
    }

    public CategoryPopup chooseSubCategory(String subCategory) {
        categoriesMenu.shouldBe(Condition.interactable, duration);
        SelenideElement subCategoryBtn = $x("//a[contains(text(),'" + subCategory + "')]");
        subCategoryBtn.shouldBe(Condition.interactable, duration).click();
        return this;
    }

    public CategoryPopup assertCorrectPageOpened(String expectedUrl) {
        assertThat(url())
                .as("Verify the correct page is opened")
                .isEqualTo(expectedUrl);
        return this;
    }

    public void assertPageTitle(String expectedPageTitle) {
        assertThat($x("//div[@id='mainContent']/h1").getText())
                .as("Verify the correct page title")
                .isEqualTo(expectedPageTitle);
    }
}
