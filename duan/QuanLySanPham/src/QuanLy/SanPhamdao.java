package QuanLy;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamdao extends QuanLyDao<SanPham,String> {

    public void insert(SanPham model) {
        String sql = "INSERT INTO sanpham (masp, tensp,dongia,loaisp) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql,
                model.getMasp(),
                model.getTensp(),
                model.getDongia(),
                model.getLoaisp()
        );
    }

    public void update(SanPham model) {
        String sql = "UPDATE sanpham SET  tensp=?, dongia=?, loaisp=? WHERE masp=?";
        XJdbc.update(sql,
                model.getMasp(),
                model.getTensp(),
                model.getDongia(),
                model.getLoaisp()
        );
    }

    public void delete(String MaCD) {
        String sql = "DELETE FROM sanpham WHERE masp=?";
        XJdbc.update(sql, MaCD);
    }

    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM sanpham";
        return selectBySql(sql);
    }

    public SanPham selectById(String macd) {
        String sql = "SELECT * FROM sanpham WHERE loaisp=?";
        List<SanPham> list = selectBySql(sql, macd);
        return list.size() > 0 ? list.get(0) : null;
    }

    protected List<SanPham> selectBySql(String sql,Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    SanPham entity = new SanPham();
                    entity.setMasp(rs.getString("masp"));
                    entity.setTensp(rs.getString("tensp"));
                    entity.setDongia(rs.getDouble("dongia"));
                    entity.setLoaisp(rs.getString("loaisp"));

                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

        private List<Object[]> getListOfArray(String sql, String[] cols, Object...args){
        try {
            List<Object[]> list=new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while(rs.next()){
                Object[] vals = new Object[cols.length];
                for(int i=0; i<cols.length; i++){
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
      public List<Object[]> getSL(){
        String sql = "EXEC SL";
        String[] cols = {"loaisp", "sl"};
        return this.getListOfArray(sql, cols);
    }
}
