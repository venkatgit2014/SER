
import geb.Page

class GoogleResultPage extends Page{
    static at = { title.endsWith "Google Search" }
    static content = {
        results { $("li.g") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a.l") }
        firstResultLink { resultLink(0) }
    }
}