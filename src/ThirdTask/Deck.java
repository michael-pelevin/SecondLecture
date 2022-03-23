package ThirdTask;

import java.util.*;

public class Deck{
    static List<String> ranks = new ArrayList<>(13);
    static List<String> suits = new ArrayList<>(4);
    static List<String> deck = new ArrayList<>(54);

    private Deck(Boolean jokers) {

        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("10");
        ranks.add("Jack");
        ranks.add("Queen");
        ranks.add("King");
        ranks.add("Ace");

        suits.add("diamonds");
        suits.add("clubs");
        suits.add("hearts");
        suits.add("spades");

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(rank + " " + suit);
            }
        }
        if (jokers) {
            deck.add("Joker Red");
            deck.add("Joker Black");
        }

    }

    //создание колоды с джокерами
    static Deck createWithJokers() {
        return new Deck(true);
    }

    //создание колоды без джокеров
    static Deck createWithoutJokers() {
        return new Deck(false);
    }

    //вывод случайной карты из колоды
    static String randomCard() {
        Random rand = new Random();
        int cardIndex = rand.nextInt(deck.size());
        String randomCard = deck.get(cardIndex);
        return randomCard;
    }

    //перетасовка колоды
    static List mixDeck() {
        Collections.shuffle(deck);
        return deck;
    }


    //извлечение карты из колоды
    static String ejectingTheCard(String Card) {
        //если карта корректна, то проверяем наличие ее в колоде, затем удаляем ее из колоды
        if (checkCard(Card)) {
            Integer cardIndex = deck.indexOf(Card);
            if (cardIndex != -1) {
                deck.remove(Card);
            } else {
                System.out.print("Card missing from deck\n");
            }
        } else {
            System.out.print("You entered wrong card\n");
        }

        return Card + "\n";
    }

    //возврат карты в колоду
    static String returnTheCard(String Card) {
        if (checkCard(Card)) {
            Integer cardIndex = deck.indexOf(Card);
            if (cardIndex == -1) {
                deck.add(Card);
            } else {
                System.out.print("Card already in deck\n");
            }
        }
        return Card + "\n";
    }

    //проверка колоды на пустоту
    static Boolean checkForEmpty() {
        if (deck.size() == 0) {
            return true;
        }
        return false;
    }


    //toString method
    static String showDeck() {
        String result = "";
        if (!deck.isEmpty()) {
            for (String card : deck) {
                result = result + "Card " + card + "\n";
            }
        } else {
            result = "Deck is empty";
        }
        return result;
    }

    //раздача всех кард из колоды
    static Boolean ejectingAllCards() {
        Boolean res = false;
        if (deck.isEmpty()) {
            System.out.print("Deck is empty");
            res = true;
        } else {
            for (String card : deck) {
                System.out.printf("Card %s ejected from deck\n", card);
            }
            deck.clear();
        }
        return res;
    }


    //проверка корректности ввода карты
    static public Boolean checkCard(String Card) {
        Boolean isCorrect = false;
        String rank = Card.split(" ")[0];
        String suit = Card.split(" ")[1];
        if (ranks.indexOf(rank) != -1 && suits.indexOf(suit) != -1) {
            isCorrect = true;
        } else {
            isCorrect = false;
        }
        return isCorrect;
    }

}