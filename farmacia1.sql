-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2017 a las 02:09:49
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmacia1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cedula` int(10) NOT NULL COMMENT 'Única de cada cliente',
  `nombre1` varchar(15) NOT NULL,
  `nombre2` varchar(15) DEFAULT NULL COMMENT 'Una persona puede o no tener segundo nombre',
  `apellido1` varchar(15) NOT NULL,
  `apellido2` varchar(15) DEFAULT NULL COMMENT 'Una persona puede tener o no segundo apellido',
  `direccion` char(45) NOT NULL,
  `telefono` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `direccion`, `telefono`) VALUES
(1, 'a', 'a', 'a', 'a', 'a', 1),
(24559350, 'Mélida', NULL, 'Patiño', 'Hoyos', 'Calle25_#1062_piso3', 3453014),
(30300869, 'Martha', 'Nelly', 'Trujillo', 'Serna', 'Calle96_#16C04_casa36', 3449709),
(1088342470, 'Alejandro', NULL, 'Osorio', 'Trujillo', 'Calle_96_#16C04_casa36', 3449709);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id_compra` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `estado` varchar(20) NOT NULL DEFAULT 'Pendiente',
  `cedula` int(11) NOT NULL,
  `fechacompra` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id_compra`, `id_usuario`, `id_producto`, `cantidad`, `total`, `estado`, `cedula`, `fechacompra`) VALUES
(13, 1, 7, 1, 25000, 'pendiente', 1088349562, '0000-00-00'),
(14, 1, 2, 8, 40000, 'pendiente', 1088349562, '0000-00-00'),
(15, 1, 2, 195, 975000, 'pendiente', 123412, '0000-00-00'),
(16, 1, 2, 49, 245000, 'pendiente', 2147483647, '0000-00-00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `usuario` varchar(10) NOT NULL,
  `contra` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`usuario`, `contra`) VALUES
('admin', 1234);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `registro_medico` int(10) NOT NULL,
  `cedula` int(10) NOT NULL,
  `nombre1` varchar(15) NOT NULL,
  `nombre2` varchar(15) DEFAULT NULL,
  `apellido1` varchar(15) NOT NULL,
  `apellido2` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medicos`
--

INSERT INTO `medicos` (`registro_medico`, `cedula`, `nombre1`, `nombre2`, `apellido1`, `apellido2`) VALUES
(884358, 3524657, 'Jaime', NULL, 'Garzón', 'López'),
(23793, 4126346, 'Armando', NULL, 'Cardozo', 'Vargas'),
(346347436, 4234235, 'Pepito', NULL, 'Pérez', 'Penagos'),
(940358, 10124235, 'Gloria', 'Janeth', 'Ríos', 'Betancur'),
(836294, 10129369, 'Henry', NULL, 'Osorio', 'Patiño'),
(3456789, 12346547, 'Adriana', 'Judith', 'Ochoa', 'Rincón'),
(432535, 12421443, 'Sarita', '', 'Patiño', 'Rojas'),
(7576364, 24266453, 'Jason', NULL, 'Smith', NULL),
(2423525, 24768234, 'Carlos', 'Alberto', 'Córdoba', 'Quintero'),
(3422452, 43259852, 'Carlos', 'Alberto', 'Ocampo', 'Sepúlveda'),
(79474957, 61728219, 'Ariel', NULL, 'Granados', 'Urrea'),
(87793274, 353456214, 'Karen', NULL, 'Agudelo', 'Ospina'),
(645645, 1088345689, 'María', 'Alejandra', 'Cortés', 'Molano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(10) NOT NULL,
  `laboratorio` char(20) NOT NULL,
  `precio` int(10) NOT NULL,
  `cantidad` int(10) NOT NULL,
  `formula_medica` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre`, `descripcion`, `laboratorio`, `precio`, `cantidad`, `formula_medica`) VALUES
(2, 'Cetirizina', '10mg', 'La', 5000, 1, 0),
(6, 'Condones', 'S', 'Durex', 6500, 40, 0),
(7, 'Solución salina', '30ml', 'novamed', 25000, 37, 0),
(8, 'Nitrofurantoína', '100mg', 'MK', 18000, 50, 1),
(9, 'Dololed', '150mg', 'Ledmar', 12000, 75, 0),
(10, 'Oximetazolina', '0,05%', 'MSD', 25000, 120, 0),
(11, 'Ácido fusídico', '2%', 'Genfar', 12500, 125, 0),
(13, 'Effaclar', '3ml', 'La Roche-Posay', 30000, 19, 0),
(14, 'Cetirizina', '10mg', 'MK', 13600, 75, 0),
(15, 'Tramadol-acetaminofén', '325mg', 'Grunenthal', 7600, 36, 0),
(16, 'Amoxicilina', '500mg', 'La Santé', 47000, 48, 0),
(17, 'Pangetan', '2mg', 'Tecnoquímicas', 7500, 45, 0),
(18, 'Minoxidil', '5%', 'Kirkland', 40000, 130, 0),
(19, 'Glicerina carbonatada', '10ml', 'ropim', 3500, 89, 0),
(20, 'alerxy', '4,2ml', 'Abbott', 37000, 32, 0),
(21, 'Antiácido', '100g', 'ENO', 10000, 20, 0),
(22, 'Betahistina diclorhidrato', '24mg', 'Grunenthal', 23000, 56, 0),
(23, 'Bisoprolol fumarato', '2,5mg', 'MerckSerono', 34000, 34, 0),
(24, 'Meloxicam', '15mg', 'La Santé', 37000, 45, 0),
(25, 'Meloxicam', '15mg', 'MK', 11500, 45, 0),
(26, 'Benzocaína', '2%', 'Bussié', 32000, 30, 0),
(27, 'Diclofenaco sódico', '25mg', 'Grunenthal', 17000, 50, 0),
(28, 'Buscapina', '500mg', 'Boehringer Ingelheim', 9000, 100, 0),
(29, 'Concord', '2,5mg', 'Merck', 78000, 20, 0),
(30, 'Raytan', 'Factor 15', 'Merck', 32000, 25, 0),
(31, 'Clotrimazol', '100mg', 'Procaps', 27000, 50, 0),
(32, 'Funide', '15mg', 'LaFrancol', 11000, 70, 0),
(34, 'Clotrimazol solución', '1%', 'Bayer', 14000, 60, 0),
(35, 'Procto-Glyvenol', '5%', 'Novartis', 34000, 45, 0),
(37, 'Prueba', 'Prueba', 'Prueba', 5000, 34, 0),
(38, 'Prueba', 'Prueba', 'Prueba', 10000, 10, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(10) NOT NULL,
  `nombre_usuario` varchar(35) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `cargo_usuario` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `contraseña`, `cargo_usuario`) VALUES
(1, 'admin@superdrogas.com', 'f10e2821bbbea527ea02200352313bc059445190', 'administrador');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id_compra`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`cedula`),
  ADD UNIQUE KEY `cedula` (`cedula`),
  ADD UNIQUE KEY `registro_medico` (`registro_medico`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`),
  ADD UNIQUE KEY `id_producto` (`id_producto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id_compra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
