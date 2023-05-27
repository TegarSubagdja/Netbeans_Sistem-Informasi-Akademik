/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author kingt
 */
public class Mahasiswa {

    private int nim;
    private String nama;
    private String status;
    private String dosen_wali;
    private String semester_aktif;
    private String batas_studi;
    private String email;
    private String nomor;
    private String prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(int nim, String nama, String status, String dosen_wali, String semester_aktif, String batas_studi, String email, String nomor, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.status = status;
        this.dosen_wali = dosen_wali;
        this.semester_aktif = semester_aktif;
        this.batas_studi = batas_studi;
        this.email = email;
        this.nomor = nomor;
        this.prodi = prodi;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDosen_wali() {
        return dosen_wali;
    }

    public void setDosen_wali(String dosen_wali) {
        this.dosen_wali = dosen_wali;
    }

    public String getSemester_aktif() {
        return semester_aktif;
    }

    public void setSemester_aktif(String semester_aktif) {
        this.semester_aktif = semester_aktif;
    }

    public String getBatas_studi() {
        return batas_studi;
    }

    public void setBatas_studi(String batas_studi) {
        this.batas_studi = batas_studi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
