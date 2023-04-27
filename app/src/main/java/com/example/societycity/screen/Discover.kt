package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.societycity.R
import com.example.societycity.ui.theme.*


@Composable
fun Discoverscreen() {

    var isPopupVisible by remember { mutableStateOf(false) }

    Box {
        Button(onClick = { isPopupVisible = true }) {
            Text("Show Popup")
        }
        if (isPopupVisible) {
            PopupContent {
                // TODO: Handle icon selection
                isPopupVisible = false
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PopupContent(onIconSelected: (Int) -> Unit) {


        Card(
            modifier = Modifier
                .padding(top = 250.dp, start = 16.dp, end = 16.dp)
                .height(461.dp)
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.LightGray, shape = Bottomcardshap.large),

        ) {
            Scaffold(
                scaffoldState = rememberScaffoldState(),
                topBar = {
                    TopAppBar(
                        title = {
                            Text(text = "Society Accounts", color = grayscal)
                        },
                        navigationIcon = {
                            IconButton(
                                onClick = { },
                                content = {
                                    Icon(Icons.Default.ArrowBack, contentDescription = "")
                                }
                            )
                        }
                    )
                }
            ) {

                POPUP()
            }


        }

}

@Composable
fun POPUP() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
            .padding(12.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
            ) {
            ImageButton(
                imageResId = R.drawable.bill,
                text = "Utility Bill",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.search,
                text = "Discover",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.loca_manage,
                text = "Local Service",
                onClick = { /* handle click */ }
            )
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ImageButton(
                imageResId = R.drawable.shopping,
                text = "Exclusive Store",
                onClick = { /* handle click */ }
            )

            ImageButton(
                imageResId = R.drawable.bill,
                text = "Utility Bill",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.search,
                text = "Discover",
                onClick = { /* handle click */ }
            )
        }
    }
}

