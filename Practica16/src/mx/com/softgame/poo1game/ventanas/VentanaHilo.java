import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;

public class VentanaHilo extends JFrame {
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
        this.setLayout(new GridLayout(4,1));

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        mnuArchivo = new JMenu();
        this.setJMenu(mnuArchivo);
        mnuInicio = new JMenuItem();

        this.setJMenuItem(mnuInicio);
        mnuSalir = new JMenuItem();

        this.setJMenuItem(mnuSalir);
        IbiA = new JLabel();
        
        this.add(IbiA);
        this.add(IbiB);
        this.add(IbiC);
        this.add(IbiD);

        mnuSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                dispose();
               
            }
        }); 

        mnuInicio.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                iniciarHilos();
            }
        }); 

        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    }

    public VentanaHilo(){
        initComponents();
    }
    
}
