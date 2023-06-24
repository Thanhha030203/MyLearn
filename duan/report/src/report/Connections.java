 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

/**
 *
 * @author Admin
 */


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Connections {

    Connection con;
// chỉ cần khởi tạo là tự động liên kết

    public Connections() {
       
    }

    public Connection consql(String user, String pass, int port, String database) {
        String url = "jdbc:sqlserver:// localhost : " + port + "; databaseName = " + database + "; encrypt = true; trustServerCertificate= true;";

        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
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

//    public void getResult(String sql) throws SQLException {
//        int result = 0;
//        try {
//            Statement stmt = con.createStatement();
//            result = stmt.executeUpdate(sql);
//            if (result == 1) {
//                System.out.println("Xử lí thành công");
//            }
//        } catch (SQLException ex) {
//            System.out.println("lỗi tại getResult " + ex);
//        }
//    }
//// Tạo 1 method để chạy kết quả cho lệnh select
//    // to do code here
//
//    public TaiKhoan getTaiKhoan(String sql) throws SQLException {
//        TaiKhoan acc = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet taikhoan = stmt.executeQuery(sql);
//            while (taikhoan.next()) {
//                String MaTk = taikhoan.getString("MaTK");
//                String Username = taikhoan.getString("UserName");
//                String Password = taikhoan.getString("Passwordd");
//                int Sdt = taikhoan.getInt("SDT");
//                String remember = taikhoan.getString("remember_pass");
//                acc = new TaiKhoan(MaTk, Username, Password, Sdt, remember);
//                System.out.println(acc);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return acc;
//    }
//
//    // to do code here
//    public TaiKhoan getTaiKhoan_NguoiDung(String sql) throws SQLException {
//        TaiKhoan acc = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet taikhoan = stmt.executeQuery(sql);
//            while (taikhoan.next()) {
//                String MaTk = taikhoan.getString("MaTK");
//                String Username = taikhoan.getString("UserName");
//                String Password = taikhoan.getString("Passwordd");
//                int Sdt = taikhoan.getInt("SDT");
//                String remember = taikhoan.getString("remember_pass");
//                String TenNGD = taikhoan.getString("TenNgD");
//                String DiaChi = taikhoan.getString("DiaChi");
//                String NgaySinh = taikhoan.getString(String.valueOf("NgaySinh"));
//                boolean gt = (taikhoan.getByte("GioiTinh") == 1) ? true : false;
//                String Email = taikhoan.getString("Email");
//                int CMND = taikhoan.getInt("CMND");
//                String Hinh = taikhoan.getString("Hinh");
//                acc = new TaiKhoan(MaTk, Username, Password, Sdt, remember, TenNGD, DiaChi, NgaySinh, gt, Email, CMND, Hinh);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return acc;
//    }
//
//    public NhaTro getNhaTro(String sql) throws SQLException {
//        NhaTro acc = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet nhatro = stmt.executeQuery(sql);
//            while (nhatro.next()) {
//                String Mant = nhatro.getString("MaNT");
//                String tennt = nhatro.getString("TenNT");
//                String diachi = nhatro.getString("DiaChi");
//                int dientich = nhatro.getInt("DienTich");
//                String mota = nhatro.getString("MoTa");
//                String MaLoai = nhatro.getString("MaLoai");
//                double gia = nhatro.getDouble("Gia");
//                String ma_nlh = nhatro.getString("MA_NLH");
//                boolean trangthai = (nhatro.getByte("TrangThai") == 1) ? true : false;
//                String Hinh = nhatro.getString("Hinh");
//                acc = new NhaTro(Mant, tennt, diachi, dientich, mota, MaLoai, gia, ma_nlh, trangthai, Hinh);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return acc;
//    }
//
//    public NhaTro getNhaTro_LoaiTro(String sql) throws SQLException {
//        NhaTro acc = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet nhatro = stmt.executeQuery(sql);
//            while (nhatro.next()) {
//                String Mant = nhatro.getString("MaNT");
//                String tennt = nhatro.getString("TenNT");
//                String diachi = nhatro.getString("DiaChi");
//                int dientich = nhatro.getInt("DienTich");
//                String mota = nhatro.getString("MoTa");
//                String MaLoai = nhatro.getString("MaLoai");
//                double gia = nhatro.getDouble("Gia");
//                String manlh = nhatro.getString("MA_NLH");
//                boolean trangthai = (nhatro.getByte("TrangThai") == 1) ? true : false;
//                String Hinh = nhatro.getString("Hinh");
//                String MaLoaiLoaiTro = nhatro.getString("MaLoai");
//                acc = new NhaTro(Mant, tennt, diachi, dientich, mota, MaLoai, gia, manlh, trangthai, Hinh, MaLoaiLoaiTro);
//                System.out.println(acc);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return acc;
//    }
//    public LoaiNhaTro getLoaiNhaTro(String sql){ 
//        LoaiNhaTro lnt = null;
//         try {
//            Statement stmt = con.createStatement();
//            ResultSet lntt = stmt.executeQuery(sql);
//            while(lntt.next()){ 
//                String MaLoai = lntt.getString("MaLoai");
//                String TenLoai = lntt.getString("TenLoai");
//                lnt = new LoaiNhaTro(MaLoai, TenLoai);
//            }
//         }catch(Exception e){ 
//             
//         }
//        return lnt;
//    }
//
//    public List<NhaTro> getNhaTro_LoaiTro1(String sql) throws SQLException {
//        List<NhaTro> list = new ArrayList<NhaTro>();
//        NhaTro acc = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet nhatro = stmt.executeQuery(sql);
//            while (nhatro.next()) {
//                String Mant = nhatro.getString("MaNT");
//                String tennt = nhatro.getString("TenNT");
//                String diachi = nhatro.getString("DiaChi");
//                int dientich = nhatro.getInt("DienTich");
//                String mota = nhatro.getString("MoTa");
//                String MaLoai = nhatro.getString("MaLoai");
//                String TenLoai = nhatro.getString("TenLoai");
//                double gia = nhatro.getDouble("Gia");
//                String manlh = nhatro.getString("MA_NLH");
//                boolean trangthai = (nhatro.getByte("TrangThai") == 1) ? true : false;
//                String Hinh = nhatro.getString("Hinh");
//                String MaLoaiLoaiTro = nhatro.getString("MaLoai");
//                acc = new NhaTro(Mant, tennt, diachi, dientich, mota, MaLoai, gia, manlh, trangthai, Hinh, MaLoaiLoaiTro,TenLoai);
//                list.add(acc);
//                System.out.println(acc);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return list;
//    }
//
//    public DichVu getDichVu(String sql) throws SQLException {
//        DichVu dv = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet dichvu = stmt.executeQuery(sql);
//            while (dichvu.next()) {
//                String MaDV = dichvu.getString("MaDV");
//                String tendv = dichvu.getString("TenDV");
//                double phidv = dichvu.getDouble("PhiDV");
//                String ngayPhatHanh = dichvu.getString("NgayPhatHanh");
//                String hanketthuc = dichvu.getString("HanKetThuc");
//                String tencti = dichvu.getString("TenCTy");
//                String Email = dichvu.getString("Email");
//                int sdt = dichvu.getInt("SDT");
//                String web = dichvu.getString("Webstie");
//                String zalo = dichvu.getString("Zalo");
//                String diachi = dichvu.getString("DiaChi");
//                String ghichu = dichvu.getString("GhiChu");
//                dv = new DichVu(MaDV, tendv, phidv, ngayPhatHanh, hanketthuc, tencti, Email, sdt, web,zalo, diachi, ghichu);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại Connenctions.getDichVu : " + e);
//        }
//        return dv;
//    }
//
//    public DangKy_DichVu getDangKy_DichVu(String sql) throws SQLException {
//        DichVu dv = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet dichvu = stmt.executeQuery(sql);
//            while (dichvu.next()) {
//                String MaTk = dichvu.getString("MaTK");
//                String NgayDangKy = dichvu.getString("NgayDangKy");
//                boolean trangthaithanhtoan = (dichvu.getByte("TrangThaiThanhToan") == 1 ? true : false);
//                boolean trangthai = (dichvu.getByte("trangThaiDangKy") == 1 ? true : false);
//                String MaDV = dichvu.getString("MaDV");
//                String tendv = dichvu.getString("TenDV");
//                double phidv = dichvu.getDouble("PhiDV");
//                String ngayPhatHanh = dichvu.getString("NgayPhatHanh");
//                String hanketthuc = dichvu.getString("HanKetThuc");
//                String tencty = dichvu.getString("TenCTy");
//                String Email = dichvu.getString("Email");
//                int sdt = dichvu.getInt("SDT");
//                String web = dichvu.getString("Webstie");
//                String zalo = dichvu.getString("Zalo");
//                String diachi = dichvu.getString("DiaChi");
//                String ghichu = dichvu.getString("GhiChu");
//                dv = new DangKy_DichVu(MaTk, NgayDangKy, 0, trangthai, trangthaithanhtoan, MaDV, tendv, phidv, ngayPhatHanh, hanketthuc, tencty, Email, sdt, web,zalo, diachi, ghichu);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return (DangKy_DichVu) dv;
//
//    }
//
//        public List<DangKy_DichVu> getDangKy_DichVus(String sql) throws SQLException {
//        DichVu dv = null;
//        List<DangKy_DichVu> list = new ArrayList<DangKy_DichVu>();
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet dichvu = stmt.executeQuery(sql);
//            while (dichvu.next()) {
//                String MaTk = dichvu.getString("MaTK");
//                String NgayDangKy = dichvu.getString("NgayDangKy");
//                boolean trangthaithanhtoan = (dichvu.getByte("TrangThaiThanhToan") == 1 ? true : false);
//                boolean trangthai = (dichvu.getByte("trangThaiDangKy") == 1 ? true : false);
//                String MaDV = dichvu.getString("MaDV");
//                String tendv = dichvu.getString("TenDV");
//                double phidv = dichvu.getDouble("PhiDV");
//                String ngayPhatHanh = dichvu.getString("NgayPhatHanh");
//                String hanketthuc = dichvu.getString("HanKetThuc");
//                String tencty = dichvu.getString("TenCTy");
//                String Email = dichvu.getString("Email");
//                int sdt = dichvu.getInt("SDT");
//                String web = dichvu.getString("Webstie");
//                String zalo = dichvu.getString("Zalo");
//                String diachi = dichvu.getString("DiaChi");
//                String ghichu = dichvu.getString("GhiChu");
//                dv = new DangKy_DichVu(MaTk, NgayDangKy, 0, trangthai, trangthaithanhtoan, MaDV, tendv, phidv, ngayPhatHanh, hanketthuc, tencty, Email, sdt, web,zalo, diachi, ghichu);
//                list.add((DangKy_DichVu) dv);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return list;
//
//    }
//    public LienKet getLienKet_taiKhoan(String sql) throws SQLException {
//        LienKet lienket = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet lk = stmt.executeQuery(sql);
//            while (lk.next()) {
//                String MaLk = lk.getString("MaLK");
//                String MaTk = lk.getString("MaTK");
//                String Tennganhang = lk.getString("TenNganHang");
//                int sothe = lk.getInt("SoThe");
//                int sotk = lk.getInt("SoTK");
//                boolean trangthai = (lk.getByte("TrangThai") == 1 ? true : false);
//                double sodu = lk.getDouble("SoDu");
//                String MaTk_tk = lk.getString("TaiKhoan.MaTK");
//                String Username = lk.getString("UserName");
//                String Password = lk.getString("Passwordd");
//                int Sdt = lk.getInt("SDT");
//                String remember = lk.getString("remember_pass");
//                lienket = new LienKet(MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu, MaTk_tk, Username, Password, Sdt, remember);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return lienket;
//    }
//
//    public LienKet getLienKet(String sql) throws SQLException {
//        LienKet lienket = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet lk = stmt.executeQuery(sql);
//            while (lk.next()) {
//                String MaLk = lk.getString("MaLK");
//                String MaTk = lk.getString("MaTK");
//                String Tennganhang = lk.getString("TenNganHang");
//                int sothe = lk.getInt("SoThe");
//                int sotk = lk.getInt("SoTK");
//                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
//                double sodu = lk.getDouble("SoDu");
//                lienket = new LienKet(MaLk, MaTk, Tennganhang, sothe, sotk, sodu);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return lienket;
//    }
//
//    public List<LienKet> getLienKets(String sql) throws SQLException {
//        LienKet lienket = null;
//        List<LienKet> list = new ArrayList<LienKet>();
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet lk = stmt.executeQuery(sql);
//            while (lk.next()) {
//                String MaLk = lk.getString("MaLK");
//                String MaTk = lk.getString("MaTK");
//                String Tennganhang = lk.getString("TenNganHang");
//                int sothe = lk.getInt("SoThe");
//                int sotk = lk.getInt("SoTK");
//                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
//                double sodu = lk.getDouble("SoDu");
//                lienket = new LienKet(MaLk, MaTk, Tennganhang, sothe, sotk, sodu);
//                list.add(lienket);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại getLienKets : " + e);
//        }
//        return list;
//    }
//
//    public GiaoDich getLienKet_GiaoDich(String sql) throws SQLException {
//        LienKet giaodich = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet lk = stmt.executeQuery(sql);
//            while (lk.next()) {
//                String MaGD = lk.getString("MaGD");
//                String TenGD = lk.getString("tenGD");
//                int sotk_nguoinhan = lk.getInt("soTK_nguoinhan");
//                String NoiDung = lk.getString("noiDung");
//                String ThoiGian = String.valueOf(lk.getDate("thoigian"));
//                double sotien = lk.getDouble("SoTien");
//                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
//                String MaLk = lk.getString("MaLK");
//                String MaTk = lk.getString("MaTK");
//                String Tennganhang = lk.getString("TenNganHang");
//                int sothe = lk.getInt("SoThe");
//                int sotk = lk.getInt("SoTK");
//                boolean trangthai_lkthe = (lk.getByte("TrangThai") == 1) ? true : false;
//                double sodu = lk.getDouble("SoDu");
//                giaodich = new GiaoDich(MaGD, TenGD, sotk_nguoinhan, NoiDung, ThoiGian, sotien, trangthai, MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại getLienKet_taiKhoan : " + e);
//        }
//        return (GiaoDich) giaodich;
//    }
//     public List<GiaoDich> getLienKet_GiaoDichs(String sql) throws SQLException {
//        LienKet giaodich = null;
//        List<GiaoDich> list = new ArrayList<GiaoDich>();
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet lk = stmt.executeQuery(sql);
//            while (lk.next()) {
//                String MaGD = lk.getString("MaGD");
//                String TenGD = lk.getString("tenGD");
//                int sotk_nguoinhan = lk.getInt("soTK_nguoinhan");
//                String NoiDung = lk.getString("noiDung");
//                String ThoiGian = String.valueOf(lk.getDate("thoigian"));
//                double sotien = lk.getDouble("SoTien");
//                boolean trangthai = (lk.getByte("TrangThai") == 1) ? true : false;
//                String MaLk = lk.getString("MaLK");
//                String MaTk = lk.getString("MaTK");
//                String Tennganhang = lk.getString("TenNganHang");
//                int sothe = lk.getInt("SoThe");
//                int sotk = lk.getInt("SoTK");
//                boolean trangthai_lkthe = (lk.getByte("TrangThai") == 1) ? true : false;
//                double sodu = lk.getDouble("SoDu");
//                giaodich = new GiaoDich(MaGD, TenGD, sotk_nguoinhan, NoiDung, ThoiGian, sotien, trangthai, MaLk, MaTk, Tennganhang, sothe, sotk, trangthai, sodu);
//                list.add((GiaoDich) giaodich);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại getLienKet_taiKhoan : " + e);
//        }
//        return (List<GiaoDich>) (GiaoDich) list;
//    }
//
//    public DanhGia getDanhGia(String sql) throws SQLException {
//        NhaTro dg = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet danhgia = stmt.executeQuery(sql);
//            while (danhgia.next()) {
//                String MaDanhGia = danhgia.getString("MADG");
//                String Ma_NGD = danhgia.getString("MA_NGD");
//                boolean like_dislike = (danhgia.getByte("like_dislike") == 1) ? true : false;
//                String NoiDung = danhgia.getString("noiDung");
//                String Mant = danhgia.getString("MaNT");
//                String tennt = danhgia.getString("TenNT");
//                String diachi = danhgia.getString("DiaChi");
//                int dientich = danhgia.getInt("DienTich");
//                String mota = danhgia.getString("MoTa");
//                String MaLoai = danhgia.getString("MaLoai");
//                double gia = danhgia.getDouble("Gia");
//                String ma_nlh = danhgia.getString("MA_NLH");
//                boolean trangthai = (danhgia.getByte("TrangThai") == 1) ? true : false;
//                String Hinh = danhgia.getString("Hinh");
//                dg = new DanhGia(MaDanhGia, Ma_NGD, like_dislike, NoiDung, Mant, tennt, diachi, dientich, mota, MaLoai, gia, ma_nlh, trangthai, Hinh);
//            }
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return (DanhGia) dg;
//    }
//
//    public BaiDang getBaidang(String sql) throws SQLException {
//        BaiDang bd = null;
//        try {
//            Statement stmt = con.createStatement();
//            ResultSet baidang = stmt.executeQuery(sql);
//            while (baidang.next()) {
//                String MaTK = baidang.getString("MATK");
//                String NoiDung = baidang.getString("NoiDung");
//                String HinhAnh = baidang.getString("HinhAnh");
//                String NgayDang = baidang.getString("NgayDang");
//                boolean like_dislike = (baidang.getByte("like_dislike") == 1) ? true : false;
//                String NoiDung_baiDang = baidang.getString("ND_BaiDang");
//                bd = new BaiDang(MaTK, NoiDung, HinhAnh, NgayDang, like_dislike, NgayDang);
//
//            }
//
//        } catch (Exception e) {
//            System.out.println("Lỗi tại gettaiKhoan : " + e);
//        }
//        return bd;
//    }
//
//}
}
