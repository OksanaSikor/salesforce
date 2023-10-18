package pages;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.By;

public class NewAccountPage extends BasePage {

    private static final String SAVE_BUTTON_XPATH = "//button[@name='SaveEdit']";
    private static final String ACCOUNT_LABEL = "Account Name";
    private static final String WEBSITE_LABEL = "Website";
    private static final String INDUSTRY_LABEL = "Industry";

    public NewAccountPage openAccountPage() {
        driver.get("https://page-java-7530.lightning.force.com/lightning/o/Account/new");
        return this;
    }

    public NewAccountPage fillInAccountName(Account account) {
        new InputField(ACCOUNT_LABEL).writeText(account.getAccountName());
        return this;
    }

    public NewAccountPage fillInWebsite(Account account) {
        new InputField(WEBSITE_LABEL).writeText(account.getWebSite());
        return this;
    }

    public NewAccountPage fillInIndustry(Account account) {
        new DropDown(INDUSTRY_LABEL).selectOption(account.getIndustry());
        return this;
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
