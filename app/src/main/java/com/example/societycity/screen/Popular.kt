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
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.societycity.R
import com.example.societycity.ui.theme.Bottomcardshap
import com.example.societycity.ui.theme.grayscaltitle
import com.example.societycity.ui.theme.white


@Composable
fun Popularscreen() {
    Popular_window{ // TODO: Handle icon selection
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

