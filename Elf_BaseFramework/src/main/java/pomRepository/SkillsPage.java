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

public class SkillsPage {

	public SkillsPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Skills Elements.
		@FindBy(xpath="//button[text()='Skills']") private WebElement SkillsButton;
		@FindBy(xpath="//input[@placeholder='Frontend Technologies']") private WebElement FrontEndTechnologiesDropdown;
		@FindBy(xpath="//li[.='HTML']") private WebElement HTMLoption;
		@FindBy(xpath="//li[.='CSS']") private WebElement CSSoption;
		
		@FindBy(xpath="//input[@placeholder='Backend Technologies']") private WebElement BackEndTechnologiesDropdown;
		@FindBy(xpath="//li[.='Java 1.8']") private WebElement Java1_8_option;
		@FindBy(xpath="//li[.='Sql']") private WebElement SQLoption;
		
		//3Rd TestCase..
		@FindBy(xpath="//input[@placeholder='Middleware Technologies']") private WebElement MiddleWareTechnologiesDropdown;
		@FindBy(xpath="//li[.='RestFull Services']") private WebElement RestFull_ServicesOption;
		
		@FindBy(xpath="//input[@placeholder='Design Patterns']") private WebElement DesignPatternDropdown;
		@FindBy(xpath="//li[.='Singleton']") private WebElement SingletonOption;

		@FindBy(xpath="//input[@placeholder='DataBase used']") private WebElement DataBase_UsedDropdown;
		@FindBy(xpath="//li[.='MongoDB']") private WebElement MongoDBOption;

		@FindBy(xpath="//input[@placeholder='Version Control System']") private WebElement VersionControlSystemDropdown;
		@FindBy(xpath="//li[.='Github']") private WebElement GithubOption;

		@FindBy(xpath="//input[@placeholder='AWS']") private WebElement AWSDropdown;
		@FindBy(xpath="//li[.='EC2']") private WebElement EC2Option;

		@FindBy(xpath="//input[@placeholder='SDLC']") private WebElement SDLCDropdown;
		@FindBy(xpath="//li[.='Waterfall model and agile Git']") private WebElement WaterFallOption;

		@FindBy(xpath="//input[@placeholder='Development Tools']") private WebElement DevelopmentToolsDropdown;
		@FindBy(xpath="//li[.='Maven']") private WebElement MavenOption;

		public WebElement getSkillsButton() {
			return SkillsButton;
		}
		public WebElement getFrontEndTechnologiesDropdown() {
			return FrontEndTechnologiesDropdown;
		}
		public WebElement getHTMLoption() {
			return HTMLoption;
		}
		public WebElement getCSSoption() {
			return CSSoption;
		}
		public WebElement getBackEndTechnologiesDropdown() {
			return BackEndTechnologiesDropdown;
		}
		public WebElement getJava1_8_option() {
			return Java1_8_option;
		}
		public WebElement getSQLoption() {
			return SQLoption;
		}
		
		//3Rd TestCase..
		public WebElement getMiddleWareTechnologiesDropdown() {
			return MiddleWareTechnologiesDropdown;
		}
		public WebElement getRestFull_ServicesOption() {
			return RestFull_ServicesOption;
		}
		public WebElement getDesignPatternDropdown() {
			return DesignPatternDropdown;
		}
		public WebElement getSingletonOption() {
			return SingletonOption;
		}
		public WebElement getDataBase_UsedDropdown() {
			return DataBase_UsedDropdown;
		}
		public WebElement getMongoDBOption() {
			return MongoDBOption;
		}
		public WebElement getVersionControlSystemDropdown() {
			return VersionControlSystemDropdown;
		}
		public WebElement getGithubOption() {
			return GithubOption;
		}
		public WebElement getAWSDropdown() {
			return AWSDropdown;
		}
		public WebElement getEC2Option() {
			return EC2Option;
		}
		public WebElement getSDLCDropdown() {
			return SDLCDropdown;
		}
		public WebElement getWaterFallOption() {
			return WaterFallOption;
		}
		public WebElement getDevelopmentToolsDropdown() {
			return DevelopmentToolsDropdown;
		}
		public WebElement getMavenOption() {
			return MavenOption;
		}
}
