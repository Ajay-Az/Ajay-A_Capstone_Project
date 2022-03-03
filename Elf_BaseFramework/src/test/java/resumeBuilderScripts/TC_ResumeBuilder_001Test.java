package resumeBuilderScripts;

/***
 * 
 * @author Ajay A
 *
 */
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.EducationDetailsPage;
import pomRepository.EducationPage;
import pomRepository.HomePage;
import pomRepository.ProfilePage;
import pomRepository.SkillsPage;
import pomRepository.SummaryPage;


public class TC_ResumeBuilder_001Test extends Base_Class{
	@Test(invocationCount = 1, threadPoolSize = 1, enabled = true)
	@DataProvider()
	public void CreatingResume() {
		
		//Action
		Actions actions = new Actions(driver);
		
		String FirstName = excelLib.readAnyDataFromExcelInString("sheet1",0,0 );
		String LastName = excelLib.readAnyDataFromExcelInString("sheet1", 0, 1);
		String Summary = excelLib.readAnyDataFromExcelInString("sheet1", 1, 0);
		String ProjectName = excelLib.readAnyDataFromExcelInString("sheet1", 2, 0);
		String ProjectDescription = excelLib.readAnyDataFromExcelInString("sheet1", 2, 1);
		String PassedYear = excelLib.readAnyDataFromExcelInString("sheet1", 2, 2);
		String expectedTitle = excelLib.readAnyDataFromExcelInString("sheet1", 3, 0);
		
		ProfilePage profilePage = new ProfilePage(driver);
		Assert.assertEquals(driver.getTitle(), expectedTitle,"Profile page is not displayed");
		Reporter.log("Profile page is displayed succesfully");
		profilePage.getFirstName().clear();
		profilePage.getFirstName().sendKeys(FirstName);
		profilePage.getLastName().clear();
		profilePage.getLastName().sendKeys(LastName);
		profilePage.getProfileTechnologyDropdown().click();
		profilePage.getMERN_Tech().click();
		
		SummaryPage summaryPage = new SummaryPage(driver);
		
		summaryPage.getSummaryButton().click();
		
		actions.moveToElement(summaryPage.getSummaryText()).doubleClick().sendKeys(Summary).perform();
		
		SkillsPage skillsPage = new SkillsPage(driver);
		
		skillsPage.getSkillsButton().click();
		skillsPage.getFrontEndTechnologiesDropdown().click();
		skillsPage.getHTMLoption().click();
		skillsPage.getBackEndTechnologiesDropdown().click();
		skillsPage.getJava1_8_option().click();
		
		EducationPage educationPage = new EducationPage(driver);

		educationPage.getEducationButton().click();
		educationPage.getHigherEducationDropdown().click();
		educationPage.getBE_B_TECH_option().click();
		educationPage.getSpecializationDropdown().click();
		educationPage.getAdministrative_Leadershipoption().click();
		educationPage.getUniversityDropdown().click();
		educationPage.getVisveswaraiah_Technological_University_option().click();
		actions.moveToElement(educationPage.getPassOutYearTextField()).doubleClick().sendKeys(PassedYear).perform();
		
		EducationDetailsPage educationDetailsPage = new EducationDetailsPage(driver);
		
		educationDetailsPage.getProjectDetailsButton().click();
		actions.moveToElement(educationDetailsPage.getProjectNameTextField()).doubleClick().sendKeys(ProjectName).perform();
		actions.moveToElement(educationDetailsPage.getProjectDescriptionTextField()).doubleClick().sendKeys(ProjectDescription).perform();
		
		HomePage homePage = new HomePage(driver);
		
		
		actions.moveToElement(homePage.getDownloadButton()).perform();
		actions.moveToElement(homePage.getPDFbutton()).click().perform();
		
	}
}
