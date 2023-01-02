package testcard;

import java.util.Random;

public class Deck_of_Card 
{
    private final int Card_Size=52;
private Card [] deck=new Card[Card_Size];
private int currentCard;
private Random r=new Random();

public Deck_of_Card()
{
    String [] fc={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    String [] st={"Hearts","Diamond","Spade","Club"};
    for(int i=0; i<this.Card_Size; i++)
    {
        this.deck[i]=new Card(fc[i%13],st[i/13]);
    }
    
    
}   
public void shuffle()
{
    for(int i=0; i<this.Card_Size; i++)
    {   
        int index=r.nextInt(52);
        Card temp=this.deck[i];
        this.deck[i]=this.deck[index];
        this.deck[index]=temp;
    }
}
public Card dealCard()
{
    return this.deck[this.currentCard++];
}

}
