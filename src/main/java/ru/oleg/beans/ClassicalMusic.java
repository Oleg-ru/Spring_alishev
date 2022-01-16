package ru.oleg.beans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private String name;

    private ClassicalMusic() {
    }

    public ClassicalMusic(String name) {
        this.name = name;
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

    @Override
    public List<ClassicalMusic> returnListMusic() {
        List<ClassicalMusic> classicalMusics = new ArrayList<>();
        classicalMusics.add(new ClassicalMusic("Aria"));
        classicalMusics.add(new ClassicalMusic("Beth"));
        classicalMusics.add(new ClassicalMusic("Bax"));
        return classicalMusics;
    }

    @Override
    public String toString() {
        return "ClassicalMusic{" +
                "name='" + name + '\'' +
                '}';
    }
}
