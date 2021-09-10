package mx.com.softgame.poo1game.ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import mx.com.softgame.poo1game.hilos.Hilo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLuis extends JFrame {
    JMenuBar menuBar;
    JLabel IbiA;
    JLabel IbiB;
    JLabel IbiC;
    JLabel IbiD;
    JMenu mnuArchivo;
    JMenuItem mnuInicio;
    JMenuItem mnuSalir;

    public void initComponents(){
        menuBar = new JMenuBar();

        IbiA = new JLabel("texto A");
        IbiB = new JLabel("texto B");
        IbiC = new JLabel("texto C");
        IbiD = new JLabel("texto D");
        mnuArchivo = new JMenu("Archivo");
        mnuInicio = new JMenuItem("Inicio");
        mnuSalir = new JMenuItem("Salir");

        this.setLayout(new GridLayout(4,1));

        mnuArchivo.add(mnuInicio);
        mnuArchivo.add(mnuSalir);
        mnuArchivo.add(mnuArchivo);
        this.setJMenuBar(menuBar);
        this.add(IbiA);
        this.add(IbiB);
        this.add(IbiC);
        this.add(IbiD);

        mnuSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
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
    
    public VentanaLuis(){
        initComponents();
    }

    public void iniciarHilos(){
        Hilo m1 = new Hilo("m1", IbiA);
        Hilo m2 = new Hilo("m2", IbiB);
        Hilo m3 = new Hilo("m3", IbiC);
        Hilo m4 = new Hilo("m4", IbiD);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
