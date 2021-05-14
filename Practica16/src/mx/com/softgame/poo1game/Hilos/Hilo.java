import javax.swing.JLabel;

public class Hilo extends Thread {
    JLabel etiqueta;

    public Hilo(String name, JLabel etiqueta) {
        this.name = name;
        this.etiqueta = etiqueta;
        
    }
}
