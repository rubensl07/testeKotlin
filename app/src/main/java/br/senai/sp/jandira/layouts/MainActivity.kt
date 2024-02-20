package br.senai.sp.jandira.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.sharp.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TesteColumn()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column{
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Nome de usuário:")
                },
                leadingIcon = {
                               Icon(
                                   imageVector = Icons.Filled.Face,
                                   contentDescription = "")
                },
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedTextColor = Color.White,
                        focusedTextColor = Color.Yellow,
                        unfocusedBorderColor = Color.Magenta,
                        focusedBorderColor = Color(0xFFFFFF)
                    )
            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Build,
                        contentDescription = "Ícone de uma ferramenta"
                    )
                }
            )
            Button(onClick = { /*TODO*/ }) {
                
            }
        }
    }
}

@Composable
fun TesteColumn() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Red
    ) {
        Column(
            Modifier.background(Color.Green),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "Logotipo da aplicação",
                modifier = Modifier
                    .size(height = 120.dp, width = 120.dp)
                    .padding(top = 16.dp)
            )
            Card(
                modifier = Modifier
                    .size(height = 200.dp, width = 200.dp)
                , colors = CardDefaults.cardColors(containerColor = Color(0xffaaaaaa)),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = CircleShape,
                border = BorderStroke(4.dp, Color.Yellow)
            ){
                Image(
                    painter = painterResource(id = R.drawable.maria),
                    contentDescription = "profile picture"
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 16.dp),
                text = "LOGIN",
                fontSize = 48.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .background(
                        color = Color.Gray,
                        shape = RoundedCornerShape(16.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .padding(32.dp)
                ) {
                    Text(text = "Nome")
                    TextField(
                        value = "",
                        onValueChange = {}
                    )
                    Text(text = "Senha")
                    TextField(
                        value = "",
                        onValueChange = {}
                    )
                }
            }
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = {/*TODO*/ }
            ) {
                Text(text = "Entrar")
                Image(
                    painter = painterResource(id = R.drawable.loginicon),
                    contentDescription = "ícone entrar",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(height = 20.dp, width = 20.dp)
                )

            }

            Box(){
                Text(modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth(),
                    text="Copyright DS2BIT",
                    fontSize = 32.sp,
                    color = Color.White
                )
            }

        }


    }
}


@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .width(300.dp)
            .height(300.dp)
            .padding(16.dp),
        //.width(300.dp)
        //.height(150.dp),
        color = (Color(0xFFb814b8)),
        border = BorderStroke(5.dp, color = Color.Black)
    ) {
        Box(
            modifier = Modifier
                .padding(top = 24.dp, bottom = 24.dp, start = 20.dp, end = 20.dp)
                .background(Color.Magenta, shape = RoundedCornerShape(150.dp))
                .border(width = 4.dp, color = Color.White, RoundedCornerShape(150.dp))
        ) {
            Text(
                text = "Rubens Lobo",
                color = Color.White,
                modifier = Modifier
                    .width(250.dp)
                    .align(alignment = Alignment.Center)
                    .offset(x = 0.dp, y = 0.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(60.dp)
                    ),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive,
                fontSize = 35.sp,
                letterSpacing = 2.sp
            )
        }
    }
}

@Composable
fun Modelo() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Red
    ) {
        Column(
            Modifier.background(Color.Green),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "Logotipo da aplicação",
                modifier = Modifier
                    .size(height = 120.dp, width = 120.dp)
                    .padding(top = 16.dp)
            )
            Card(
                modifier = Modifier
                    .size(height = 200.dp, width = 200.dp)
                , colors = CardDefaults.cardColors(containerColor = Color(0xffaaaaaa)),
                elevation = CardDefaults.cardElevation(8.dp),
                shape = CircleShape,
                border = BorderStroke(4.dp, Color.Yellow)
            ){
                Image(
                    painter = painterResource(id = R.drawable.maria),
                    contentDescription = "profile picture"
                )
            }
            Text(
                modifier = Modifier
                    .padding(top = 16.dp),
                text = "LOGIN",
                fontSize = 48.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .background(
                        color = Color.Gray,
                        shape = RoundedCornerShape(16.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .padding(32.dp)
                ) {
                    Text(text = "Nome")
                    TextField(
                        value = "",
                        onValueChange = {}
                    )
                    Text(text = "Senha")
                    TextField(
                        value = "",
                        onValueChange = {}
                    )
                }
            }
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = {/*TODO*/ }
            ) {
                Text(text = "Entrar")
                Image(
                    painter = painterResource(id = R.drawable.loginicon),
                    contentDescription = "ícone entrar",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .size(height = 20.dp, width = 20.dp)
                )

            }

            Box(){
                Text(modifier = Modifier
                    .background(Color.Black)
                    .fillMaxWidth(),
                    text="Copyright DS2BIT",
                    fontSize = 32.sp,
                    color = Color.White
                )
            }

        }


    }
}


@Preview(showSystemUi = true)
@Composable
fun ModeloPreview() {
    LayoutsTheme {
        Modelo()
    }
}

@Preview(showSystemUi = true)
@Composable
fun TesteColumnPreview() {
    LayoutsTheme {
        TesteColumn()
    }
}

@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    LayoutsTheme {
        Teste()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LayoutsTheme {
        Greeting()
    }
}

