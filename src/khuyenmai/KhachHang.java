/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khuyenmai;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lân
 */
public class KhachHang implements ChamSocKhachHang.IKhuyenMaiListener{
    private List<TinKhuyenMai> list = new ArrayList<>();

    public KhachHang() {
    }
    
    public void dangKy(ChamSocKhachHang cskh){
        cskh.themKhachHang(this);
        list.addAll(cskh.getList());
    }

    @Override
    public void nhanTinMoi(TinKhuyenMai khuyenMai) {
        list.add(khuyenMai);
        System.out.println("Tin khuyen mai moi: " + khuyenMai.toString());
    }

    @Override
    public void capNhatTin(int i, TinKhuyenMai khuyenMai) {
        list.set(i, khuyenMai);
        System.out.println("Cap nhat tin khuyen mai(" + i + "): " + khuyenMai.toString());
    }
    
}
