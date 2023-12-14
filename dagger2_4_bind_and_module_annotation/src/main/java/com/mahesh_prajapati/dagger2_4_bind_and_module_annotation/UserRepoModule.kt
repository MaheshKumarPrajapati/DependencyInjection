package com.mahesh_prajapati.dagger2_4_bind_and_module_annotation

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepoModule {
    @Binds
    abstract fun getDBRepo(sqlRepository: SQLRepository):UserRepository
}