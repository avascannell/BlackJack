public class card {

     //soiut ex heart, club, spade, diamond
    public String suit;
    //value ex wprth 1-11 points in game
    public int value;
    // type ex ace, 1,2,... Jack, Queen, King
    public String type;
    // need params
    // one for type

    public card(int pType, int pSuit){
        if(pType == 0){
            type = "ace";
        } else if(pType == 1){
            type = "two";
        }
        if(pSuit == 1){
            suit = "spades";
        }
        if(pSuit == 2){
            suit = "clubs";
        }
        if(pSuit == 3){
            suit = "hearts";
        }
        if(pSuit == 4){
            suit = "diomands";
        }

      suit = pSuit;
      type = pType;
      //TODO; write if statements that set the value of value based on type
      //value =
    }
    public void print(){
        System.out.println("the" + type + "of" + suit + " is worth" + value + "points.");
    }
}
