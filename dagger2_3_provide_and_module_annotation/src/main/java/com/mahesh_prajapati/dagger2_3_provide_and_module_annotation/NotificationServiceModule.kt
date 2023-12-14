package com.mahesh_prajapati.dagger2_3_provide_and_module_annotation

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getMessageService():NotificationService{
        return MessageService()
    }
}