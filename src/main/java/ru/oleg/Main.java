package ru.oleg;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.oleg.beans.CCCPMusic;
import ru.oleg.beans.ClassicalMusic;
import ru.oleg.beans.Music;
import ru.oleg.beans.MusicPlayer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicalMusic", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
