package FirstTask;
import java.util.*;

public class CardC extends CardB {
    //список всех достоинств для вывода в читабельном виде
    private String[] ranks = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

//    Map<String, Integer> maxRanks = new HashMap<String, Integer>();
//    maxRanks.put("daimonds", 0);
//    maxRanks.put("clubs", 0);
//    maxRanks.put("hearts", 0);
//    maxRanks.put("spades", 0);

    //переменные для подсчета карт
    private static Integer maxRankDiamonds = 0;
    private static Integer maxRankClubs = 0;
    private static Integer maxRankHearts = 0;
    private static Integer maxRankSpades = 0;

    //конструктор по умолчанию
    public CardC(){
        this.rank = null;
        this.suit = null;
    }

    //контруктор с возможностью ввода масти карты
    public CardC (String suit) {
        //проверка введенной масти и увеличение достоинства созданных карт
        for (String cardSuit: suits) {
            if (cardSuit.contains(suit)) {
                switch (suit){
                    case "diamonds":
                        if(maxRankDiamonds < 13){
                            maxRankDiamonds++;
                            this.rank = maxRankDiamonds;
                        }
                        else{
                            System.out.printf("Card`s suit %s finished \n", suit);
                        }
                        break;
                    case "clubs":
                        if(maxRankClubs < 13){
                            maxRankClubs +=1;
                            this.rank = maxRankClubs;
                        }
                        else{
                            System.out.printf("Card`s suit %s finished \n", suit);
                        }
                        break;
                    case "hearts":
                        if(maxRankHearts < 13){
                            maxRankHearts +=1;
                            this.rank = maxRankHearts;
                        }
                        else{
                            System.out.printf("Card`s suit %s finished \n", suit);
                        }
                        break;
                    case "spades":
                        if(maxRankSpades < 13){
                            maxRankSpades +=1;
                            this.rank = maxRankSpades;
                        }
                        else{
                            System.out.printf("Card`s suit %s finished \n", suit);
                        }
                        break;
                    default:
                        this.suit = null;
                        this.rank = null;
                        break;
                }
                break;
            }
            else {
                System.out.println("You entered wrong card`s suit");
                break;
            }
        }
    }

    //метод вывода созданной карты в читабельном виде
    @Override
    void showCard() {
        if (rank != null && suit != null){
            System.out.printf("CardC rank`s number is %s, rank is %s, suit is %s \n", this.rank, this.ranks[this.rank-1], this.suit);
        }
        else {
            System.out.printf("CardC not created \n");
        }
    }
}
