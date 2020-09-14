package Appium.Project;

import org.testng.annotations.Test;

import Appium.Project.HybridCapability;
import Appium.Project.webPlayVideoPage;

public class appSignOut extends HybridCapability{

	appSignOutPage signoutpage;
	
	@Test
	public void signOut() throws InterruptedException {
		signoutpage = new appSignOutPage(driver);
		signoutpage.clickSignOut();
	}
}
