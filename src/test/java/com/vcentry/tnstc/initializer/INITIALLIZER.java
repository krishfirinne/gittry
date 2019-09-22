package com.vcentry.tnstc.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class INITIALLIZER {

	/*
	 * @author JK Declare locator properties
	 */

	public static FileInputStream locfis = null;
	public static Properties locprop = null;

	/*
	 * @author JK Declare the environment variables
	 */
	public static FileInputStream envfis = null;
	public static Properties envprop = null;
	
	/*
	 * @author JK Declare the 
	 */
	
	public static WebDriver wd=null;
	public static void initialize() throws IOException {
		envfis = new FileInputStream(new File(System.getProperty("user.dir") + File.separator + "src" + File.separator
				+ "main" + File.separator + "resources" + File.separator + "com" + File.separator + "vcentry"
				+ File.separator + "tnstc" + File.separator + "config" + File.separator + "env.properties"));
		envprop = new Properties();
		envprop.load(envfis);

		locfis = new FileInputStream(new File(System.getProperty("user.dir") + File.separator + "src" + File.separator
				+ "main" + File.separator + "resources" + File.separator + "com" + File.separator + "vcentry"
				+ File.separator + "tnstc" + File.separator + "config" + File.separator + "locator.properties"));
		locprop = new Properties();
		locprop.load(locfis);

		if (envprop.getProperty("BROWSER").equals("FIREFOX")) {
			 wd = new FirefoxDriver();
		}
		else if(envprop.getProperty("BROWSER").equals("CHROME")){
			//WebDriver wd=new ChromeDriver();
		}
	}
	public static  WebElement getElementByName(String name){
		WebElement  element=wd.findElement(By.name(name));
		return element;
	}
}
