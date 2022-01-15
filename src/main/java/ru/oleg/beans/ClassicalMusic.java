package ru.oleg.beans;

public class ClassicalMusic implements Music{
    public ClassicalMusic() {
    }
    @Override
    public String getSong() {
        return "Classical";
    }
}
