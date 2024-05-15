import java.util.Scanner;

public class casino {
    public card[] deck;
    public boolean isHIt = false;
    public player p;
    public player dealer;
    public int numCards;
    public static void main(String[] args) {
        casino c =  new casino();


    }


    public casino(){
        System.out.println("welcome to Mx. Bradford's casino!");
        deck = new card[52];
        int count = 0;
        // fill our deck with cards
        for(int t =0; t < 13; t++){
            for(int s = 0; s< 4;s++){
                deck[count] = new card(t, s);
                count++;
            }
        }


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



    }
    public void makeDeck(){
        deck = new card[52];
    }
    public void deal(){
        // first and second card to pl
        p.hand [0] = deck[0];
        p.hand [1] = deck[1];

        dealer.hand[0]= deck[2];
        dealer.hand[1] = deck[3];


    }

}




