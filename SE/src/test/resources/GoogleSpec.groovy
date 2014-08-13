import javax.swing.text.html.StyleSheet.SearchBuffer;

import spock.lang.*
import geb.*
import geb.spock.*


class GoogleSpec extends GebReportingSpec {

    def "the first link should be wikipedia"() {
        when:
        to GoogleHomePage
		
		then:
		
		println "ok, fine"
		//to GoogleResultsPage
		
		println "after googleresultspage"
		
		
      //  and:
       // firstResultLink.text() == "Wikipedia"

       // when:
        //firstResultLink.click()

        //then:
       // waitFor { at WikipediaPage }
        
    }

}