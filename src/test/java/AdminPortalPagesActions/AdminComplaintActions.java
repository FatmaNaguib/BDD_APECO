package AdminPortalPagesActions;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import AdminPortaPageslLocators.AdminComplaintLocatores;
import Bases.APECOTestBase;

public class AdminComplaintActions extends APECOTestBase {
	 AdminComplaintLocatores  adminComplaintLocatores;
	
	public AdminComplaintActions() throws IOException {
		 adminComplaintLocatores = new AdminComplaintLocatores();
		 PageFactory.initElements(driver,  adminComplaintLocatores);
		
			
	}
	
	public void adminClosesTheComplaint()  {
		adminComplaintLocatores.close_Btn.click();
		adminComplaintLocatores.save_Btn.click();
	}

}
