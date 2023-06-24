/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhsach ds = new danhsach();
        int luachon=0;
        do {            
            System.out.println("===menu======");
            System.out.println(""
                    + "1. Nhập danh sách họ và tên\n" +
                      "2. Xuất danh sách vừa nhập\n"
                    + "3. Xuất danh sách ngẫu nhiên\n" +
                      "4. Sắp xếp giảm dần và xuất danh sách\n" +
                      "5. Tìm và xóa họ tên nhập từ bàn phím\n" +
                      "0. Kết thúc");
            System.out.print("Moi ban chon : ");
            luachon=sc.nextInt();
            sc.nextLine();
            switch(luachon){ 
                case 0: System.exit(luachon);
                case 1:{ 
                    do {                        
                       hoten ht = new hoten();
                       ht.nhap();
                       ds.them(ht);
                       System.out.println("ban muon tiep tuc nua khong (C/K)");
                    } while (!sc.nextLine().equalsIgnoreCase("K"));
                    break;
                }
                 case 2:{ 
                    ds.xuatdanhsach();
                    break;
                }
                case 3:{ 
                    ds.xuatdanhsachngaunhien();
                    break;
                }
                case 4:{ 
                    ds.sapxep();
                    ds.xuatdanhsach();
                    break;
                }
                case 5:{
                    System.out.println("Nhap ho va ten muon tim xoa : ");
                    String xoaten = sc.nextLine();
                    hoten ht = new hoten(xoaten);
                    System.out.println("Xoa ho va ten : "+ds.xoahovaten(ht));
                   break;
                }
                default: System.out.println(" Ban chon sai chon lai : ");
                break;
            }
        } while (luachon!=0);
    }
    
}
