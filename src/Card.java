public class Card {
    
    private Integer suite; // Spades - 1, Heart - 2, Clubs - 3, Diamond - 4

    private Integer value; // 1 - 10, Jack - 11, Queen - 12, King - 13

    public Card(Integer suite, Integer value) {
        this.suite = suite;
        this.value = value;
    }

    public Integer getSuite() {
        return suite;
    }

    public void setSuite(Integer suite) {
        this.suite = suite;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String checkSuite (Integer suite) {

        switch(suite) { 

            case 1: 
                return("Spades");
            
            case 2: 
                return("Hearts");

            case 3:
                return("Clubs");

            case 4:
                return("Diamonds");

            default:
            System.out.println("- Invalid Suite -\n");
        }
        return null;
        
    }
    

}
