package me.niz.thefloorislava.plugin.game.model.settings;

import me.niz.thefloorislava.api.game.model.settings.GameSettings;

public class CraftGameSettings implements GameSettings {

    private int gameDuration, lavaCooldown, timeBeforeStart, maxPlayers, minPlayers;

    public CraftGameSettings(int gameDuration, int lavaCooldown, int timeBeforeStart, int maxPlayers, int minPlayers) {
        this.setGameDuration(gameDuration);
        this.setLavaCooldown(lavaCooldown);
        this.setTimeBeforeStart(timeBeforeStart);
        this.setMaxPlayers(maxPlayers);
        this.setMinPlayers(minPlayers);
    }

    @Override
    public int getGameTime() {
        return this.gameDuration;
    }

    @Override
    public int getLavaTime() {
        return this.lavaCooldown;
    }

    @Override
    public int getTimeBeforeStart() {
        return this.timeBeforeStart;
    }

    @Override
    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    @Override
    public int getMinPlayers() {
        return this.minPlayers;
    }

    private void setGameDuration(int gameDuration) {
        if(gameDuration < 0)
            throw new IllegalArgumentException("Game time cannot be negative or zero !");

        this.gameDuration = gameDuration;
    }

    private void setLavaCooldown(int lavaCooldown) {
        if(lavaCooldown < 0)
            throw new IllegalArgumentException("Lava cooldown cannot be negative or zero !");

        this.lavaCooldown = lavaCooldown;
    }

    private void setTimeBeforeStart(int timeBeforeStart) {
        if(timeBeforeStart < 0)
            throw new IllegalArgumentException("Time before start cannot be negative or zero !");

        this.timeBeforeStart = timeBeforeStart;
    }

    private void setMaxPlayers(int maxPlayers) {
        if(maxPlayers < 0)
            throw new IllegalArgumentException("Max player cannot be negative or zero !");

        this.maxPlayers = maxPlayers;
    }

    private void setMinPlayers(int minPlayers) {
        if(this.maxPlayers < minPlayers)
            throw new IllegalArgumentException("Min player cannot be more than max players !");

        this.minPlayers = minPlayers;
    }
}
