package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {
    @Binds
    abstract fun getEmailService(emailService: EmailService):NotificationService
}