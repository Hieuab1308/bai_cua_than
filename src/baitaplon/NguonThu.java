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
public class NguonThu extends QuanLyThuChi implements Serializable{
    private String khoanThu;
    public NguonThu() {
    }

    public NguonThu(String date,double soTien,String khoanThu) {
        super(date, soTien);
        this.khoanThu = khoanThu;
    }

    public String getKhoanThu() {
        return khoanThu;
    }

    public void setKhoanThu(String khoanThu) {
        this.khoanThu = khoanThu;
    }

    @Override
    public String toString() {
        return "NguonThu{" + "khoanThu=" + khoanThu + '}';
    }
    
}
