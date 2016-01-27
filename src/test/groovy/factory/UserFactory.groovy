package factory

import dto.User
import utils.SettingsReader

class UserFactory {

    static final USER_LOGIN =  SettingsReader.get 'user.login'
    static final USER_WWW =  SettingsReader.get 'user.www'

    def static buildUser(login, www) {
        return new User(
                login: login,
                www: www
        )
    }

    def static buildNewUser() {
        buildUser(USER_LOGIN, USER_WWW)
    }
}
