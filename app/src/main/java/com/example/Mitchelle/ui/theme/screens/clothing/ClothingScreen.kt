package com.example.Mitchelle.ui.theme.screens.clothing

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Mitchelle.R

@Composable
fun ClothingScreen(navController: NavHostController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Image(painter = painterResource(id = R.drawable.winter),
                contentDescription = "winter",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text ="WINTER COLLECTION",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White)
                Text(
                    text ="Purchase your clothes",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White)
            }

        }
        //End of box
        Spacer(modifier = Modifier.height(30.dp))
        //Column
        Column (modifier = Modifier.padding(start = 20.dp)){
            //Row1
            Row {
                //Card1
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.girl),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Ladies' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left,)

                        Text(text = "Ksh.2500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        OutlinedButton(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        )
                        {
                            Text(text = "PAY")

                        }





                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.girl1),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Ladies' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        Text(text = "Ksh.1500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        OutlinedButton(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        )
                        {
                            Text(text = "PAY")

                        }


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
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.men),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Mens' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left,)

                        Text(text = "Ksh.2500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        OutlinedButton(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        )
                        {
                            Text(text = "PAY")

                        }





                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.man),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Mens' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        Text(text = "Ksh.1500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                       OutlinedButton(
                           onClick = {
                               val simToolKitLaunchIntent =
                                   mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                               simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                           },
                           colors = ButtonDefaults.buttonColors(Color.White)
                       ) 
                       {
                           Text(text = "PAY")
                           
                       }
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
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.girl2),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Ladies' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left,)

                        Text(text = "Ksh.2500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        OutlinedButton(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        )
                        {
                            Text(text = "PAY")

                        }


                    }
                    //End of semi-column
                }
                //End of card1

                Spacer(modifier = Modifier.width(30.dp))

                // Card2
                Card (modifier = Modifier.size(width = 150.dp, height = 180.dp)) {
                    //Semi-column
                    Column {
                        Image(painter = painterResource(id = R.drawable.man2),
                            contentDescription = "wow",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = "Mens' Clothing",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        Text(text = "Ksh.1500",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Left)

                        OutlinedButton(
                            onClick = {
                                val simToolKitLaunchIntent =
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                            },
                            colors = ButtonDefaults.buttonColors(Color.White)
                        )
                        {
                            Text(text = "PAY")

                        }

                    }
                    //End of semi-column
                }
                //End of card2
            }
            //End of row3


        }


    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ClothingScreenPreview(){
    ClothingScreen(rememberNavController())
}