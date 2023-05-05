package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.societycity.R
import com.example.societycity.ui.theme.Bottomcardshap
import com.example.societycity.ui.theme.grayscaltitle
import com.example.societycity.ui.theme.white


@Composable
fun Popularscreen() {
    Popular_window{ // TODO: Handle icon selection
    }

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
    val navController = rememberNavController()


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
                onClick = { navController.navigateUp()},
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
                .padding(top = 300.dp, bottom = 20.dp, start = 10.dp, end = 16.dp)
                .background(white)
                .height(100.dp)

        ) {
            LazyRow {
                items(4) { index ->
                    Image(
                        painter = painterResource(id = getDrawableRes(index)),
                        contentDescription = "Image $index",
                        modifier = Modifier
                            .fillMaxWidth()
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
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp),
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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Popular_window(onIconSelected: (Int) -> Unit) {
    Card(
        modifier = Modifier
            .padding(top = 250.dp, start = 16.dp, end = 16.dp)
            .height(461.dp)
            .fillMaxWidth()
            .border(width = 2.dp,color = Color.LightGray, shape = Bottomcardshap.large),
        ) {
        Row(modifier = Modifier.fillMaxWidth().padding(top=80.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
            Box(modifier = Modifier.background(Color.LightGray).width(160.dp).height(70.dp).padding(start = 10.dp, end = 150.dp))
            Box(modifier = Modifier.background(Color.LightGray).width(160.dp).height(70.dp).padding(start = 80.dp, end = 20.dp))
        }
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
                text = "Popular",
                color = grayscaltitle,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(top = 20.dp, start = 95.dp, end = 130.dp)
            )
        }

        Pop_up()

        Row(
            modifier = Modifier
                .padding(top = 280.dp, bottom = 20.dp, start = 10.dp, end = 16.dp)
                .background(white)
        )
        {
            LazyRow {
                items(5) { index ->
                    Image(
                        painter = painterResource(id = getDrawableres(index)),
                        contentDescription = "Image $index",
                        modifier = Modifier
                            .height(120.dp)
                            .width(250.dp)
                            .padding(6.dp))
                }
            }
        }
    }
}
fun getDrawableres(index: Int): Int {
    return when (index) {
        0 -> R.drawable.frame
        1 -> R.drawable.frame1
        2 -> R.drawable.frame2
        3 -> R.drawable.frame4
        4 -> R.drawable.frame2
        else -> throw IllegalArgumentException("Invalid image index")
    }
}

@Composable
fun Pop_up(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 140.dp)
            .padding(12.dp),
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly)
        {
            ImageButton(
                imageResId = R.drawable.bill,
                text = "Utility Bill",
                onClick = { }
        )
            ImageButton(
                imageResId = R.drawable.society_corner,
                text = "Society Corner",
                onClick = { }
            )
        }
    }
}

