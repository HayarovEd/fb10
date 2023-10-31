package com.coffee.recipes.mobile.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coffee.recipes.mobile.R
import com.coffee.recipes.mobile.ui.theme.md_theme_light_onPrimary
import com.coffee.recipes.mobile.ui.theme.md_theme_light_primary
import com.coffee.recipes.mobile.ui.theme.md_theme_light_primaryContainer

@Preview
@Composable
fun SampleNeededElements() {
    NeededElements(
        name = stringResource(id = R.string.ingredients),
        elements = recipes.first().ingredients)
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
            .padding(15.dp)
    ) {
        Text(
            modifier = modifier
                .fillMaxWidth()
                .background(color = md_theme_light_onPrimary),
            text = name,
            color = md_theme_light_primary,
            fontSize = 20.sp
        )
        Spacer(modifier = modifier.height(15.dp))
    }
}