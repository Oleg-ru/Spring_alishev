package ru.oleg;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.oleg.beans.Music;
import ru.oleg.beans.MusicPlayer;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        musicPlayer.playMusic();
        context.close();
    }
}
