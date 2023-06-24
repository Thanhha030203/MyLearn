


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class showClock implements Runnable{
    
     public showClock() {
      
    }
    @Override
    public void run() { 
        while(true){
            Date now = new Date();
            SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss aa");
           
            JLabel a = new JLabel();
             QuanLyNhanVien qlnv = null;
            try {
                qlnv = new QuanLyNhanVien();
            } catch (IOException ex) {
                Logger.getLogger(showClock.class.getName()).log(Level.SEVERE, null, ex);
            }
            qlnv.lblDongHo.setText(String.valueOf(fm.format(now)));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

   

   
    
}
