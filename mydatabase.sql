-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2016 at 03:00 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `food_id` varchar(10) NOT NULL,
  `food_name` varchar(30) NOT NULL,
  `food_price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`food_id`, `food_name`, `food_price`) VALUES
('F10001', 'Char Kuey Teow', 4.5),
('F10002', 'Popiah', 2.5),
('F10003', 'Wan Tan Mee', 5);

-- --------------------------------------------------------

--
-- Table structure for table `neworder`
--

CREATE TABLE `neworder` (
  `order_no` varchar(6) NOT NULL,
  `seat_no` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `order_list`
--

CREATE TABLE `order_list` (
  `order_no` varchar(6) NOT NULL,
  `item` varchar(30) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_id` varchar(6) NOT NULL,
  `order_no` varchar(6) NOT NULL,
  `payment_type` varchar(12) NOT NULL,
  `account_no` varchar(20) NOT NULL,
  `subtotal` double NOT NULL,
  `gst` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `order_no`, `payment_type`, `account_no`, `subtotal`, `gst`, `total`) VALUES
('P1000', 'O1001', 'Cash', '---', 12, 0.72, 12.72),
('P1001', 'O1002', 'Credit Card', '123456789', 14.5, 0.87, 15.37),
('P1002', 'O1000', 'Credit Card', '123456789', 12.6, 0.76, 13.36),
('P1003', 'O1001', 'Cash', '---', 4.5, 0.27, 4.77);

-- --------------------------------------------------------

--
-- Table structure for table `personnel`
--

CREATE TABLE `personnel` (
  `id` varchar(4) NOT NULL,
  `name` varchar(50) NOT NULL,
  `ic` varchar(14) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `hp` varchar(12) NOT NULL,
  `stype` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personnel`
--

INSERT INTO `personnel` (`id`, `name`, `ic`, `address`, `gender`, `hp`, `stype`) VALUES
('M100', 'Wong', '960426', 'aaa', 'Male', '012-3456789', 'M'),
('S100', 'Seong', '960426', 'aaa', 'Male', '012-3456789', 'S');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
