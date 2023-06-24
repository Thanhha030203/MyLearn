/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        danhsachsanpham1 dssp = new danhsachsanpham1();
        Scanner sc = new Scanner(System.in);
        int chon=0;
        do {       
            System.out.println(""
                    + "=========================MENU=========================="
                    +"\n0. ket thuc \n"
                    + "1. Nhập danh sách sản phẩm từ bàn phím\n" +
                      "2. Sắp xếp giảm dần theo giá và xuất ra màn hình\n" +
                      "3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím\n"
                    + "4. Xuất giá trung bình của các sản phẩm\n"
                    + "5. Sap xep theo ten giam dan\n"
                    + "=======================================================");
            System.out.print("Moi ban chon : ");
            chon = sc.nextInt();
            switch(chon){ 
                case 1 :{                    
                    do {                        
                        SanPham1 sp = new SanPham1();
                    sp.themsanpham();
                    dssp.themdanhsach(sp);          
                  System.out.println("ban muon tiep tuc nua khong (C/K)");
                    } while (!sc.nextLine().equalsIgnoreCase("K"));
                    break;
                }
                case 2 :{ 
                    dssp.sapxepdanhsach();
                    dssp.xuatdanhsach();
                    
                    break;
                }
                case 3 :{
                    sc.nextLine();
                    System.out.print("Nhap ten ban muon xoa : ");
                    String phantu = sc.nextLine();
                    SanPham1 sp1 = new SanPham1(phantu);
                    dssp.xoa(sp1);
                    break;
                }
                case 4 :{ 
                    dssp.xuatgiatrunhbinh();
                    break;
                }
                case 5: { 
                        
                    dssp.sapxeptheoten();
                    dssp.xuatdanhsach();
                }
                default:
            }
            
        } while (chon!=0);
        
    }
    
}
