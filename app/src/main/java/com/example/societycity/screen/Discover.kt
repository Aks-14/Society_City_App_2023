package com.example.societycity.screen

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.societycity.R
import com.example.societycity.ui.theme.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Discoverscreen() {

    NavGraph()
}


@RequiresApi(Build.VERSION_CODES.O)
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
        composable("nav_drawer") { Nav_Drawer() }

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
        Button(onClick = { navController.navigate("nav_drawer")}) {
            Text("Nav Drawer")
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
        })
    {

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
        Box(modifier = Modifier
            .padding(top = 90.dp, start = 24.dp)
            .background(white)) {
            Box(
                modifier = Modifier
                    .size(75.dp)
                    .background(Color.LightGray, shape = CircleShape)
            ){
                Image(
                    painterResource(id = R.drawable.baseline_add_24), "admin",
                    Modifier
                        .padding(top = 60.dp, start = 20.dp)
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 160.dp),
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
                modifier = Modifier
                    .padding(start = 24.dp, top = 10.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
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
                modifier = Modifier
                    .padding(start = 24.dp)
                    .padding(end = 24.dp)
                    .padding(top = 15.dp)
                    .fillMaxWidth()
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

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Daily_Visitors(){
    Scaffold(
        scaffoldState = rememberScaffoldState(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Daily Visitors")
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
        MenuList()
    }
}

data class MenuItem(val name: String, val icon: ImageVector)

@Composable
fun MenuList() {
    val menuList = remember {
        mutableStateListOf(
            MenuItem("Cook (9)", Icons.Default.Home),
            MenuItem("Maid (9)", Icons.Default.Favorite),
            MenuItem("Nanny (9)", Icons.Default.Settings),
            MenuItem("Cook (9)", Icons.Default.Home),
            MenuItem("Maid (9)", Icons.Default.Favorite),
            MenuItem("Nanny (9)", Icons.Default.Settings),
            MenuItem("Cook (9)", Icons.Default.Home),
            MenuItem("Maid (9)", Icons.Default.Favorite),
            MenuItem("Nanny (9)", Icons.Default.Settings)
        )
    }
    val showDialog = remember { mutableStateOf(false) }
    val newMenuItem = remember { mutableStateOf(MenuItem("", Icons.Default.Add)) }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            items(menuList) { item ->
                MenuItemRow(item)
            }
        }
        FloatingActionButton(
            onClick = {
                showDialog.value = true
            },
            modifier = Modifier.padding(end = 10.dp,start = 320.dp, bottom = 80.dp),
            backgroundColor = blue
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Add Menu", tint = Color.White)
        }
    }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = {
                showDialog.value = false
                newMenuItem.value = MenuItem("", Icons.Default.Add)
            },
            title = { Text(text = "Add New Menu") },
            text = {
                Column {
                    TextField(
                        value = newMenuItem.value.name,
                        onValueChange = { newValue ->
                            newMenuItem.value = newMenuItem.value.copy(name = newValue)
                        },
                        label = { Text(text = "Menu Name") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    //menu icon item selection
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Text(text = "Menu Icon:")
//                    IconSelection(
//                        selectedIcon = newMenuItem.value.icon,
//                        onIconSelected = { newIcon ->
//                            newMenuItem.value = newMenuItem.value.copy(icon = newIcon)
//                        }
//                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        menuList.add(newMenuItem.value)
                        showDialog.value = false
                        newMenuItem.value = MenuItem("", Icons.Default.Add)
                    }
                ) {
                    Text(text = "Add")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        showDialog.value = false
                        newMenuItem.value = MenuItem("", Icons.Default.Add)
                    }
                ) {
                    Text(text = "Cancel")
                }
            }
        )
    }
}


@Composable
fun MenuItemRow(item: MenuItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(1.dp, MaterialTheme.colors.onSurface, shape = Shapes.small)
            .padding(4.dp)
    ) {
            Icon(
                imageVector = item.icon,
                contentDescription = null,
                modifier = Modifier
                    .size(32.dp)
            )
            Text(text = item.name,
            modifier = Modifier.padding(top = 5.dp, start =10.dp)
                )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null,
                modifier = Modifier.padding(top = 5.dp, end = 25.dp)
            )

    }
}



@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Visitors_Out() {
    Scaffold(
        scaffoldState = rememberScaffoldState(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Daily Visitors")
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
        val searchResults by remember { mutableStateOf("") }

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(1.dp, MaterialTheme.colors.onSurface, shape = CircleShape)
            .padding(4.dp)) {
            // Other UI component
            SearchBar(onSearch = { query ->
                // Perform the search action using the provided query
            })

            // Display search results or other content based on the search action
            Text(text = searchResults)
        }


        BoxWithButtons()
    }
}

@SuppressLint("RememberReturnType")
@Composable
fun SearchBar(onSearch: (String) -> Unit) {
    var query by remember { mutableStateOf("") }
    val focusRequester = remember { FocusRequester() }
    val focusManager = LocalFocusManager.current

    Row(
        modifier = Modifier
            .focusRequester(focusRequester)
            .onFocusChanged { if (!it.isFocused) focusManager.clearFocus() }
    ) {
        TextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier.weight(1f),
            textStyle = androidx.compose.ui.text.TextStyle(color = Color.Black),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { focusRequester.requestFocus() }),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            singleLine = true,
            placeholder = { Text("Search") }
        )
        IconButton(
            onClick = { onSearch(query) },
            modifier = Modifier.focusRequester(focusRequester),
        ) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "Search"
            )
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BoxWithButtons() {
    val callVisitorEnabled by remember { mutableStateOf(true) }
    val timeoutCodeEnabled by remember { mutableStateOf(true) }

    Box(
        modifier = Modifier
            .padding(top = 75.dp)
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(light_blue2)
                    .height(68.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.padding(top = 10.dp,start = 20.dp),
                )
                {
                    Text(
                        text = "DP",
                        color = white,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .clip(shape = CircleShape)
                            .background(darkgreen)
                            .padding(top = 14.dp)
                            .size(40.dp)
                            .padding(start = 15.dp, end = 3.dp),
                        fontSize = 14.sp,
                    )

                    Column(modifier = Modifier.padding(start = 11.dp, top = 5.dp)) {
                        Text(
                            text = "Disha Pai",
                            color = grayscaltitle,
                            fontSize = 16.sp,
                        )
                        val currentDateTime= LocalDateTime.now()
                        val formatter = DateTimeFormatter.ofPattern("d MMMM YYYY, h:mm a", Locale.ENGLISH)
                        val formatterDatetime=currentDateTime.format(formatter)
                        Text(text = formatterDatetime,
                            fontSize = 12.sp,
                        )
                    }
                    Row(
                        modifier = Modifier.padding(top = 10.dp,start = 150.dp),
                    ) {
                        Text(
                            text = "In",
                            color = grayscaltitle,
                            fontSize = 16.sp,
                        )
                    }
                }

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Column(
                    modifier = Modifier.padding(top = 10.dp,start = 20.dp),
                ){
                    Text(text = "To Meet",
                        color=GreyScale,
                        modifier=Modifier.padding(top = 22.dp),
                        fontSize = 12.sp
                        )
                    Text(
                        text = "Lata Ashok Dummad",
                        color=GreyScale_Body,
                        modifier=Modifier.padding(top = 4.dp),
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.padding(top = 10.dp,start = 100.dp),
                ){
                    Text(text = "Flat no.",
                        color=GreyScale,
                        modifier=Modifier.padding(top = 22.dp),
                        fontSize = 12.sp
                    )
                    Text(
                        text = "A- 104",
                        color=GreyScale_Body,
                        modifier=Modifier.padding(top = 4.dp),
                        fontSize = 14.sp
                    )
                }
            }

            Row(
                modifier = Modifier
                    .padding(top = 22.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Button(
                    onClick = { /* Call Visitor button action */ },
                    shape = RoundedCornerShape(40.dp),
                    modifier= Modifier
                        .height(32.dp)
                        .width(160.dp),
                    enabled = callVisitorEnabled
                ) {
                    Text(text = "Call Visitor")
                }
                Button(
                    onClick = { /* Timeout Code button action */ },
                    shape = RoundedCornerShape(40.dp),
                    modifier= Modifier
                        .height(32.dp)
                        .width(160.dp),
                    enabled = timeoutCodeEnabled
                ) {
                    Text(text = "Timeout")
                }
            }
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Pre_Approval(){

    Scaffold(
        scaffoldState = rememberScaffoldState(),

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Pre Approval")
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
        val searchResults by remember { mutableStateOf("") }

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(1.dp, MaterialTheme.colors.onSurface, shape = CircleShape)
            .padding(4.dp)) {
            // Other UI component
            SearchBar(onSearch = { query ->
                // Perform the search action using the provided query
            })

            // Display search results or other content based on the search action
            Text(text = searchResults)
        }

    }

}


@Composable
fun Nav_Drawer() {
    TODO("Not yet implemented")
}










