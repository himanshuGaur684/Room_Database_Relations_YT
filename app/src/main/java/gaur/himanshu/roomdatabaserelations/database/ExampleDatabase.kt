package gaur.himanshu.roomdatabaserelations.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import gaur.himanshu.roomdatabaserelations.database.model.Dog
import gaur.himanshu.roomdatabaserelations.database.model.Owner

@Database(entities = [Dog::class, Owner::class], version = 1, exportSchema = false)
abstract class ExampleDatabase : RoomDatabase() {

    companion object {
        fun getInstance(context: Context): ExampleDatabase {
            return Room.databaseBuilder(context, ExampleDatabase::class.java, "db_example")
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun getExampleDao(): ExampleDao

}