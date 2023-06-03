/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Akun;
import Model.ConnectionManager;
import Model.Mahasiswa;
import Model.Matakuliah;
import Model.Nilai;
import View.Index;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kingt
 */
public class ControllerAdmin {

    private Akun acc;
    private int nim;

    public ControllerAdmin(int acc) {
        this.nim = acc;
    }

    public ControllerAdmin(Akun acc) {
        this.acc = acc;
    }

    public List<Mahasiswa> getMahasiswa() {
        String query = "SELECT * FROM mahasiswa";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        List<Mahasiswa> listm = new ArrayList<>();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getInt("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setStatus(rs.getString("status"));
                mhs.setDosen_wali(rs.getString("dosen_wali"));
                mhs.setSemester_aktif(rs.getString("semester_aktif"));
                mhs.setBatas_studi(rs.getString("batas_studi"));
                mhs.setEmail(rs.getString("email"));
                mhs.setNomor(rs.getString("nomor"));
                mhs.setProdi(rs.getString("prodi"));
                listm.add(mhs);
            }
        } catch (Exception ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listm;
    }

    public void updateMahasiswa(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nim='" + mhs.getNim() + "', nama='" + mhs.getNama()
                + "', status='" + mhs.getStatus() + "', dosen_wali='" + mhs.getDosen_wali()
                + "', semester_aktif='" + mhs.getSemester_aktif() + "', batas_studi='" + mhs.getBatas_studi()
                + "', email='" + mhs.getEmail() + "', nomor='" + mhs.getNomor() + "', prodi='" + mhs.getProdi()
                + "' WHERE nim=" + nim;
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nim, nama, status, dosen_wali, semester_aktif, batas_studi, email, nomor, prodi) VALUES ('"
                + mhs.getNim() + "', '" + mhs.getNama() + "', '" + mhs.getStatus() + "', '" + mhs.getDosen_wali() + "', '"
                + mhs.getSemester_aktif() + "', '" + mhs.getBatas_studi() + "', '" + mhs.getEmail() + "', '" + mhs.getNomor()
                + "', '" + mhs.getProdi() + "')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data mahasiswa!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        conMan.logOff();
    }

    public void hapusMahasiswa(Mahasiswa mhs) {
        String query = "DELETE FROM mahasiswa WHERE nim=" + mhs.getNim();
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data mahasiswa berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus data mahasiswa!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        conMan.logOff();
    }

    public List<Matakuliah> getMatakuliah() {
        String query = "SELECT * FROM Matakuliah";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        List<Matakuliah> listMk = new ArrayList<>();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Matakuliah m = new Matakuliah(); // Memindahkan inisialisasi objek Nilai ke dalam perulangan while
                m.setKode(rs.getString("kode"));
                m.setMatakuliah(rs.getString("matakuliah"));
                m.setSks(rs.getInt("sks"));
                m.setKelas(rs.getString("kelas"));
                m.setJenis(rs.getString("jenis"));
                m.setSisa(rs.getString("sisa"));
                m.setStatus_awal(rs.getString("status_awal"));
                m.setBdatm(rs.getString("bdatm"));
                m.setApprove_wali(rs.getString("Approve_wali"));
                m.setHari(rs.getString("hari"));
                m.setJam(rs.getString("jam"));
                listMk.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return listMk;
    }

    public void tambahMatakuliah(Matakuliah mk) {
        String query = "INSERT INTO matakuliah (kode, matakuliah, sks, kelas, jenis, sisa, hari, jam) VALUES ('"
                + mk.getKode() + "', '" + mk.getMatakuliah() + "', " + mk.getSks() + ", '" + mk.getKelas() + "', '"
                + mk.getJenis() + "', '" + mk.getSisa() + "', '" + mk.getHari() + "', '" + mk.getJam() + "')";

        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data matakuliah berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menambahkan data matakuliah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        conMan.logOff();
    }

    public void hapusMatakuliah(Matakuliah mk) {
        String query = "DELETE FROM matakuliah WHERE kode='" + mk.getKode() + "'";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Matakuliah berhasil dihapus!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menghapus matakuliah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        conMan.logOff();
    }

    public void updateMatakuliah(Matakuliah mk) {
        String query = "UPDATE matakuliah SET matakuliah='" + mk.getMatakuliah() + "', sks=" + mk.getSks() + ", kelas='" + mk.getKelas()
                + "', jenis='" + mk.getJenis() + "', sisa='" + mk.getSisa() + "', hari='" + mk.getHari() + "', jam='" + mk.getJam() + "' WHERE kode='" + mk.getKode() + "'";

        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data matakuliah berhasil diperbarui!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui data matakuliah!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        conMan.logOff();
    }
}
