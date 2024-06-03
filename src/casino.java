import java.util.Scanner;

public class casino {
    public card[] deck;
    public int numDealtCards;
    public boolean isHIt = false;
    public player p;
    public player dealer;
    public int numCards;

    public static void main(String[] args) {
        casino c = new casino();


    }


    public casino() {
        System.out.println("welcome to Mx. Bradford's casino!");
        deck = new card[52];
        makeDeck();
        printDeck();


        p = new player();
        dealer = new player();
        p.isPlayer = true;
        //  d = new player();
        dealer.isPlayer = false;


        deal();
        p.print();
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println(userName);
        p.name = userName;
        p.print();
        String desicison = "";
        // stop when they stand or when they bust
        while (!desicison.equals("stand") && p.cardsValue <= 21) {
            System.out.println("Do you want to stand or hit?");
            desicison = scan.nextLine();
            System.out.println(desicison);
            boolean isHit;
            if (desicison.equals("hit")) {
                isHit = true;
                System.out.println("You decided to hit");
            } else {
                isHit = false;
                System.out.println("You decided to stand");
            }
            if (isHit) {
                //take a card from the deck add it to hand
                // use add card to do this
                // update the value ]
                p.addCard(deck[numDealtCards]);
                numDealtCards++;
                p.print();

            } else {
                // dealer has to play
                // delaer hits untill they reach or surpass 17
                //use add card
            }
        }
    }

    public void makeDeck() {
        deck = new card[52];
        int count = 0;
        // fill our deck with cards
        for (int t = 0; t < 13; t++) {
            for (int s = 0; s < 4; s++) {
                deck[count] = new card(t, s);
                count++;
            }
        }
    }

    public void deal() {
        // first and second card to pl
        p.hand[0] = deck[0];
        p.hand[1] = deck[1];

        dealer.hand[0] = deck[2];
        dealer.hand[1] = deck[3];
        numDealtCards = 4;

    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i = i + 2) {
            deck[i].print();

        }
    }
    public void shuffleDeck(){
        for(int i = 0; i < deck.length; i=i + 2){
            math.random
        }
    }

}




