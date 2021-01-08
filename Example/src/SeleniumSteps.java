import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSteps {
	private WebDriver driver;

	public void startChrome() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome driver is started");
	}

	public void webElementClick(String params, String report) {
		driver.findElement(By.xpath(params)).click();
		System.out.println(report);
	}
	

	public void driverQuit() {
		driver.quit();
		System.out.println("Chrome closed");
		System.out.println("------------------------");
	}

	public void gotoURL(String url) {
		driver.get(url);
		System.out.println("navigation to : " + url);
	}

	public void waiting(int time) {
		try {
			Thread.sleep(time);
			System.out.println("code waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void enterText(String path, String txt) {
		driver.findElement(By.xpath(path)).sendKeys(txt);
		System.out.println("entered text : " + txt);
	}

	public void clearTextBox(String path) {
		driver.findElement(By.xpath(path)).clear();
		System.out.println("text Cleared");

	}

	public String getTextFromElement(String xpath) {
		String str = driver.findElement(By.xpath(xpath)).getText();
		System.out.println("From getText : " + str);
		return str;
	}

	public boolean isDisplayedOnScreen(String xpath,String reportPass, String reportFail) {
		boolean flag = driver.findElement(By.xpath(xpath)).isDisplayed();
		if(flag) {
			System.out.println("pass: "+reportPass);
		}else {
			System.out.println("Fail: "+reportFail);
		}
		return flag;
	}
	
	public boolean isNotDisplayedOnScreen(String xpath,String reportPass, String reportFail) {
		boolean flag = driver.findElement(By.xpath(xpath)).isDisplayed();
		if(!flag) {
			System.out.println("pass: "+reportPass);
		}else {
			System.out.println("Fail: "+reportFail);
		}
		return flag;
	}

}
