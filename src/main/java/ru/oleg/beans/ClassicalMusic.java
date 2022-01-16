package ru.oleg.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{
    ClassicalMusic() {
    }

    //фабричный метод
    public static ClassicalMusic factoryGetClassicalMusic() {
        System.out.println("Factory is be run");
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Initialization is be run... ");
    }

    public void destroy() {
        System.out.println("Destroy bean...");
    }
    @Override
    public String getSong() {
        return "Classical";
    }
}
