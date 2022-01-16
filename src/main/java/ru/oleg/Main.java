package ru.oleg;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.oleg.beans.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusicFromLists(Genre.ROCK));
        context.close();
    }
}
