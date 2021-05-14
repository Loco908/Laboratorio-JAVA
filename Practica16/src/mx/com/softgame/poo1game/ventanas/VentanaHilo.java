import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaHilo extends JFrame {
    JFrame f;
    JMenuBar menuBar;
    JLabel IbiA;
    JLabel IbiB;
    JLabel IbiC;
    JLabel IbiD;
    JMenu mnuArchivo;
    JMenuItem mnuInicio;
    JMenuItem mnuSalir;

    public VentanaHilo(){
        IbiA = new JLabel("Texto A");
        IbiB = new JLabel("Texto B");
        IbiC = new JLabel("Texto C");
        IbiD = new JLabel("Texto D");
        mnuArchivo = new JMenu("Texto Archivo");
        mnuInicio = new JMenuItem("Texto Inicio");
        mnuSalir = new JMenuItem("Texto Salir");
    }

    public void initComponents(){
        f.setLayout(new GridLayout(4,1));
        f = new JFrame("MenuBar");
        mb = new JMenuBar();
        f.setJMenuBar(mb);
    }
    
}
