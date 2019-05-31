package com.leizhang.nail.java.Chapter05.Sec01;

// ABSTRACT CLASS

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();
    abstract String draw();

}
