package com.mahesh_prajapati.dagger2_field_injection

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getRegistrationServiceUsingFieldInjection(activity: MainActivity)
}