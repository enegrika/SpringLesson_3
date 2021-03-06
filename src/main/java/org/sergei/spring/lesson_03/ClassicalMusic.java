package org.sergei.spring.lesson_03;

public class ClassicalMusic implements Music {

    ///// ФАБРИЧНЫЙ МЕТОД - получаем объект с помощью СТАТИЧЕСКОГО МЕТОДА
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Bach - Air on G";
    }

    @Override
    public void doInit() {
        System.out.println("classical music bean initialized " + this);
    }

    @Override
    public void doDestroy() {
        System.out.println("classical music bean destroyed " + this);

    }


}
