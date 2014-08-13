import geb.*
import geb.Page

class GoogleHomePage extends Page {
    static url = "http://google.com/?complete=0"
    static at = { title == "Google" }
    static content = {
        searchField { $("input[name=q]") }
      
    }
 
    void search(String searchTerm) {
        searchField.value searchTerm
    }
}