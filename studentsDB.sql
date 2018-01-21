-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 22, 2018 at 02:12 AM
-- Server version: 5.7.18-0ubuntu0.16.04.1
-- PHP Version: 5.6.31-4+ubuntu16.04.1+deb.sury.org+4

--
-- Database: `sb_student_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `course` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `course`) VALUES
(2, 'Liza', 'BBA'),
(3, 'Carol', 'History'),
(4, 'Chris', 'Manager'),
(5, 'Dana', 'Finance'),
(6, 'Ann', 'Anatomy');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;