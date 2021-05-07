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
        txtContenido = new JTextArea(30, 40);
        IbLeidos = new JLabel("Archivos leidos");
        IbiN = new JLabel("CERO");
        btnExit = new JButton("Salir");
    }

    public void initComponents(){
        f.setLayout(new FlowLayout());
        f.add(IbiFile);
        f.add(txFile);
        f.add(btnOpen);
        f.add(txtContenido);
        f.add(IbLeidos);
        f.add(IbiN);
        f.add(btnExit);
        f.setSize(550, 440);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}