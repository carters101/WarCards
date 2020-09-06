package com.company;
import java.util.Random;

public class Deck {
    private Card[] deckOfCards;

    public Deck() {
        this.deckOfCards = new Card[52];
        int index = 0;
        for (Card.Suits suit : Card.Suits.values()) {
            for (int j = 2; j <= 14; j++) {
                deckOfCards[index] = new Card(j, suit);
            }
        }
    }
    public void shuffle() {

    }

}
