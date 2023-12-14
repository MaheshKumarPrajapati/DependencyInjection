package com.mahesh_prajapati.manual_dependency

class UserRegistrationService(val userRepository: UserRepository,val emailService: EmailService) {
    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.send(email,"noreply@gmail.com","User Registered")
    }

}