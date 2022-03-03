package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationDetailsPage {

	public EducationDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Project Details Elements.
	@FindBy(xpath="//button[.='ProjectDetails']") private WebElement ProjectDetailsButton;
	
	@FindBy(xpath="//label[.='Project Name']") private WebElement ProjectNameTextField;
	
	@FindBy(xpath="//label[.='Project Description']") private WebElement ProjectDescriptionTextField;

	public WebElement getProjectDetailsButton() {
		return ProjectDetailsButton;
	}
	public WebElement getProjectNameTextField() {
		return ProjectNameTextField;
	}
	public WebElement getProjectDescriptionTextField() {
		return ProjectDescriptionTextField;
	}
}
