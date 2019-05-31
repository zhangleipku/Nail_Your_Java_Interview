package com.leizhang.nail.java.Chapter03;

public class Sec4 {

    public static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        // A P P L E S
        // 0 1 2 3 4 5
        String a = "Apples";
        String b = "Bananas";
        String o = "Oranges";
        String bp = "Banana Peels";
        String p = "Pears";
        String chs = "我爱北京天安门";  // length = 7
        String[] fruits = {a, b, o, bp, p, chs};

        for (String f : fruits) {
            // Getting a character at a specific index
            int index = 1;
            System.out.println(f.charAt(index));

            char[] charArray = f.toCharArray();
            System.out.println("Char at " + index + " : " + charArray[index]);

            int indexOfLetterE = f.indexOf('e');
            System.out.println(indexOfLetterE);

            f = f.toLowerCase();
            if (f.contains("app")) {
                System.out.println("Contains app: " + f);
            }

            System.out.println(f.substring(1, 4));

            System.out.println(reverseString(f));

            System.out.println();

            // Print a string if it contains a substring
            // Grab a substring using two indexes
            // Print a reverse String
        }

        System.out.println("========");
        System.out.println(chs.substring(3,chs.length()));
        System.out.println(chs.length());



    }
}
