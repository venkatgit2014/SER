import geb.spock.GebReportingSpec
import pages.*


class GebSpockTest extends GebReportingSpec{

 def "Check for a word"(){

     when:
     to GoogleHomePage

     then:
	 println "hi"
     assert at(GoogleHomePage)
/*
     when:
     field.value("jellyfish technologies")

     then:
     waitFor { at GoogleResultPage }

     when:
     assert firstResultLink.text() == "Contact Us"

     then:
     firstResultLink.click()
     waitFor { at JellyFishTechnologies }
 */
	 
	 }
}