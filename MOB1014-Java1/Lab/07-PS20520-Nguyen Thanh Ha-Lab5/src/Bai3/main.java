/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.Scanner;

/*Xây dựng ứng dụng quản lý sản phẩm (thông tin mỗi sản phẩm gồm tên và giá)
theo menu sau

 */
public class main {
    static danhsachsanpham dssp = new danhsachsanpham();
    public static void main(String[] args) {
        
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
                    + "=======================================================");
            System.out.print("Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){ 
                case 1 :{ 
                    do {                        
                         SanPham sp = new SanPham();
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
                    System.out.println("Trang thai : "+trangthai());
                    break;
                }
                case 4 :{ 
                    dssp.xuatgiatrunhbinh();
                    break;
                }
                default:
            }
            
        } while (chon!=0);
        
    }
    static  String trangthai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham muon xoa : ");
                    String tensp = sc.nextLine();
                    SanPham sp1 = new SanPham(tensp);
            if(dssp.xoa(sp1)){ 
                return "thanh cong";
        }
            else{ return "that bai";
            
            }
    }
}
