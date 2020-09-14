package Appium.Project;

import org.testng.annotations.Test;
import Appium.Project.HybridCapability;
import Appium.Project.webPlayVideoPage;

public class appSelectCourse extends HybridCapability{
	
	appSelectCoursePage selCoursePage;
	
	@Test
	public void courseSel() throws InterruptedException {
		selCoursePage = new appSelectCoursePage(driver);
		selCoursePage.clickEditBtn();
		selCoursePage.selCourse();
		selCoursePage.launchCourseinChrome();
	}
}
