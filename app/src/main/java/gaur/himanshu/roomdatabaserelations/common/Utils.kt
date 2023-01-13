package gaur.himanshu.roomdatabaserelations.common

import gaur.himanshu.roomdatabaserelations.database.model.Dog
import gaur.himanshu.roomdatabaserelations.database.model.Owner

object OneToOneRelation {
    fun getDogList(): List<Dog> {
        return listOf(
            Dog(
                dogOwnerId = 1,
                name = "Dog 1",
                dogId = 1
            ),
            Dog(
                dogOwnerId = 2,
                name = "Dog 2",
                dogId = 2
            ),
            Dog(
                dogOwnerId = 3,
                name = "Dog 3",
                dogId = 3
            ),
            Dog(
                dogOwnerId = 4,
                name = "Dog 4",
                dogId = 4
            ),
            Dog(
                dogOwnerId = 5,
                name = "Dog 5",
                dogId = 5
            ),
        )
    }

    fun getOwnerList(): List<Owner> {
        return listOf(
            Owner(
                ownerId = 1, name = "Owner 1"
            ),
            Owner(
                ownerId = 2, name = "Owner 2"
            ),
            Owner(
                ownerId = 3, name = "Owner 3"
            ),
            Owner(
                ownerId = 4, name = "Owner 4"
            ),
            Owner(
                ownerId = 5, name = "Owner 5"
            ),
            Owner(
                ownerId = 6, name = "Owner 6"
            ),
        )
    }
}

object OneToManyRelation {
    fun getDogList(): List<Dog> {
        return listOf(
            Dog(
                dogOwnerId = 1,
                name = "Dog 1",
                dogId = 1
            ),
            Dog(
                dogOwnerId = 2,
                name = "Dog 2",
                dogId = 2
            ),
            Dog(
                dogOwnerId = 3,
                name = "Dog 3",
                dogId = 3
            ),
            Dog(
                dogOwnerId = 4,
                name = "Dog 4",
                dogId = 4
            ),
            Dog(
                dogOwnerId = 5,
                name = "Dog 5",
                dogId = 5
            ),
            Dog(
                dogOwnerId = 5,
                name = "Dog 6",
                dogId = 6
            ),
            Dog(
                dogOwnerId = 1,
                name = "Dog 7",
                dogId = 7
            ),
        )
    }

    fun getOwnerList(): List<Owner> {
        return listOf(
            Owner(
                ownerId = 1, name = "Owner 1"
            ),
            Owner(
                ownerId = 2, name = "Owner 2"
            ),
            Owner(
                ownerId = 3, name = "Owner 3"
            ),
            Owner(
                ownerId = 4, name = "Owner 4"
            ),
            Owner(
                ownerId = 5, name = "Owner 5"
            ),
            Owner(
                ownerId = 6, name = "Owner 6"
            ),
        )
    }
}

object ManyToManyRelation {

}
