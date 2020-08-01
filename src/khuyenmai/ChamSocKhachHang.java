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
public class ChamSocKhachHang {
    private List<TinKhuyenMai> list = new ArrayList<>();
    private List<IKhuyenMaiListener> listeners = new ArrayList<>();

    public ChamSocKhachHang() {
    }

    public List<TinKhuyenMai> getList() {
        return list;
    }
    
    public void themKhachHang(IKhuyenMaiListener ikml){
        if (!listeners.contains(ikml)) {
            listeners.add(ikml);
        }
    }
    
    public void themTinKhuyenMai(TinKhuyenMai khuyenMai){
        list.add(khuyenMai);
        for (IKhuyenMaiListener listener : listeners) {
            listener.nhanTinMoi(khuyenMai);
        }
    }
    
    public void capNhatTinKhuyenMai(int i, TinKhuyenMai khuyenMai){
        list.set(i, khuyenMai);
        for (IKhuyenMaiListener listener : listeners) {
            listener.capNhatTin(i, khuyenMai);
        }
    }
    
    public void capNhatTinKhuyenMai(String ma, TinKhuyenMai khuyenMai){
        int t;
        for (TinKhuyenMai km : list) {
            if(km.getMa().equals(ma)){
                khuyenMai.setMa(ma);
                t = list.indexOf(km);
                list.set(t, khuyenMai);
                for (IKhuyenMaiListener listener : listeners) {
                    listener.capNhatTin(t, khuyenMai);
                }
                break;
            }
        }
    }
    
    public static interface IKhuyenMaiListener{
        public void nhanTinMoi(TinKhuyenMai khuyenMai);
        public void capNhatTin(int i, TinKhuyenMai khuyenMai);
    }
}
