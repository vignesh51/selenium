import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Chapter1 {

	public void testCase1() {
		System.out.println("executing 1st tc");
		SeleniumSteps obj = new SeleniumSteps();
		String chapter11Link = "//a[@href='/chapter1']";
		String radioBtn = "//input[@id='radiobutton']";
		obj.startChrome();
		obj.gotoURL("http://book.theautomatedtester.co.uk/");
		obj.webElementClick(chapter11Link,"clicking on chapter 1");
		obj.webElementClick(radioBtn,"clicking on radio button");
		
		obj.waiting(2000);
		obj.driverQuit();
	}

	public void testCase2() {
		String chapter11Link = "//a[@href='/chapter1']";
		String homepagelink = "//a[@href='/']";
		SeleniumSteps adc = new SeleniumSteps();
		adc.startChrome();
		adc.gotoURL("http://book.theautomatedtester.co.uk/");
		adc.webElementClick(chapter11Link,"clicking on chapter 1");
		adc.webElementClick(homepagelink,"clicking on homepage");
		adc.waiting(5000);
		adc.driverQuit();

	}

	public void testCase3() {
		String chapter1link = "//a[@href='/chapter1']";
		String enablebtn = "//input[@name='selected(1234)']";
		SeleniumSteps asd = new SeleniumSteps();
		asd.startChrome();
		asd.gotoURL("http://book.theautomatedtester.co.uk/");
		asd.webElementClick(chapter1link,"clicking on chapter 1");
		asd.webElementClick(enablebtn,"clicking on enable button");
		asd.waiting(6000);
		asd.driverQuit();

	}

	public void testCase4() {
		String chapter1link = "//a[@href='/chapter1']";
		String clickwind = "//div[@class='multiplewindow']";
		SeleniumSteps ask = new SeleniumSteps();
		ask.startChrome();
		ask.gotoURL("http://book.theautomatedtester.co.uk/");
		ask.webElementClick(chapter1link,"clicking on chapter 1");
		ask.webElementClick(clickwind,"clicking on window link");
		ask.waiting(10000);
		ask.driverQuit();

	}

	public void testCase5() {
		String chapter1link = "//a[@href='/chapter1']";
		String clickwind1 = "//div[@class='multiplewindow2']";
		SeleniumSteps amp = new SeleniumSteps();
		amp.startChrome();
		amp.gotoURL("http://book.theautomatedtester.co.uk/");
		amp.webElementClick(chapter1link,"clicking on chapter 1");
		amp.webElementClick(clickwind1,"clicking on window link");
		amp.waiting(10000);
		amp.driverQuit();
	}

	public void testCase6() {
		String chapter1link = "//a[@href='/chapter1']";
		String clickwind2 = "//div[@id='loadajax']";
		SeleniumSteps ant = new SeleniumSteps();
		ant.startChrome();
		ant.gotoURL("http://book.theautomatedtester.co.uk/");
		ant.webElementClick(chapter1link,"clicking on chapter 1");
		ant.webElementClick(clickwind2,"clicking on window key");
		ant.waiting(10000);
		ant.driverQuit();
	}

	public void testCase7() {
		String chapter1link = "//a[@href='/chapter1']";
		String assertText = "//div[@id='divontheleft']";
		SeleniumSteps amp = new SeleniumSteps();
		amp.startChrome();
		amp.gotoURL("http://book.theautomatedtester.co.uk/");
		amp.webElementClick(chapter1link,"clicking on chapter 1");
		String expected = "Assert that this text is on the page";
		System.out.println("Expected : " + expected);
		String actual = amp.getTextFromElement(assertText);		
		if (expected.equals(actual)) {
			System.out.println("text matched");
		} else {
			System.out.println("text not matched");
		}
		amp.driverQuit();
	}
	
	public void testCase8() {
		String chapter1link = "//a[@href='/chapter1']";
		String btn="//input[@id='verifybutton']";
		SeleniumSteps amp = new SeleniumSteps();
		amp.startChrome();
		amp.gotoURL("http://book.theautomatedtester.co.uk/");
		amp.webElementClick(chapter1link,"Clicking on chapter 1");
		amp.isDisplayedOnScreen(btn,"button is dipslayed","button is not displayed");
		
		amp.driverQuit();
	}
	
	public void testCase9() {
		String chapter1link = "//a[@href='/chapter1']";
		String ajaxDiv="//div[@id='ajaxdiv']";
		String loadAjax="//div[@id='loadajax']";
		
		SeleniumSteps amp = new SeleniumSteps();
		amp.startChrome();
		amp.gotoURL("http://book.theautomatedtester.co.uk/");
		amp.webElementClick(chapter1link,"clicking on chapter 1 using String xpath passing");
		
		
		amp.isNotDisplayedOnScreen(ajaxDiv,"ajax is not displayed","ajax is displayed");
		
		
		amp.webElementClick(loadAjax,"clicking on ajax loader");
		
		amp.waiting(3000);		
		amp.isDisplayedOnScreen(ajaxDiv,"ajax is displayed","ajax not displayed");
		
		
		amp.driverQuit();
	}

}