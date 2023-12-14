package com.mahesh_prajapati.dagger2_field_injection

import javax.inject.Inject

//Constructor Annotation

class UserRegistrationService @Inject constructor(val userRepository: UserRepository, val emailService: EmailService) {
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"noreply@gmail.com","User Registered")
    }

}