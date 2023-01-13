package gaur.himanshu.roomdatabaserelations.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.roomdatabaserelations.database.ExampleDao
import gaur.himanshu.roomdatabaserelations.database.ExampleDatabase

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): ExampleDatabase {
        return ExampleDatabase.getInstance(context)
    }

    @Provides
    fun provideDao(exampleDatabase: ExampleDatabase): ExampleDao {
        return exampleDatabase.getExampleDao()
    }

}