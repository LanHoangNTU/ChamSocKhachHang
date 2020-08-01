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
public class TinKhuyenMai {
    private String ma;
    private String ten;
    private int giaBan;
    private String batDau;
    private String ketThuc;

    public TinKhuyenMai(String ma, String ten, int giaBan, String batDau, String ketThuc) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getBatDau() {
        return batDau;
    }

    public void setBatDau(String batDau) {
        this.batDau = batDau;
    }

    public String getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(String ketThuc) {
        this.ketThuc = ketThuc;
    }

    @Override
    public String toString() {
        return "TinKhuyenMai{" + "ma=" + ma + ", ten=" + ten + ", giaBan=" + giaBan + ", batDau=" + batDau + ", ketThuc=" + ketThuc + '}';
    }
}
