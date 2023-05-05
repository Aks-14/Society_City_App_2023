package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.societycity.R
import com.example.societycity.ui.theme.*


@Composable
fun Discoverscreen() {

    NavGraph()
}


@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomePage(navController = navController)
        }
        composable("visitors_in") { Visitors_In() }
        composable("daily_visitors") { Daily_Visitors() }
        composable("visitors_out") { Visitors_Out() }
        composable("pre_approval") { Pre_Approval() }
    }
}

@Composable
fun HomePage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("visitors_in")}) {
            Text("Visitors In")
        }

        Button(onClick = { navController.navigate("daily_visitors")}) {
            Text("Daily Visitors")
        }

        Button(onClick = {navController.navigate("visitors_out") }) {
            Text("Visitors Out")
        }

        Button(onClick = { navController.navigate("pre_approval")}) {
            Text("Pre Approval")
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Visitors_In(){
    Scaffold(
        scaffoldState = rememberScaffoldState(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Visitors In")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(Icons.Default.ArrowBack, contentDescription = "")
                        }
                    )
                })
        }){

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.SpaceAround)
        {
            Button(onClick = { },
                shape = RoundedCornerShape(40.dp)) {
                Text(text = "Selected Flat" ,
                    modifier = Modifier
                        .width(150.dp)
                        .height(45.dp)
                        .padding(top = 10.dp, start = 23.dp)
                )
            }
            Button(onClick = { },
                shape = RoundedCornerShape(40.dp),) {
                Text(
                    text = "Find Member", 
                    modifier = Modifier
                        .width(150.dp)
                        .height(45.dp)
                        .padding(top = 10.dp, start = 25.dp)
                )
            }
        }
        Box(modifier = Modifier.padding(top =90.dp, start = 24.dp).background(white)) {
            Box(
                modifier = Modifier
                    .size(75.dp)
                    .background(Color.LightGray, shape = CircleShape)
            ){
                Image(
                    painterResource(id = R.drawable.baseline_add_24), "admin",
                    Modifier
                        .padding(top = 60.dp, start =20.dp)
                        .size(40.dp)
                )
            }
        }

        //app content....
        // Set up the local state for the received OTP code and the entered OTP code
        var Member_Name by remember { mutableStateOf("") }
        var Username by remember { mutableStateOf("") }
        var Password by remember { mutableStateOf("") }
        var Mobile_No by remember { mutableStateOf("") }
        var Email_Id by remember { mutableStateOf("") }
        var Address by remember { mutableStateOf("") }
        var Flat_No by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.fillMaxWidth().padding(top=160.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
//            Text(text = "Member Name",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 16.dp),
//                fontSize = 12.sp
//            )

            OutlinedTextField(
                value = Member_Name,
                onValueChange = { Member_Name = it },
                label = { Text("Visitor name *",fontSize = 13.sp ) },
                modifier = Modifier.padding(start = 24.dp, top = 10.dp, end = 24.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Person,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )
                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )

            OutlinedTextField(
                value = Username,
                onValueChange = { Username = it },
                label = { Text("Enter Number *",fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp,end = 24.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Phone,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )
            OutlinedTextField(
                value = Password,
                onValueChange = { Password = it },
                label = { Text("Select purpose of visit *",fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp, end = 24.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Menu,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )
            OutlinedTextField(
                value = Mobile_No,
                onValueChange = { Mobile_No = it },
                label = { Text("Enter location *",fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp,end = 24.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )
            OutlinedTextField(
                value = Email_Id,
                onValueChange = { Email_Id = it },
                label = { Text("Enter address",fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp, end = 24.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )
            OutlinedTextField(
                value = Address,
                onValueChange = { Address = it },
                label = { Text("Enter vehicle number",fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp, end = 24.dp).fillMaxWidth(),
                leadingIcon ={
//                    IconButton(onClick = { }) {
//                        Icon(
//                            Icons.Filled.LocationOn,
//                            contentDescription = "Icon",
//                            tint = Color.Black
//                        )
//
//                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

//            Text(text = "Username",
//                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
//                fontSize = 12.sp
//            )

            OutlinedTextField(
                value = Flat_No,
                onValueChange = { Flat_No = it },
                label = { Text("Enter ID proof number", fontSize = 13.sp) },
                modifier = Modifier.padding(start = 24.dp,end = 24.dp).fillMaxWidth(),
                leadingIcon ={
//                    IconButton(onClick = { }) {
//                        Icon(
//                            Icons.Filled.LocationOn,
//                            contentDescription = "Icon",
//                            tint = Color.Black
//                        )
//
//                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Button(
                modifier = Modifier.padding(start = 24.dp)
                    .padding(end = 24.dp)
                    .padding(top = 15.dp).fillMaxWidth()
                    .height(56.dp)
                    .clip(
                        RoundedCornerShape(30.dp)
                    ),
                onClick = { },
            ) {
                Text(
                    "Save",
                    color = white,
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
fun Daily_Visitors(){
    Text(text = "This is Page 2")
}

@Composable
fun Visitors_Out() {
    Text(text = "This is Page 3")
}
@Composable
fun Pre_Approval(){
    Text(text = "This is Page 4")
}










