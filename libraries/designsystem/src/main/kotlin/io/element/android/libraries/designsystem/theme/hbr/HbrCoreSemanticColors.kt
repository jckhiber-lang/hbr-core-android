package io.element.android.libraries.designsystem.theme.hbr

import io.element.android.compound.tokens.generated.SemanticColors

/**
 * Applies the HBR CORE graphite and emerald identity
 * to the dark Compound semantic color palette.
 */
fun SemanticColors.toHbrCoreDarkColors(): SemanticColors = copy(
    // Main application backgrounds
    bgCanvasDefault = HbrCoreColors.Background,
    bgCanvasDefaultLevel1 = HbrCoreColors.BackgroundDeep,
    bgCanvasDisabled = HbrCoreColors.SurfacePressed,

    // Cards, fields, menus and elevated areas
    bgSubtlePrimary = HbrCoreColors.Surface,
    bgSubtleSecondary = HbrCoreColors.SurfaceRaised,
    bgSubtleSecondaryLevel0 = HbrCoreColors.Surface,

    // Main interactive accent
    bgActionPrimaryRest = HbrCoreColors.Emerald,
    bgActionPrimaryHovered = HbrCoreColors.EmeraldBright,
    bgActionPrimaryPressed = HbrCoreColors.EmeraldDark,
    bgActionPrimaryDisabled = HbrCoreColors.EmeraldGlow,

    bgAccentRest = HbrCoreColors.Emerald,
    bgAccentHovered = HbrCoreColors.EmeraldBright,
    bgAccentPressed = HbrCoreColors.EmeraldDark,
    bgAccentSelected = HbrCoreColors.EmeraldDeep,

    // Technical borders
    borderDefault = HbrCoreColors.Border,
    borderDisabled = HbrCoreColors.BorderSoft,
    borderFocused = HbrCoreColors.BorderActive,
    borderInteractivePrimary = HbrCoreColors.Emerald,
    borderInteractiveHovered = HbrCoreColors.EmeraldBright,
    borderInteractiveSecondary = HbrCoreColors.Border,
    borderAccentPrimary = HbrCoreColors.Emerald,
    borderAccentSubtle = HbrCoreColors.EmeraldDark,

    // Icons
    iconAccentPrimary = HbrCoreColors.Emerald,
    iconPrimary = HbrCoreColors.TextPrimary,
    iconSecondary = HbrCoreColors.TextSecondary,
    iconDisabled = HbrCoreColors.TextDisabled,
    iconOnSolidPrimary = HbrCoreColors.TextOnEmerald,

    // Text
    textActionAccent = HbrCoreColors.Emerald,
    textActionPrimary = HbrCoreColors.TextPrimary,
    textPrimary = HbrCoreColors.TextPrimary,
    textSecondary = HbrCoreColors.TextSecondary,
    textDisabled = HbrCoreColors.TextDisabled,
    textLinkExternal = HbrCoreColors.EmeraldBright,
    textOnSolidPrimary = HbrCoreColors.TextOnEmerald,
    textInfoPrimary = HbrCoreColors.Info,
    textSuccessPrimary = HbrCoreColors.Success,

    isLight = false,
)
