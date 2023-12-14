package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import javax.inject.Inject

//Constructor Annotation

class UserRegistrationService @Inject constructor(val userRepository: UserRepository, val emailService: NotificationService) {
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"noreply@gmail.com","User Registered")
    }

}