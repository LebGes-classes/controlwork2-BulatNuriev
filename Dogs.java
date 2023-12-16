package com.example;
public class Dogs extends Animals {
    Dogs(int percent) {
        super(percent);
    }

    protected void call() {
        System.out.println("Гав!");
    }
}