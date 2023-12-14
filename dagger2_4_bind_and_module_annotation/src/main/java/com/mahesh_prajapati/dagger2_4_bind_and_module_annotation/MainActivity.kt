package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerUserRegistrationComponent.builder().build().apply {
            getRegistrationServiceUsingFieldInjection(this@MainActivity)
        }

        userRegistrationService.registerUser("test@mail.com","1234")

    }

    companion object{
        public const val TAG:String="Dependancy_Injection::"
    }
}