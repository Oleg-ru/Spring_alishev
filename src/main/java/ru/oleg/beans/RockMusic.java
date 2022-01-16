package ru.oleg.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private String name;

    public RockMusic(String name) {
        this.name = name;
    }

    public RockMusic() {
    }

    @Override
    public String getSong() {
        return "Rock";
    }

    @Override
    public List<RockMusic> returnListMusic() {
        List<RockMusic> rockMusics = new ArrayList<>();
        rockMusics.add(new RockMusic("King of shut"));
        rockMusics.add(new RockMusic("Red plesen"));
        rockMusics.add(new RockMusic("Sector gaze"));
        return rockMusics;
    }

    @Override
    public String toString() {
        return "RockMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}
