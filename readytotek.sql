-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3308
-- Généré le :  ven. 08 sep. 2023 à 17:04
-- Version du serveur :  5.7.24
-- Version de PHP :  7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `readytotek`
--

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` varchar(255) NOT NULL,
  `level` int(11) NOT NULL,
  `mny` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `sergn` int(11) NOT NULL,
  `date` datetime DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`user_id`, `level`, `mny`, `score`, `sergn`, `date`, `user_name`) VALUES
('p111', 11, 240, 100, 2, '2023-02-22 11:05:55', 'cool123'),
('p106', 11, 240, 95, 2, '2023-02-22 11:05:55', 'cool118'),
('p107', 11, 240, 96, 2, '2023-02-22 11:05:55', 'cool119'),
('p108', 11, 240, 97, 2, '2023-02-22 11:05:55', 'cool120'),
('p109', 11, 240, 98, 2, '2023-02-22 11:05:55', 'cool121'),
('p110', 11, 240, 99, 2, '2023-02-22 11:05:55', 'cool122'),
('p112', 11, 240, 101, 2, '2023-02-22 11:05:55', 'cool124'),
('p113', 11, 240, 102, 2, '2023-02-22 11:05:55', 'cool125'),
('p114', 11, 240, 103, 2, '2023-02-22 11:05:55', 'cool126'),
('p115', 11, 240, 104, 2, '2023-02-22 11:05:55', 'cool127'),
('p116', 11, 240, 105, 2, '2023-02-22 11:05:55', 'cool128'),
('p117', 11, 240, 106, 2, '2023-02-22 11:05:55', 'cool129');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
