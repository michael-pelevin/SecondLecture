package SecondTask;

import FirstTask.CardB;

public class ModifiedCardB extends CardB {
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "Joker"};
    private String[] jokerColors = {"red", "black"};

    //проверка принадлежности карты стандартной колоде
    public boolean checkCard(){
        Boolean result = false;
        if (rank == 13){
            for (String jokerColor: jokerColors) {
                if (jokerColor.contains(suit)){
                    result = true;
                }
            }
        } else if (rank >= 0 && rank < 13){
            for (String cardSuit: suits) {
                if (cardSuit.contains(this.suit)){
                    result = true;
                }
            }
        } else {
            return result;
        }
        return result;

    }

    // текущая карта сильнее (одинаковые масти)
    public boolean isStrongerWithEqualSuits(ModifiedCardB cardToCompare){
        if (this.suit == cardToCompare.suit){
            return this.rank > cardToCompare.rank;
        }
        else {
            System.out.printf("Suit of cards are not equals \n");
            return false;
        }
    }

    // текущая карта сильнее
    public Integer isStronger(ModifiedCardB cardToCompare){
        Integer currentSuitIndex = getSuitIndex(this.suit);
        Integer suitIndexToCompare = getSuitIndex(cardToCompare.suit);
        if(this.equals(cardToCompare)){
            return 0;
        }
        if(currentSuitIndex == suitIndexToCompare){
            return this.isStrongerWithEqualSuits(cardToCompare) ? 1 : -1;
        }
        else{
            return currentSuitIndex > suitIndexToCompare ? 1 : -1;
        }
    }

    // текущая карта сильнее (static) сравнение двух карт
    public static Integer isStrongerStat(ModifiedCardB firstCard, ModifiedCardB cardToCompare){
        Integer currentSuitIndex = getSuitIndex(firstCard.suit);
        Integer suitIndexToCompare = getSuitIndex(cardToCompare.suit);
        if(firstCard.equals(cardToCompare)){
            return 0;
        }
        if(currentSuitIndex == suitIndexToCompare){
            return firstCard.isStrongerWithEqualSuits(cardToCompare) ? 1 : -1;
        }
        else{
            return currentSuitIndex > suitIndexToCompare ? 1 : -1;
        }
    }

    //получение индекса масти текущей карты
    private static Integer getSuitIndex(String suit){
        for (int i = 0; i < suits.length; i++) {
            if (suits[i] == suit) {
                return i;
            }
        }
        return -1; //элемент не найден
    }

    //получение хеш-кода текущей карты
    @Override
    public int hashCode() {
        return 31 * rank + suit.hashCode();
    }

    //сравнение текущей карты с новой
    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof ModifiedCardB)){
            return false;
        }
        ModifiedCardB other = (ModifiedCardB) obj;
        return rank == other.rank && suit == other.suit;
    }

    //сравнение объектов по строковому представлению
    public boolean equalsByString(ModifiedCardB cardToCompare) {
        return (toString().equals(cardToCompare.toString()));
    }

    @Override
    public String toString() {
        return String.format("Rank: %s, suit: %s", this.ranks[this.rank], this.suit);
    }


}
