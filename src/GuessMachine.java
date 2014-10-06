public class GuessMachine {
    //instance variables
    private int number;
    private int numguesses;
    private int guess;
    
    //constructor
    public GuessMachine(){
        //generates random number from 1 to 100
        number = (int)(Math.random()*100)+1; 
        guess = 0;
        numguesses = 0;
    }
    
    //to do - add methods:
    //giveHint(), setGuess(), getNumGuesses() 
}
