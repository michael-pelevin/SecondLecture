package SecondTask;

public class SecondTask {
    public static void main(String[] args) {
        /*достоинства карт ["2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"]
        для ссоздания карты нужно ввести индекс нужного достоинства
        */
        ModifiedCardB card1 = new ModifiedCardB();
        System.out.printf("Check %s\n", card1.checkCard());
        System.out.printf("Check %s\n", card1.checkCard());
        System.out.printf("hash %s\n", card1.hashCode());
        System.out.printf("card1 rank: %s, suit: %s \n", card1.rank, card1.suit);

        ModifiedCardB card2 = new ModifiedCardB();
        System.out.printf("card1 rank: %s, suit: %s \n", card2.rank, card2.suit);
        System.out.printf("hash %s\n", card2.hashCode());

        System.out.printf("Str %s\n", card2.toString());

        System.out.printf("Equals %s\n", card2.equals(card1));

        System.out.printf("EqualsByString %s\n", card2.equalsByString(card1));
        System.out.printf("isStronger %s\n", ModifiedCardB.isStrongerStat(card1, card2));
    }
}
