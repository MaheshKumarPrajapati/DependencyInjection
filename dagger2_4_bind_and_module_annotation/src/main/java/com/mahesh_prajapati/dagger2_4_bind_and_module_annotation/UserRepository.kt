package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import android.util.Log
import com.mahesh_prajapati.dagger2_4_bind_and_module_annotation.MainActivity.Companion.TAG
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String, password:String)
}
class SQLRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in DB")
    }
}

class FirebaseRepository:UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in Firebase")
    }
}