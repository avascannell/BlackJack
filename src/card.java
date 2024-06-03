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
            value = 11;
        }
        if(pType == 1){
            type = "two";
            value = 2;
        }

        if(pType == 2){
            type = "three";
            value = 3;
        }

        if(pType == 3){
            type = "four";
            value =4;
        }
         if(pType == 4){
            type = "five";
             value = 5;
        }

        if(pType == 5){
            type = "six";
            value = 6;
        }
        if(pType == 6){
            type = "seven";
            value = 7;
        }
        if(pType == 7){
            type = "eight";
            value = 8;
        }
        if(pType == 8){
            type = "nine";
            value = 9;
        }
        if(pType == 9){
            type = "ten";
            value = 10;
        }
        if(pType == 10){
            type = "jack";
            value = 10;
        }
        if(pType == 11){
            type = "queen";
            value = 10;
        }
        if(pType == 12){
            type = "king";
            value = 10;
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
        if(pSuit == 0){
            suit = "diomands";
        }
    }
    public void print(){
        System.out.println("the" + type + "of" + suit + " is worth" + value + "points.");

    }
}
