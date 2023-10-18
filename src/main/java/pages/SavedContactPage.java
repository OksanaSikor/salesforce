package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedContactPage extends BasePage {

    @FindBy(xpath = "//span[@class='custom-truncate uiOutputText']")
    private WebElement savedContactName;

    public String getSavedContactName() {
        return savedContactName.getText();
    }
}
