package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Locators {
    public Locators() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "programs")
    public WebElement programs;

    @FindBy(id = "amIEligible")
    public WebElement amIEligible;

    @FindBy(xpath = "//img[@alt='Exit button']")
    public WebElement Exit;

    public void openurl(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
