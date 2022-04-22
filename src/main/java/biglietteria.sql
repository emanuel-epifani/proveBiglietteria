-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Creato il: Apr 22, 2022 alle 13:41
-- Versione del server: 10.4.21-MariaDB
-- Versione PHP: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biglietteria`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `biglietteria`
--

CREATE TABLE `biglietteria` (
  `id_biglietteria` int(11) NOT NULL,
  `nome_biglietteria` varchar(30) DEFAULT NULL,
  `indirizzo` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `bigliettiacquistati`
--

CREATE TABLE `bigliettiacquistati` (
  `id_utente` int(11) NOT NULL,
  `id_biglietto` int(11) NOT NULL,
  `quantità_acquistati` int(11) DEFAULT NULL,
  `data_acquisto` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `bigliettidisponibili`
--

CREATE TABLE `bigliettidisponibili` (
  `id_biglietteria` int(11) NOT NULL,
  `id_biglietto` int(11) NOT NULL,
  `quantità_dispon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `biglietto`
--

CREATE TABLE `biglietto` (
  `id_biglietto` int(11) NOT NULL,
  `costo` double DEFAULT NULL,
  `data_evento` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE `utente` (
  `id_utente` int(11) NOT NULL,
  `nome_utente` varchar(20) DEFAULT NULL,
  `cognome_utente` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `biglietteria`
--
ALTER TABLE `biglietteria`
  ADD PRIMARY KEY (`id_biglietteria`);

--
-- Indici per le tabelle `bigliettiacquistati`
--
ALTER TABLE `bigliettiacquistati`
  ADD PRIMARY KEY (`id_utente`,`id_biglietto`,`data_acquisto`),
  ADD KEY `id_biglietto` (`id_biglietto`);

--
-- Indici per le tabelle `bigliettidisponibili`
--
ALTER TABLE `bigliettidisponibili`
  ADD PRIMARY KEY (`id_biglietteria`,`id_biglietto`),
  ADD KEY `id_biglietto` (`id_biglietto`);

--
-- Indici per le tabelle `biglietto`
--
ALTER TABLE `biglietto`
  ADD PRIMARY KEY (`id_biglietto`);

--
-- Indici per le tabelle `utente`
--
ALTER TABLE `utente`
  ADD PRIMARY KEY (`id_utente`);

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `bigliettiacquistati`
--
ALTER TABLE `bigliettiacquistati`
  ADD CONSTRAINT `bigliettiacquistati_ibfk_1` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`) ON DELETE CASCADE,
  ADD CONSTRAINT `bigliettiacquistati_ibfk_2` FOREIGN KEY (`id_biglietto`) REFERENCES `biglietto` (`id_biglietto`) ON DELETE CASCADE;

--
-- Limiti per la tabella `bigliettidisponibili`
--
ALTER TABLE `bigliettidisponibili`
  ADD CONSTRAINT `bigliettidisponibili_ibfk_1` FOREIGN KEY (`id_biglietteria`) REFERENCES `biglietteria` (`id_biglietteria`) ON DELETE CASCADE,
  ADD CONSTRAINT `bigliettidisponibili_ibfk_2` FOREIGN KEY (`id_biglietto`) REFERENCES `biglietto` (`id_biglietto`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
