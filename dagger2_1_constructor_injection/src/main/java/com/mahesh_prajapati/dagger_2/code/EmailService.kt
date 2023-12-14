package com.mahesh_prajapati.dagger_2.code

import android.util.Log
import com.mahesh_prajapati.dagger_2.code.MainActivity.Companion.TAG
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(to:String,from:String,body:String){
        Log.d(TAG,"Email Sent Successfully")
    }
}