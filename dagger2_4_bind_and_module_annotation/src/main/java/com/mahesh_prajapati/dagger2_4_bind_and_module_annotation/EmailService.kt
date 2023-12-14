package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import android.util.Log
import com.mahesh_prajapati.dagger2_4_bind_and_module_annotation.MainActivity.Companion.TAG
import javax.inject.Inject

interface NotificationService{
    fun send(to:String,from:String,body:String)
}
class EmailService @Inject constructor():NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d(TAG,"Email Sent Successfully")
    }
}

class MessageService:NotificationService{
    override fun send(to:String, from:String, body:String){
        Log.d(TAG,"Message Sent Successfully")
    }
}