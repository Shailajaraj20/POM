package View;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginView {
	@FindBy(name = "userName")
	WebElement userNameEdtBox;
	@FindBy(name ="password")
	WebElement passwordEdtBox;
	@FindBy(name ="login")
	WebElement loginBtn;
	@FindBy(name ="SIGN-OFF")
	WebElement signOffLnk;
	
	public boolean login()
	{
		try{
			userNameEdtBox.sendKeys("batman");
			passwordEdtBox.sendKeys("batman");
			loginBtn.click();
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

}
