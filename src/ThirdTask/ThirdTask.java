package ThirdTask;

public class ThirdTask {
    public static void main(String[] args) {
        Deck.createWithJokers();
        System.out.printf("card %s\n", Deck.ejectingTheCard("2 hearts"));
        System.out.printf("card %s\n", Deck.ejectingTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("2 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.printf("ret card %s\n", Deck.returnTheCard("3 hearts"));
        System.out.print(Deck.showDeck());

        System.out.print("------");

        Deck.mixDeck();
        System.out.print(Deck.showDeck());

        Deck.ejectingAllCards();

        System.out.printf("random card %s\n", Deck.deck);

        System.out.printf("check for empty %s\n", Deck.checkForEmpty());

        System.out.print(Deck.showDeck());

    }
}
