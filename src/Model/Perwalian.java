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
public class Perwalian {

    private int nim;
    private int sks;
    private int mk;
    private Date approve_wali;

    public Perwalian() {
    }

    public Perwalian(int nim, int sks, int mk, Date approve_wali) {
        this.nim = nim;
        this.sks = sks;
        this.mk = mk;
        this.approve_wali = approve_wali;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public int getMk() {
        return mk;
    }

    public void setMk(int mk) {
        this.mk = mk;
    }

    public Date getApprove_wali() {
        return approve_wali;
    }

    public void tanggal_update(Date approve_wali) {
        this.approve_wali = approve_wali;
    }
}
