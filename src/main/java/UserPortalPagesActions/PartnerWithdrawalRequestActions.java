package UserPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Bases.APECOTestBase;
import UserPortalPagesLocators.PartnerWithdrawalRequestLocators;

public class PartnerWithdrawalRequestActions  extends APECOTestBase {

	PartnerWithdrawalRequestLocators partnerWithdrawalRequestLocators;
	public PartnerWithdrawalRequestActions() throws IOException {
		super();
		 partnerWithdrawalRequestLocators = new PartnerWithdrawalRequestLocators();
		 PageFactory.initElements(driver,partnerWithdrawalRequestLocators);
	}
	public String  selectOwner() {
		partnerWithdrawalRequestLocators.selectOwner_Radiobtn.click();
		commonFunctions.moveToWebElement(partnerWithdrawalRequestLocators.selectOwnerNext_btn);
		partnerWithdrawalRequestLocators.selectOwnerNext_btn.click();
		String changePercentageTitle = partnerWithdrawalRequestLocators.changePercentageTitle_label.getText();
		return  changePercentageTitle;
	}
	

}
