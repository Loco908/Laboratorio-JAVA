import javax.swing.JLabel;

public class Hilo extends Thread {
    JLabel etiqueta;

    public Hilo(String name, JLabel etiqueta) {
        this.name = name;
        this.etiqueta = etiqueta; 
    }

    public void run(){
        String str;
        char c;
        for(int i = 0; i < 30; i++ ){
            str = etiqueta.getText();
            c = str.charAt(str.length()-1);
            str = etiqueta.setText();
        }
    }
}
