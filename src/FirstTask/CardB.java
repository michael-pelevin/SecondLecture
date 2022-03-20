package FirstTask;

public class CardB {
    //список с мастями карт
    protected String[] suits = new String[] {"diamonds", "clubs", "hearts", "spades"};
    public Integer rank;
    public String suit;

    //конструктор по умолчанию с заданными значениями масти и дотоинства
    public CardB(){
        this.rank = 6;
        this.suit = "hearts";
    }

    //конструктор для ввода масти и достоинства с проверкой наличия масти
    public CardB(Integer rank, String suit){
        for (String cardSuit: suits) {
            if (cardSuit.contains(suit)) {
                this.suit = suit;
                break;
            }
            else {
                System.out.println("You entered wrong card`s suit \n");
                break;
            }
        }
        if(rank < 13){
            this.rank = rank;
        }
        else {
            System.out.println("You entered wrong card`s rank \n");
        }

    }

    //метод для вывода информации о созданной карте (при условии, что карта создана)
    void showCard() {
        if (rank != null && suit != null){
            System.out.printf("CardB rank is %s, suit is %s \n", this.rank, this.suit);
        }
        else {
            System.out.printf("CardB not created \n");
        }
    }
}

