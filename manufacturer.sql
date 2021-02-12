-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2020 at 10:27 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: ` snap_shoes`
--

-- --------------------------------------------------------

--
-- Table structure for table `manufacturer`
--

CREATE TABLE `manufacturer` (
  `name` varchar(50) NOT NULL,
  `products` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `delivery` date NOT NULL,
  `location` varchar(50) NOT NULL,
  `pricing` int(11) NOT NULL,
  `plan` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `manufacturer`
--

INSERT INTO `manufacturer` (`name`, `products`, `quantity`, `delivery`, `location`, `pricing`, `plan`) VALUES
('Action', 'School time', 60, '2020-12-04', 'Dallas', 200, 'weekly'),
('Addidas', 'Converse', 20, '2020-04-04', 'Naperville', 500, 'weekly'),
('Bata', 'Paragon', 50, '2020-01-04', 'Indiana', 300, 'quarterly'),
('H&M', 'Air Converse', 100, '2019-08-04', 'Chinatown', 350, 'yearly'),
('Levis', 'Canvas', 80, '2020-10-04', 'Chicago', 100, 'yearly'),
('Nike', 'Air Jordan', 10, '2020-04-04', 'Chicago', 500, 'weekly'),
('Skechers', 'NYC', 40, '2020-02-04', 'Schaumburg', 510, 'monthly'),
('Steve Madden', 'Legends', 70, '2020-11-04', 'New York', 10, 'monthly'),
('Vans', 'Air Force', 30, '2020-03-04', 'Chicago', 50, 'weekly'),
('Zara', 'Formals', 90, '2020-09-04', 'Rosemont', 150, 'monthly');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `manufacturer`
--
ALTER TABLE `manufacturer`
  ADD PRIMARY KEY (`name`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
