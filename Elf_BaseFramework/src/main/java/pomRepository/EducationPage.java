package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationPage {

	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Education Elements.
	@FindBy(xpath="//button[text()='Education']") private WebElement EducationButton;
	@FindBy(xpath="//select[@id='Highest Education']") private WebElement HigherEducationDropdown;
	@FindBy(xpath="//option[.='BE/B.Tech']") private WebElement BE_B_TECH_option;
	
	@FindBy(xpath="//select[@id=\"Specialization\"]") private WebElement SpecializationDropdown;
	@FindBy(xpath="//option[.='Administrative Leadership']") private WebElement Administrative_Leadershipoption;
	
	@FindBy(xpath="(//select[@id=\"University\"])[1]") private WebElement UniversityDropdown;
	@FindBy(xpath="//option[.='Visveswaraiah Technological University']") private WebElement Visveswaraiah_Technological_University_option;
	
	@FindBy(xpath="//label[.='Pass out Year']") private WebElement PassOutYearTextField;
	

	public WebElement getEducationButton() {
		return EducationButton;
	}
	public WebElement getHigherEducationDropdown() {
		return HigherEducationDropdown;
	}
	public WebElement getBE_B_TECH_option() {
		return BE_B_TECH_option;
	}
	public WebElement getSpecializationDropdown() {
		return SpecializationDropdown;
	}
	public WebElement getAdministrative_Leadershipoption() {
		return Administrative_Leadershipoption;
	}
	public WebElement getUniversityDropdown() {
		return UniversityDropdown;
	}
	public WebElement getVisveswaraiah_Technological_University_option() {
		return Visveswaraiah_Technological_University_option;
	}
	public WebElement getPassOutYearTextField() {
		return PassOutYearTextField;
	}
}
