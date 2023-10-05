package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {


            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun cartaodevisitas() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.cientistadedados),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .alpha(1.4f)
                .size(200.dp)

        )


        Column(
            modifier = Modifier.fillMaxSize()
                .padding(16.dp))


        {

            }

        }


    }



