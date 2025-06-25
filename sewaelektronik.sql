-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2024 at 03:56 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewaelektronik`
--

-- --------------------------------------------------------

--
-- Table structure for table `datakomputer`
--

CREATE TABLE `datakomputer` (
  `merek_PC` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL,
  `VGA` varchar(50) NOT NULL,
  `tahun_produksi` date NOT NULL,
  `Harga_Sewa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datakomputer`
--

INSERT INTO `datakomputer` (`merek_PC`, `type`, `VGA`, `tahun_produksi`, `Harga_Sewa`) VALUES
('PC Gaming', 'Intel I7 Gen 13', 'RTX 4090', '2024-05-08', '2500000'),
('PC Gaming & Rendering', 'Intel I9 Gen 13', 'RTX 4090', '2024-05-14', '3000000'),
('PC Gaming Terbaru', 'Intel I5 Gen 13', 'RTX 4070', '2024-07-01', '3000000'),
('PC Graphic Design', 'Intel I5 Gen 13', 'RTX 4070', '2018-05-21', '2000000'),
('PC Graphic Designer New', 'Intel I5 Gen 14', 'RTX4070', '2024-01-01', '2500000');

-- --------------------------------------------------------

--
-- Table structure for table `datakonsumen`
--

CREATE TABLE `datakonsumen` (
  `nama_konsumen` varchar(50) NOT NULL,
  `NIK` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Pekerjaan` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `No_HP` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datakonsumen`
--

INSERT INTO `datakonsumen` (`nama_konsumen`, `NIK`, `Alamat`, `Pekerjaan`, `Email`, `No_HP`) VALUES
('Calvin Nicholas', '317511002200002', 'Jl. Margonda Depok RT 01/RW 01 Kelurahan Margonda, Kecamatan Margonda, Depok', 'Software Engineer', 'calvinnicholas@gmail.com', '08889177045'),
('Dwiki  Arlian Maulana', '317522001100001', 'Jl. Pondok Gede RT 01/RW01 Kelurahan Pondok Gede', 'Software Engineer', 'dwikiarlian@gmail.com', '0895336310998'),
('Fikri Pandu Wibawa', '3175101211020022', 'Jl. Sepakat III RT.008/RW.001, Kelurahan Cilangkap, Kecamatan Cipayung, Jakarta Timur', 'Software Engginer', 'fikripandu123@gmail.com', '081314875702');

-- --------------------------------------------------------

--
-- Table structure for table `datalaptop`
--

CREATE TABLE `datalaptop` (
  `type` varchar(150) NOT NULL,
  `merk` varchar(150) NOT NULL,
  `spek` varchar(50) NOT NULL,
  `tahun_produksi` date NOT NULL,
  `Harga_Sewa` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datalaptop`
--

INSERT INTO `datalaptop` (`type`, `merk`, `spek`, `tahun_produksi`, `Harga_Sewa`) VALUES
('Macbook PRO 2020', 'Apple', 'Apple M1 Pro Chip 10 Core', '2020-01-01', '2000000'),
('Macbook PRO 2021', 'Apple', 'Apple M1 Pro Chip 10 Core', '2021-05-01', '2000000'),
('Macbook PRO 2022', 'Apple', 'Apple M2 Pro Chip 16 Core', '2024-07-01', '3000000'),
('Nitro V 15', 'Acer', 'Intel I7 Gen 13 RTX 4050', '2022-05-05', '1500000'),
('Nitro V 16', 'Acer', 'Intel I7 Gen 13 RTX 4050', '2024-07-01', '2500000'),
('ROG Strix G16', 'Asus', 'Intel I9 Gen 14 RTX 4070', '2024-06-01', '1800000'),
('ROG Strix SCAR 18', 'Asus', 'Intel I7 Gen 13 RTX 4050', '2024-01-01', '3000000');

-- --------------------------------------------------------

--
-- Table structure for table `datapegawai`
--

CREATE TABLE `datapegawai` (
  `Nama` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Tempat_Lahir` varchar(20) NOT NULL,
  `Tanggal_Lahir` date NOT NULL,
  `No_HP` varchar(15) NOT NULL,
  `Jenis_Kelamin` varchar(20) NOT NULL,
  `Umur` varchar(10) NOT NULL,
  `Alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datapegawai`
--

INSERT INTO `datapegawai` (`Nama`, `Email`, `Tempat_Lahir`, `Tanggal_Lahir`, `No_HP`, `Jenis_Kelamin`, `Umur`, `Alamat`) VALUES
('Egi Puji Sugiawan', 'egipuji@gmail.com', 'Jakarta', '2001-09-12', '081314567891', 'Laki-laki', '23', 'Jl. Pondok Gede RT 01/RW01 Kelurahan Pondok Gede'),
('Fikri Pandu Wibawa', 'fikripandu@gmail.com', 'Jakarta', '2002-11-12', '081314875702', 'Laki-laki', '21', 'Jl. Sepakat III RT 08/RW 01 No.19, Kelurahan Cilangkap, Kecamatan Cipayung, Jakarta Timur'),
('Guntur Sahadi', 'guntursahadi@gmail.com', 'Jakarta', '2002-06-01', '08889177045', 'Laki-laki', '21', 'Jl. Margonda Depok RT 01/RW 01 Kelurahan Margonda, Kecamatan Margonda, Depok');

-- --------------------------------------------------------

--
-- Table structure for table `transaksisewakomputer`
--

CREATE TABLE `transaksisewakomputer` (
  `data_konsumen` varchar(150) NOT NULL,
  `data_pegawai` varchar(150) NOT NULL,
  `order_id` varchar(11) NOT NULL,
  `book_pinjam` date NOT NULL,
  `book_pengembalian` date NOT NULL,
  `type` varchar(150) NOT NULL,
  `VGA` varchar(50) NOT NULL,
  `unit_dipilih` varchar(150) NOT NULL,
  `Harga_Sewa` varchar(50) NOT NULL,
  `Durasi_Sewa` varchar(50) NOT NULL,
  `Harga_Total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksisewakomputer`
--

INSERT INTO `transaksisewakomputer` (`data_konsumen`, `data_pegawai`, `order_id`, `book_pinjam`, `book_pengembalian`, `type`, `VGA`, `unit_dipilih`, `Harga_Sewa`, `Durasi_Sewa`, `Harga_Total`) VALUES
('Calvin Nicholas', 'Egi Puji Sugiawan', '451122', '2024-07-01', '2024-07-02', 'Intel I5 Gen 13', 'RTX 4070', 'PC Gaming Terbaru, Intel I5 Gen 13', '3000000', '2', '6000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '465053', '2024-07-03', '2024-07-05', 'Intel I9 Gen 13', 'RTX 4090', 'PC Gaming & Rendering, Intel I9 Gen 13', '3000000', '3', '9000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '500250', '2024-07-05', '2024-07-07', 'Intel I9 Gen 13', 'RTX 4090', 'PC Gaming & Rendering, Intel I9 Gen 13', '3000000', '3', '9000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '521448', '2024-07-01', '2024-07-04', 'Intel I5 Gen 13', 'RTX 4070', 'PC Graphic Design, Intel I5 Gen 13', '2000000', '4', '8000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '735111', '2024-07-01', '2024-07-02', 'Intel I5 Gen 13', 'RTX 4090', 'PC Graphic Design, Intel I5 Gen 13', '2000000', '2', '4000000'),
('Calvin Nicholas', 'Fikri Pandu Wibawa', '743199', '2024-07-01', '2024-07-31', 'Intel I5 Gen 13', 'RTX 4090', 'PC Gaming & Rendering, Intel I9 Gen 13', '3000000', '31', '93000000'),
('Dwiki  Arlian Maulana', 'Egi Puji Sugiawan', '732061', '2024-07-01', '2024-07-02', 'Intel I5 Gen 13', 'RTX 4090', 'PC Gaming & Rendering, Intel I9 Gen 13', '3000000', '2', '6000000'),
('Dwiki  Arlian Maulana', 'Fikri Pandu Wibawa', '741961', '2024-07-01', '2024-07-31', 'Intel I9 Gen 13', 'RTX 4090', 'PC Gaming & Rendering, Intel I9 Gen 13', '3000000', '31', '93000000');

-- --------------------------------------------------------

--
-- Table structure for table `transaksisewalaptop`
--

CREATE TABLE `transaksisewalaptop` (
  `data_konsumen` varchar(150) NOT NULL,
  `data_pegawai` varchar(150) NOT NULL,
  `order_id` varchar(30) NOT NULL,
  `book_pinjam` date NOT NULL,
  `book_pengembalian` date NOT NULL,
  `merk` varchar(150) NOT NULL,
  `spesifikasi` varchar(150) NOT NULL,
  `type` varchar(150) NOT NULL,
  `Harga_Sewa` int(50) NOT NULL,
  `Durasi_Sewa` int(50) NOT NULL,
  `Harga_Total` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksisewalaptop`
--

INSERT INTO `transaksisewalaptop` (`data_konsumen`, `data_pegawai`, `order_id`, `book_pinjam`, `book_pengembalian`, `merk`, `spesifikasi`, `type`, `Harga_Sewa`, `Durasi_Sewa`, `Harga_Total`) VALUES
('Calvin Nicholas', 'Egi Puji Sugiawan', '366450', '2024-07-01', '2024-07-03', 'Apple', 'Apple M1 Pro Chip 10 Core', 'Macbook PRO 2021, Apple', 3, 2000000, '6000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '608316', '2024-07-01', '2024-07-02', 'Asus', 'Intel I9 Gen 14 RTX 4090', 'ASUS ROG Strix SCAR 18, ASUS', 2500000, 2, '5000000'),
('Calvin Nicholas', 'Fikri Pandu Wibawa', '866821', '2024-07-01', '2024-07-31', 'Apple', 'Apple M1 Pro Chip 10 Core', 'Macbook PRO 2021, Apple', 2000000, 31, '62000000'),
('Calvin Nicholas', 'Egi Puji Sugiawan', '917905', '2024-07-01', '2024-07-02', 'Asus', 'Intel I7 Gen 13 RTX 4050', 'ROG Strix SCAR 18, Asus', 3000000, 2, '6000000'),
('Dwiki  Arlian Maulana', 'Fikri Pandu Wibawa', '383266', '2024-07-01', '2024-07-31', 'Asus', 'Intel I9 Gen 14 RTX 4090', 'ASUS ROG Strix SCAR 18, Asus', 2500000, 31, '77500000'),
('Dwiki  Arlian Maulana', 'Egi Puji Sugiawan', '770897', '2024-07-01', '2024-07-02', 'Apple', 'Apple M1 Pro Chip 10 Core', 'Macbook PRO 2021, Apple', 2000000, 2, '4000000'),
('Dwiki Arlian Maulana', 'Egi Puji Sugiawan', '249735', '2024-07-01', '2024-07-04', 'Asus', 'Intel I9 Gen 14 RTX 4090', 'ASUS ROG Strix SCAR G18 2024', 2500000, 4, '10000000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datakomputer`
--
ALTER TABLE `datakomputer`
  ADD PRIMARY KEY (`merek_PC`,`type`);

--
-- Indexes for table `datakonsumen`
--
ALTER TABLE `datakonsumen`
  ADD PRIMARY KEY (`nama_konsumen`);

--
-- Indexes for table `datalaptop`
--
ALTER TABLE `datalaptop`
  ADD PRIMARY KEY (`type`,`merk`);

--
-- Indexes for table `datapegawai`
--
ALTER TABLE `datapegawai`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `transaksisewakomputer`
--
ALTER TABLE `transaksisewakomputer`
  ADD PRIMARY KEY (`data_konsumen`,`order_id`);

--
-- Indexes for table `transaksisewalaptop`
--
ALTER TABLE `transaksisewalaptop`
  ADD PRIMARY KEY (`data_konsumen`,`order_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
