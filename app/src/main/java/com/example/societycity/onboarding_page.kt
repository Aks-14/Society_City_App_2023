@file:OptIn(ExperimentalPagerApi::class, ExperimentalPagerApi::class)

package com.example.societycity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.societycity.ui.theme.Bottomcardshap
import com.example.societycity.ui.theme.b_blue
import com.example.societycity.ui.theme.dark_blue
import com.example.societycity.ui.theme.white
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState


@Composable
fun StartPage(navController: NavController){

    Surface(modifier = Modifier.fillMaxSize()
    ) {
        val items=ArrayList<OnBoardingData>()
        items.add(
            OnBoardingData(R.drawable.bill1,
                backgroundColor = Color(0xFF389BF1)

            )
        )
        items.add(
            OnBoardingData(
                R.drawable.visitorm,
                backgroundColor = Color(0xFF389BF1)

            )
        )
        items.add(
            OnBoardingData(
                R.drawable.bookaservice,
                backgroundColor = Color(0xFF389BF1)
            )
        )

        val pagerState= rememberPagerState(
            pageCount =items.size,
            initialOffscreenLimit=2,
            infiniteLoop = false,
            initialPage = 0

        )

        OnBoardingPager(
            navController,
            item = items,
            pagerState = pagerState,
            modifier = Modifier.fillMaxSize(),
        )
    }
}

@ExperimentalPagerApi
@Composable
fun OnBoardingPager(
    navController: NavController,
    item: List<OnBoardingData>,
    pagerState: PagerState,
    modifier: Modifier = Modifier
) {

    Box(modifier = modifier) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            HorizontalPager(state = pagerState) { page ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(item[page].backgroundColor),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {

                    Image(
                        painter = painterResource(
                            id = item[page].image
                        ),
                        contentDescription = "",
                        modifier = Modifier.fillMaxWidth()
                    )

                    Button(onClick = { navController.navigate("first_page") }) {
                        Text(
                            "NEXT PAGE",
                            color = white,
                            fontSize = 14.sp,
                        )

                    }
                }
            }
        }

        Box(modifier = Modifier.align(Alignment.BottomCenter)) {
            Card(
                backgroundColor = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(252.dp),
                elevation = 0.dp,
                shape = Bottomcardshap.large
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Text(
                        text = "Welcome to Society City",
                        fontSize = 16.sp,
                        color = dark_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 26.dp)
                            .padding(start = 100.dp),
                        )
                    Text(
                        text = "Manage housing bills, get timely reminders, save",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .padding(start = 40.dp, end = 13.dp),
                        )
                    Text(
                        text = "E-receipts, find local services, and much more ",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 0.dp)
                            .padding(start = 47.dp, end = 13.dp),
                        )

                        Button(
                            modifier = Modifier
                                .padding(start = 24.dp)
                                .padding(end = 16.dp)
                                .padding(top = 24.dp)
                                .width(343.dp)
                                .height(56.dp)
                                .clip(RoundedCornerShape(30.dp)),

                            onClick = {   }
                        )

                        {

                            Text(
                                "Get Started",
                                color = white,
                                fontSize = 14.sp,
                            )
                        }

                    Text(
                        text = "By clicking Get Started, you agree to the",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 75.dp, end = 13.dp,top = 16.dp),
                    )
                    Text(
                        text ="Terms and Conditions",
                        fontSize = 14.sp,
                        color = b_blue,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 130.dp, end = 13.dp,top = 0.dp),
                    )

                }
            }
        }
    }
}



