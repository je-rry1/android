package com.example.Mitchelle.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Mitchelle.R
import com.example.Mitchelle.navigation.ROUT_CLOTHING
import com.example.Mitchelle.ui.theme.Blue

@Composable
fun DashboardScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(title = { Text(text = "Amazon Shop")},
        backgroundColor = Blue)

        //End of topAppBar

        Spacer(modifier = Modifier.height(30.dp))

        //Row
        Row (modifier = Modifier

            .padding(start = 70.dp)){
            //Column
            Column {
                Text(text = "Amazon", fontSize = 35.sp, color = Blue, fontWeight = FontWeight.ExtraBold, fontFamily = FontFamily.Cursive)
                Text(text = "Shop from A to Z", fontSize = 15.sp)
            }
            Spacer(modifier = Modifier.width(30.dp))
            //End of column
            Image(painter = painterResource(id = R.drawable.social),
                contentDescription = "amazon",
                modifier = Modifier.size(100.dp))
        }
        //End of row
        Spacer(modifier = Modifier.height(30.dp))
        //Column
        Column (modifier = Modifier.padding(start = 20.dp)){
            //Row1
            Row {
                //Card1
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp)
                            .clickable {
                                navController.navigate(ROUT_CLOTHING)
                            }, contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.dress),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.gadgets),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Electronics",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card2
                }
            //End of row1

            Spacer(modifier = Modifier.height(30.dp))

            //Row2
            Row {
                //Card1
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.house),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Home",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.makeup),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Beauty",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card2
                }
            //End of row2
            Spacer(modifier = Modifier.height(30.dp))

            //Row3
            Row {
                //Card1
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.drugs),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Pharmacy",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 100.dp)) {
                    //Semi-column
                    Column {
                        //Box
                        Box (modifier = Modifier.size(50.dp), contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.vegetable),
                                contentDescription = "wow",
                                modifier = Modifier.size(50.dp)
                            )
                        }
                        //End of Box
                        Text(text = "Groceries",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }
                    //End of semi-column
                }
                //End of card2
                }
            //End of row3
            Spacer(modifier = Modifier.height(30.dp))
            
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}