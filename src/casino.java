public class casino {
    public card[] deck;
    public static void main(String[] args) {
        casino c =  new casino();
    }

    public casino() {
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
    }
}