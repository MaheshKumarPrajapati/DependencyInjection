package com.mahesh_prajapati.dagger_2.code

import android.util.Log
import com.mahesh_prajapati.dagger_2.code.MainActivity.Companion.TAG
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in DB")
    }
}