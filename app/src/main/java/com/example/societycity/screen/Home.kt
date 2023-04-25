package com.example.societycity.screen

import android.os.Build
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.societycity.R
import com.example.societycity.ui.theme.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = blue),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            Text(text = "abhishek")
            Text(text = "abhishek4")
            Text(text = "abhishek5")
        }


        Card(
            backgroundColor = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .height(718.dp),
            elevation = 0.dp,
            shape = Bottomcardshap.large
        ) {
            Box(
                modifier = Modifier
                    .height(114.dp)
                    .width(343.dp)
                    .background(white)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            ) {
                val imageList = listOf(
                    R.drawable.s1,
                    R.drawable.s2,
                    R.drawable.s3,
                    R.drawable.s4,
                    R.drawable.s5
                )
                ImageSlider(images = imageList,
                heading = "Lorem Ipsum", sub_heading = "Place holder text for banner, may go in 3 lines"
                    )
            }
// next box
            Box(
                modifier = Modifier
                    .padding(top = 140.dp, bottom = 350.dp, start = 16.dp, end = 16.dp)
                    .background(white)
                    .height(222.dp)
                    .width(343.dp)
                    .border(width = 2.dp, color = Color.LightGray, shape = CornerShape10.small)
            ) {
                Text(
                    text = "Quick Links",
                    color = grayscaltitle,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp, start = 12.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 197.dp, bottom = 358.dp, start = 24.dp, end = 193.dp)
                    .height(169.dp)
                    .width(164.dp)
                    .background(color = grayscal, shape = CornerShape10.small)
            )
            {
                Text(
                    text = "Visitors",
                    modifier = Modifier
                        .padding(top = 5.dp, start = 8.dp, end = 39.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 285.dp,start = 24.dp, end = 193.dp)
            )
            {
                Text(
                    text = "Abhishek s..",
                    modifier = Modifier.height(15.dp).width(85.dp)
                        .padding(top = 1.dp, start = 6.dp, end = 3.dp),
                    fontSize = 12.sp,
                )
                //user name will show in circle code here

                //name and time
                Text(
                    text = "Mohan Sa..",
                    modifier = Modifier.height(15.dp).width(120.dp)
                        .padding(top = 1.dp, start = 11.dp, end = 3.dp),
                    fontSize = 12.sp,
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 302.dp,start = 24.dp, end = 193.dp)
            )
            {
                val currentDateTime=LocalDateTime.now()
                val formatter =DateTimeFormatter.ofPattern("d MMMM,h:mm a", Locale.ENGLISH)
                val formatterDatetime=currentDateTime.format(formatter)
                Text(text = formatterDatetime,
                    modifier = Modifier.height(15.dp).width(74.dp)
                        .padding(top = 2.dp, start = 5.dp, end = 3.dp),
                    fontSize = 9.sp,
                    )
                Text(text = formatterDatetime,
                    modifier = Modifier.height(15.dp).width(120.dp)
                        .padding(top = 2.dp, start = 20.dp, end = 3.dp),
                    fontSize = 9.sp,
                )

            }
            Row(
                modifier = Modifier
                    .padding(top = 197.dp, bottom = 358.dp, start = 205.dp, end = 108.dp)
                    .height(169.dp)
                    .width(76.dp)
                    .background(color = grayscal, shape = CornerShape10.small)
            )
            {
                Text(text = "abhishek")
                Text(text = "abhishek4")

            }
            Row(
                modifier = Modifier
                    .padding(top = 197.dp, bottom = 358.dp, start = 290.dp, end = 25.dp)
                    .height(169.dp)
                    .width(76.dp)
                    .background(color = grayscal, shape = CornerShape10.small)
            )
            {
                Text(text = "abhishek")
                Text(text = "abhishek4")
                Text(text = "abhishek5")
            }
        }


        Row(
            modifier = Modifier
                .padding(top = 410.dp, bottom = 210.dp, start = 10.dp, end = 16.dp)
                .background(white)
                .height(130.dp)
                .fillMaxWidth()
        ) {

            LazyRow {
                items(4) { index ->
                    Image(
                        painter = painterResource(id = getDrawableResId(index)),
                        contentDescription = "Image $index",
                        modifier = Modifier
                            .width(176.dp)
                            .height(120.dp)
                            .padding(6.dp)
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 505.dp, bottom = 65.dp, start = 16.dp, end = 16.dp)
                .background(white)
                .height(148.dp)
                .width(360.dp)
                .border(width = 2.dp, color = Color.LightGray, shape = CornerShape10.small)
        ) {
            Text(
                text = "Service and Amenities",
                color = grayscaltitle,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 8.dp, start = 12.dp)
            )

            MyIB()
        }
    }
    }



@Composable
fun ImageSlider(images: List<Int>,heading:String,sub_heading:String) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = CornerShape10.small),
        contentPadding = PaddingValues(horizontal = 0.dp, vertical = 0.dp)
    ) {
        itemsIndexed(images) { index, image ->
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(343.dp)
                    .height(114.dp)
                    .padding(horizontal = 8.dp)
            )
            Text(text = heading,
                color = white,
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 80.dp)
            )
            Text(text = sub_heading,
                color = white,
                fontSize = 10.sp,
                modifier = Modifier.padding(top = 80.dp)
            )
        }
    }
}


fun getDrawableResId(index: Int): Int {
    return when (index) {
        0 -> R.drawable.frame
        1 -> R.drawable.frame1
        2 -> R.drawable.frame2
        3 -> R.drawable.frame4

        else -> throw IllegalArgumentException("Invalid image index")
    }
}

@Composable
fun MyIB() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
            .padding(12.dp),
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
        ImageButton(
            imageResId = R.drawable.shopping,
            text = "Exclusive Store",
            onClick = { /* handle click */ }
        )
    }
}

@Composable
fun ImageButton(imageResId: Int,text:String, onClick: () -> Unit) {
    val painter: Painter = painterResource(id = imageResId)

    IconButton(onClick = onClick) {
        Image(
            painter = painter,
            contentDescription = null,
            modifier = Modifier.size(70.dp)
        )
        Text(text = text,
            color = grayscaltitle,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 80.dp)
            )

    }
}

@Composable
fun UserProfile(name: String, avatarUrl: String) {
//    val painter: Painter = painterResource(id = avatarUrl)
//
//    Column(
//        modifier = Modifier.padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = painterResource(painter),
//            contentDescription = "User Avatar",
//            modifier = Modifier
//                .size(100.dp)
//                .clip(CircleShape)
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Text(
//            text = name,
//            style = MaterialTheme.typography.h6
//        )
//    }
}



