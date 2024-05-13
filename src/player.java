public class player {
    public int cardsValue;
    public card[] hand;
    public String name;
    public boolean isDealer;
    public boolean isPlayer;
    public boolean chooseToHit;
    public boolean chooseToStay;

    public player() {
        cardsValue = 0;
        name = "Ava";
        isPlayer = true;
        hand = new card[2];
    }
// TODO: print hand
    public void print() {
        if (isPlayer) {
            System.out.println("Hi!" + name);
            System.out.println("you have" + cardsValue + "points");
        } else {
            System.out.println("Dealer info");
        }

    }
}
