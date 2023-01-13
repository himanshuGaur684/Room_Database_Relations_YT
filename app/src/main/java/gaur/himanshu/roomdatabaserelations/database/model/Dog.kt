package gaur.himanshu.roomdatabaserelations.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Dog(
    var dogOwnerId: Int,
    @PrimaryKey(autoGenerate = false)
    val dogId: Int,
    val name: String
)
