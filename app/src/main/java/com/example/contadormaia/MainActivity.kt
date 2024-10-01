package com.example.contadormaia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.contadormaia.ui.theme.ContadorMaiaTheme
import com.example.contadormaia.viewmodel.MainGuiViewModel
import com.example.contadormaia.view.MainGui


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val meuViewModel = MainGuiViewModel()
        enableEdgeToEdge()
        setContent {
            ContadorMaiaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainGui(
                        meuViewModel
                    )
                }
            }
        }
    }
}