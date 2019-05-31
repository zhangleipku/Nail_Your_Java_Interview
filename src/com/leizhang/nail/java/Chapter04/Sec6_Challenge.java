package com.leizhang.nail.java.Chapter04;

import java.util.HashMap;

public class Sec6_Challenge {

    public static String findTheMostFrequentWord(String s){
        String result = new String();

        HashMap<String, Integer> hashMap = new HashMap<>();

        StringBuilder stringBuilder = new StringBuilder();
        String word = new String();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if( c != ' ' && c != '\n' && c != '\t') {
                stringBuilder.append(c);
            } else {
                word = stringBuilder.toString();

                if (hashMap.get(word) == null) {
                    hashMap.put(word, 1);
                } else {
                    hashMap.put(word, hashMap.get(word) + 1);
                }

                stringBuilder.setLength(0);
            }
        }

        int n = 0;
        for (int num : hashMap.values()) {
            if (num > n) {
                n = num;
            }
        }

        for (String string: hashMap.keySet()) {
            if (hashMap.get(string) == n) {
                result = string;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String testString4 = "Sunday morning rain is falling\n" +
                "Steal some covers share some skin\n" +
                "Clouds are shrouding us in moments unforgettable\n" +
                "You twist to fit the mold that I am in\n" +
                "But things just get so crazy living life gets hard to do\n" +
                "And I would gladly hit the road get up and go if I knew\n" +
                "That someday it would lead me back to you\n" +
                "That someday it would lead me back to you\n" +
                "\n" +
                "That may be all I need\n" +
                "In darkness she is all I see\n" +
                "Come and rest your bones with me\n" +
                "Driving slow on Sunday morning\n" +
                "And I never want to leave\n" +
                "\n" +
                "Fingers trace your every outline\n" +
                "Paint a picture with my hands\n" +
                "Back and forth we sway like branches in a storm\n" +
                "Change the weather still together when it ends\n" +
                "\n" +
                "That may be all I need\n" +
                "In darkness she is all I see\n" +
                "Come and rest your bones with me\n" +
                "Driving slow on Sunday morning\n" +
                "And I never want to leave\n" +
                "\n" +
                "But things just get so crazy living life gets hard to do\n" +
                "Sunday morning rain is falling and I'm calling out to you\n" +
                "Singing someday it'll bring me back to you\n" +
                "Find a way to bring myself back home to you\n" +
                "\n" +
                "May not know\n" +
                "\n" +
                "That may be all I need\n" +
                "In darkness she is all I see\n" +
                "Come and rest your bones with me\n" +
                "Driving slow on Sunday morning\n" +
                "Driving slow\n" +
                "\n" +
                "Oh, yeah, yeah...\n" +
                "\n" +
                "There is a flower in your hair.\n" +
                "I'm a flower in your hair.\n" +
                "\n" +
                "Oh, yeah, yeah, oh\n";

        System.out.println(findTheMostFrequentWord(testString4));
    }
}
