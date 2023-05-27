/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.ConnectionManager;
import Model.Keuangan;
import Model.Mahasiswa;
import Model.Nilai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kingt
 */
public class ControllerMahasiswa {

    private int nim;

    public ControllerMahasiswa(int nim) {
        this.nim = nim;
    }

    public Mahasiswa getMhs() {
        String query = "SELECT * FROM mahasiswa WHERE nim='" + nim + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        Mahasiswa mhs = new Mahasiswa();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                mhs.setNim(rs.getInt("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setStatus(rs.getString("status"));
                mhs.setDosen_wali(rs.getString("dosen_wali"));
                mhs.setSemester_aktif(rs.getString("semester_aktif"));
                mhs.setBatas_studi(rs.getString("batas_studi"));
                mhs.setEmail(rs.getString("email"));
                mhs.setNomor(rs.getString("nomor"));
                mhs.setProdi(rs.getString("prodi"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return mhs;
    }

    public List<Nilai> getNilai() {
        String query = "SELECT * FROM nilai_mhs WHERE nim='" + nim + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        List<Nilai> listn = new ArrayList<>();

        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                Nilai n = new Nilai(); // Memindahkan inisialisasi objek Nilai ke dalam perulangan while
                n.setId(rs.getInt("id"));
                n.setKode(rs.getString("kode"));
                n.setMataKuliah(rs.getString("matakuliah"));
                n.setSks(rs.getString("sks"));
                n.setSemester(rs.getString("semester"));
                n.setNilai(rs.getString("nilai"));
                n.setBobot(rs.getString("bobot"));
                n.setNk(rs.getString("nk"));
                listn.add(n);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

        conMan.logOff();
        return listn;

    }

    public Keuangan getKeuangan() {
        String query = "SELECT * FROM keuangan_mhs WHERE nim='" + nim + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        Keuangan ku = new Keuangan();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                ku.setDpp_wajib(rs.getInt("dpp_wajib"));
                ku.setUkt(rs.getInt("ukt"));
                ku.setUkv(rs.getInt("ukv"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return ku;
    }

    public double getIpk() {
        double ipk = 0.0;
        int totalSks = 0;
        double totalNilaiSks = 0.0;
        String query = "SELECT * FROM nilai_mhs WHERE nim='" + nim + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                double bobot = rs.getDouble("bobot");
                double sks = rs.getInt("sks");
                totalNilaiSks += bobot * sks;
                totalSks += sks;
            }
            if (totalSks > 0) {
                ipk = totalNilaiSks / totalSks;
            }
        } catch (Exception e) {
        }
        System.out.println(ipk);
        return ipk;
    }

}
