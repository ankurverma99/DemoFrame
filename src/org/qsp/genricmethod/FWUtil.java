package org.qsp.genricmethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FWUtil {
	public static void getphoto(WebDriver driver, String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		Files.copy(srcFile, destFile);

	}

}
