package com.example.societycity

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.societycity.ui.theme.*
import kotlinx.coroutines.*
import java.util.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstPage(navController: NavController) {
//    BackHandler({  })
    Box(
        modifier = Modifier.fillMaxSize()
            .background(color = blue)
            .padding(top = 50.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 300.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Computerised",
                style = TextStyle(fontSize = 24.sp),
                color = dark_blue,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "maintenance Bills",
                style = TextStyle(fontSize = 24.sp),
                color = white,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp

            )
            Text(

                modifier = Modifier.padding(top = 21.dp),
                text = "Get quarterly and monthly computerised",
                style = TextStyle(fontSize = 24.sp),
                color = white,
                fontSize = 16.sp,
            )
            Text(
                text = "maintenance Bills",
                style = TextStyle(fontSize = 24.sp),
                color = white,
                fontSize = 16.sp

            )
        }

        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            Card(
                backgroundColor = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                elevation = 0.dp,
                shape = Bottomcardshap.large
            ) {

                // Your bottom layout goes here
                // Set up the local state for the phone number and OTP code
                var phoneNumber by remember { mutableStateOf("") }
                var otpCode by remember { mutableStateOf("") }

                Column(
                    modifier = Modifier.fillMaxSize(),

                    ) {
                    Text(
                        text = "Login Now",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 20.dp)
                            .fillMaxSize()
                            .padding(start = 146.dp)
                            .padding(end = 146.dp),
                    )
                }
                Column(modifier = Modifier.fillMaxSize()) {

                    // Add a Textfield for the user to enter their phone number
                    TextField(
                        value = phoneNumber,
                        onValueChange = { number ->
                            if (number.length <= 10 && number.all { it.isDigit() }) {
                                phoneNumber = number
                            }
                        },
//                        placeholder={Text("Enter Register Mobile Number")},
                        label = {
                            Text(
                                "Enter registered Mobile No.",
                                color = Color.Black
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                        modifier = Modifier
                            .padding(start = 16.dp).padding(end = 16.dp)
                            .padding(top = 70.dp)
                            .width(360.dp)
                            .height(56.dp)
                            .clip(
                                RoundedCornerShape(8.dp)
                            )
                    )
                    // Add a "Get OTP" button that sends the SMS message when clicked
                    Button(
                        modifier = Modifier.padding(start = 16.dp)
                            .padding(end = 16.dp)
                            .padding(top = 25.dp)
                            .width(360.dp)
                            .height(56.dp)
                            .clip(
                                RoundedCornerShape(30.dp)
                            ),

                        onClick = {
                            navController.navigate("main_home")

                        },

                        ) {

                        Text(
                            "Get OTP",
                            color = white,
                            fontSize = 14.sp,
                        )
                    }
                }


                Row(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Text(
                        text = "Retrieve Password",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 240.dp)
                            .padding(start = 30.dp),
                    )

                    Text(
                        text = "Login with Password",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.fillMaxSize()
                            .padding(top = 240.dp)
                            .padding(end = 30.dp)
                            .padding(start = 80.dp),
                    )
                }
            }
        }
    }
}

@Composable
fun OTPScreen() {
    // Set up the local state for the received OTP code and the entered OTP code
    var receivedOtp by remember { mutableStateOf("") }
    val enteredOtp by remember { mutableStateOf("") }

    // Get the context for verifying the OTP code
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Add a Textfield for the user to enter the received OTP code
        TextField(
            value = receivedOtp,
            onValueChange = { receivedOtp = it },
            label = { Text("Enter the received OTP code") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        // Add a "Verify" button that checks if the entered OTP code matches the received OTP code when clicked
        Button(
            onClick = {
                // Use a coroutine to perform the OTP verification on a background thread
                GlobalScope.launch {
                    // Simulate a delay to make the verification seem more realistic
                    delay(2000)

                    // Check if the entered OTP code matches the received OTP code
                    val isValid = enteredOtp == receivedOtp

                    // Display the verification result on the UI
                    withContext(Dispatchers.Main) {
                        if (isValid) {
                            // If the OTP is valid, show a success message
                            showMessage(context, "OTP verified successfully!")
                        } else {
                            // If the OTP is invalid, show an error message
                            showMessage(context, "Invalid OTP! Please try again.")
                        }
                    }
                }
            }
        ) {
            Text("Verify")
        }
    }
}

private fun showMessage(context: Context, message: String) {
    // Show a Toast message with the given message string
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}



@Composable
fun ResetPasswordPage() {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.width(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
//            Button(onClick = { onCancel() }) {
            Text("Cancel")
        }
//            Button(onClick = { onResetPassword(email) }) {
        Text("Reset password")
    }
}