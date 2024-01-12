-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 22:52:39
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel31`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipoHabitacion` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipoHabitacion`, `estado`) VALUES
(1, 2, 1),
(2, 1, 0),
(3, 1, 0),
(4, 2, 1),
(5, 2, 0),
(6, 2, 0),
(7, 1, 1),
(8, 1, 0),
(9, 1, 0),
(10, 1, 1),
(11, 1, 0),
(12, 1, 0),
(13, 1, 0),
(14, 1, 0),
(15, 1, 0),
(16, 1, 0),
(17, 1, 0),
(18, 1, 0),
(19, 1, 0),
(20, 1, 0),
(21, 1, 0),
(22, 1, 0),
(23, 1, 0),
(24, 1, 0),
(25, 1, 0),
(26, 1, 0),
(27, 1, 0),
(28, 1, 0),
(29, 1, 0),
(30, 1, 0),
(31, 1, 0),
(32, 1, 0),
(33, 1, 0),
(34, 1, 0),
(35, 2, 1),
(36, 2, 0),
(37, 2, 0),
(38, 2, 0),
(39, 2, 0),
(40, 2, 0),
(41, 2, 0),
(42, 2, 0),
(43, 2, 0),
(44, 2, 0),
(45, 2, 0),
(46, 2, 0),
(47, 2, 1),
(48, 2, 0),
(49, 2, 0),
(50, 2, 0),
(51, 2, 0),
(52, 2, 0),
(53, 2, 0),
(54, 2, 0),
(55, 2, 0),
(56, 2, 0),
(57, 2, 0),
(58, 2, 0),
(59, 2, 0),
(60, 2, 0),
(61, 2, 0),
(62, 3, 0),
(63, 3, 0),
(64, 3, 0),
(65, 3, 1),
(66, 3, 0),
(67, 3, 0),
(68, 3, 0),
(69, 3, 1),
(70, 3, 0),
(71, 3, 0),
(72, 3, 0),
(73, 3, 0),
(74, 3, 0),
(75, 3, 0),
(76, 3, 0),
(77, 3, 0),
(78, 3, 0),
(79, 3, 0),
(80, 3, 1),
(81, 3, 0),
(82, 3, 0),
(83, 3, 0),
(84, 3, 0),
(85, 3, 0),
(86, 3, 0),
(87, 3, 0),
(88, 3, 1),
(89, 3, 0),
(90, 3, 0),
(91, 3, 0),
(92, 4, 0),
(93, 4, 0),
(94, 4, 0),
(95, 4, 0),
(96, 4, 1),
(97, 4, 0),
(98, 4, 0),
(99, 4, 0),
(100, 4, 0),
(101, 4, 0),
(102, 4, 0),
(103, 4, 0),
(104, 4, 0),
(105, 4, 0),
(106, 4, 0),
(107, 4, 0),
(108, 4, 0),
(109, 4, 0),
(110, 4, 0),
(111, 4, 0),
(112, 4, 0),
(113, 4, 0),
(114, 4, 0),
(115, 4, 0),
(116, 4, 0),
(117, 4, 0),
(118, 4, 0),
(119, 4, 0),
(120, 4, 0),
(121, 4, 0),
(122, 5, 0),
(123, 5, 0),
(124, 5, 0),
(125, 5, 0),
(126, 5, 0),
(127, 5, 0),
(128, 5, 0),
(129, 5, 0),
(130, 5, 0),
(131, 5, 0),
(132, 5, 0),
(133, 5, 0),
(134, 5, 0),
(135, 5, 0),
(136, 5, 0),
(137, 5, 0),
(138, 5, 0),
(139, 5, 0),
(140, 5, 0),
(141, 5, 0),
(142, 5, 0),
(143, 5, 0),
(144, 5, 0),
(145, 5, 0),
(146, 5, 0),
(147, 5, 0),
(148, 5, 0),
(149, 5, 0),
(150, 5, 0),
(151, 5, 0),
(152, 6, 0),
(153, 6, 0),
(154, 6, 0),
(155, 6, 0),
(156, 6, 0),
(157, 6, 0),
(158, 6, 0),
(159, 6, 0),
(160, 6, 0),
(161, 6, 0),
(162, 6, 0),
(163, 6, 0),
(164, 6, 0),
(165, 6, 0),
(166, 6, 1),
(167, 6, 0),
(168, 6, 0),
(169, 6, 0),
(170, 6, 0),
(171, 6, 0),
(180, 5, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `celular` bigint(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 'Franco', 'Kerlin ', 38018311, 'Coldaroli 949', 'Kerlin@gmail.com', 3454749769, 0),
(2, 'Nicolas', 'Iglesias', 36452738, 'Beltran 1778', 'nico-igle@gmail.com', 2804354313, 1),
(3, 'Matias', 'Carrizo', 35564662, 'Nanini 2965', 'maticarrizo@gmail.com', 3525306960, 1),
(4, 'Fabio', 'Gleria', 31950827, 'Aleu 3619', 'fgleria@gmail.com', 1133441967, 1),
(5, 'Jose Manuel ', 'Martinez Herling ', 39000000, 'Mitre 321', 'Jorge@gmail.com', 3454786980, 1),
(6, 'Oscar', 'Iglesias', 36452737, 'Beltran 1778', 'scar@gmail.com', 2804274318, 1),
(7, 'Roberto', 'Iglesias', 36452734, 'Beltran 1778', 'Robb-igle@gmail.com', 2804274318, 0),
(8, 'Facundo', 'Iglesias', 36452732, 'Beltran 1778', 'facu-igle@gmail.com', 2804354322, 1),
(9, 'Federico', 'Lopez', 31458225, 'Calle Falsa 123', 'correo_generico@gmai.com', 1122578613, 1),
(10, 'John', 'Doe', 22345679, '123 Main St', 'john.doe@example.com', 1234567890, 1),
(11, 'Jane', 'Smith', 28765432, '456 Elm St', 'jane.smith@example.com', 9876543210, 1),
(12, 'Michael', 'Johnson', 44681358, '789 Oak St', 'michael.johnson@example.com', 5555555555, 1),
(13, 'Emily', 'Williams', 33579247, '321 Cedar St', 'emily.williams@example.com', 1111111111, 1),
(14, 'David', 'Brown', 36420975, '654 Pine St', 'david.brown@example.com', 2222222222, 1),
(15, 'Sarah', 'Jones', 37095861, '987 Maple St', 'sarah.jones@example.com', 3333333333, 1),
(16, 'Matthew', 'Garcia', 35128705, '159 Willow St', 'matthew.garcia@example.com', 4444444444, 1),
(17, 'Jessica', 'Miller', 42019735, '753 Birch St', 'jessica.miller@example.com', 5555555555, 1),
(18, 'Christopher', 'Davis', 31723469, '357 Oak St', 'christopher.davis@example.com', 6666666666, 1),
(19, 'Ashley', 'Wilson', 30234596, '246 Elm St', 'ashley.wilson@example.com', 7777777777, 1),
(20, 'Andrew', 'Martinez', 26459013, '951 Pine St', 'andrew.martinez@example.com', 8888888888, 1),
(21, 'Amanda', 'Taylor', 30951235, '602 Cedar St', 'amanda.taylor@example.com', 9999999999, 1),
(22, 'Ryan', 'Anderson', 32345678, '705 Maple St', 'ryan.anderson@example.com', 1010101010, 1),
(23, 'Stephanie', 'Hernandez', 28706543, '320 Willow St', 'stephanie.hernandez@example.com', 1111111111, 1),
(24, 'Jonathan', 'Lopez', 34509873, '157 Birch St', 'jonathan.lopez@example.com', 1212121212, 1),
(25, 'Melissa', 'Gonzalez', 27812095, '935 Oak St', 'melissa.gonzalez@example.com', 1313131313, 1),
(26, 'Daniel', 'Rodriguez', 23246709, '468 Elm St', 'daniel.rodriguez@example.com', 1414141414, 1),
(27, 'Emily', 'Moore', 32019375, '791 Pine St', 'emily.moore@example.com', 1515151515, 1),
(28, 'David', 'Harris', 18734529, '512 Cedar St', 'david.harris@example.com', 1616161616, 1),
(29, 'Olivia', 'Clark', 25672340, '269 Maple St', 'olivia.clark@example.com', 1717171717, 1),
(30, 'Joshua', 'Young', 34095671, '735 Willow St', 'joshua.young@example.com', 1818181818, 1),
(31, 'Lauren', 'Lewis', 19723506, '573 Birch St', 'lauren.lewis@example.com', 1919191919, 1),
(32, 'Jacob', 'King', 31976044, '296 Oak St', 'jacob.king@example.com', 2020202020, 1),
(33, 'Elizabeth', 'Lee', 34678901, '824 Elm St', 'elizabeth.lee@example.com', 2121212121, 1),
(34, 'Christopher', 'Scott', 27092349, '763 Pine St', 'christopher.scott@example.com', 2222222222, 1),
(35, 'Jennifer', 'Walker', 30346793, '381 Cedar St', 'jennifer.walker@example.com', 2323232323, 1),
(36, 'Matthew', 'Robinson', 25469073, '579 Maple St', 'matthew.robinson@example.com', 2424242424, 1),
(37, 'Emma', 'Perez', 30712953, '914 Willow St', 'emma.perez@example.com', 2525252525, 1),
(38, 'Anthony', 'Hill', 24350622, '198 Birch St', 'Hillantho@gmail.com', 5412345755, 1),
(39, 'Aaaaaaaaa', 'Aaaaaaaa', 99999999, 'dasdasdas 1', 'dasdas@fafas.com', 64649756156, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `fechaEntrada` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `importeTotal` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHabitacion`, `idHuesped`, `cantPersonas`, `fechaEntrada`, `fechaSalida`, `importeTotal`, `estado`) VALUES
(1, 2, 2, 3, '2023-10-05', '2023-10-08', 150000, 0),
(2, 5, 1, 1, '2023-10-07', '2023-10-12', 50000, 0),
(3, 6, 2, 1, '2023-10-13', '2023-10-18', 80000, 0),
(4, 93, 2, 3, '2023-10-21', '2023-10-24', 60000, 0),
(5, 93, 2, 3, '2023-10-18', '2023-10-20', 40000, 0),
(6, 95, 2, 3, '2023-10-14', '2023-10-21', 140000, 0),
(7, 153, 2, 4, '2023-10-17', '2023-10-19', 900000, 0),
(8, 154, 2, 4, '2023-10-17', '2023-10-20', 300000, 0),
(9, 156, 2, 4, '2023-10-18', '2023-10-19', 100000, 0),
(10, 155, 2, 4, '2023-10-18', '2023-10-21', 300000, 0),
(11, 94, 6, 3, '2023-10-20', '2023-10-23', 60000, 0),
(12, 154, 6, 4, '2023-10-20', '2023-10-23', 300000, 0),
(13, 93, 2, 3, '2023-10-24', '2023-10-29', 100000, 1),
(14, 3, 2, 1, '2023-10-28', '2023-10-31', 36000, 1),
(15, 1, 9, 2, '2023-10-26', '2023-10-30', 64000, 1),
(16, 3, 9, 1, '2023-11-16', '2023-12-01', 180000, 0),
(17, 7, 9, 3, '2023-11-16', '2023-12-01', 180000, 1),
(18, 2, 4, 1, '2023-11-01', '2023-11-06', 60000, 1),
(19, 93, 3, 3, '2023-10-27', '2023-11-01', 100000, 1),
(20, 4, 3, 2, '2023-10-27', '2023-11-01', 80000, 1),
(21, 6, 1, 2, '2023-10-28', '2023-11-05', 128000, 1),
(22, 66, 13, 2, '2020-05-15', '2020-05-19', 20000, 0),
(23, 152, 22, 5, '2021-08-18', '2021-08-25', 280000, 0),
(24, 3, 18, 1, '2018-03-05', '2018-03-09', 10000, 0),
(25, 77, 15, 2, '2022-11-11', '2022-11-13', 24000, 0),
(26, 55, 23, 1, '2023-02-15', '2023-02-19', 52000, 0),
(27, 12, 8, 1, '2020-09-28', '2020-10-01', 16000, 0),
(28, 120, 16, 3, '2023-08-22', '2023-08-26', 80000, 0),
(29, 87, 9, 1, '2021-04-14', '2021-04-19', 30000, 0),
(30, 73, 16, 1, '2020-09-15', '2020-09-19', 50000, 0),
(31, 58, 17, 2, '2018-03-05', '2018-03-09', 40000, 0),
(32, 26, 18, 2, '2022-07-25', '2022-07-29', 70000, 0),
(33, 49, 29, 2, '2022-10-15', '2022-10-19', 70000, 0),
(34, 126, 14, 2, '2021-01-15', '2021-01-19', 80000, 0),
(35, 143, 12, 2, '2020-02-15', '2020-02-19', 200000, 0),
(36, 15, 20, 2, '2019-05-15', '2019-05-19', 25000, 0),
(37, 43, 24, 2, '2023-12-15', '2023-12-19', 70000, 1),
(38, 38, 26, 2, '2023-05-15', '2023-05-19', 65000, 0),
(39, 81, 13, 2, '2023-02-15', '2023-02-19', 55000, 0),
(40, 35, 5, 2, '2023-10-28', '2023-10-31', 48000, 1),
(41, 93, 39, 3, '2023-10-26', '2023-10-27', 20000, 0),
(42, 5, 28, 2, '2023-10-28', '2023-10-31', 48000, 1),
(43, 1, 31, 1, '2023-11-03', '2023-11-13', 160000, 1),
(44, 4, 10, 2, '2023-11-08', '2023-11-10', 32000, 1),
(45, 93, 38, 3, '2023-11-01', '2023-11-04', 60000, 1),
(46, 152, 36, 4, '2023-10-28', '2023-11-01', 400000, 1),
(47, 6, 34, 2, '2023-10-27', '2023-10-30', 48000, 1),
(48, 94, 25, 3, '2023-10-27', '2023-10-30', 60000, 1),
(49, 88, 11, 2, '2023-10-27', '2023-10-30', 45000, 1),
(50, 69, 19, 2, '2023-10-28', '2023-10-30', 30000, 1),
(51, 2, 35, 1, '2023-10-28', '2023-10-31', 36000, 1),
(52, 65, 37, 1, '2023-10-28', '2023-10-31', 45000, 1),
(53, 47, 21, 2, '2023-10-28', '2023-10-31', 48000, 1),
(54, 96, 32, 3, '2023-10-27', '2023-10-31', 80000, 1),
(55, 95, 27, 3, '2023-10-27', '2023-10-31', 80000, 1),
(56, 80, 30, 2, '2023-10-27', '2023-11-03', 105000, 1),
(57, 10, 33, 1, '2023-10-30', '2023-11-03', 48000, 1),
(58, 166, 7, 4, '2023-11-03', '2023-11-05', 200000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `tipoCamas` varchar(20) NOT NULL,
  `precioNoche` double NOT NULL,
  `nombreTipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`idTipoHabitacion`, `capacidad`, `cantCamas`, `tipoCamas`, `precioNoche`, `nombreTipo`) VALUES
(1, 1, 1, 'simple', 12000, 'estandar'),
(2, 2, 2, 'simples', 16000, 'doble 2'),
(3, 2, 1, 'doble', 15000, 'doble 1'),
(4, 3, 3, 'simples', 20000, 'triple 1'),
(5, 3, 2, 'simple y doble', 22000, 'triple 2'),
(6, 6, 4, '2 simples y 2 King', 100000, 'suite');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoHabitacion` (`idTipoHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=181;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipoHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `tipodehabitacion` (`idTipoHabitacion`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
