-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2024 at 04:11 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `telephone_directory`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbltelephone`
--

CREATE TABLE `tbltelephone` (
  `Name` varchar(35) NOT NULL,
  `Address` varchar(35) NOT NULL,
  `Telephone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbltelephone`
--

INSERT INTO `tbltelephone` (`Name`, `Address`, `Telephone`) VALUES
('Abel, J. G.', '110 Oakleaf', '236-4010'),
('Baker, Sue', '409 Sunset', '645-8978'),
('Carter, L. H.', '17 Bernary', '567-8766'),
('Lang, Al', '311 Moss', '716-1111'),
('Minte, Al', '204 Pine', '356-2453'),
('Point, M. R.', '1 Market', '212-9841'),
('Sands, T. H.', '671 First', '734-7261');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbltelephone`
--
ALTER TABLE `tbltelephone`
  ADD PRIMARY KEY (`Name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
