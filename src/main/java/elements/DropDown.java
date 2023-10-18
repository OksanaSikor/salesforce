package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;

public class DropDown extends BasePage {

    private static final String DROP_DOWN_XPATH = "//label[contains(text(),'%s')]/ancestor::span//button";
    private static final String DROP_OPTION_XPATH = "//span[contains(text(), '%s')]";

    private String label;

    public DropDown(String label) {
        this.label = label;
    }

    public void selectOption(String option){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(String.format(DROP_DOWN_XPATH, label)))).click();
        driver.findElement(By.xpath(String.format(DROP_OPTION_XPATH, option))).click();
    }
}
