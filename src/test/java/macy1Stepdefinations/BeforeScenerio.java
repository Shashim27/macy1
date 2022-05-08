package macy1Stepdefinations;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import macy1Utilities.SetupDriver;

public class BeforeScenerio {
	
	@Before("@chrome")
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			SetupDriver.setupChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}

	}

}
