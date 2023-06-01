/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author kingt
 */
public class Matakuliah {
    
    private String kode;
    private String matakuliah;
    private int sks;
    private String kelas;
    private String jenis;
    private String sisa;
    private String status_awal;
    private String bdatm;
    private String Approve_wali;
    private String hari;
    private String jam;

    public Matakuliah() {
    }

    public Matakuliah(String kode, String matakuliah, int sks, String kelas, String jenis, String sisa, String status_awal, String bdatm, String Approve_wali, String hari, String jam) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.sks = sks;
        this.kelas = kelas;
        this.jenis = jenis;
        this.sisa = sisa;
        this.status_awal = status_awal;
        this.bdatm = bdatm;
        this.Approve_wali = Approve_wali;
        this.hari = hari;
        this.jam = jam;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getSisa() {
        return sisa;
    }

    public void setSisa(String sisa) {
        this.sisa = sisa;
    }

    public String getStatus_awal() {
        return status_awal;
    }

    public void setStatus_awal(String status_awal) {
        this.status_awal = status_awal;
    }

    public String getBdatm() {
        return bdatm;
    }

    public void setBdatm(String bdatm) {
        this.bdatm = bdatm;
    }

    public String getApprove_wali() {
        return Approve_wali;
    }

    public void setApprove_wali(String Approve_wali) {
        this.Approve_wali = Approve_wali;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
