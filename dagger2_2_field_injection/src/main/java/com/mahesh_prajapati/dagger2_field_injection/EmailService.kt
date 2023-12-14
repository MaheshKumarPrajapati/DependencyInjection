package com.mahesh_prajapati.dagger2_field_injection

import android.util.Log
import com.mahesh_prajapati.dagger2_field_injection.MainActivity.Companion.TAG
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String,from:String,body:String){
        Log.d(TAG,"Email Sent Successfully")
    }
}