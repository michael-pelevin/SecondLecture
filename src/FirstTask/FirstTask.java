package FirstTask;

public class FirstTask {

    public static void main(String[] args) {
        // a
        CardA card1 = new CardA();
        card1.rank = "10";
        card1.suit = "hearts";
        System.out.printf("card1 rank: %s, suit: %s \n", card1.rank, card1.suit);

        card1.rank = "6";
        System.out.printf("card1 rank: %s, suit: %s \n", card1.rank, card1.suit);

        CardA card2 = new CardA("8", "diamonds");
        System.out.printf("card2 rank: %s, suit: %s \n", card2.rank, card2.suit);

        //b
        CardB card3 = new CardB();
        System.out.printf("card3 rank: %s, suit: %s \n", card3.rank, card3.suit);

        card3.rank = 8;
        System.out.printf("card3 rank: %s, suit: %s \n", card3.rank, card3.suit);

        CardB card4 = new CardB(15, "diamonds");
        card4.showCard();

        //c
        CardC card5 = new CardC();
        System.out.printf("card5 rank: %s, suit: %s \n", card5.rank, card5.suit);

        CardC card6 = new CardC("diamonds");
        card6.showCard();

        CardC card7 = new CardC("diamonds");
        card7.showCard();
        System.out.printf("card7 rank: %s, suit: %s \n", card7.rank, card7.suit);

    }

}

