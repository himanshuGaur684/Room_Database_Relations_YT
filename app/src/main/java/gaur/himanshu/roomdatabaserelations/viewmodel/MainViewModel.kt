package gaur.himanshu.roomdatabaserelations.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import gaur.himanshu.roomdatabaserelations.database.ExampleDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val exampleDao: ExampleDao) : ViewModel() {

    val list = mutableStateOf(emptyList<String>())

    init {
        viewModelScope.launch(Dispatchers.IO) {

        }
    }


}