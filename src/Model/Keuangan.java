/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author kingt
 */
public class Keuangan {
    private double dpp_wajib;
    private double ukt;
    private double ukv;
    private Date TanggalJatuhTempoPembayaran;
    private Date TanggalJatuhTempoPerwalian;
    private int Telat_pembayaran;
    private int Telat_perwalian;
    private int totalDenda;

    public Keuangan() {
    }

    public Keuangan(double dpp_wajib, double ukt, double ukv, Date TanggalJatuhTempoPembayaran, Date TanggalJatuhTempoPerwalian, int Telat_pembayaran, int Telat_perwalian, int totalDenda) {
        this.dpp_wajib = dpp_wajib;
        this.ukt = ukt;
        this.ukv = ukv;
        this.TanggalJatuhTempoPembayaran = TanggalJatuhTempoPembayaran;
        this.TanggalJatuhTempoPerwalian = TanggalJatuhTempoPerwalian;
        this.Telat_pembayaran = Telat_pembayaran;
        this.Telat_perwalian = Telat_perwalian;
        this.totalDenda = totalDenda;
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

    public Date getTanggalJatuhTempoPembayaran() {
        return TanggalJatuhTempoPembayaran;
    }

    public void setTanggalJatuhTempoPembayaran(Date TanggalJatuhTempoPembayaran) {
        this.TanggalJatuhTempoPembayaran = TanggalJatuhTempoPembayaran;
    }

    public Date getTanggalJatuhTempoPerwalian() {
        return TanggalJatuhTempoPerwalian;
    }

    public void setTanggalJatuhTempoPerwalian(Date TanggalJatuhTempoPerwalian) {
        this.TanggalJatuhTempoPerwalian = TanggalJatuhTempoPerwalian;
    }

    public int getTelat_pembayaran() {
        return Telat_pembayaran;
    }

    public void setTelat_pembayaran(int Telat_pembayaran) {
        this.Telat_pembayaran = Telat_pembayaran;
    }

    public int getTelat_perwalian() {
        return Telat_perwalian;
    }

    public void setTelat_perwalian(int Telat_perwalian) {
        this.Telat_perwalian = Telat_perwalian;
    }

    public int getTotalDenda() {
        return totalDenda;
    }

    public void setTotalDenda(int totalDenda) {
        this.totalDenda = totalDenda;
    }
}
