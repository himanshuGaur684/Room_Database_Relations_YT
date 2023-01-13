package gaur.himanshu.roomdatabaserelations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import gaur.himanshu.roomdatabaserelations.ui.theme.RoomDatabaseRelationsTheme
import gaur.himanshu.roomdatabaserelations.viewmodel.MainViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomDatabaseRelationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val viewModel: MainViewModel by viewModels()
                    MainScreen(viewModel = viewModel)
                }
            }
        }
    }
}


@Composable
fun MainScreen(viewModel: MainViewModel) {
    val list = viewModel.list.value
    LazyColumn {
        items(list) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp), verticalArrangement = Arrangement.Center
            ) {

            }
        }
    }

}