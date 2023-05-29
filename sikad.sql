-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.24-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for sikad
CREATE DATABASE IF NOT EXISTS `sikad` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `sikad`;

-- Dumping structure for table sikad.keuangan_mhs
CREATE TABLE IF NOT EXISTS `keuangan_mhs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nim` int(11) DEFAULT NULL,
  `dpp_wajib` int(11) DEFAULT NULL,
  `ukt` int(11) DEFAULT NULL,
  `ukv` int(11) DEFAULT NULL,
  `tanggal_jatuh_tempo_pembayaran` date DEFAULT NULL,
  `tanggal_jatuh_tempo_perwalian` date DEFAULT NULL,
  `lunas` enum('1','0') DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `nim` (`nim`) USING BTREE,
  CONSTRAINT `keuangan` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table sikad.keuangan_mhs: ~0 rows (approximately)
INSERT INTO `keuangan_mhs` (`id`, `nim`, `dpp_wajib`, `ukt`, `ukv`, `tanggal_jatuh_tempo_pembayaran`, `tanggal_jatuh_tempo_perwalian`, `lunas`) VALUES
	(1, 152021169, 0, 2300000, 4800000, '2023-05-29', '2023-05-29', '1');

-- Dumping structure for table sikad.login_mhs
CREATE TABLE IF NOT EXISTS `login_mhs` (
  `nim` int(11) NOT NULL,
  `username` varchar(50) NOT NULL DEFAULT '0',
  `password` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`nim`),
  CONSTRAINT `login` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table sikad.login_mhs: ~1 rows (approximately)
INSERT INTO `login_mhs` (`nim`, `username`, `password`) VALUES
	(152021169, 'tegar', '123');

-- Dumping structure for table sikad.mahasiswa
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` int(11) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `dosen_wali` varchar(50) DEFAULT NULL,
  `semester_aktif` varchar(50) DEFAULT NULL,
  `batas_studi` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nomor` varchar(50) DEFAULT NULL,
  `prodi` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table sikad.mahasiswa: ~1 rows (approximately)
INSERT INTO `mahasiswa` (`nim`, `nama`, `status`, `dosen_wali`, `semester_aktif`, `batas_studi`, `email`, `nomor`, `prodi`) VALUES
	(152021169, 'Tegar Subagdja', 'Aktif', 'Jasman Pardede', '2023/2', '2025', 'kingtegar1510@gmail.com', '082320315060', 'Informatika');

-- Dumping structure for table sikad.nilai_mhs
CREATE TABLE IF NOT EXISTS `nilai_mhs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nim` int(11) DEFAULT NULL,
  `kode` varchar(50) DEFAULT NULL,
  `matakuliah` varchar(50) DEFAULT NULL,
  `sks` varchar(50) DEFAULT NULL,
  `semester` varchar(50) DEFAULT NULL,
  `nilai` varchar(50) DEFAULT NULL,
  `bobot` varchar(50) DEFAULT NULL,
  `nk` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `nim` (`nim`),
  CONSTRAINT `nilai` FOREIGN KEY (`nim`) REFERENCES `mahasiswa` (`nim`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table sikad.nilai_mhs: ~17 rows (approximately)
INSERT INTO `nilai_mhs` (`id`, `nim`, `kode`, `matakuliah`, `sks`, `semester`, `nilai`, `bobot`, `nk`) VALUES
	(47, 152021169, 'IFA-201', 'ALJABAR LINEAR', '3', '2021/1', 'A', '4.00', '12.00'),
	(48, 152021169, 'IFA-202', 'PEMROGRAMAN LANJUT', '3', '2021/1', 'AB', '3.50', '10.50'),
	(49, 152021169, 'IFA-203', 'PEMROGRAMAN WEB LANJUT', '3', '2021/1', 'B', '3.00', '9.00'),
	(50, 152021169, 'IFA-204', 'SISTEM OPERASI', '3', '2021/2', 'A', '4.00', '12.00'),
	(51, 152021169, 'IFA-205', 'KECERDASAN BUATAN', '3', '2021/2', 'B', '3.00', '9.00'),
	(52, 152021169, 'IFA-206', 'PEMROGRAMAN MOBILE', '3', '2021/2', 'A', '4.00', '12.00'),
	(53, 152021169, 'IFA-301', 'BASIS DATA LANJUT', '3', '2022/1', 'A', '4.00', '12.00'),
	(54, 152021169, 'IFA-302', 'JARINGAN KOMPUTER', '3', '2022/1', 'B', '3.00', '9.00'),
	(55, 152021169, 'IFA-303', 'ANALISIS DAN DESAIN SISTEM', '3', '2022/1', 'AB', '3.50', '10.50'),
	(56, 152021169, 'IFA-304', 'PEMROGRAMAN PARALEL', '3', '2022/2', 'B', '3.00', '9.00'),
	(57, 152021169, 'IFA-305', 'KEAMANAN KOMPUTER', '3', '2022/2', 'A', '4.00', '12.00'),
	(58, 152021169, 'IFA-306', 'PENGENALAN BIG DATA', '3', '2022/2', 'AB', '3.50', '10.50'),
	(59, 152021169, 'IFA-401', 'SISTEM INFORMASI', '3', '2022/2', 'B', '3.00', '9.00'),
	(60, 152021169, 'IFA-402', 'PEMROGRAMAN GAME', '3', '2023/1', 'A', '4.00', '12.00'),
	(61, 152021169, 'IFA-403', 'DATA MINING', '3', '2023/1', 'AB', '3.50', '10.50'),
	(62, 152021169, 'IFA-404', 'SISTEM CERDAS', '3', '2023/1', 'B', '3.00', '9.00'),
	(63, 152021169, 'IFA-405', 'PROYEK AKHIR', '6', '2023/2', 'A', '4.00', '24.00');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
