/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThi;

import java.util.List;

/**
 *
 * @author Admin
 */
interface  DanhSach <Enity> {
     public void stored(List<Enity> list);
     public void load();
       
}
