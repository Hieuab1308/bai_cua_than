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
public class QuanLyThuChi implements Serializable{
    private String date;
    private double soTien;
    private String tenKhoan;
    public QuanLyThuChi() {
    }

    public QuanLyThuChi(String date,String tenKhoan,double soTien) {
        this.date = date;
        this.tenKhoan = tenKhoan;
        this.soTien = soTien;
    }

    public QuanLyThuChi(String date, double soTien) {
        this.date = date;
        this.soTien = soTien;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getTenKhoan() {
        return tenKhoan;
    }

    public void setTenKhoan(String tenKhoan) {
        this.tenKhoan = tenKhoan;
    }

    @Override
    public String toString() {
        return "QuanLyThuChi{" + "date=" + date + ", soTien=" + soTien + ", tenKhoan=" + tenKhoan + '}';
    }
    
    
    
}
