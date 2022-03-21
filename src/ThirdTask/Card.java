package ThirdTask;

import SecondTask.ModifiedCardB;

public class Card implements Comparable<Card> {
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"};
    public static String[] suits = {"clubs", "diamonds", "spades", "hearts"};
    String suit;
    String rank;

    Card(String suit, String rank) {
        this.rank = rank;
        this.suit = suit;
    }


    public int compareTo(Card card) {
        Integer currentSuitIndex = getSuitIndex(this.suit);
        Integer suitIndexToCompare = getSuitIndex(card.suit);


        if (currentSuitIndex == suitIndexToCompare) {
            if (getRankIndex(this.rank) > getRankIndex(card.rank)) {
                return 1;
            } else {
                return -1;
            }
        }
        else {
            return currentSuitIndex > suitIndexToCompare ? 1 : -1;
        }


    }

    private static Integer getSuitIndex(String suit) {
        for (int i = 0; i < suits.length; i++) {
            if (suits[i].equals(suit)) {
                return i;
            }
        }
        return -1; //элемент не найден
    }

    private static Integer getRankIndex(String rank) {
        for (int i = 0; i < ranks.length; i++) {
            if (ranks[i].equals(rank)) {
                return i;
            }
        }
        return -1; //элемент не найден
    }

}
