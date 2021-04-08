package com.example.week1

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val et_email_login=findViewById<EditText>(R.id.editTextTextPersonName2);
        val et_pass_login=findViewById<EditText>(R.id.editTextTextPassword);
        val btnLogin = findViewById<Button>(R.id.LoginButton)
        btnLogin.setOnClickListener {
            if(et_email_login.text.toString()=="ronaldo@gmail.com"&&et_pass_login.text.toString()=="123456")
            {
                val intent: Intent =Intent(this@LoginActivity,ProfileActivity::class.java)
                startActivity(intent)
           }
            else {
                val dialog = AlertDialog.Builder(this)
                dialog.apply{
                    setTitle("Account khong hop le")
                    dialog.setPositiveButton("OK"){_,_->}
                }
                dialog.show()
            }

        }
    }
}