package com.example;
public class Cats extends Animals {
    Cats(int percent) {
        super(percent);
    }

    protected void call() {
        System.out.println("Мяу");
    }
}