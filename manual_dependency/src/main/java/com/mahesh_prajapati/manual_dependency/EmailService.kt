package com.mahesh_prajapati.manual_dependency

import android.util.Log
import com.mahesh_prajapati.manual_dependency.MainActivity.Companion.TAG

class EmailService {
    fun send(to:String,from:String,body:String){
        Log.d(TAG,"Email Sent Successfully")
    }
}