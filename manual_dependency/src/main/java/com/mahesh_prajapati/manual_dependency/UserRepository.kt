package com.mahesh_prajapati.manual_dependency

import android.util.Log
import com.mahesh_prajapati.manual_dependency.MainActivity.Companion.TAG

class UserRepository {
    fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in DB")
    }
}