package com.mahesh_prajapati.dagger_2.code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mahesh_prajapati.dagger2_1_constructor_injection.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerUserRegistrationComponent.builder().build().apply {
            getUserRegistrationService().registerUser("test@mail.com","1234")
        }

    }

    companion object{
        public const val TAG:String="Dependancy_Injection::"
    }
}