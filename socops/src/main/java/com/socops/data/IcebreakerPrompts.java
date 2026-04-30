package com.socops.data;

import java.util.List;

/**
 * Central catalogue of every icebreaker prompt that can appear on a board.
 * Exactly 24 entries — one fewer than the 25-cell grid, because the
 * centre cell is always the free space.
 */
public final class IcebreakerPrompts {

    public static final String FREE_CELL_LABEL = "FREE SPACE";

    public static final List<String> ALL_PROMPTS = List.of(
            "knows a useful keyboard shortcut",
            "wins at rock-paper-scissors",
            "prefers tea over coffee",
            "can teach a quick trick",
            "has a snack recommendation",
            "has a favorite app",
            "has a productivity tip",
            "has an unusual hobby",
            "speaks another language",
            "has a song recommendation",
            "uses a favorite emoji all the time",
            "has too many browser tabs open",
            "knows a good icebreaker",
            "has built something they are proud of",
            "has a favorite quick recipe",
            "has a learning hack",
            "has a surprising skill",
            "has a movie or podcast recommendation",
            "is an early bird or a night owl",
            "keeps an organized desk",
            "recommends a travel destination",
            "has a focus playlist or sound",
            "celebrated a recent small win",
            "shares something in common with you"
    );

    private IcebreakerPrompts() {
        /* catalogue only — no instances */
    }
}
