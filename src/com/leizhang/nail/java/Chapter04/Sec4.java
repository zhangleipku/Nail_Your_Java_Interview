package com.leizhang.nail.java.Chapter04;

import java.util.Stack;

public class Sec4 {

    public static void main(String[] args) {
        Stack<String> deckOfCards = new Stack();
        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        String top = deckOfCards.peek();
        System.out.println(top);

        System.out.println(deckOfCards.size());

        while(!deckOfCards.empty()) {
            String removedItem = deckOfCards.pop();
            System.out.println("Removed " + removedItem);
        }
    }
}
