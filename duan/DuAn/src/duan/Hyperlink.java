/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Hyperlink extends JFrame {

    String text = "Clink me to website";
    public Hyperlink() throws HeadlessException {
        JLabel label = new JLabel(text);
        label.setForeground(Color.BLUE.darker());
        label.setBounds(100, 100, 150, 50);
//        	S

        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                try {
                    URI u = new URI("https://phongkhamdakhoasaigon.com/");
                    Desktop.getDesktop().browse(u);
                    u.getAuthority();
                    u.getHost();
                    
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
            }

            public void mouseExit(MouseEvent event) {
                label.setText(text);
            }

            
            public void mouseEntered(MouseEvent e) {
                label.setText("<html><a href=''>" + text + "</a></html>");
            }
        });
        getContentPane().add(label);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hyperlink().setVisible(true);
            }

        });
    }
}
