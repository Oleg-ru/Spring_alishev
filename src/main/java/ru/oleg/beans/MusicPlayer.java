package ru.oleg.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing: " + music1.getSong() + " " + music2.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
    }

    public static Genre randGenre() {
        int min = 1;
        int max = 2;
        max -= min;
        int num = (int) ((Math.random() * ++max) + min);
        if (num == 1) {
            return Genre.CLASSICAL;
        } else {
            return Genre.ROCK;
        }
    }

    public static int randNumInList(int max) {
        if (max == 0)
            return 0;
        int min = 0;
        max -= min;
        return (int) ((Math.random() * ++max) + min);
    }

    public String playMusicFromLists(Genre g) {
        if (g.equals(Genre.CLASSICAL)) {
            return "" + music1.returnListMusic().get(randNumInList(music1.returnListMusic().size() - 1));
        } else {
            return "" + music2.returnListMusic().get(randNumInList(music2.returnListMusic().size() - 1));
        }
    }

}
