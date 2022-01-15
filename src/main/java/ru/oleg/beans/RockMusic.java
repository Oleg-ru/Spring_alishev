package ru.oleg.beans;

public class RockMusic implements Music{
    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Rock";
    }
}
