package org.comroid.javacord.util.model.command;

import java.util.Optional;
import java.util.function.Function;

import org.comroid.javacord.util.server.properties.Property;

import org.jetbrains.annotations.NotNull;

public interface SelfCommandChannelable<Self extends SelfCommandChannelable> {
    Self withCommandChannelProvider(@NotNull Function<Long, Long> commandChannelProvider);

    Optional<Function<Long, Long>> getCommandChannelProvider();

    @SuppressWarnings({"ConstantConditions", "unchecked"})
    default Self removeCommandChannelProvider() {
        withCommandChannelProvider((Function) null);
        return (Self) this;
    }

    // Extensions
    default Self withCommandChannelProvider(@NotNull Property commandChannelPropertyGroup) {
        return withCommandChannelProvider(commandChannelPropertyGroup.function(Long.class));
    }
}
