package com.example.societycity.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.societycity.ui.theme.white
import kotlinx.coroutines.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyProfileScreen() {
    Scaffold(
        scaffoldState = rememberScaffoldState(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "My Profile")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(Icons.Default.ArrowBack, contentDescription = "")
                        }
                    )
                }
            )
        }
    ) {

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
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
           Text(text = "Member Name",
           modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 16.dp),
           fontSize = 12.sp
           )

            OutlinedTextField(
                value = Member_Name,
                onValueChange = { Member_Name = it },
//                label = { Text("Enter Member Name") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
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
            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )

            OutlinedTextField(
                value = Username,
                onValueChange = { Username = it },
//                label = { Text("Enter Username") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
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

            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )
            OutlinedTextField(
                value = Password,
                onValueChange = { Password = it },
//                label = { Text("Enter Password") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Lock,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )
            OutlinedTextField(
                value = Mobile_No,
                onValueChange = { Mobile_No = it },
//                label = { Text("Enter Mobile No") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Phone,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )
            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )
            OutlinedTextField(
                value = Email_Id,
                onValueChange = { Email_Id = it },
//                label = { Text("Enter Email Id") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Email,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )
            OutlinedTextField(
                value = Address,
                onValueChange = { Address = it },
//                label = { Text("Enter Address") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Text(text = "Username",
                modifier = Modifier.fillMaxWidth().padding(start = 24.dp, top = 14.dp),
                fontSize = 12.sp
            )

            OutlinedTextField(
                value = Flat_No,
                onValueChange = { Flat_No = it },
//                label = { Text("Enter Flat No") },
                modifier = Modifier.padding(start = 24.dp, top = 7.dp, end = 24.dp).height(45.dp).fillMaxWidth(),
                leadingIcon ={
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.LocationOn,
                            contentDescription = "Icon",
                            tint = Color.Black
                        )

                    }
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Button(
                modifier = Modifier.padding(start = 24.dp)
                    .padding(end = 24.dp)
                    .padding(top = 25.dp).fillMaxWidth()
                    .height(56.dp)
                    .clip(
                        RoundedCornerShape(30.dp)
                    ),
                onClick = { },
                ) {
                Text(
                    "Update",
                    color = white,
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
@Preview
fun ProfileScreenPreview() {
    MyProfileScreen()
}