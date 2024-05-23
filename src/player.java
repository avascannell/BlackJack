public class player {
    public int cardsValue;
    public card[] hand;
    public String name;
    public card isDealer;
    public boolean isPlayer;
    public boolean chooseToHit;
    public boolean chooseToStay;
    public int numCards;


    public void print(){
       for(int i = 0; i< hand.length; i++){
           hand[i].print();
       }
        if(isPlayer) {
            System.out.println("hi" + name);
            System.out.println("you have" + cardsValue + "points");
            for(int i = 0; i < hand.length; i++) {
                hand[i].print();
            }
        }


        else{
            System.out.println("Dealer info");
            System.out.println("the delaer has" + cardsValue + "points");
            hand[0].print();
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
        if(numCards>=2){
            card [] moreCards = new card[hand.length + 1];
            for(int i = 0; i < 2; i++){
                moreCards[i] = hand[i];
            }
            hand = moreCards;
        }
        hand[numCards] = c;
        numCards = numCards +1;
        cardsValue = cardsValue + c.value;
    }
// TODO: print hand

}
