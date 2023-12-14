package com.mahesh_prajapati.dagger2_3_provide_and_module_annotation

import dagger.Component

@Component(modules = [UserRepoModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun getRegistrationServiceUsingFieldInjection(activity: MainActivity)
}