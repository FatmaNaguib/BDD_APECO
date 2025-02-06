package UserPortalPagesLocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class UserServicesPageLocators {
	
	@FindBy(xpath = "//nz-page-header-title[text() = 'Services']") public WebElement servicesPageheaderlable;
	@FindBy(xpath="//span[normalize-space()='New Request']") public 	WebElement newRequestButton;
	@FindBy(xpath = "//span[contains(text(),'Initial application - Submission for a Private Sch')]") public WebElement initialApprovalServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Issuance of a New Permit')]") public WebElement finalApprovalServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Private School Renewal Application')]") public WebElement schoolLicenseRenewalServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Request for School License Cancellation']") public WebElement schoolLicenseCancelationServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Principal Change']") public WebElement changeSchoolManagerServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Request for Event Permit by an External Entity']") public WebElement eventPermitbyanExternalEntityServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Request for Certification of Experience Certificate for Employees']") public WebElement experienceCertificateforEmployeesServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Application for License Holder Change / Board Repr')]") public WebElement changeorAddPartnerServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Request for Modification or Addition to a Private ')]") public WebElement modificationorAdditiontoaSchoolServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Partner Withdrawal Request']") public WebElement PartnerWithdrawalServiceLink;
	@FindBy(xpath = "//span[normalize-space()='School Relocation Request']") public WebElement changeSchoolLocationServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Request for Modification or Increase in Tuition Fe')]") public WebElement modificationorIncreaseinTuitionFeesServiceLink;
	@FindBy(xpath = "//span[normalize-space()='School Name Change Request']") public WebElement changeSchoolNamelServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Principal Change']") public WebElement principalChangeServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Adding Educational Stages']") public WebElement addingEducationalStagesServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Reducing Educational Stages']") public WebElement reducingEducationalStagesServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Approval of Annual Activities and Programs']") public WebElement annualActivitiesandProgramsServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Appointment Notification for Employees in Private Schools']") public WebElement appointmentNotificationforEmployeesServiceLink;
	@FindBy(xpath = "//span[contains(text(),'Approval for Publishing Announcements for Private ')]") public WebElement publishingAnnouncementsServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Approval for International Travel']") public WebElement internationalTravelServiceLink;
	@FindBy(xpath = "//span[normalize-space()='Submit a Complaint (Service for Parents)']") public WebElement SubmitaComplaintServiceLink;
	@FindBy(xpath = "//span[@class='d-block text-center']") public WebElement draftsPopupText;
	@FindBy(xpath = "//div[normalize-space()='Education Services']")	public WebElement  educationServices;
	@FindBy(xpath = "//nz-select")	public WebElement  serviceType_ddl;
	@FindBy(xpath = "//div[normalize-space()='Parent Services']")	public WebElement  parentServices_ddlValue;
	@FindBy(xpath = "//nz-select-clear//span")	public WebElement  serviceType_xicon;
	@FindBy (xpath = "//body") 	public WebElement pageBody;
	@FindBy (xpath = "//span[normalize-space()='New Request']") public WebElement newRequest_btn;
	
}
