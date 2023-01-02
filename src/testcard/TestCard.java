package testcard;

public class TestCard {

    public static void main(String[] args) 
    {
     Deck_of_Card d=new Deck_of_Card();
        d.shuffle();
        for(int i=1; i<=52; i++)
        {
        System.out.print(d.dealCard()+"    ");
        if(i%5==0)
        {
            System.out.println();
        }
        }   
    }
    
}
