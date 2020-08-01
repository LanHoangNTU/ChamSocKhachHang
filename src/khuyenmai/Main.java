/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuyenmai;

/**
 *
 * @author Lân
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChamSocKhachHang cskh = new ChamSocKhachHang();
        KhachHang kh = new KhachHang();
        kh.dangKy(cskh);
        
        TinKhuyenMai t1 = new TinKhuyenMai("1", "Dell", 100000, "2020-7-7", "2020-7-10");
        TinKhuyenMai t2 = new TinKhuyenMai("2", "Asus", 200000, "2020-7-7", "2020-7-10");
        TinKhuyenMai t3 = new TinKhuyenMai("3", "Mac", 300000, "2020-7-7", "2020-7-10");
        
        cskh.themTinKhuyenMai(t1);
        cskh.themTinKhuyenMai(t2);
        cskh.themTinKhuyenMai(t3);
        
        t1.setKetThuc("2020-7-15");
        cskh.capNhatTinKhuyenMai("2", t1);
    }
    
}
