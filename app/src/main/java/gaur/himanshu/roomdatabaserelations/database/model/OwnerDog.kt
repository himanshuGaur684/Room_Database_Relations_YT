package gaur.himanshu.roomdatabaserelations.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation


data class OwnerDog(
    @Embedded
    val owner:Owner,
    @Relation(
        parentColumn = "ownerId",
        entityColumn = "dogId",
        associateBy = Junction(OwnerDogRef::class)
    )
    val dog:List<Dog>?=null
)

