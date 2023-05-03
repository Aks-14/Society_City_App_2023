package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.societycity.R
import com.example.societycity.ui.theme.CornerShape10
import com.example.societycity.ui.theme.b_blue
import com.example.societycity.ui.theme.grayscal
import com.example.societycity.ui.theme.grayscaltitle
import com.example.societycity.ui.theme.green_dark
import com.example.societycity.ui.theme.light_blue2
import com.example.societycity.ui.theme.white


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DailyNeedScreen() {
    Scaffold(
        scaffoldState = rememberScaffoldState(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Complaint Details")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(Icons.Default.ArrowBack, contentDescription = "")
                        }
                    )
                })
        })
    {

        //ads section
        Card(
            backgroundColor = Color.LightGray,
            modifier = Modifier
                .padding(top = 11.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .height(69.dp),
            elevation = 0.dp,
            shape = CornerShape10.small
        ) {
            Box(
                modifier = Modifier.padding(start =0.dp),
                contentAlignment = Alignment.Center
                )
            {
                Image(
                    painterResource(id = R.drawable.rectangle_5), "bg_img_ads",
                    Modifier
                        .padding(top = 10.dp)
                        .size(40.dp)
                        .width(30.dp)
                        .height(22.dp),
                )
                Text(
                    text = "Ads",
                    color = white,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }
        // header

        Card(
            backgroundColor = Color.LightGray,
            modifier = Modifier
                .padding(top = 90.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth()
                .height(49.dp),
            elevation = 0.dp,
            shape = CornerShape10.small
        ) {

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 0.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Row()
                {
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .width(115.dp)
                            .height(42.dp)
                    ) {
                        Text(
                            "Open",
                            color = white,
                            fontSize = 13.sp,
                        )
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .width(120.dp)
                            .height(42.dp)
                            .padding(start = 7.dp)
                    ) {
                        Text(
                            "In Procress",
                            color = white,
                            fontSize = 13.sp,
                        )
                    }
                    Button(
                        onClick = { },
                        modifier = Modifier
                            .width(115.dp)
                            .height(42.dp)
                            .padding(start = 7.dp)

                    ) {
                        Text(
                            "Closed",
                            color = white,
                            fontSize = 13.sp,
                        )
                    }
                }
            }
        }

        // sub conetnt

        Column(modifier= Modifier
            .fillMaxWidth()
            .padding(top = 150.dp)
            .background(light_blue2)
            .height(40.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
            )
        {
            Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start ) {
                Text(
                    "Title : Water Leakage",
                    modifier = Modifier.padding(start = 20.dp),
                    color = grayscaltitle,
                    fontSize = 14.sp,
                )
                Text(
                    "Open",
                    modifier=Modifier.padding(start = 190.dp, end = 20.dp),
                    color = green_dark,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 195.dp)
                .height(20.dp),
            horizontalArrangement = Arrangement.Start ) {
            Text(
                "Raised by :",
                modifier = Modifier.padding(start = 20.dp),
                color = grayscaltitle,
                fontSize = 12.sp,
            )
            Text(
                "Kalyani Mukharjee, 9168660832",
                modifier=Modifier.padding(start = 25.dp, end = 20.dp),
                color = green_dark,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 215.dp)
                .height(20.dp),
            horizontalArrangement = Arrangement.Start ) {
            Text(
                "Raised on :",
                modifier = Modifier.padding(start = 20.dp),
                color = grayscaltitle,
                fontSize = 12.sp,
            )
            Text(
                "07 March 2023, 02:36 PM",
                modifier=Modifier.padding(start = 25.dp, end = 20.dp),
                color = green_dark,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 250.dp, start = 20.dp)
                .width(50.dp)
                .height(50.dp)
                .background(Color.LightGray)
        )
        Column(  modifier = Modifier
            .padding(top = 250.dp, start = 20.dp)) {

            Text(
                "Complaint on :",
                modifier = Modifier.padding(start = 93.dp),
                color = grayscaltitle,
                fontSize = 12.sp,
            )
            Text(
                "TN14640",
                modifier=Modifier.padding(start = 93.dp, end = 20.dp),
                color = green_dark,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(modifier = Modifier
            .padding(top = 255.dp, start = 240.dp, end = 20.dp)) {
            Button(
                modifier = Modifier
                    .width(145.dp)
                    .height(35.dp)
                    .clip(
                        RoundedCornerShape(28.dp)
                    ),
                onClick = { },
            ) {
                Text(
                    "Update Status",
                    color = white,
                    fontSize = 12.sp,
                )
            }
        }


    }
}
