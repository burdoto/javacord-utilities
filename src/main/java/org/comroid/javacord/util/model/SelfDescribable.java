package org.comroid.javacord.util.model;

import java.util.Optional;

import org.jetbrains.annotations.NotNull;

public interface SelfDescribable<Self extends SelfDescribable> {
    String NO_DESCRIPTION = "No description provided.";

    @SuppressWarnings("NullableProblems")
    Self withDescription(@NotNull String description);

    Optional<String> getDescription();

    @SuppressWarnings("ConstantConditions")
    default Self removeDescription() {
        return withDescription(null);
    }
}
