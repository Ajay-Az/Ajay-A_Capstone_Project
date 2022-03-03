package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	//Summary Elements.
		@FindBy(xpath="//button[text()='Summary']") private WebElement SummaryButton;
		@FindBy(xpath="//div[@class=\"input-data\"]") private WebElement SummaryText;
		
		public WebElement getSummaryButton() {
			return SummaryButton;
		}
		public WebElement getSummaryText() {
			return SummaryText;
		}
}
