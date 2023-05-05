package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.societycity.R
import com.example.societycity.ui.theme.CornerShape10
import com.example.societycity.ui.theme.grayscaltitle
import com.example.societycity.ui.theme.green_dark
import com.example.societycity.ui.theme.light_blue2
import com.example.societycity.ui.theme.white


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DailyNeedScreen() {
    val navController = rememberNavController()
    Scaffold(
        scaffoldState = rememberScaffoldState(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Complaint Details")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {navController.navigateUp()},
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
                            "In Process",
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

        // sub content

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
                "Abhilasha Harjeet, 9168660832",
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

        XYZ()

    }

}

@Composable
fun Update_status(onIconSelected: (Int) -> Unit) {
}

@Composable
fun XYZ() {
    var showDialog by remember { mutableStateOf(false) }
    var username by remember { mutableStateOf("") }


    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 250.dp, start = 237.dp, end = 20.dp)) {
        // Button to show the popup
        Button(onClick = { showDialog = true }, shape = RoundedCornerShape(20.dp)) {
            Text(text = "Update Status")
        }

        // Popup dialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
//                title = { Text(text = "Title : Water Leakage") },

                text = {
                    Column {
                        Text(
                            text = "Title : Water Leakage",
                            color = grayscaltitle,
                            fontSize = 14.sp,
                        )
                        Text(
                            text = "Open",
                            modifier = Modifier.padding(start = 0.dp, end = 20.dp),
                            color = green_dark,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .width(50.dp)
                                    .height(50.dp)
                                    .background(Color.LightGray)
                            )
                            Column(modifier = Modifier.fillMaxWidth()) {

                                Text(
                                    "Complaint on :",
                                    modifier = Modifier.padding(top = 10.dp, start = 15.dp),
                                    color = Color.LightGray,
                                    fontSize = 12.sp,
                                )
                                Text(
                                    "TN14640",
                                    modifier = Modifier.padding(start = 15.dp),
                                    color = grayscaltitle,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        Row(
                            Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Raised by :",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "Abhilasha Harjeet",
                                modifier = Modifier.padding(start = 15.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Raised on :",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "07 March 2023, 02:36 PM",
                                modifier = Modifier.padding(start = 15.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Mobile No. :",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "9168660832",
                                modifier = Modifier.padding(start = 9.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Address:",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "Flat no-d-603 Wing- D, Flat no-d",
                                modifier = Modifier.padding(start = 27.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Building:",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "Gayatri Sankul",
                                modifier = Modifier.padding(start = 27.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Text(
                                "Description:",
                                modifier = Modifier.padding(start = 0.dp),
                                color = Color.LightGray,
                                fontSize = 12.sp,
                            )
                            Text(
                                "As per discussion, don't allow visitors to stay at the society after 12 ",
                                modifier = Modifier.padding(start = 9.dp, end = 20.dp),
                                color = grayscaltitle,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(text = "Remarks:", fontSize = 13.sp)
                        OutlinedTextField(
                            value = username,
                            onValueChange = { username = it },
                            modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                        )
                        Text(text = "Status:", fontSize = 13.sp)
                        OutlinedTextField(
                            value = username,
                            onValueChange = { username = it },
                            modifier = Modifier
                                .height(50.dp)
                                .fillMaxWidth(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                        )

                    }
                    Row(
                        Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        TextButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(top = 440.dp, start = 20.dp)
                                .height(40.dp)
                        )
                        {
                            Text(text = "View Log",
                                fontSize = 13.sp
                                )
                        }

                        Button(onClick = { },
                            modifier = Modifier
                                .padding(top = 440.dp, start = 30.dp)
                                .height(40.dp),
                            shape = RoundedCornerShape(20.dp)) {
                            Text(text = "Update Status", fontSize = 13.sp)
                        }
                    }
                },


                confirmButton = {
//                    Button(
//                        onClick = {
//                            // Handle update logic with inputText
//                            showDialog = false
//                        }
//                    ) {
//                        Text(text = "Update Status")
//                    }
                },

//                dismissButton = {
//                    Button(onClick = { showDialog = false }) {
//                        Text(text = "Cancel")
//                    }
//                },

                )
        }
    }
}

