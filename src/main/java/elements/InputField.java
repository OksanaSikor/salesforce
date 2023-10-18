package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class InputField extends BasePage {

    private static final String INPUT_XPATH = "//label[contains(text(),'%s')]/ancestor::div[@part='input-text']//input";

    private String label;

    public InputField(String label) {
        this.label = label;
    }

    public void writeText(String text){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(String.format(INPUT_XPATH, label))))
                .sendKeys(text);
    }
}
