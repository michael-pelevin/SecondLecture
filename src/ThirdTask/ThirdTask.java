package ThirdTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {
        //создание колоды
        Deck.createWithoutJokers();
        //действия с колодой
        System.out.printf("card %s\n", Deck.ejectingTheCard("2 hearts"));
        System.out.printf("card %s\n", Deck.ejectingTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("2 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.print(Deck.showDeck());

        //перемешивание карт в колоде
        Deck.mixDeck();

        //приведение карт в колоде к нужному для сортировки виду
        List<Card> cards = new ArrayList<>();
        System.out.println("------");
        System.out.println("Mixed");
        System.out.println("------");
        for (String card: Deck.deck){
            System.out.println(card);
            String rank = card.split(" ")[0];
            String suit = card.split(" ")[1];
            cards.add(new Card(suit, rank));
        }

        //сортировка карт
        Collections.sort(cards);

        //вывод отсортированной колоды
        System.out.println("------");
        System.out.println("Sorted");
        System.out.println("------");
        for(Card card : cards){
            System.out.println(card.rank + " "
                    + card.suit);
        }


    }
}
