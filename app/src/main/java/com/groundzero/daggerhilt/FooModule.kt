package com.groundzero.daggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

/**
 * ActivityRetainedComponent
 * ActivityComponent
 * FragmentComponent
 * ViewComponent
 * ViewWithFragmentComponent
 * ServiceComponent
 */
@Module
@InstallIn(ActivityRetainedComponent::class)
class FooModule {

    @Provides
    @ActivityRetainedScoped
    fun provideFoo() = Foo()
}