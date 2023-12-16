package com.example;
public abstract class Animals {

    int eatnost;
    Animals(int percent) {
        this.eatnost = percent;
    }
    protected abstract void call();
    protected void eating() {
        eatnost += 75;
    }
}