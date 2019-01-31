-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 31-01-2019 a las 15:09:50
-- Versión del servidor: 5.7.23
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `loancheckerdb2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `edad` int(3) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `dni` int(8) DEFAULT NULL,
  `telfijo` varchar(10) DEFAULT NULL,
  `domcobro` varchar(60) DEFAULT NULL,
  `domsec` varchar(60) DEFAULT NULL,
  `barrio` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id`, `nombre`, `apellido`, `edad`, `celular`, `dni`, `telfijo`, `domcobro`, `domsec`, `barrio`) VALUES
(1, 'David', 'SSSSSSSS', 22, '321654987', 9876543, NULL, NULL, NULL, ''),
(2, 'Pepe', 'lopez', 23, '3814010787', 33222111, '4265463', 'la concha de tu mandre 200', 'cabeza y ura', 'loma del ure'),
(3, 'jUANCHO', 'Ppas', 12, '23234', 122313, '234535', 'jfjfj', 'jfjfj', 'kdkdk'),
(4, 'ertet', 'ertert', 234234, 'werwerw', 42342, '4234', 'werewr', 'werwer', 'werwr'),
(5, '3453', 'werwre', 23, 'fdsdfs', 343434, 'sdfsdf', 'sdfsf', 'sfdsf', 'sfsfs'),
(6, 'Caho', 'Cataña', 22, '321654987', 34521897, '4258095', 'av siempre vivca 239', 'la cocnha de tu vieja', 'barrio de la muerte'),
(7, 'pEPO', 'Cacheira Do Navos', 27, '3814567894', 34567876, NULL, NULL, NULL, ''),
(8, 'asdasd', 'asdasd', 234243, '2534535', 345345, NULL, NULL, NULL, NULL),
(9, 'sdfsdf', 'sdfsdfsdf', 34, '345345', 345345345, NULL, NULL, NULL, 'sdfsdf'),
(10, 'Pedro', 'Avila', 27, '381634564', 23456765, NULL, NULL, NULL, NULL),
(11, 'Populi', 'Castro', 27, '3458765438', 876464, NULL, NULL, NULL, NULL),
(13, 'Uno', 'Dos', 3, '4', 5, NULL, NULL, NULL, NULL),
(15, 'nnn', 'nnn', 12, '121212', 12121212, NULL, NULL, NULL, NULL),
(16, 'cosa', 'cosa', 12, '123123', 123123, NULL, NULL, NULL, 'cosa'),
(17, 'cccc', 'ccc', 1111, '11111', 11111, NULL, NULL, NULL, 'cccc'),
(18, 'bbb', 'bbb', 33, '33333', 3333, NULL, NULL, NULL, 'bbb'),
(25, 'Roberto', 'Perez', 99, '3814010787', 0, NULL, NULL, NULL, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cobros`
--

DROP TABLE IF EXISTS `cobros`;
CREATE TABLE IF NOT EXISTS `cobros` (
  `id` int(6) NOT NULL,
  `idprestamo` int(6) NOT NULL,
  `idcliente` int(6) NOT NULL,
  `idpago` int(6) NOT NULL,
  `idgestor` int(6) NOT NULL,
  `monto` int(9) DEFAULT NULL,
  `montocobrado` int(9) DEFAULT NULL,
  `fechacobro` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cobros`
--

INSERT INTO `cobros` (`id`, `idprestamo`, `idcliente`, `idpago`, `idgestor`, `monto`, `montocobrado`, `fechacobro`) VALUES
(1, 1, 1, 1, 1, 111, 11, '1111-11-11'),
(2, 2, 2, 2, 2, 2222, 20, '1999-12-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE IF NOT EXISTS `prestamos` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `idcliente` int(6) DEFAULT NULL,
  `idpagos` int(6) DEFAULT NULL,
  `monto` int(6) DEFAULT NULL,
  `tasa` float DEFAULT NULL,
  `montosaldado` int(8) DEFAULT NULL,
  `cantidadpagos` int(4) DEFAULT NULL,
  `diaspagados` int(4) DEFAULT NULL,
  `diasnopagados` int(4) DEFAULT NULL,
  `fechainicio` varchar(10) DEFAULT NULL,
  `pagos` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=128 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`id`, `idcliente`, `idpagos`, `monto`, `tasa`, `montosaldado`, `cantidadpagos`, `diaspagados`, `diasnopagados`, `fechainicio`, `pagos`) VALUES
(125, 890, 7, 7, 7, 7, 171, 7, 7, '6666-77-80', 0),
(123, 11, 11, 11, 11, 11, 11, 11, 11, '1233-12-12', 1),
(3, 1, 1, 2, 1, 1, 1, 1, 1, '1233-12-12', 3),
(126, 12, 11, 11, 11, 11, 11, 11, 11, '1111-11-11', 11),
(127, 9, 9, 9, 9, 9, 9, 9, 9, '9876-54-32', 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prueba`
--

DROP TABLE IF EXISTS `prueba`;
CREATE TABLE IF NOT EXISTS `prueba` (
  `numero1` int(3) NOT NULL AUTO_INCREMENT,
  `numero2` int(3) DEFAULT NULL,
  PRIMARY KEY (`numero1`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prueba`
--

INSERT INTO `prueba` (`numero1`, `numero2`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 6),
(6, 7);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
