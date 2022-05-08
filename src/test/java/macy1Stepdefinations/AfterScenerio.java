package macy1Stepdefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import macy1Utilities.SetupDriver;

public class AfterScenerio {
	
	@After("@chrome")
	public void afterChromeScenario(Scenario scen) {

		System.out.println(">> Test Eexecution Completed: " + scen.getName()+" <<");
		System.out.println(">> Shutting Down Browser! <<");

		try {
			if (scen.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) SetupDriver.driver;
				byte[] imageBytes = ts.getScreenshotAs(OutputType.BYTES);
				scen.attach(imageBytes, "image/png", "failed_image");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		SetupDriver.tearDownDriver();
		
		System.out.println(">> Driver Closed! <<");

	}

}
