/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuquanlinv;

/**
 *
 * @author THANH MY
 */
public class Data {
    public boolean isMaNV(String str){
        String reMaNV = "[Rr][TPCtpc]\\d{5}";
        return str.matches(reMaNV);
    }
}
