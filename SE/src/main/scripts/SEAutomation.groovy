import geb.*

class GoogleHomePages extends Page {
   static url = "http://google.com/?complete=0"
   static at = { title == "Google" }
   static content = {
	   searchField { $("input[name=q]") }
	   searchButton(to: GoogleResultsPage) { $("input[value='Google Search']") }
   }
}

class GoogleResultsPages extends Page {
   static at = { waitFor { title.endsWith("Google Search") } }
   static content = {
	   results(wait: true) { $("li.g") }
	   result { index -> results[index] }
	   resultLink { index -> result(index).find("a.l") }
   }
}

// Now the script
Browser.drive {
   to GoogleHomePages
   searchField().value "Chuck Norris"
   searchButton().click()
   at GoogleResultsPages
   resultLink(0).text().contains("Chuck")
}
