package com.example.maternalhealthcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val reset_button : Button = findViewById(R.id.reset_button)
        reset_button.setOnClickListener {
            perFormReset()
        }

        }

    private fun perFormReset() {

val email : EditText = findViewById(R.id.editTextTextEmailAddress)
        if (email.text.isEmpty()){
            Toast.makeText(this, "Fill all the field", Toast.LENGTH_SHORT)
                .show()
            return
        }

        val inputEmail = email.text.toString()

        if (inputEmail.equals(email)) {

                    val intent = Intent (this, LoginActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(baseContext, "Your password has been sent to your email.",
                        Toast.LENGTH_SHORT)
                        .show()

                } else {

                    Toast.makeText(baseContext, "Enter correct email address or user name",
                        Toast.LENGTH_SHORT)
                        .show()

                }

    }
}



