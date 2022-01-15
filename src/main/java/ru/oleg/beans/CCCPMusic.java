package ru.oleg.beans;

import org.springframework.stereotype.Component;


public class CCCPMusic implements Music {
    @Override
    public String getSong() {
        return "CCCP";
    }
}
