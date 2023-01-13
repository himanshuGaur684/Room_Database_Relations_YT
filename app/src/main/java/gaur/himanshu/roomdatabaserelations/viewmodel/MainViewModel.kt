package gaur.himanshu.roomdatabaserelations.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import gaur.himanshu.roomdatabaserelations.common.OneToOneRelation
import gaur.himanshu.roomdatabaserelations.database.ExampleDao
import gaur.himanshu.roomdatabaserelations.database.model.OwnerDog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val exampleDao: ExampleDao) : ViewModel() {

    val list = mutableStateOf<List<OwnerDog>>(emptyList<OwnerDog>())

    init {
        viewModelScope.launch(Dispatchers.IO) {
            async { exampleDao.insertDog(OneToOneRelation.getDogList()) }.await()
            async { exampleDao.insertOwner(OneToOneRelation.getOwnerList()) }.await()
            async { list.value =exampleDao.getOwnerDogList() }

        }
    }


}