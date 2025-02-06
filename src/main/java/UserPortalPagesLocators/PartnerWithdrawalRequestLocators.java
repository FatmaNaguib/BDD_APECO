package UserPortalPagesLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PartnerWithdrawalRequestLocators {

	@FindBy(xpath = "(//input[@type=\"radio\"])[1]") public WebElement selectOwner_Radiobtn;
	@FindBy(xpath = "(//button[@ng-reflect-nz-type=\"primary\"])[1]") public WebElement selectOwnerNext_btn;
	@FindBy(xpath = "//h1[@class='ng-star-inserted']") public WebElement changePercentageTitle_label;

	
}
