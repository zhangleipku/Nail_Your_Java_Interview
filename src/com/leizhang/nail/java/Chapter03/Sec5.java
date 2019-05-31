package com.leizhang.nail.java.Chapter03;

public class Sec5 {

    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite " +
                "for bamboo. A typical animal eats half the day—a " +
                "full 12 out of every 24 hours—and relieves itself " +
                "dozens of times a day. It takes 28 pounds of " +
                "bamboo to satisfy a giant panda's daily dietary " +
                "needs. Pandas will sometimes eat birds or rodents" +
                " as well.";

        String fishText = text.replace("bamboo", "fish");
        System.out.println(fishText);

        // How many sentences?
        String[] sentences = text.split("\\. ");
        System.out.println("The text has " + sentences.length + " sentences.");

        System.out.println("========");
        for (String sentence: sentences) {
            System.out.println(sentence);
        }
        System.out.println("========");

        // How many words?
        String[] words = text.split(" ");
        System.out.println("The text has " + words.length + " words.");

        System.out.println("========");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("========");
        // How many characters?
        System.out.println(text.length());
    }
}
