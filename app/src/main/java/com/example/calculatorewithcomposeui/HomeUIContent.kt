package com.example.calculatorewithcomposeui

import android.widget.Button
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorewithcomposeui.ui.theme.Pink80

@Composable
fun homeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)

    ) {
        Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "0",

                style = TextStyle(color = Color.Black,
                    fontSize = 30.sp,
                    ),
                textAlign = TextAlign.Center
            )

//            Row(
//                modifier = Modifier
//                    .background(Pink80)
//                    .fillMaxWidth()
//                    .height(40.dp)
//            ) {
//                Button(icon = R.drawable.menue, Color.White)
//                Column(
//                    modifier = Modifier.fillMaxHeight(),
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Text(
//                        text = "Home UI",
//                        style = TextStyle(
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            fontWeight = FontWeight.W700,
//                        )
//                    )
//                }
//            }


        }
    }

}


@Composable
fun Button(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(painter = painterResource(id = icon), contentDescription = "")
    }
}
