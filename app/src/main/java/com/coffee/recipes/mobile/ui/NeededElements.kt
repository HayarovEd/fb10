package com.coffee.recipes.mobile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coffee.recipes.mobile.R
import com.coffee.recipes.mobile.ui.theme.md_theme_light_onPrimaryContainer
import com.coffee.recipes.mobile.ui.theme.md_theme_light_primaryContainer

@Preview
@Composable
fun SampleNeededElements() {
    NeededElements(
        name = stringResource(id = R.string.ingredients),
        elements = recipes.first().ingredients
    )
}

@Composable
fun NeededElements(
    modifier: Modifier = Modifier,
    name: String,
    elements: List<String>
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(20.dp))
            .background(color = md_theme_light_primaryContainer)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(color = md_theme_light_onPrimaryContainer)
                .padding(15.dp),
        ) {
            Text(
                text = name,
                color = md_theme_light_primaryContainer,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = modifier.height(15.dp))
        elements.forEach {element ->
            Element(content = element)
        }
    }
}

@Composable
fun Element(
    modifier: Modifier = Modifier,
    content: String
) {
    Row(
        modifier = modifier.padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.outline_coffee_24),
            contentDescription = "",
            tint = md_theme_light_onPrimaryContainer
        )
        Spacer(modifier = modifier.width(10.dp))
        Text(
            text = content,
            fontSize = 16.sp
        )
    }
}
