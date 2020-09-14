package Appium.Project;

import org.testng.annotations.Test;

import Appium.Project.HybridCapability;
import Appium.Project.webPlayVideoPage;

public class webPlayVideo extends HybridCapability {

	webPlayVideoPage playVid;
	
	@Test
	public void playVideo() throws InterruptedException {
		playVid=new webPlayVideoPage(driver);
		playVid.startVideo();
		//playVid.stopVideo();
	}
	
}
