package com.example.starter.login

class LoginPresenter(view: LoginView) {

    var view = view

    fun login(username: String, password: String){
        if (username.isEmpty()){
            view.showUserNameError()
            return
        }

        if (password.isEmpty()){
            view.showPasswordError()
            return
        }

        view.showLoginError()

    }

}