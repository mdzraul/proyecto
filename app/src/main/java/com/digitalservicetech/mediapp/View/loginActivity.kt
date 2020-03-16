package com.digitalservicetech.mediapp.View

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.digitalservicetech.mediapp.R
import com.digitalservicetech.mediapp.Service.RepoRepository

import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        setSupportActionBar(toolbar)


        var email = txt_email.text;


        OnclikRegister.setOnClickListener {
            //Your code here
            //var str = "$z"
            //println("z is $email")
            println("Estoy pasando por la veriable touch cliked register")

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        RepoRepository.getInstance().postGetPedecimiento("") { isSuccess, response ->
            if (isSuccess) {
                println("listado de padecimiento"+ response.toString())

            } else {
                println("Hubo un error en listado de padecimiento")

            }
        }
    }

//    /** Called when the user taps the Send button  */
//    fun OnclikRegister(view: View) {
//        // Do something in response to button
//    }

}
