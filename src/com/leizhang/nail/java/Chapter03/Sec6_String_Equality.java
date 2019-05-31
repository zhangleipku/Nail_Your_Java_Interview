package com.leizhang.nail.java.Chapter03;

public class Sec6_String_Equality {

    public static void main(String[] args) {
        String literal = "hello";
        String obj = new String("hello");
        String otherLiteral = "hello";
        String otherObj = new String("hello");
        String otherObj2 = "hello";

        // literal --> "hello"
        // otherLiteral --^

        // obj --> "hello"
        // otherObj --> "hello"

        System.out.println(literal == obj);    //false
        System.out.println(literal == otherLiteral);   // true
        System.out.println(literal.equals(obj));   // true
        System.out.println(literal.equals(otherLiteral));   //true

        System.out.println();

        System.out.println(obj == otherObj);   // false
        System.out.println(obj.equals(otherObj));   // true

        System.out.println("=====================");
        System.out.println(literal.equals(otherObj2));  // true
        System.out.println(literal == otherObj2);;   // true
    }
}
