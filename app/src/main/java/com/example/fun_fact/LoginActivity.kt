package com.example.fun_fact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signIn()




    }

    private fun signIn() {
        val email = findViewById<EditText>(R.id.edEmail)
        val password = findViewById<EditText>(R.id.edPassword)
        val login = findViewById<Button>(R.id.btnLogin)

        login.setOnClickListener(){
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this, "Email or password is not provided", Toast.LENGTH_LONG).show()
            } else{
                if (email.text.toString() =="man@gmail.com" && password.text.toString() == "12345"){
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else  {
                    Toast.makeText(this, "wrong email or password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}