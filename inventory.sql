-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2020 at 12:12 PM
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
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int auto_increment,
  `product` varchar(100) NOT NULL,
  `manufacturer` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `msrp` varchar(100) NOT NULL,
  `unit_cost` varchar(100) NOT NULL,
  `discount` varchar(100) NOT NULL,
  `stock` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `product`, `manufacturer`, `location`, `msrp`, `unit_cost`, `discount`, `stock`) VALUES
('1', 'School time', 'Action', 'Dallas', '400', '390', '355', '4'),
('10', 'Formals', 'Zara', 'Rosemont', '450', '425', '400', '18'),
('2', 'Converse', 'Addidas', 'Naperville', '500', '250', '350', '5'),
('3', 'Paragon', 'Bata', 'Indiana', '700', '650', '600', '8'),
('4', 'Air Converse', 'H&M', 'Chinatown', '600', '450', '500', '9'),
('5', 'Canvas', 'Levis', 'Chicago', '450', '470', '400', '10'),
('6', 'Air Jordan', 'Nike', 'Chicago', '350', '325', '300', '11'),
('7', 'NYC', 'Skechers', 'Schaumburg', '250', '225', '200', '13'),
('8', 'Legends', 'Steve Madden', 'New York', '350', '325', '300', '18'),
('9', 'Air Force', 'Vans', 'Chicago', '400', '375', '350', '20');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
