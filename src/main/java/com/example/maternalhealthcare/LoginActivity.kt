package com.example.maternalhealthcare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login_btn: Button = findViewById(R.id.login_btn)

        login_btn.setOnClickListener {
            val username: EditText = findViewById(R.id.username)
            val password: EditText = findViewById(R.id.editTextTextPassword)


                    if (username.text.toString().equals("LOGIN") || password.text.toString()
                            .equals("password")
                    ) {
                        Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT)
                            .show()
                }
            }
        val forgot_password : TextView = findViewById(R.id.forgot_password)
        forgot_password.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)

        }

        val create_newaccount : TextView = findViewById(R.id.create_newaccount)
        create_newaccount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }
        }

    }





