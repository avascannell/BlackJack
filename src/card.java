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
        }else if(pType == 2){
            type = "three";
        }
        if(pSuit == 2){
            suit = "clubs";
        }else if(pType == 3){
            type = "four";
        }
        if(pSuit == 3){
            suit = "hearts";
        }else if(pType == 4){
            type = "five";
        }
        if(pSuit == 4){
            suit = "diomands";
        }else if(pType == 5){
            type = "six";
        }


      //suit = pSuit;
     // type = pType;
      //TODO; write if statements that set the value of value based on type

    }
    public void print(){
        System.out.println("the" + type + "of" + suit + " is worth" + value + "points.");
    }
}
