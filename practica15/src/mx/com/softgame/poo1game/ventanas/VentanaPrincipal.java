import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPrincipal{
    JFrame f;
    JLabel IbiFile;
    JTextField txFile;
    JButton btnOpen;
    JTextArea txtContenido;
    JLabel IbiN;
    JLabel IbLeidos;
    JButton btnExit;

    public VentanaPrincipal(){
        f = new JFrame ("Practica 14");
        IbiFile = new JLabel("Nombre del archivo:");
        txFile = new JTextField(20);
        btnOpen = new JButton("Abrir archivo");
        txtContenido = new JTextArea(int 30, int 40);
        IbLeidos = new JLabel("Archivos leidos");
        IbiN = new JLabel(CERO 0);
        btnExit = new JButton("Salir");
    }
}