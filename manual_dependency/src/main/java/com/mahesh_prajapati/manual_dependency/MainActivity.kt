package com.mahesh_prajapati.manual_dependency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UserRegistrationService(UserRepository(),EmailService()).apply {
            registerUser("test@mail.com","1234")
        }
    }

    companion object{
        public const val TAG:String="Dependancy Injection"
    }
}