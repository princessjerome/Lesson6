public class GuessMachine {
    //instance variables
    private int number;
    private int numguesses;
    private int guess;
    
    //constructor
    public GuessMachine(){
        //generates random number from 1 to 100
        number = (int)(Math.floor(Math.random()*100))+1; 
        guess = 0;
        numguesses = 0;
    }
    
    //was it higher or lower
    public String giveHint(){
        if(guess > number)
            return "Your guess was greater than the number";
        else if(guess < number)
            return "Your guess was less than the number";
        else
            return "You got it!";
    }
    //was it valid?
    public boolean setGuess(int valid){
        if(valid >=1 && valid <= 100){
            numguesses++;
            guess = valid;
            return true;
        }
        else
            return false;
    }
    //add number of guesses
    public int getNumGuesses(){
        return numguesses;
    }
    
}
