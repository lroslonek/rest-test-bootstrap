package service

import dto.User
import groovy.util.logging.Slf4j
import utils.SettingsReader

import static com.jayway.restassured.RestAssured.given

@Slf4j
class UserService {

    static final SERVICE_HOST = SettingsReader.get 'wiremock.host'

    def static postNewUser(User user) {
        def response =
            given()
                .contentType("application/json")
                .body(user)
            .when()
                .post("${SERVICE_HOST}/addNewUser")
            .then()
                .statusCode(200)
                .extract().response()

        log.info "-- user: ${user.login} : ${user.www} posted!"

        response.path("")
    }

}
