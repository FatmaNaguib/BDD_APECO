package AdminPortaPageslLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEventPermitbyanExternalEntityLocators {

	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]") public WebElement approve_Btn;
	@FindBy(xpath = "//button[normalize-space(text())=\"Save\"]") public WebElement approvalSave_btn;
}
