package com.epam.javacore.homework.hw2.task_6;

public class NuclearPoweredBoat {
    private EngineNuclearPoweredBoat EngineNuclearPoweredBoat;
    private String name;
    NuclearPoweredBoat(String name){
        this.name=name;
        EngineNuclearPoweredBoat = new EngineNuclearPoweredBoat();
    }

    public void move(){
        EngineNuclearPoweredBoat.start();
        System.out.println("поехали");
    }

    private class EngineNuclearPoweredBoat{
        public void start(){
            System.out.println("двигатель запущен");
        }
    }
}
