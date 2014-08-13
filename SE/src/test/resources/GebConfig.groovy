import org.openqa.selenium.firefox.FirefoxDriver
driver = {
	def driver = new FirefoxDriver()
	//driver.javascriptEnabled = true
	driver
}

waiting {
	timeout=10
}

baseUrl = 'http://www.google.com'
reportsDir = 'd:\\se_automation'
