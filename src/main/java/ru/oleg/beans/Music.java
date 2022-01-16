package ru.oleg.beans;

import java.util.List;

public interface Music {
    String getSong();
    List<? extends Music> returnListMusic();
}
