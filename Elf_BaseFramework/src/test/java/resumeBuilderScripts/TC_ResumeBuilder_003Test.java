package resumeBuilderScripts;
/***
 * 
 * @author Ajay A
 *
 */
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.HomePage;
import pomRepository.SkillsPage;

public class TC_ResumeBuilder_003Test extends Base_Class{

	@Test(invocationCount = 1, threadPoolSize = 1, enabled = true)
	@DataProvider()
	public void ModifingSkillsModule() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		
		SkillsPage skillsPage = new SkillsPage(driver);
		
		skillsPage.getSkillsButton().click();
		skillsPage.getFrontEndTechnologiesDropdown().click();
		skillsPage.getCSSoption().click();
		skillsPage.getBackEndTechnologiesDropdown().click();
		skillsPage.getSQLoption().click();
		skillsPage.getMiddleWareTechnologiesDropdown().click();
		skillsPage.getRestFull_ServicesOption().click();
		skillsPage.getDesignPatternDropdown().click();
		skillsPage.getSingletonOption().click();
		skillsPage.getDataBase_UsedDropdown().click();
		skillsPage.getMongoDBOption().click();
		skillsPage.getVersionControlSystemDropdown().click();
		skillsPage.getGithubOption().click();
		skillsPage.getAWSDropdown().click();
		skillsPage.getEC2Option().click();
		skillsPage.getSDLCDropdown().click();
		skillsPage.getWaterFallOption().click();
		skillsPage.getDevelopmentToolsDropdown().click();
		skillsPage.getMavenOption().click();
		
		HomePage homePage = new HomePage(driver);
		
		homePage.getIncludeEducationCheckBox().click();
		
		actions.moveToElement(homePage.getDownloadButton()).perform();

		actions.moveToElement(homePage.getWORDbutton()).click().perform();


	}
}
