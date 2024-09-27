/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitaplon;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class NguonChi extends QuanLyThuChi implements Serializable{
    private String khoanChi;

    public NguonChi() {
    }

    public NguonChi(String date, double soTien,String khoanChi) {
        super(date, soTien);
        this.khoanChi = khoanChi;
    }

    public String getKhoanChi() {
        return khoanChi;
    }

    public void setKhoanChi(String khoanChi) {
        this.khoanChi = khoanChi;
    }

    @Override
    public String toString() {
        return "NguonChi{" + "khoanChi=" + khoanChi + '}';
    }
    
    
}
