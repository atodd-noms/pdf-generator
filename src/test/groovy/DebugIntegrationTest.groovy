import groovyx.net.http.RESTClient
import helpers.TestConfiguration
import spark.Spark
import spock.lang.Ignore
import spock.lang.Specification
import uk.gov.justice.digital.pdf.Server

class DebugIntegrationTest extends Specification {

    @Ignore
    def "debug available in test configuration"() {

        when:
        def result = new RESTClient('http://localhost:8081/').get(path: 'debug/shortFormatPreSentenceReport')

        then:
        result.status == 200
    }

    def setupSpec() {

        Server.run(new TestConfiguration())
        Thread.sleep 1500
    }

    def cleanupSpec() {

        Spark.stop()
        Thread.sleep 3500
    }
}
