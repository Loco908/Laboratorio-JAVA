package mx.com.softgame.poo1game.hilos;
import javax.swing.JLabel;

public class Hilo extends Thread {
    JLabel etiqueta;

    public Hilo(String name, JLabel etiqueta) {
        super(name);
        this.etiqueta = etiqueta; 
    }

    public void run(){
        String str = "";
        char c;
        int n;
        for(int i = 0; i < 30; i++ ){
            str = etiqueta.getText();
            c = str.charAt(str.length()-1);
            str += c;
            etiqueta.setText(str);
            n = (int) (Math.random()*1000);
            try {
                Thread.sleep(n);    
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        str += " Hecho";
        etiqueta.setText(str);
    }
}
