package mx.com.softgame.poo1game.utils;
public class TheException extends Exception{
    private int poss;
    public TheException(String message, int poss){
        super(message);
        this.poss = poss;
        
    }
    public int getPoss(){
        return poss;
    } 
}