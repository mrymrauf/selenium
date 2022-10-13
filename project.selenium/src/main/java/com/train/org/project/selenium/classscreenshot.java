package com.train.org.project.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class classscreenshot {
public static void Mscreenshots(WebDriver driver, String filename) throws IOException {
	File file1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(file1, new File("/Users/maryam/Desktop/" + filename +""));
}
}
