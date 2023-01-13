package gaur.himanshu.roomdatabaserelations.database.model

import androidx.room.Embedded
import androidx.room.Relation


data class OwnerDog(
    @Embedded
    val owner:Owner,
    @Relation(
        parentColumn = "ownerId",
        entityColumn = "dogOwnerId"
    )
    val dog:Dog
)

