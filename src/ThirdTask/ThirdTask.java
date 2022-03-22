package ThirdTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {
        Deck.createWithoutJokers();
        System.out.printf("card %s\n", Deck.ejectingTheCard("2 hearts"));
        System.out.printf("card %s\n", Deck.ejectingTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("2 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.print(Deck.showDeck());

        System.out.print("------");

        Deck.mixDeck();

        System.out.print("------");

        List<Card> cards = new ArrayList<>();
        for (String card: Deck.deck){
            System.out.print(card+"\n");
            String rank = card.split(" ")[0];
            String suit = card.split(" ")[1];
            cards.add(new Card(suit, rank));
        }

//        System.out.print(cards);
        System.out.print("\n");

        Collections.sort(cards);

        System.out.print("Sorted\n");
        for(Card card : cards){
            System.out.println(card.rank + " "
                    + card.suit);
        }


//        System.out.print(Deck.showDeck());
//
//        Deck.ejectingAllCards();
//
//        System.out.printf("random card %s\n", Deck.deck);
//
//        System.out.printf("check for empty %s\n", Deck.checkForEmpty());
//
//        System.out.print(Deck.showDeck());

    }
}
