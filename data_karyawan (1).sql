-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Dec 07, 2023 at 06:01 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `datakaryawan`
--

CREATE TABLE `datakaryawan` (
  `Nama` varchar(30) NOT NULL,
  `NIK` varchar(20) NOT NULL,
  `No_ID` int(10) NOT NULL,
  `Tanggal_Lahir` date DEFAULT NULL,
  `Jenis_Kelamin` varchar(10) NOT NULL,
  `Jabatan` varchar(10) NOT NULL,
  `Alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datakaryawan`
--

INSERT INTO `datakaryawan` (`Nama`, `NIK`, `No_ID`, `Tanggal_Lahir`, `Jenis_Kelamin`, `Jabatan`, `Alamat`) VALUES
('Hanif Ahmad', '6028906346290472', 1, '2000-06-27', 'Laki-Laki', 'Operator', 'Sekaran, Semarang, Jawa Tengah'),
('Andini Sekar', '4091455689064126', 2, '2001-01-10', 'Perempuan', 'Marketing', 'Tembalang City, Semarang, Jawa Tengah'),
('Nabila Sidika', '109834803712864', 3, '1999-07-18', 'Perempuan', 'Programmer', 'Gajah Mungkur, Semarang, Jawa Tengah'),
('Syahrul Maulana', '3017856780127813', 4, '2000-12-06', 'Laki-Laki', 'HRD', 'Erlangga, Semarang, Jawa Tengah'),
('Irham Sodikun', '2014987251083518', 5, '1998-09-22', 'Laki-Laki', 'Marketing', 'Banaran, Semarang, Jawa Tengah');

-- --------------------------------------------------------

--
-- Table structure for table `data_password`
--

CREATE TABLE `data_password` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_password`
--

INSERT INTO `data_password` (`username`, `password`) VALUES
('lisaamatul', 'lisa3004'),
('annisacahya', 'annisakentut'),
('zuyunkhoiriyah', 'zuyun123'),
('annisacahya', 'annisaaja'),
('zuyun', 'zuyun123');

-- --------------------------------------------------------

--
-- Table structure for table `gaji_karyawan`
--

CREATE TABLE `gaji_karyawan` (
  `ID_Karyawan` int(10) NOT NULL,
  `Nama_Karyawan` varchar(30) NOT NULL,
  `ID_Gaji` int(10) NOT NULL,
  `Jabatan` varchar(10) NOT NULL,
  `Gaji_Pokok` int(20) NOT NULL,
  `Lembur` int(10) NOT NULL,
  `Periode_Gaji` date NOT NULL,
  `Jumlah_Tak_Hadir` int(10) NOT NULL,
  `Potongan_Kehadiran` int(20) NOT NULL,
  `Potongan_Asuransi` int(20) NOT NULL,
  `Gaji_Total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `gaji_karyawan`
--

INSERT INTO `gaji_karyawan` (`ID_Karyawan`, `Nama_Karyawan`, `ID_Gaji`, `Jabatan`, `Gaji_Pokok`, `Lembur`, `Periode_Gaji`, `Jumlah_Tak_Hadir`, `Potongan_Kehadiran`, `Potongan_Asuransi`, `Gaji_Total`) VALUES
(2, 'Andini Sekar', 1, 'Marketing', 5500000, 0, '2023-05-25', 0, 0, 55000, 5445000),
(3, 'Nabila Sidika', 2, 'Programmer', 10000000, 86705, '2023-05-25', 1, 500000, 100000, 9486705),
(1, 'Hanif Ahmad', 3, 'Operator', 4500000, 78035, '2023-05-25', 0, 0, 45000, 4533035),
(4, 'Syahrul Maulana', 4, 'HRD', 7500000, 195087, '2023-05-25', 1, 375000, 75000, 7245087),
(5, 'Irham Sodikun', 5, 'Marketing', 5500000, 47688, '2023-05-25', 1, 275000, 55000, 5217688),
(3, 'Nabila Sidika', 6, 'Programmer', 10000000, 260116, '2023-05-25', 1, 500000, 100000, 9660116);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datakaryawan`
--
ALTER TABLE `datakaryawan`
  ADD PRIMARY KEY (`No_ID`);

--
-- Indexes for table `gaji_karyawan`
--
ALTER TABLE `gaji_karyawan`
  ADD PRIMARY KEY (`ID_Gaji`),
  ADD KEY `ID_Karyawan` (`ID_Karyawan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datakaryawan`
--
ALTER TABLE `datakaryawan`
  MODIFY `No_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `gaji_karyawan`
--
ALTER TABLE `gaji_karyawan`
  MODIFY `ID_Gaji` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=202;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gaji_karyawan`
--
ALTER TABLE `gaji_karyawan`
  ADD CONSTRAINT `gaji_karyawan_ibfk_1` FOREIGN KEY (`ID_Karyawan`) REFERENCES `datakaryawan` (`No_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
