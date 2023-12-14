-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 13, 2023 at 05:58 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentmangementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`, `phoneNumber`) VALUES
(1, 'Admin', '1234', '0123456789');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `courseCode` varchar(10) NOT NULL,
  `courseTitle` varchar(100) NOT NULL,
  `credit` varchar(5) NOT NULL,
  `type` varchar(10) NOT NULL,
  `semester` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courseCode`, `courseTitle`, `credit`, `type`, `semester`) VALUES
('CSE E-1CSE', 'Elective Course', '3.0', 'Theory', '5th'),
('CSE101', 'Introduction to Computer Science', '3.0', 'Theory', '1st'),
('CSE102', 'Programming Fundamentals', '3.0', 'Theory', '1st'),
('CSE102L', 'Programming Fundamentals Lab', '1.5', 'Lab', '1st'),
('CSE111', 'Data Structures and Algorithms', '3.0', 'Theory', '2nd'),
('CSE111L', 'Data Structures and Algorithms Lab', '1.5', 'Lab', '2nd'),
('CSE121', 'Object-Oriented Programming', '3.0', 'Theory', '2nd'),
('CSE121L', 'Object-Oriented Programming Lab', '1.5', 'Lab', '2nd'),
('CSE201', 'Digital Logic Design', '3.0', 'Theory', '3rd'),
('CSE201L', 'Digital Logic Design Lab', '1.5', 'Lab', '3rd'),
('CSE211', 'Computer Organization and Architecture', '3.0', 'Theory', '3rd'),
('CSE211L', 'Computer Organization and Architecture Lab', '1.5', 'Lab', '3rd'),
('CSE221', 'Operating Systems', '3.0', 'Theory', '3rd'),
('CSE221L', 'Operating Systems Lab', '1.5', 'Lab', '3rd'),
('CSE231', 'Database Systems', '3.0', 'Theory', '4th'),
('CSE231L', 'Database Systems Lab', '1.5', 'Lab', '4th'),
('CSE241', 'Computer Networks', '3.0', 'Theory', '4th'),
('CSE241L', 'Computer Networks Lab', '1.5', 'Lab', '4th'),
('CSE251', 'Software Engineering', '3.0', 'Theory', '4th'),
('CSE251P', 'Software Engineering Project', '1.0', 'Project', '4th'),
('CSE301', 'Algorithm Design and Analysis', '3.0', 'Theory', '5th'),
('CSE311', 'Artificial Intelligence', '3.0', 'Theory', '5th'),
('CSE321', 'Computer Graphics', '3.0', 'Theory', '5th'),
('CSE321L', 'Computer Graphics Lab', '1.5', 'Lab', '5th'),
('CSE331', 'Web Technologies', '3.0', 'Theory', '6th'),
('CSE331L', 'Web Technologies Lab', '1.5', 'Lab', '6th'),
('CSE341', 'Computer Security', '3.0', 'Theory', '6th'),
('CSE341L', 'Computer Security Lab', '1.5', 'Lab', '6th'),
('CSE401', 'Compiler Design', '3.0', 'Theory', '7th'),
('CSE411', 'Machine Learning', '3.0', 'Theory', '7th'),
('CSE411L', 'Machine Learning Lab', '1.5', 'Lab', '7th'),
('CSE421', 'Data Mining', '3.0', 'Theory', '7th'),
('CSE421L', 'Data Mining Lab', '1.5', 'Lab', '7th'),
('CSE431', 'Cloud Computing', '3.0', 'Theory', '8th'),
('CSE431L', 'Cloud Computing Lab', '1.5', 'Lab', '8th'),
('CSE441', 'Mobile Computing', '3.0', 'Theory', '8th'),
('CSE441L', 'Mobile Computing Lab', '1.5', 'Lab', '8th'),
('CSE451', 'Capstone Project', '3.0', 'Project', '8th'),
('CSEE02', 'Elective Course-02', '3.0', 'Theory', '6th'),
('MAT101', 'Calculus I', '3.0', 'Theory', '1st'),
('MAT102', 'Calculus II', '3.0', 'Theory', '2nd'),
('PHY101', 'Physics I', '3.0', 'Theory', '1st'),
('PHY101L', 'Physics I Lab', '1.5', 'Lab', '1st'),
('PHY102', 'Physics II', '3.0', 'Theory', '2nd'),
('PHY102L', 'Physics II Lab', '1.5', 'Lab', '2nd');

-- --------------------------------------------------------

--
-- Table structure for table `demand`
--

CREATE TABLE `demand` (
  `stdId` varchar(30) DEFAULT NULL,
  `tutionFee` float DEFAULT NULL,
  `librayFee` float DEFAULT NULL,
  `medicalFee` float DEFAULT NULL,
  `labFee` float DEFAULT NULL,
  `otherFee` float DEFAULT NULL,
  `toatalFee` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `intake`
--

CREATE TABLE `intake` (
  `stdId` varchar(255) DEFAULT NULL,
  `intake` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  `semester` varchar(255) DEFAULT NULL,
  `courseCode` varchar(10) DEFAULT NULL,
  `courseTitle` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `stdId` varchar(30) DEFAULT NULL,
  `semester` varchar(30) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  `courseTitle` varchar(100) DEFAULT NULL,
  `courseCredit` varchar(5) DEFAULT NULL,
  `score` int(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `stdinfo`
--

CREATE TABLE `stdinfo` (
  `stdId` varchar(255) NOT NULL,
  `stdName` varchar(255) NOT NULL,
  `stdIntake` varchar(255) DEFAULT NULL,
  `stdPhone` varchar(255) NOT NULL,
  `stdBirth` varchar(255) NOT NULL,
  `stdGender` varchar(255) NOT NULL,
  `stdSemester` varchar(255) NOT NULL,
  `stdYear` varchar(255) NOT NULL,
  `stdDept` varchar(255) NOT NULL,
  `stdGar` varchar(255) NOT NULL,
  `stdGarRel` varchar(255) NOT NULL,
  `stdGarPhone` varchar(255) NOT NULL,
  `stdPasswor` varchar(255) NOT NULL,
  `stdAddress` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stdinfo`
--

INSERT INTO `stdinfo` (`stdId`, `stdName`, `stdIntake`, `stdPhone`, `stdBirth`, `stdGender`, `stdSemester`, `stdYear`, `stdDept`, `stdGar`, `stdGarRel`, `stdGarPhone`, `stdPasswor`, `stdAddress`) VALUES
('1', 'Jamanl Hossain', '41', '01818889990', 'April 19, 1998', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Dhaka'),
('10', 'Asiya', '42', '01818889990', 'March 3, 1999', 'Female', 'Fall', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Dhaka'),
('11', 'Midul Islam', '42', '01899900011', 'March 5, 1998', 'Male', 'Fall', '2023', 'Computer Science and Engineering', 'Gurdian Defaul', 'Father', '01888822229', '1234', 'Khulna'),
('12', 'Mahmudullah', '42', '01488877777', 'April 7, 1998', 'Male', 'Fall', '2023', 'Computer Science and Engineering', 'Gurdian name', 'Father', '018777755514', '1234', 'Dhaka'),
('2', 'Kamal Hossain', '41', '01818889990', 'April 25, 1998', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Mother', '01944477788', '1234', 'Dhaka'),
('3', 'Aktaruzzaman', '41', '01818889990', 'April 13, 1998', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Cox\'s Bazar'),
('4', 'Abu Huraria', '41', '01818889990', 'March 2, 1998', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Chattogram'),
('5', 'Abdur Rahman', '41', '01818889990', 'April 3, 1997', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Mother', '01944477788', '1234', 'Rajshahi'),
('6', 'Obydur Rahman', '41', '01818889990', 'April 3, 1998', 'Male', 'Spring', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Sylet'),
('7', 'Ayesha Siddiqa', '42', '01818889990', 'March 2, 1997', 'Female', 'Fall', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Khulna'),
('8', 'Mariam', '42', '01818889990', 'January 2, 1999', 'Female', 'Fall', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Rangpur'),
('9', 'Hafsa', '42', '01818889990', 'March 2, 1998', 'Female', 'Fall', '2023', 'Computer Science and Engineering', 'Grudian Name', 'Father', '01944477788', '1234', 'Cox\'s Bazar');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`courseCode`);

--
-- Indexes for table `demand`
--
ALTER TABLE `demand`
  ADD KEY `stdId` (`stdId`);

--
-- Indexes for table `intake`
--
ALTER TABLE `intake`
  ADD KEY `stdId` (`stdId`),
  ADD KEY `courseCode` (`courseCode`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD KEY `stdId` (`stdId`);

--
-- Indexes for table `stdinfo`
--
ALTER TABLE `stdinfo`
  ADD PRIMARY KEY (`stdId`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `demand`
--
ALTER TABLE `demand`
  ADD CONSTRAINT `demand_ibfk_1` FOREIGN KEY (`stdId`) REFERENCES `stdinfo` (`stdId`);

--
-- Constraints for table `intake`
--
ALTER TABLE `intake`
  ADD CONSTRAINT `intake_ibfk_1` FOREIGN KEY (`stdId`) REFERENCES `stdinfo` (`stdId`),
  ADD CONSTRAINT `intake_ibfk_2` FOREIGN KEY (`courseCode`) REFERENCES `courses` (`courseCode`);

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`stdId`) REFERENCES `stdinfo` (`stdId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
