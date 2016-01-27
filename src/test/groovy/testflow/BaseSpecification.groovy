package testflow

import com.jayway.restassured.RestAssured
import groovy.util.logging.Slf4j
import org.junit.Rule
import org.junit.rules.TestName
import org.junit.rules.Timeout
import spock.lang.Specification

@Slf4j
class BaseSpecification extends Specification {

    @Rule def Timeout globalTimeout = new Timeout(200000)
    @Rule def TestName name = new TestName()

    def setup() {
        log.info "#TEST: " + name.methodName
    }

    def setupSpec() {
        RestAssured.useRelaxedHTTPSValidation()
    }

}
