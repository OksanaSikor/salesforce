package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedAccountPage extends BasePage {

    @FindBy(xpath = "//div/descendant::*[@class='custom-truncate']")
    private WebElement savedAccountName;

    public String getSavedAccountName() {
        return savedAccountName.getText();
    }
}
