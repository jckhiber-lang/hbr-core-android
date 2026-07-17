/*
 * Copyright (c) 2025 Element Creations Ltd.
 * Copyright 2023-2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.libraries.designsystem.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.element.android.compound.theme.ElementTheme
import io.element.android.libraries.designsystem.preview.ElementPreview
import io.element.android.libraries.designsystem.preview.PreviewsDayNight

@Composable
fun BottomSheetDragHandle(
    modifier: Modifier = Modifier
) {
    // HBR CORE: compact drag handle
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(28.dp)
            .background(Color.Transparent),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            modifier = Modifier
                .width(44.dp)
                .height(4.dp)
                .background(
                    color = ElementTheme.colors.iconSecondary,
                    shape = RoundedCornerShape(2.dp),
                )
        )
    }
}

@PreviewsDayNight
@Composable
internal fun BottomSheetDragHandlePreview() = ElementPreview {
    BottomSheetDragHandle()
}
