import geb.*
import geb.Page.*

Browser.drive {
	go "http://google.com/ncr"
	
	//$("input[name=q]").value "Chuck Norris"
	//$("input[value='Google Search']")
	//waitFor { $("li.g", 0).find("a.l").text().contains("Chuck") }
}