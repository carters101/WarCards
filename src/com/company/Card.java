package com.company;

public class Card {
    public enum Suits {
        Heart,
        Diamond,
        Spade,
        Club
    }
    private int rank;
    private Suits suit;

    // Constructor initializes the Card
    public Card(int rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Create getters for suit and rank
    public Suits getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }

    /*
        Positive if this card is higher than the card it is being compared to
        0 if the cards are equal
        Negative if this card is lower than the card it is being compared to
     */
    public int compareRank(int otherCard) {
        return rank - otherCard;
    }

    public String toString() {
        String value;
        if (rank == 11) {
            value = "Jack";
        } else if (rank == 12) {
            value = "Queen";
        } else if (rank == 13) {
            value = "King";
        } else if (rank == 14) {
            value = "Ace";
        } else {
            value = String.valueOf(rank);
        }
        return value + " of " + suit;
    }
}
