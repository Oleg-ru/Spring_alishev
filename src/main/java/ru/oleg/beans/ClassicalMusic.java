package ru.oleg.beans;

public class ClassicalMusic implements Music{
    private ClassicalMusic() {
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
