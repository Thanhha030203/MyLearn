/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuquanlinv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author THANH MY
 */
public class DanhSachSinhVien {

    ArrayList<NhanVien> listnv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu() {
        String str = "";
//        nv.nhapNV();
//        nv.xuatNV();
        int chon;
        boolean temp;
        String ans;
        int case1 = 0;
        do {
            System.out.printf("\n\n\n%55s   ***************************************************", ' ');
            System.out.printf("\n%55s  **\t\t\t     >>MENU<<\t\t           **", ' ');
            System.out.printf("\n%55s **-vvv-------vvv----------vvv---------vvv--------vvv-**", ' ');
            System.out.printf("\n%55s *|  1  |               Nhập nhân viên                |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  2  |               Xuất nhân viên                |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  3  |           Tìm nhân viên theo mã             |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  4  |           Xoá nhân viên theo mã             |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  5  |    Cập nhật thông tin nhân viên theo mã     |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  6  |       Tìm nhân viên theo khoản lương        |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  7  |        Sắp xếp nhân viên theo họ tên        |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  8  |       Sắp xếp nhân viên theo thu nhập       |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  9  |   Danh sách 5 nhân viên có lương cao nhất   |*", ' ');
            System.out.printf("\n%55s *| --- |---------------------------------------------|*", ' ');
            System.out.printf("\n%55s *|  0  |                    Thoát                    |*", ' ');
            System.out.printf("\n%55s **-^^^-------^^^----------^^^---------^^^--------^^^-**", ' ');
            System.out.printf("\n%55s * ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** **", ' ');
            do {
                System.out.printf("\n\n%60s\t\t    Nhập lựa chọn của bạn: ", ' ');
                str = sc.nextLine();
                temp = kiem_tra(str);

                if (temp) {
                    chon = Integer.parseInt(str);
                    System.out.printf("\n%60s\t\t     ----------------------", ' ');
                    System.out.printf("\n%60s\t\t  Bạn đang chọn chức năng thứ %d\n", ' ', chon);
                    System.out.printf("\n%60s\t\t     vvvvvvvvvvvvvvvvvvvvvvvv\n", ' ');
                    switch (chon) {
                        case 1: {
                            System.out.printf("\n%60s\t\tChức năng nhập thông tin nhân viên \n", ' ');
                            System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                            nhap();
                            case1 = 1;
                            break;
                        }
                        case 2: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t\tChức năng xuất thông tin nhân viên \n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                xuat();
                            }
                            break;
                        }
                        case 3: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t      Chức năng tìm kiếm nhân viên theo mã\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                timNVTheoMa();
                            }
                            break;
                        }
                        case 4: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t\t Chức năng xóa nhân viên theo mã\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                XoaMa();
                            }
                            break;
                        }
                        case 5: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t  Chức năng cập nhật thông tin nhân viên theo mã\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                MaThayDoi();
                            }
                            break;
                        }
                        case 6: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t    Chức năng tìm nhân viên theo khoản lương\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                TimTheoLuong();
                            }
                            break;
                        }
                        case 7: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t     Chức năng sắp xếp nhân viên theo họ tên\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                sap_xep_ten();
                            }
                            break;
                        }
                        case 8: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t    Chức năng sắp xếp nhân viên theo thu nhập\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                sap_xep_theo_thu_nhap();
                            }
                            break;
                        }
                        case 9: {
                            if (case1 != 0) {
                                System.out.printf("\n%60s\t      Danh sách 5 nhân viên có lương cao nhất\n", ' ');
                                System.out.printf("\n%60s\t\t    =========================\n\n", ' ');
                                nam_nhan_vien_luong_cao();
                            }
                            break;
                        }
                        default: {
                            System.out.printf("\n%60s\t\t  ------------------------------", ' ');
                            System.out.printf("\n%60s\t\t      Không có chức năng này", ' ');
                            System.out.printf("\n%60s\t\t        Vui lòng nhập lại!", ' ');
                            System.out.printf("\n%60s\t\t  ------------------------------\n", ' ');
                            break;
                        }
                        case 0: {
                            System.out.printf("\n%60s\t\t------------------------------", ' ');
                            System.out.printf("\n%60s\t\t\tThanks for using!", ' ');
                            System.out.printf("\n%60s\t\t------------------------------\n", ' ');
                            System.exit(0);
                            break;
                        }

                    }

                    if (case1 == 0) {
                        System.out.printf("\n%60s\t\t  ------------------------------", ' ');
                        System.out.printf("\n%60s\t\t      Bạn chưa nhập dữ liệu", ' ');
                        System.out.printf("\n%60s\t\t        Vui lòng nhập lại!", ' ');
                        System.out.printf("\n%60s\t\t  ------------------------------\n", ' ');
                    }

                } else {
                    System.out.printf("\n%60s\t\t  ------------------------------", ' ');
                    System.out.printf("\n%60s\t\t      Không có chức năng này", ' ');
                    System.out.printf("\n%60s\t\t        Vui lòng nhập lại!", ' ');
                    System.out.printf("\n%60s\t\t  ------------------------------\n", ' ');
                }
            } while (!temp);

            System.out.printf("\n%60s\t===================================================", ' ');
            System.out.printf("\n%60s\t Bạn muốn tiếp tục chọn chức năng khác không? (Y/N) ", ' ');
            ans = sc.nextLine();
            if (ans.equalsIgnoreCase("n")) {
                System.out.printf("\n%60s\t\t ------------------------------", ' ');
                System.out.printf("\n%60s\t\t\tThanks for using!", ' ');
                System.out.printf("\n%60s\t\t ------------------------------\n\n\n", ' ');
                System.exit(0);
            }

        } while (!ans.equalsIgnoreCase("n"));

    }

    public static boolean kiem_tra(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void nhap() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        Data ds = new Data();
        String ans = "";
        do {
            String msnv = "";
            do {
                System.out.printf("\n%50s Nhập mã số nhân viên: ", ' ');
                msnv = sc.nextLine();
                if (ds.isMaNV(msnv)) {
                    break;
                } else {
                    System.out.printf("\n\n%50s ------------------------------------", ' ');
                    System.out.printf("\n%50s    Mã số nhân viên chưa đúng ", ' ');
                    System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                    System.out.printf("\n%50s ------------------------------------\n", ' ');
                }
            } while (true);
            String tenNv = "";
            do {

                System.out.printf("\n%50s Nhập tên: ", ' ');
                tenNv = sc.nextLine();
                if (tenNv == null || tenNv.equals("")) {
                    System.out.printf("\n\n%50s ------------------------------------", ' ');
                    System.out.printf("\n%50s    Bạn chưa nhập tên nhân viên ", ' ');
                    System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                    System.out.printf("\n%50s ------------------------------------\n", ' ');
                } else {
                    break;
                }
            } while (true);
            do {
                System.out.printf("\n%50s Nhân viên: ", ' ');
                System.out.printf("\n%50s    1. Hanh chanh", ' ');
                System.out.printf("\n%50s    2. Tiep thi", ' ');
                System.out.printf("\n%50s    3. Truong phong\n", ' ');
                System.out.printf("\n%50s Chọn: ", ' ');
                String nhanvien = sc.nextLine();
                int nv = 0;
                if (kiem_tra(nhanvien) || nhanvien.equalsIgnoreCase("hanh chanh") || nhanvien.equalsIgnoreCase("tiep thi") || nhanvien.equalsIgnoreCase("truong phong")) {
                    if (kiem_tra(nhanvien)) {
                        nv = Integer.parseInt(nhanvien);
                    }

                    if (nv == 1 || nv == 2 || nv == 3 || nhanvien.equalsIgnoreCase("hanh chanh") || nhanvien.equalsIgnoreCase("tiep thi") || nhanvien.equalsIgnoreCase("truong phong")) {
                        double luong = 0;
                        String str = "";
                        do {
                            System.out.printf("\n%50s Nhập lương: ", ' ');
                            str = sc.nextLine();
                            if (kiem_tra(str)) {
                                luong = Double.parseDouble(str);
                                if (luong < 0) {
                                    System.out.printf("\n\n%50s ------------------------------------", ' ');
                                    System.out.printf("\n%50s  Cần nhập đúng lương của nhân viên", ' ');
                                    System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                                    System.out.printf("\n%50s ------------------------------------\n", ' ');
                                } else {
                                    if (nv == 2 || nhanvien.equalsIgnoreCase("Tiep thi")) {
                                        String strdoanhso = "";
                                        String strhuehong = "";
                                        double doanhSo = 0;
                                        double hueHong = 0;
                                        do {
                                            System.out.printf("\n%50s Nhập doanh số: ", ' ');
                                            strdoanhso = sc.nextLine();
                                            System.out.printf("\n%50s Nhập tỉ lệ huê hồng (%%): ", ' ');
                                            strhuehong = sc.nextLine();
                                            if (kiem_tra(strdoanhso) && kiem_tra(strhuehong)) {
                                                doanhSo = Double.parseDouble(strdoanhso);
                                                hueHong = Double.parseDouble(strhuehong);
                                                if (doanhSo > 0 && hueHong > 0) {
                                                    NhanVien nvTT = new TiepThi(msnv, tenNv, luong, doanhSo, hueHong);
                                                    listnv.add(nvTT);
                                                    break;
                                                }
                                            }
                                            System.out.printf("\n\n%50s ------------------------------------", ' ');
                                            System.out.printf("\n%50s  Cần nhập đúng doanh số và huê hồng của nhân viên", ' ');
                                            System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                                            System.out.printf("\n%50s ------------------------------------\n", ' ');
                                        } while (true);
                                    } else if (nv == 3 || nhanvien.equalsIgnoreCase("Truong phong")) {
                                        String strtrachnhiem = "";
                                        double trachnhiem = 0;
                                        do {
                                            System.out.printf("\n%50s Nhập lương trách nhiệm: ", ' ');
                                            strtrachnhiem = sc.nextLine();

                                            if (kiem_tra(strtrachnhiem)) {
                                                trachnhiem = Double.parseDouble(strtrachnhiem);
                                                if (trachnhiem > 0) {
                                                    NhanVien nvTP = new TruongPhong(msnv, tenNv, luong, trachnhiem);
                                                    listnv.add(nvTP);
                                                    break;
                                                }
                                            }
                                            System.out.printf("\n\n%50s ------------------------------------", ' ');
                                            System.out.printf("\n%50s  Cần nhập đúng lương trách nhiệm của nhân viên", ' ');
                                            System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                                            System.out.printf("\n%50s ------------------------------------\n", ' ');
                                        } while (true);
                                    } else {
                                        NhanVien nvHC = new NhanVien(msnv, tenNv, luong);
                                        listnv.add(nvHC);
                                    }
                                    break;
                                }
                            } else {
                                System.out.printf("\n\n%50s ------------------------------------", ' ');
                                System.out.printf("\n%50s  Cần nhập đúng lương của nhân viên", ' ');
                                System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                                System.out.printf("\n%50s ------------------------------------\n", ' ');
                            }

                        } while (true);
                    } else {
                        System.out.printf("\n\n%50s ------------------------------------", ' ');
                        System.out.printf("\n%50s        Chọn loại nhân viên", ' ');
                        System.out.printf("\n%50s ------------------------------------\n", ' ');
                    }
                    break;
                } else {
                    System.out.printf("\n\n%50s ------------------------------------", ' ');
                    System.out.printf("\n%50s        Chọn loại nhân viên", ' ');
                    System.out.printf("\n%50s ------------------------------------\n", ' ');
                }

            } while (true);
            System.out.printf("\n%50s ==============================================", ' ');
            System.out.printf("\n\n%50s Bạn muốn nhập tiếp nhân viên khác? (Y/N) ", ' ');
        } while (!sc.nextLine().equalsIgnoreCase("n"));

    }

    public void xuat() {
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        System.out.printf("\n%20s|%3s%-15s|%8s%-20s|%9s%-19s|%8s%-20s|%8s%-20s|%8s%-20s|", ' ', ' ', "Mã nhân viên", ' ', "Họ và tên", ' ', "Lương", ' ', "Thu Nhập", ' ', "Thuế Thu Nhập", ' ', "Tổng Thu Nhập");
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        for (NhanVien nv : listnv) {
            nv.xuatThongTin();
        }
    }

    public void timNVTheoMa() {

        System.out.printf("\n%50s Nhập mã số nhân viên muốn tìm: ", ' ');
        String TimMa = sc.nextLine();
        int temp = 0;
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        System.out.printf("\n%20s|%3s%-15s|%8s%-20s|%9s%-19s|%8s%-20s|%8s%-20s|%8s%-20s|", ' ', ' ', "Mã nhân viên", ' ', "Họ và tên", ' ', "Lương", ' ', "Thu Nhập", ' ', "Thuế Thu Nhập", ' ', "Tổng Thu Nhập");
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        for (NhanVien nv : listnv) {
            if (nv.getmsnv().equalsIgnoreCase(TimMa)) {
                nv.xuatThongTin();
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.printf("\n\n%50s Không tìm thấy số nhân viên tương ứng", ' ');
        }
    }

    public void XoaMa() {
        System.out.printf("\n%50s Nhập mã số nhân viên muốn xóa: ", ' ');
        String TimMa = sc.nextLine();

        int temp = 0;
        for (NhanVien nv : listnv) {
            if (nv.getmsnv().equalsIgnoreCase(TimMa)) {
                listnv.remove(nv);
                System.out.printf("\n%50s Đã xóa", ' ');
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.printf("\n%50s Không tìm thấy số nhân viên tương ứng", ' ');
        }
    }

    public void MaThayDoi() {
        System.out.printf("\n%50s --------------------------------------------", ' ');
        System.out.printf("\n%50s Nhập mã số nhân viên muốn thay đổi: ", ' ');
        String TimMa = sc.nextLine();
        NhanVien found = null;
        int vitri = 0;
        for (NhanVien nv : listnv) {
            if (nv.getmsnv().equalsIgnoreCase(TimMa)) {
                found = nv;
                vitri = listnv.indexOf(nv);
                break;
            }
        }
        if (found != null) {
            Data ds = new Data();
            String msnv = "";
            do {
                System.out.printf("\n%50s Nhập mã số nhân viên: ", ' ');
                msnv = sc.nextLine();
                if (msnv.equals("") || msnv == null) {
//                    msnv = found.getmsnv();
                    break;
                } else {
                    if (ds.isMaNV(msnv)) {
                        found.setmsnv(msnv);
                        break;
                    } else {
                        System.out.printf("\n\n%50s ------------------------------------", ' ');
                        System.out.printf("\n%50s    Mã số nhân viên chưa đúng ", ' ');
                        System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                        System.out.printf("\n%50s ------------------------------------\n", ' ');
                    }
                }
            } while (true);
            String tenNv = "";

            System.out.printf("\n%50s Nhập tên: ", ' ');
            tenNv = sc.nextLine();
            if (tenNv == null || tenNv.equals("")) {
//                tenNv = found.getten();
            }
            else{
                found.setten(tenNv);
            }
            double luong = 0;
            do {

                String str = "";

                System.out.printf("\n%50s Nhập lương: ", ' ');
                str = sc.nextLine();

                if (str.equals("") || str == null) {
//                    luong = found.getluong();
                    break;
                } else {
                    if (kiem_tra(str)) {
                        luong = Double.parseDouble(str);

                        if (luong < 0) {
                            System.out.printf("\n\n%50s ------------------------------------", ' ');
                            System.out.printf("\n%50s  Cần nhập đúng lương của nhân viên", ' ');
                            System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                            System.out.printf("\n%50s ------------------------------------\n", ' ');
                        } else {
                            found.setluong(luong);
                            break;
                        }
                    } else {
                        System.out.printf("\n\n%50s ------------------------------------", ' ');
                        System.out.printf("\n%50s  Cần nhập đúng lương của nhân viên", ' ');
                        System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                        System.out.printf("\n%50s ------------------------------------\n", ' ');
                    }
                }
            } while (true);
            if (found instanceof TiepThi) {
                String strdoanhso = "";
                String strhuehong = "";
                double doanhSo = 0;
                double hueHong = 0;

                do {
                    System.out.printf("\n%50s Nhập doanh số: ", ' ');
                    strdoanhso = sc.nextLine();
                    if (strdoanhso.equals("") || strdoanhso == null) {
//                        doanhSo = ((TiepThi) found).getDoanhSo();
                        break;
                    } else {

                        if (kiem_tra(strdoanhso)) {
                            doanhSo = Double.parseDouble(strdoanhso);
                            if (doanhSo>0){
                                ((TiepThi) found).setDoanhSo(doanhSo);
                                break;
                            }
                        } else {
                            System.out.printf("\n\n%50s ------------------------------------", ' ');
                            System.out.printf("\n%50s  Cần nhập đúng doanh số và huê hồng của nhân viên", ' ');
                            System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                            System.out.printf("\n%50s ------------------------------------\n", ' ');
                        }
                    }
                } while (true);
                do {
                    System.out.printf("\n%50s Nhập tỉ lệ huê hồng: ", ' ');
                    strhuehong = sc.nextLine();
                    if (strhuehong.equals("") || strhuehong == null) {
//                        hueHong = ((TiepThi) found).getHueHong();
                        break;
                    } else {

                        if (kiem_tra(strhuehong)) {
                            hueHong = Double.parseDouble(strhuehong);
                            if (hueHong>0){
                                ((TiepThi) found).setHueHong(hueHong);
                                break;
                            }
                        } else {
                            System.out.printf("\n\n%50s ------------------------------------", ' ');
                            System.out.printf("\n%50s  Cần nhập đúng doanh số và huê hồng của nhân viên", ' ');
                            System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                            System.out.printf("\n%50s ------------------------------------\n", ' ');
                        }
                    }
                } while (true);
//                NhanVien nvTT = new TiepThi(msnv, tenNv, luong, doanhSo, hueHong);
                listnv.set(vitri, found);
                System.out.printf("\n%50s   <<Đã thay đổi>>", ' ');
            } else if (found instanceof TruongPhong) {
                String strtrachnhiem = "";
                double trachnhiem = 0;
                do {
                    System.out.printf("\n%50s Nhập lương trách nhiệm: ", ' ');
                    strtrachnhiem = sc.nextLine();
                    if (strtrachnhiem.equals("") || strtrachnhiem==null){
//                        trachnhiem = ((TruongPhong) found).getLuongTrachNhiem();
                        break;
                    }
                    if (kiem_tra(strtrachnhiem)) {
                        trachnhiem = Double.parseDouble(strtrachnhiem);
                        if (trachnhiem > 0) {
                            ((TruongPhong) found).setLuongTrachNhiem(trachnhiem);
                            break;
                        }
                    }
                    System.out.printf("\n\n%50s ------------------------------------", ' ');
                    System.out.printf("\n%50s  Cần nhập đúng lương trách nhiệm của nhân viên", ' ');
                    System.out.printf("\n%50s     Mời nhập lại! Xin cảm ơn", ' ');
                    System.out.printf("\n%50s ------------------------------------\n", ' ');
                } while (true);
//                NhanVien nvTP = new TruongPhong(msnv, tenNv, luong, trachnhiem);
                listnv.set(vitri, found);
                System.out.printf("\n%50s   <<Đã thay đổi>>", ' ');
            } else {
//                NhanVien nvHC = new NhanVien(msnv, tenNv, luong);
                listnv.set(vitri, found);
                System.out.printf("\n%50s   <<Đã thay đổi>>", ' ');
            }
        } else {
            System.out.printf("\n%50s Không tìm thấy mã nhân viên tương ứng", ' ');
        }
    }

    public void TimTheoLuong() {
        System.out.printf("\n%50s Nhập khoản lương muốn tìm: ", ' ');
        System.out.printf("\n%50s Từ: ", ' ');
        double Luongtu = sc.nextDouble();
        System.out.printf("\n%50s Đến: ", ' ');
        double Luongtden = sc.nextDouble();
        int temp = 0;
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        System.out.printf("\n%20s|%3s%-15s|%8s%-20s|%9s%-19s|%8s%-20s|%8s%-20s|%8s%-20s|", ' ', ' ', "Mã nhân viên", ' ', "Họ và tên", ' ', "Lương", ' ', "Thu Nhập", ' ', "Thuế Thu Nhập", ' ', "Tổng Thu Nhập");
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        for (NhanVien nv : listnv) {
            if (nv.getTongLuong() > Luongtu && nv.getTongLuong() < Luongtden) {
                nv.xuatThongTin();
                temp++;
            }
        }
        if (temp == 0) {
            System.out.printf("\n%50s Không tìm thấy số nhân viên tương ứng", ' ');
        }
    }

    public void sap_xep_ten() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getten().compareTo(o1.getten());
            }

        };
        Collections.sort(listnv, comp);
        xuat();
    }

    public void sap_xep_theo_thu_nhap() {
        Comparator<NhanVien> comp1 = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getTongLuong().compareTo(o1.getTongLuong());
            }

        };
        Collections.sort(listnv, comp1);
        xuat();
    }

    public void nam_nhan_vien_luong_cao() {
        Comparator<NhanVien> comp2 = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o2.getTongLuong().compareTo(o1.getTongLuong());
            }

        };
        int i = 0;
        Collections.sort(listnv, comp2);
        System.out.printf("\n%50s \tDanh sách 5 nhân viên có mức lương cao nhất\n", ' ');
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        System.out.printf("\n%20s|%3s%-15s|%8s%-20s|%9s%-19s|%8s%-20s|%8s%-20s|%8s%-20s|", ' ', ' ', "Mã nhân viên", ' ', "Họ và tên", ' ', "Lương", ' ', "Thu Nhập", ' ', "Thuế Thu Nhập", ' ', "Tổng Thu Nhập");
        System.out.printf("\n%20s---------------------------------------------------------------------------------------------------------------------------------------------------------------------", ' ');
        for (NhanVien nv : listnv) {
            nv.xuatThongTin();
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}
