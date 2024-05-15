public class player {
    public int cardsValue;
    public card[] hand;
    public String name;
    public boolean isDealer;
    public boolean isPlayer;
    public boolean chooseToHit;
    public boolean chooseToStay;
    public int numCards;


    public void print(){
       for(int i = 0; i< hand.length; i++){
           hand[i].print();
       }
        if(isPlayer){
            System.out.println("hi" + name);
            System.out.println("you have" + cardsValue + "points");
        }
        else{
        System.out.println("Dealer info");
        }
    }

    public player() {
        cardsValue = 0;
        name = "Ava";
        isPlayer = true;
        hand = new card[2];
        numCards = 0;
    }
    public void addCard(card c){
        hand[numCards] = c;
        numCards = numCards +1;
        cardsValue = cardsValue + c.value;
    }
// TODO: print hand

}
