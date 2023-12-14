package com.mahesh_prajapati.dagger2_field_injection

import android.util.Log
import com.mahesh_prajapati.dagger2_field_injection.MainActivity.Companion.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in DB")
    }
}