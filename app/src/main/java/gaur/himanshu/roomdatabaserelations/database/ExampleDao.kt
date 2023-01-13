package gaur.himanshu.roomdatabaserelations.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import gaur.himanshu.roomdatabaserelations.database.model.Dog
import gaur.himanshu.roomdatabaserelations.database.model.Owner


@Dao
interface ExampleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOwner(owner: List<Owner>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDog(dog: List<Dog>)

    @Query("SELECT * FROM Owner")
    suspend fun getAllOwner(): List<Owner>

    @Query("SELECT * FROM Dog")
    suspend fun getAllDog(): List<Dog>


}