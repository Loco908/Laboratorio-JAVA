package mx.com.softgame.poo1game.ventanas;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

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
        btnOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent av){
                openFile();
            }
        });

        
        f.add(txtContenido);
        f.add(IbLeidos);
        f.add(IbiN);
        f.add(btnExit);
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent av) {
                f.dispose();
            }

        });
        f.setSize(550, 440);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }

    public static void main(String[] args) {
        VentanaPrincipal v = new VentanaPrincipal();
        v.initComponents();
    }

    public void openFile() {
        String file = txFile.getText();
        String path = System.getProperty("user.home") + System.getProperty("file.separator") + file;
        System.out.println(path);
        txtContenido.setText("");
        File archivo = new File(path);


        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(f, "No existe");
            return;
        }
        if(archivo.isFile()){
            getContenido(archivo);
        }else {
            getList(archivo);
        }
    }

    public void getContenido(File f) {
        String lineas;
        try {
            FileReader r = new FileReader(f);
            BufferedReader b = new BufferedReader(r);
            int count = 0;
            while((lineas = b.readLine()) != null){
                txtContenido.append(lineas + "\n");
                System.out.println(lineas);
                count = lineas.length();
            }
            b.close();
            IbiN.setText(Integer.toString(count));

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void getList(File archivo) {
        String[] list = archivo.list();
        if (list == null || list.length == 0) {
            System.out.println("No hay elementos");
        } else {
            for(int i = 0; i < list.length; i++){
                System.out.println(list[i]);
            }
        }
    }

}