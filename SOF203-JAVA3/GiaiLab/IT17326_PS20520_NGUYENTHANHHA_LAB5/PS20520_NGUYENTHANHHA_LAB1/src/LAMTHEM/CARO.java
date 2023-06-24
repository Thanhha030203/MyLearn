/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAMTHEM;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Admin
 */
public class CARO {
    private JToggleButton o;

     JToggleButton [][] arr = new JToggleButton[10][10];
    boolean role = true;
    String use = "1";
    public void taoO(){ 
        JFrame frame = new JFrame("Người chơi thứ "+ use);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setSize(400,400);
        panel.setLayout(new GridLayout(10,10));
        frame.add(panel);
    
        for(int i=0;i<10;i++){ 
            for(int j=0;j<10;j++){
           arr[i][j] = new JToggleButton();
             arr[i][j].addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                      for(int i=0; i<10;i++){ 
        for(int j=0 ;j<10;j++){ 
            if(e.getSource() == arr[i][j]){ 
                arr[i][j].setText(role?"X":"O");
                check();
                arr[i][j].setEnabled(false);
                arr[i][j].setBackground(role?Color.red:Color.GREEN);
              
               role = !role;
               frame.setTitle(role?"Người chơi thứ 1":"Người chơi thứ 2");
            }
        }
    
}
               }
             });
     panel.add(arr[i][j]);
            }
        }

        frame.setVisible(true);
    }
   
    public void check(){ 
         String doc ="";
    String ngang = "";
        for(int i=0;i<10;i++){ 
            for(int j=0;j<10;j++){ 
                 if(arr[i][j].getText().equals("")){ 
                     doc = doc+ " ";
               }
               else{
                doc = doc + arr[i][j].getText();
;            }
                
            }
        }
        System.out.println("ngang");
        System.out.println(doc);
                for(int i=0;i<10;i++){ 
            for(int j=0;j<10;j++){ 
               if(arr[j][i].getText().equals("")){ 
                     ngang = ngang + " ";
               }
               else{
                ngang = ngang + arr[j][i].getText()
;            }
            }
        }
        if(doc.contains("XXXXX")){ 
            JOptionPane.showMessageDialog(null, "Người chơi thứ 1 đã thắng");
        }
        else if(doc.contains("OOOOO")){ 
             JOptionPane.showMessageDialog(null, "Người chơi thứ 2 đã thắng");
        }
              if(ngang.contains("XXXXX")){ 
           JOptionPane.showMessageDialog(null, "Người chơi thứ 1 đã thắng");
        }
                else if(ngang.contains("OOOOO")){ 
            System.out.println("2 thắng");
            JOptionPane.showMessageDialog(null, "Người chơi thứ 2 đã thắng");
        }
              System.out.println("doc");
                System.out.println(ngang);
    }
    public static void main(String[] args) {
        CARO caro = new CARO();
        caro.taoO();
    }
}
