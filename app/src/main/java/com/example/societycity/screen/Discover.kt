package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
                ) {
                IconButton(
                    onClick = { },
                    modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                    content = {
                        Icon(Icons.Default.ArrowBack, contentDescription = "")
                    }
                )

                Text(
                    text = "Society Accounts",
                    color = grayscaltitle,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(top = 20.dp, start = 55.dp, end = 100.dp)
                )
            }
                POPUP()

            Row(
                modifier = Modifier
                    .padding(top=300.dp,bottom = 20.dp, start = 10.dp, end = 16.dp)
                    .background(white)
                    .height(100.dp)

            ) {
                LazyRow {
                    items(4) { index ->
                        Image(
                            painter = painterResource(id = getDrawableRes(index)),
                            contentDescription = "Image $index",
                            modifier = Modifier.fillMaxWidth()
                                .height(100.dp)
                                .padding(6.dp)
                        )
                    }
                }
            }
        }

}
fun getDrawableRes(index: Int): Int {
    return when (index) {
        0 -> R.drawable.frame
        1 -> R.drawable.frame1
        2 -> R.drawable.frame2
        3 -> R.drawable.frame4

        else -> throw IllegalArgumentException("Invalid image index")
    }
}

@Composable
fun POPUP() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp)
            .padding(12.dp),
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
            ) {
            ImageButton(
                imageResId = R.drawable.bill,
                text = "Bill",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.search,
                text = "Receipts",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.loca_manage,
                text = "Ledger",
                onClick = { /* handle click */ }
            )
        }
        Row(modifier = Modifier.fillMaxWidth().padding(top = 2.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ImageButton(
                imageResId = R.drawable.shopping,
                text = "Interest Depo",
                onClick = { /* handle click */ }
            )

            ImageButton(
                imageResId = R.drawable.bill,
                text = "Car Parking",
                onClick = { /* handle click */ }
            )
            ImageButton(
                imageResId = R.drawable.search,
                text = "Utility Bills",
                onClick = { /* handle click */ }
            )
        }
    }
}

