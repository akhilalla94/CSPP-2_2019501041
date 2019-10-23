import java.util.Random;
class Card{
    String facevalue;
    String suitvalue;

Card(){
    
}
Card(String fv,String sv){
    this.facevalue=fv;
    this.suitvalue=sv;
}

public void setfacevalue(String fv){
    this.facevalue=fv;
}
public void setsuitvalue(String sv){
     this.suitvalue=sv;
}
public String getfacevalue(){
    return this.facevalue;
}
public String getsuitvalue(){
    return this.suitvalue;
}

public String toString(){
    return this.suitvalue+ " : "+this.facevalue;
}

public static void Shuffle(int Card[], int n) {
    Random rand = new Random();
    for (int i = 0; i < n; i++){
        int s = i + rand.nextInt(52 - i);
        int temp = Card[s];
        Card[s] = Card[i];
        Card[i] = temp;
     }
}
}

class Sollu{
    public static void main(String[]args){
    Card[] deck =new Card[52];
    String[] suits={"s","c","d","h"};
    String[] face={"2","3","4","5","6","7","8","9","T","Q","J","K","A"};
    int position=0;
    for(int i=0;i<suits.length;i++){
        for(int j=0;j<face.length;j++){
            Card card=new Card();
            card.setsuitvalue(suits[i]);
            card.setfacevalue(face[j]);
            deck[position++]=card;

        }
    }
    Shuffle(deck, 13);
    for(int i=0;i<deck.length;i++){
    System.out.println(deck[i]);
    }
}

    private static void Shuffle(Card[] deck, int i) {
    }
}