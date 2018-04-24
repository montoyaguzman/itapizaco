-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2017 a las 21:44:50
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `escuela`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `id` int(8) NOT NULL,
  `matricula` int(8) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `app` varchar(25) NOT NULL,
  `apm` varchar(25) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  `semestre` int(2) NOT NULL,
  `promedio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`id`, `matricula`, `nombre`, `app`, `apm`, `correo`, `telefono`, `carrera`, `semestre`, `promedio`) VALUES
(6, 65, 'Javier', 'Cervantes', 'Amaro', 'roy_@hotmail.com', '297', 'Informatica', 10, 100),
(7, 322, 'Eduardo', 'Landero', 'Sanchez', 'ed_landi1988@gmail.com', '248', 'tics', 12, 98),
(8, 78, 'Magi', 'Hernandez', 'Santos', 'mag@amatech.mx', '412', 'Medicina', 2, 99),
(9, 400, 'Luis Angel', 'Lima', 'Vidal', 'np@np.com', '5556', 'Mecatronica', 1, 83),
(10, 16, 'Jose', 'Montoya', 'Guzman', 'montoyita_libra@hotmail.com', '2411597543', 'tics', 9, 65),
(11, 99, 'Marloon', 'Mendienta', 'Zamora', 'kevin_ghost@gmail.com', '2411220304', 'Filosofia', 2, 82),
(12, 2, 'Tony', 'Vazquez', 'mklnjbkh', 'klnbkjh', '56', 'txdcf', 9, 92.2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `idProfesor` int(2) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `app` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `matricula` (`matricula`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`idProfesor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
