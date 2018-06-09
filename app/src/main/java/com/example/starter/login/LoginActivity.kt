package com.example.starter.login

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.starter.R
import com.example.starter.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), LoginView {

    internal lateinit var dataBinding: ActivityLoginBinding
    internal lateinit var presenter: LoginPresenter

    companion object {

        fun start(context: Context){
            val startIntent = Intent(context, LoginActivity::class.java)
            context.startActivity(startIntent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_login)

        presenter = LoginPresenter(this)

        initUi()
    }


    override fun initUi() {

        dataBinding.btnLogin.setOnClickListener {
            presenter.login(dataBinding.username.text.toString(),
                    dataBinding.password.text.toString())
        }


        setSupportActionBar(dataBinding.toolbarLogin)
        supportActionBar?.title = "Login"
    }

    override fun showUserNameError() {
        dataBinding.username.error = "Please enter a valid username!"
    }

    override fun showPasswordError() {
        dataBinding.password.error = "Please enter a valid password!"
    }

    override fun showLoginError() {
        Toast.makeText(this, "Username or password invalid!", Toast.LENGTH_SHORT)
                .show()
    }
}
