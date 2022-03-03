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

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//HomePage Elements.
	@FindBy(xpath="//div[.='Include Education ']//input") private WebElement IncludeEducationCheckBox;
	
	@FindBy(xpath="//button[.='Download as']") private WebElement DownloadButton;
	
	@FindBy(xpath="//button[.='PDF']") private WebElement PDFbutton;
	
	@FindBy(xpath="//button[.='WORD']") private WebElement WORDbutton;

	public WebElement getIncludeEducationCheckBox() {
		return IncludeEducationCheckBox;
	}
	public WebElement getDownloadButton() {
		return DownloadButton;
	}
	public WebElement getPDFbutton() {
		return PDFbutton;
	}
	public WebElement getWORDbutton() {
		return WORDbutton;
	}
}
