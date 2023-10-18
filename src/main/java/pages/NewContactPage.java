package pages;

import elements.DropDown;
import elements.InputField;
import model.Contact;
import org.openqa.selenium.By;

public class NewContactPage extends BasePage {

    private static final String SAVE_BUTTON_XPATH = "//button[@name='SaveEdit']";
    private static final String SALUTATION_LABEL = "Salutation";
    private static final String LAST_NAME_LABEL = "Last Name";
    private static final String PHONE_LABEL = "Phone";


    public NewContactPage openContactPage() {
        driver.get("https://page-java-7530.lightning.force.com/lightning/o/Contact/new");
        return this;
    }

    public NewContactPage fillInSalutation(Contact contact) {
        new DropDown(SALUTATION_LABEL).selectOption(contact.getSalutation());
        return this;
    }

    public NewContactPage fillInLastName(Contact contact) {
        new InputField(LAST_NAME_LABEL).writeText(contact.getLastName());
        return this;
    }

    public NewContactPage fillInPhone(Contact contact) {
        new InputField(PHONE_LABEL).writeText(contact.getPhone());
        return this;
    }

    public void clickSave() {
        driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
    }
}
