/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

/**
 *
 * @author Admin
 */
import DoiTuong.BaiDang;
import DoiTuong.DangKy_DichVu;
import DoiTuong.DanhGia;
import DoiTuong.DichVu;
import DoiTuong.GiaoDich;
import DoiTuong.LienKet;
import DoiTuong.NhaTro;
import DoiTuong.TaiKhoan;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connections {

    Connection con;
// chỉ cần khởi tạo là tự động liên kết

    public Connections() {
        System.out.println("1");
        consql("sa1", "123", 1433, "QLNT_NHOM5");
        System.out.println("2");
    }

    public Connection consql(String user, String pass, int port, String database) {
        String url = "jdbc:sqlserver://localhost:" + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("thành công");
            Statement st = con.createStatement();
        } catch (Exception e) {
            System.out.println(" LỖI DO KẾT NỐI SQL" + e);
            return null;
        }
        return (Connection) con;
    }
// Tạo 1 method để chạy kết quả các các lệnh tạo, cập nhật, xoá

    public void getResult(String sql) throws SQLException {
        int result = 0;
        try {
            Statement stmt = con.createStatement();
            result = stmt.executeUpdate(sql);
            if (result == 1) {
                System.out.println("Xử lí thành công");
                JOptionPane.showMessageDialog(null, "Xử lí thành công");
            }
        } catch (SQLException ex) {
            System.out.println("lỗi tại getResult" + ex);
        }
    }
// Tạo 1 method để chạy kết quả cho lệnh select
    // to do code here

    public TaiKhoan getTaiKhoan(String sql) throws SQLException {
        TaiKhoan acc = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet taikhoan = stmt.executeQuery(sql);
            while (taikhoan.next()) {
                String MaTk = taikhoan.getString("MaTK");
                String Username = taikhoan.getString("UserName");
                String Password = taikhoan.getString("Passwordd");
                int Sdt = taikhoan.getInt("SDT");
                String remember = taikhoan.getString("remember_pass");
                acc = new TaiKhoan(MaTk, Username, Password, Sdt,remember);
                System.out.println(acc);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return acc;
    }

    // to do code here
    public TaiKhoan getTaiKhoan_NguoiDung(String sql) throws SQLException {
        TaiKhoan acc = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet taikhoan = stmt.executeQuery(sql);
            while (taikhoan.next()) {
                String MaTk = taikhoan.getString("MaTK");
                String Username = taikhoan.getString("UserName");
                String Password = taikhoan.getString("Passwordd");
                int Sdt = taikhoan.getInt("SDT");
                String remember = taikhoan.getString("remember_pass");
                String TenNGD = taikhoan.getString("TenNgD");
                String DiaChi = taikhoan.getString("DiaChi");
                String NgaySinh = taikhoan.getString(String.valueOf("NgaySinh"));
                boolean gt = (taikhoan.getByte("GioiTinh") == 1) ? true : false;
                String Email = taikhoan.getString("Email");
                int CMND = taikhoan.getInt("CMND");
                String Hinh = taikhoan.getString("Hinh");
                acc = new TaiKhoan(MaTk, Username, Password, Sdt,remember, TenNGD, DiaChi, NgaySinh, gt, Email, CMND, Hinh);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return acc;
    }

    public NhaTro getNhaTro(String sql) throws SQLException {
        NhaTro acc = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet nhatro = stmt.executeQuery(sql);
            while (nhatro.next()) {
                String Mant = nhatro.getString("MaNT");
                String tennt = nhatro.getString("TenNT");
                String diachi = nhatro.getString("DiaChi");
                int dientich = nhatro.getInt("DienTich");
                String mota = nhatro.getString("MoTa");
                String MaLoai = nhatro.getString("MaLoai");
                double gia = nhatro.getDouble("Gia");
                String ma_nlh = nhatro.getString("MA_NLH");
                boolean trangthai = (nhatro.getByte("TrangThai") == 1) ? true : false;
                String Hinh = nhatro.getString("Hinh");
                acc = new NhaTro(Mant, tennt, diachi, dientich, mota, MaLoai, gia, ma_nlh, trangthai, Hinh);
                System.out.println(acc);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return acc;
    }

    public NhaTro getNhaTro_LoaiTro(String sql) throws SQLException {
        NhaTro acc = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet nhatro = stmt.executeQuery(sql);
            while (nhatro.next()) {
                String Mant = nhatro.getString("MaNT");
                String tennt = nhatro.getString("TenNT");
                String diachi = nhatro.getString("DiaChi");
                int dientich = nhatro.getInt("DienTich");
                String mota = nhatro.getString("MoTa");
                String MaLoai = nhatro.getString("NhaTro.MaLoai");
                double gia = nhatro.getDouble("Gia");
                String ma_nlh = nhatro.getString("MA_NLH");
                boolean trangthai = (nhatro.getByte("TrangThai") == 1) ? true : false;
                String Hinh = nhatro.getString("Hinh");
                String MaLoaiLoaiTro = nhatro.getString("LoaiNhaTro.MaLoai");
                String TenLoai = nhatro.getString("TenLoai");
                acc = new NhaTro(Mant, tennt, diachi, dientich, mota, MaLoai, gia, ma_nlh, trangthai, Hinh, MaLoaiLoaiTro, TenLoai);
                System.out.println(acc);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return acc;
    }

    public DichVu getDichVu(String sql) throws SQLException {
        DichVu dv = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet dichvu = stmt.executeQuery(sql);
            while (dichvu.next()) {
                System.out.println("3");
                String MaDV = dichvu.getString("MaDV");
                String tendv = dichvu.getString("TenDV");
                double phidv = dichvu.getDouble("PhiDV");
                String ngayPhatHanh = dichvu.getString("NgayPhatHanh");
                String hanketthuc = dichvu.getString("HanKetThuc");
                String tencti = dichvu.getString("TenCTy");
                String Email = dichvu.getString("Email");
                int sdt = dichvu.getInt("SDT");
                System.out.println("4");
                String web = dichvu.getString("Webstie");
                System.out.println("5");
                String diachi = dichvu.getString("DiaChi");
                String ghichu = dichvu.getString("GhiChu");
                dv = new DichVu(MaDV, tendv, phidv, ngayPhatHanh, hanketthuc, tencti, Email, sdt, web, diachi, ghichu);
                System.out.println(dv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại Connenctions.getDichVu : " + e);
        }
        return dv;
    }

    public DangKy_DichVu getDangKy_DichVu(String sql) throws SQLException {
        DichVu dv = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet dichvu = stmt.executeQuery(sql);
            while (dichvu.next()) {
                String MaTk = dichvu.getString("MaTK");
                String NgayDangKy = dichvu.getString("NgayDangKy");
                int thoihan = dichvu.getInt("ThoiHan");
                boolean trangthai = (dichvu.getByte("trangThaiDangKy") == 1 ? true : false);
                String MaDV = dichvu.getString("MaDV");
                String tendv = dichvu.getString("TenDV");
                double phidv = dichvu.getDouble("PhiDV");
                String ngayPhatHanh = dichvu.getString("NgayPhatHanh");
                String hanketthuc = dichvu.getString("HanKetThuc");
                String tencty = dichvu.getString("TenCTy");
                String Email = dichvu.getString("Email");
                int sdt = dichvu.getInt("SDT");
                String web = dichvu.getString("Website");
                String diachi = dichvu.getString("DiaChi");
                String ghichu = dichvu.getString("GhiChu");
                dv = new DangKy_DichVu(MaTk, NgayDangKy, thoihan, trangthai, MaDV, tendv, phidv, ngayPhatHanh, hanketthuc, tencty, Email, sdt, web, diachi, ghichu);
                System.out.println(dv);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return (DangKy_DichVu) dv;

    }

    public LienKet getLienKet_taiKhoan(String sql) throws SQLException {
        LienKet lienket = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet lk = stmt.executeQuery(sql);
            while (lk.next()) {
                String MaLk = lk.getString("MaLK");
                String MaTk = lk.getString("LienKetThe_Vi.MaTK");
                String Tennganhang = lk.getString("TenNganHang");
                int sothe = lk.getInt("SoThe");
                int sotk = lk.getInt("SoTK");
                boolean trangthai = (lk.getByte("TrangThai") == 1 ? true : false);
                double sodu = lk.getDouble("SoDu");
                String MaTk_tk = lk.getString("TaiKhoan.MaTK");
                String Username = lk.getString("UserName");
                String Password = lk.getString("Passwordd");
                int Sdt = lk.getInt("SDT");
                String remember = lk.getString("remember_pass");
                lienket = new LienKet(MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu, MaTk_tk, Username, Password, Sdt,remember);
                System.out.println(lienket);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return lienket;
    }

    public LienKet getLienKet(String sql) throws SQLException {
        LienKet lienket = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet lk = stmt.executeQuery(sql);
            while (lk.next()) {
                String MaLk = lk.getString("MaLK");
                String MaTk = lk.getString("LienKetThe_Vi.MaTK");
                String Tennganhang = lk.getString("TenNganHang");
                int sothe = lk.getInt("SoThe");
                int sotk = lk.getInt("SoTK");
                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
                double sodu = lk.getDouble("SoDu");
                lienket = new LienKet(MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu);
                System.out.println(lienket);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return lienket;
    }

    public GiaoDich getLienKet_GiaoDich(String sql) throws SQLException {
        LienKet giaodich = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet lk = stmt.executeQuery(sql);
            while (lk.next()) {
                String MaGD = lk.getString("MaGD");
                String TenGD = lk.getString("tenGD");
                int sotk_nguoinhan = lk.getInt("soTK_nguoinhan");
                String NoiDung = lk.getString("noiDung");
                String ThoiGian = String.valueOf(lk.getDate("thoigian"));
                double sotien = lk.getDouble("SoTien");
                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
                String MaLk = lk.getString("MaLK");
                String MaTk = lk.getString("LienKetThe_Vi.MaTK");
                String Tennganhang = lk.getString("TenNganHang");
                int sothe = lk.getInt("SoThe");
                int sotk = lk.getInt("SoTK");
                boolean trangthai_lkthe = (lk.getByte("TrangThai") == 1) ? true : false;
                double sodu = lk.getDouble("SoDu");
                giaodich = new GiaoDich(MaGD, TenGD, sotk_nguoinhan, NoiDung, ThoiGian, sotien, trangthai, MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu);
                System.out.println(giaodich);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return (GiaoDich) giaodich;
    }

    public DanhGia getDanhGia(String sql) throws SQLException {
        NhaTro dg = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet danhgia = stmt.executeQuery(sql);
            while (danhgia.next()) {
                String MaDanhGia = danhgia.getString("MADG");
                String Ma_NGD = danhgia.getString("MA_NGD");
                boolean like_dislike = (danhgia.getByte("like_dislike") == 1) ? true : false;
                String NoiDung = danhgia.getString("noiDung");
                String Mant = danhgia.getString("MaNT");
                String tennt = danhgia.getString("TenNT");
                String diachi = danhgia.getString("DiaChi");
                int dientich = danhgia.getInt("DienTich");
                String mota = danhgia.getString("MoTa");
                String MaLoai = danhgia.getString("MaLoai");
                double gia = danhgia.getDouble("Gia");
                String ma_nlh = danhgia.getString("MA_NLH");
                boolean trangthai = (danhgia.getByte("TrangThai") == 1) ? true : false;
                String Hinh = danhgia.getString("Hinh");
                dg = new DanhGia(MaDanhGia, Ma_NGD, like_dislike, NoiDung, Mant, tennt, diachi, dientich, mota, MaLoai, gia, ma_nlh, trangthai, Hinh);
                System.out.println(dg);
            }
        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return (DanhGia) dg;
    }

    public BaiDang getBaidang(String sql) throws SQLException {
        BaiDang bd = null;
        try {
            Statement stmt = con.createStatement();
            ResultSet baidang = stmt.executeQuery(sql);
            while (baidang.next()) {
                String MaTK = baidang.getString("MATK");
                String NoiDung = baidang.getString("NoiDung");
                String HinhAnh = baidang.getString("HinhAnh");
                String NgayDang = baidang.getString("NgayDang");
                boolean like_dislike = (baidang.getByte("like_dislike") == 1) ? true : false;
                String NoiDung_baiDang = baidang.getString("ND_BaiDang");
                bd = new BaiDang(MaTK, NoiDung, HinhAnh, NgayDang, like_dislike, NgayDang);
                System.out.println(bd);

            }

        } catch (Exception e) {
            System.out.println("Lỗi tại gettaiKhoan : " + e);
        }
        return bd;
    }

}
