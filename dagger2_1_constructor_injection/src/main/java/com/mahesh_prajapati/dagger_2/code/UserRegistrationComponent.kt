package com.mahesh_prajapati.dagger_2.code

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService
}