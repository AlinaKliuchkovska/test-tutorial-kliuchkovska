package tutorialspoint;

import data_models.HomePage;
import org.junit.jupiter.api.Test;

public class CategoryTests extends BaseTest {
    @Test
    public void categoryTest() {
        HomePage homePage = new HomePage();
        homePage.clickCategoryButton()
                .chooseCategory(testData.CATEGORY)
                .chooseSubCategory(testData.SUB_CATEGORY)
                .assertCorrectPageOpened(testData.EXPECTED_URL)
                .assertPageTitle(testData.EXPECTED_PAGE_TITLE);
    }
}
