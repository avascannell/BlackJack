public class dealer {
    public class Dealer {
        public int cardsValue;

        public boolean isDealer;

        public boolean chooseToHit;
        public boolean chooseToStay;
        public int cardsValue;
        public card[] hand;
        public String name;
        public boolean isPlayer;


    }
    public Dealer(){
            cardsValue = 0;
            name = "Ava";
            isPlayer = false;
            hand = new card[2];
    }

}
