package com.example.contadormaia.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.contadormaia.viewmodel.MainGuiViewModel
import androidx.compose.runtime.livedata.observeAsState


@Composable
fun MainGui(meuViewModel: MainGuiViewModel) {

    val x: Int by meuViewModel.contador.observeAsState(0)

    var txfieldValue by remember { mutableStateOf("") }

    Column {
        TextField(value = x.toString(), onValueChange = {
        })
        Button(onClick = {
            meuViewModel.incrementaContador()
        }) {
            Text(text = "Numero de clicks = " + x.toString())
        }
    }
}