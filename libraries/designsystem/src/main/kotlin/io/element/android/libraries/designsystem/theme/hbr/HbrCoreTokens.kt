package io.element.android.libraries.designsystem.theme.hbr

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Central visual tokens for the HBR CORE interface.
 *
 * UI components should reference these tokens instead of declaring
 * independent colors and dimensions.
 */
object HbrCoreColors {
    // Application backgrounds
    val Background = Color(0xFF05090B)
    val BackgroundDeep = Color(0xFF020405)
    val Surface = Color(0xFF0D1416)
    val SurfaceRaised = Color(0xFF121B1D)
    val SurfaceInteractive = Color(0xFF172326)
    val SurfacePressed = Color(0xFF1C2B2E)

    // Technical borders
    val Border = Color(0xFF263638)
    val BorderSoft = Color(0xFF1B292B)
    val BorderActive = Color(0xFF00A983)

    // Emerald identity
    val Emerald = Color(0xFF00E0AD)
    val EmeraldBright = Color(0xFF25FFD0)
    val EmeraldDark = Color(0xFF007D65)
    val EmeraldDeep = Color(0xFF004C3F)
    val EmeraldGlow = Color(0x3300E0AD)

    // Text
    val TextPrimary = Color(0xFFECF6F3)
    val TextSecondary = Color(0xFF96AAA5)
    val TextMuted = Color(0xFF62736F)
    val TextDisabled = Color(0xFF44534F)
    val TextOnEmerald = Color(0xFF001A14)

    // Presence
    val PresenceOnline = Color(0xFF25FFD0)
    val PresenceAway = Color(0xFF62CDB5)
    val PresenceBusy = Color(0xFFE3AD4D)
    val PresenceOffline = Color(0xFF536560)
    val PresenceHidden = Color(0xFF35413E)

    // Conversation list
    val ChatReadBackground = Background
    val ChatUnreadBackground = Color(0xFF0D1D19)
    val ChatUnreadPressed = Color(0xFF132923)
    val UnreadCounter = Emerald
    val UnreadIndicator = EmeraldBright
    val ReadPreviewText = Color(0xFF748681)
    val UnreadPreviewText = Color(0xFFC8DAD5)

    // Messages
    val IncomingMessage = Color(0xFF151E21)
    val IncomingMessageUnread = Color(0xFF192925)
    val IncomingMessageBorder = Color(0xFF29383B)

    val OutgoingMessage = Color(0xFF123A32)
    val OutgoingMessagePressed = Color(0xFF17483E)
    val OutgoingMessageBorder = Color(0xFF1E6958)

    val ReplyLine = Emerald
    val NewMessagesDivider = Emerald

    // Notifications and system states
    val NotificationAccent = Emerald
    val Success = Color(0xFF3BE5B5)
    val Warning = Color(0xFFE3AD4D)
    val Error = Color(0xFFF05B68)
    val Info = Color(0xFF58BFD1)

    // Calls
    val CallActive = Emerald
    val CallMuted = Color(0xFFF05B68)
    val CallControlBackground = Color(0xE6142022)
    val CallControlPressed = Color(0xFF203235)
}

object HbrCoreDimensions {
    val ScreenHorizontalPadding = 16.dp
    val CompactPadding = 8.dp
    val ContentSpacing = 12.dp
    val SectionSpacing = 24.dp

    val ButtonHeight = 54.dp
    val ButtonCornerRadius = 14.dp
    val CardCornerRadius = 16.dp
    val MessageCornerRadius = 18.dp
    val MessageTailRadius = 6.dp
    val InputCornerRadius = 18.dp

    val TechnicalBorderWidth = 1.dp
    val ActiveBorderWidth = 1.5.dp

    val IconSmall = 18.dp
    val IconDefault = 22.dp
    val IconLarge = 26.dp

    val PresenceDotSmall = 9.dp
    val PresenceDotDefault = 11.dp
    val PresenceDotProfile = 15.dp
}

object HbrCoreMotion {
    const val Fast = 120
    const val Normal = 190
    const val Slow = 300
    const val PresencePulse = 1_800
}
