package pomRepository;
/***
 * 
 * @author Ajay A
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Profile Elements.
		@FindBy(xpath="//input[@value='FirstName']") private WebElement FirstName;
		@FindBy(xpath="//input[@value='LastName']") private WebElement LastName;
		@FindBy(id="Technology") private WebElement ProfileTechnologyDropdown;
		@FindBy(xpath="//option[.='React JS']") private WebElement MERN_Tech;
		
		public WebElement getFirstName() {
			return FirstName;
		}
		public WebElement getLastName() {
			return LastName;
		}
		public WebElement getProfileTechnologyDropdown() {
			return ProfileTechnologyDropdown;
		}
		public WebElement getMERN_Tech() {
			return MERN_Tech;
		}
}
