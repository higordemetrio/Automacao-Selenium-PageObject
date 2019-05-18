package utils;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Evidence {
	private static WebDriver driver;
	private static String dateAndTime;
	private static int index;

	public Evidence(WebDriver driver) {
		this.driver = driver;
		this.index = 0;
		this.dateAndTime = getDateAndTime();
	}

	public static void takeEvidence(WebDriver webdriver, String name) throws Exception {
		index++;
		String fileWithPath = System.getProperty("user.dir") + "\\output\\" + dateAndTime + "\\" + name + "_" + index
				+ ".png";
		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination

		File DestFile = new File(fileWithPath);

		// Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

	private static String getDateAndTime() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String formattedDate = dateFormat.format(date);
		return formattedDate;
	}
}
