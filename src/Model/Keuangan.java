/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kingt
 */
public class Keuangan {
    private double dpp_wajib;
    private double ukt;
    private double ukv;

    public Keuangan() {
    }

    public Keuangan(double dpp_wajib, double ukt, double ukv) {
        this.dpp_wajib = dpp_wajib;
        this.ukt = ukt;
        this.ukv = ukv;
    }

    public double getDpp_wajib() {
        return dpp_wajib;
    }

    public void setDpp_wajib(double dpp_wajib) {
        this.dpp_wajib = dpp_wajib;
    }

    public double getUkt() {
        return ukt;
    }

    public void setUkt(double ukt) {
        this.ukt = ukt;
    }

    public double getUkv() {
        return ukv;
    }

    public void setUkv(double ukv) {
        this.ukv = ukv;
    }
}
