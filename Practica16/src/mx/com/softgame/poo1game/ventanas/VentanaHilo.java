package mx.com.softgame.poo1game.ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import mx.com.softgame.poo1game.hilos.Hilo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaHilo extends JFrame {
    JMenuBar menuBar;
    JLabel IbiA;
    JLabel IbiB;
    JLabel IbiC;
    JLabel IbiD;
    JMenu mnuArchivo;
    JMenuItem mnuInicio;
    JMenuItem mnuSalir;

    public void initComponents(){
        IbiA = new JLabel("Texto A");
        IbiB = new JLabel("Texto B");
        IbiC = new JLabel("Texto C");
        IbiD = new JLabel("Texto D");
        mnuArchivo = new JMenu("Texto Archivo");
        mnuInicio = new JMenuItem("Texto Inicio");
        mnuSalir = new JMenuItem("Texto Salir");

        this.setLayout(new GridLayout(4,1));

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        mnuArchivo = new JMenu();
        mnuInicio = new JMenuItem();
        mnuSalir = new JMenuItem();
        IbiA = new JLabel();

        mnuArchivo.add(mnuInicio);
        mnuArchivo.add(mnuSalir);

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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public VentanaHilo(){
        initComponents();
    }
    public void iniciarHilos() {
        Hilo m1 = new Hilo("m1", IbiA);
        Hilo m2 = new Hilo("m2", IbiB);
        Hilo m3 = new Hilo("m3", IbiC);
        Hilo m4 = new Hilo("m4", IbiD);
    }

}
