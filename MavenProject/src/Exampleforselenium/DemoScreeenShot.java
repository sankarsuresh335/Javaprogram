package Exampleforselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoScreeenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\MavenProject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/AutoComplete.html");

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

		File sourcefile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		File file = new File("F://sample.png");

		FileHandler.copy(sourcefile, file);

	}

}
