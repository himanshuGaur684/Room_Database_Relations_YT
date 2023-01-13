package gaur.himanshu.roomdatabaserelations.database.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE

@Entity(primaryKeys = ["ownerId", "dogId"], foreignKeys = [
    ForeignKey(
        entity = Owner::class,
        parentColumns = ["ownerId"],
        childColumns = ["ownerId"],
        onUpdate = CASCADE,
        onDelete = CASCADE
    ),
    ForeignKey(
        entity = Dog::class,
        parentColumns = ["dogId"],
        childColumns = ["dogId"],
        onUpdate = CASCADE,
        onDelete = CASCADE
    )
])
data class OwnerDogRef(
    val ownerId: Int,
    val dogId: Int
)

