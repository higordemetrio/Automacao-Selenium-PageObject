package config;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Selenium {
	private static ChromeDriverService service;
	public static WebDriver driver;

	@BeforeClass
	public static void start() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

//
//	@BeforeClass
//	public static void createAndStartService() throws IOException {
//		service = new ChromeDriverService.Builder()
//				.usingDriverExecutable(new File(System.getProperty("user.dir") + "\\driver\\chromedriver.exe"))
//				.usingAnyFreePort().build();
//		service.start();
//	}
//
//	@AfterClass
//	public static void createAndStopService() {
//		service.stop();
//	}
//
//	@Before
//	public void createDriver() {
//		driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
//	}
//
	@After
	public void quitDriver() {
		driver.quit();
	}

}
