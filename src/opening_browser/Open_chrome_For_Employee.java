package opening_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_chrome_For_Employee {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5000/employee");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String expectedtitle="ECODERS-Employee page";
		if(expectedtitle.equals(title)) {
			System.out.println("Title matched test case passed");
		}
		else {
			System.out.println("Title not matched test case failed");
		}
		String excpectedurl="http://127.0.0.1:5000/employee";
		if(excpectedurl.endsWith(currentUrl)) {
			System.out.println("url matched test case passed");
		}
		else {
			System.out.println("url not matched test case failed");
		}
		driver.quit();
	}

}
