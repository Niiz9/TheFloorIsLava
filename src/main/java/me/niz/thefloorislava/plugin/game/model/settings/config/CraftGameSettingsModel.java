package me.niz.thefloorislava.plugin.game.model.settings.config;

import me.niz.thefloorislava.api.game.model.settings.GameSettings;
import me.niz.thefloorislava.api.game.model.settings.config.GameSettingsModel;
import org.jetbrains.annotations.NotNull;

public class CraftGameSettingsModel implements GameSettingsModel {

    private GameSettings gameSettings;

    @Override
    public void setGameSettings(@NotNull GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    @Override
    public GameSettings getGameSettings() {
        return this.gameSettings;
    }
}
