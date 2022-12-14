import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck {

    public static void main(String[] args) {
        
        String welcomeMessage = """
         ============================================
        ||    This is a Deck of Cards simulation    ||
        ||                                          ||
        ||  Commmands:      <shuffle>               ||            
        ||                  <cut>                   ||
        ||                  <deal>                  ||
        ||                                          ||
         ============================================
                """;

        System.out.println(welcomeMessage);

        // Create the a deck of ordered cards

        Integer suiteRange = 4;
        Integer valueRange = 13;

        ArrayList<Card> cardList = new ArrayList<Card>();

        for (Integer i=1; i<=4; i++) {

            for (Integer j=1; j<=13; j++) {

                Card card = new Card(i, j);
                cardList.add(card);

            }
        
            

        }

        for (Integer i=0; i<=51; i++) {
            
            System.out.printf("Card [%d] Suite: %d Value: %d\n", i, cardList.get(i).getSuite(), cardList.get(i).getValue());
     
        }

    }

    public void shuffle() {


    }

    public void deal() {

        
    }
    
    public void cut() {

        
    }

}