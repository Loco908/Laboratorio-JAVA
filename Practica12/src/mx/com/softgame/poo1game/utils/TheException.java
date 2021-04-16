package mx.com.softgame.poo1game.utils;

public class TheException extends Exception{
    public int poss;

    public TheException(String Msg, int poss){
        super(Msg);
        this.poss = poss;
    }

    public int getPoss(){
        return poss;
    }    
}