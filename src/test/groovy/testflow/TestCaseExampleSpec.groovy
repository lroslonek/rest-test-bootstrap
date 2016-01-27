package testflow

import static asserts.UserValidation.isCorrect
import static factory.UserFactory.buildNewUser
import static service.UserService.postNewUser

class TestCaseExampleSpec extends BaseSpecification {

    def "should post new user successfully"() {

        given: "new user is built"
        def user = buildNewUser()

        when: "post new user"
        def response = postNewUser(user)

        then: "response is valid"
        isCorrect response
    }
}
