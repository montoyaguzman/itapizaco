-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2017 a las 21:43:53
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cookiebdd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentariosnegocios`
--

CREATE TABLE `comentariosnegocios` (
  `idUsuarioCoNe` int(11) NOT NULL,
  `comentario` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `hora` time NOT NULL,
  `fecha` date NOT NULL,
  `idNegocioCoNe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentariosrecetas`
--

CREATE TABLE `comentariosrecetas` (
  `idUsuarioCoRe` int(11) NOT NULL,
  `comentario` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `hora` time NOT NULL,
  `fecha` date NOT NULL,
  `idRecetaCoRe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentariosvideorecetas`
--

CREATE TABLE `comentariosvideorecetas` (
  `idUsuarioCoViRe` int(11) NOT NULL DEFAULT '0',
  `comentario` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `hora` time DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idVideoRecetaCoViRe` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

CREATE TABLE `favoritos` (
  `idUsuarioFav` int(11) NOT NULL,
  `idRecetaFav` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menuusuario`
--

CREATE TABLE `menuusuario` (
  `idUsuarioMen` int(11) NOT NULL,
  `comida` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` date NOT NULL,
  `idRecetaMen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `negocios`
--

CREATE TABLE `negocios` (
  `idNegocio` int(11) NOT NULL,
  `nombreNegocio` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `imagen` mediumblob NOT NULL,
  `descripcion` text COLLATE utf8_spanish2_ci NOT NULL,
  `giro` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `productos` text COLLATE utf8_spanish2_ci NOT NULL,
  `correo` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `pagina` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `facebook` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `twitter` varchar(40) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `calificacionNegocio` decimal(10,0) DEFAULT NULL,
  `visitas` int(11) DEFAULT NULL,
  `contacto` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `telefonoContacto` varchar(20) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `negocios`
--

INSERT INTO `negocios` (`idNegocio`, `nombreNegocio`, `imagen`, `descripcion`, `giro`, `productos`, `correo`, `pagina`, `facebook`, `twitter`, `calificacionNegocio`, `visitas`, `contacto`, `telefonoContacto`) VALUES
(2, 'nombre negocio nuevo2', 0x3165334a362e6a706567, 'descripNN', 'CarnicerÃ­a', 'prodNN', 'correNN', 'web1NN', 'faceNN', 'twittNN', NULL, NULL, 'contNN', 'tel de contNN'),
(3, 'sxsdsd', 0x494d472d32303137303532372d5741303030362e6a7067, 'bvfcxs', 'Abarrotes', 'vcxz', 'vcxsza', 'bvcxsz', 'bvcxz<', 'cxsza', NULL, NULL, '74', '21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recetas`
--

CREATE TABLE `recetas` (
  `idReceta` int(11) NOT NULL,
  `nombreReceta` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `imagen` mediumblob NOT NULL,
  `ingredientes` text COLLATE utf8_spanish2_ci NOT NULL,
  `pasos` text COLLATE utf8_spanish2_ci NOT NULL,
  `tiempoPreparacion` int(4) NOT NULL,
  `kilocalorias` int(5) NOT NULL,
  `tipoAlimento` varchar(25) COLLATE utf8_spanish2_ci NOT NULL,
  `tipoPlatillo` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `comida` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `nacionalidad` varchar(20) COLLATE utf8_spanish2_ci NOT NULL,
  `ocasion` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `porciones` int(2) NOT NULL,
  `dificultad` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `informacionNutrimental` text COLLATE utf8_spanish2_ci NOT NULL,
  `tipsReceta` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `calificacionReceta` decimal(2,2) DEFAULT NULL,
  `anuncio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `recetas`
--

INSERT INTO `recetas` (`idReceta`, `nombreReceta`, `imagen`, `ingredientes`, `pasos`, `tiempoPreparacion`, `kilocalorias`, `tipoAlimento`, `tipoPlatillo`, `comida`, `nacionalidad`, `ocasion`, `porciones`, `dificultad`, `informacionNutrimental`, `tipsReceta`, `calificacionReceta`, `anuncio`) VALUES
(15, 'Aguacate relleno de semillas de girasol', 0x61677561636174656170705f70316b48445a492e6a7067, '1/2 pieza de aguacate.\r\n1 cucharada de semillas de girasol.', 'Rellena medio aguacate con una cucharada de semillas de girasol tostadas. Disfruta entre comidas.', 5, 0, 'Ensaladas', 'Entrada', 'Merienda', '', 'Comida diaria', 1, 'Sencilla', 'ProteÃ­nas 0 g.\r\nLÃ­pidos 0 g.\r\nColesterol 0 mg.\r\nAcidos Grasos Saturados 0 g.\r\nMonoinsaturados0 g.\r\nPoliinsaturados 0 g.', '', NULL, NULL),
(16, 'Pan tostado con pera y miel', 0x70616e326170705f7a335a323536662e6a7067, '1 rebanada de pan tostado.\r\n1/2 pieza de pera.\r\n1 cucharadita de miel.', 'Distribuye las rebanadas de pera sobre el pan tostado y termina con unos hilos de miel.', 10, 0, 'Postres y dulces', 'Entrada', 'Desayuno', '', 'Comida diaria', 2, 'Sencilla', 'ProteÃ­nas 0 g.\r\nLÃ­pidos 0 g.\r\nColesterol 0mg.\r\nAcidos Grasos Saturados 0 g.\r\nMonoinsaturados 0 g.\r\nPoliinsaturados 0 g.', '', NULL, NULL),
(17, 'Postre de merengue con crema de arandano', 0x706f7374726544654d6572656e677565322e6a7067, 'Para el merengue\r\n3/4 taza de agua de garbanzos de lata\r\n1/2 taza de azÃºcar\r\n2 cucharadas de extracto de vainilla\r\n4 cucharadas de nueces mixtas tostadas y finamente picadas\r\nPara la crema de avellanas y chocolate\r\n4 piezas de plÃ¡tano tabasco\r\n3 cucharadas de avellanas tostadas con piel\r\n3 cucharadas de cocoa sin azÃºcar\r\n1 cucharada de aceite de coco fundido\r\nPara servir\r\n1/2 taza de fresas lavadas, desinfectadas, rebanadas y congeladas\r\n1/2 taza de frutas rojas mixtas (frambuesa, moras azules) lavadas, desinfectadas y congeladas\r\n1 pieza de durazno en medias lunas\r\n2 cucharaditas de azÃºcar glass (opcional)', 'Para el merengue\r\nPrecalienta tu horno a 150 ÂºC.\r\nColoca en tu batidora el agua de garbanzo y bate a velocidad alta con el aditamento de globo por aproximadamente 15 minutos, hasta obtener picos suaves. \r\nBaja la velocidad de la batidora e incorpora el azÃºcar cucharada por cucharada hasta integrarla completamente y vuelve a batir a velocidad alta, hasta obtener una apariencia brillante. Integra finalmente el extracto de vainilla y las nueces de manera envolvente.\r\nColoca una hoja de papel estrella dentro de una charola para horno de aproximadamente 30 x 20 cm. \r\nVierte el merengue dentro de la parrilla y distribuye en una capa uniforme y lleva a hornear de 1Â½ a 2 horas, o hasta que tomen una textura firme y crujiente. Apaga el horno, deja reposar el merengue 10 minutos adentro y retÃ­ralo para dejar enfriar completamente en dentro de la charola sobre una rejilla.\r\n \r\nPara la crema de avellanas y chocolate\r\nColoca los plÃ¡tanos en tu procesador de alimentos y muele a pulsos hasta obtener una textura cremosa. AÃ±ade las avellanas, la cocoa y aceite de coco y vuelve a procesar hasta obtener una textura suave y cremosa. Reserva en refrigeraciÃ³n.\r\n \r\nPara el armado\r\nUnta la placa de merengue con la crema de avellanas y chocolate casera y decora con las frutas y azÃºcar glass. Sirve de inmediato o reserva en refrigeraciÃ³n hasta el momento de servir. Comparte y disfruta.', 60, 20, 'Postres y dulces', 'Postre', 'Cena', '', 'Especial', 8, 'Media', 'ProteÃ­nas 0 g.\r\nLÃ­pidos 0 g.\r\nColesterol 0 mg.\r\nAcidos Grasos Saturados 0 g.\r\nMonoinsaturados 0 g.\r\nPoliinsaturados 0 g.', '', NULL, NULL),
(18, 'Rib eye a la parrilla', 0x526962457965526f7374697a61646f2e6a7067, '3 cucharadas de aceite de oliva\r\n2 dientes de ajo finamente picados\r\n2 piezas de echalote finamente picados\r\n4 cucharadas de perejil lavadas, desinfectadas y finamente picadas\r\n2 cucharadas de romero lavado, desinfectado y finamente picado\r\n2 cucharadas de orÃ©gano lavado, desinfectado y finamente picado\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\n4 piezas de filetes de rib eye 140g c/u\r\n16 piezas de espÃ¡rragos verdes\r\n2 tazas de purÃ© de papa natura', 'Precalienta tu parrilla.\r\nPon en un tazÃ³n aceite de oliva, ajo, chalote, perejil, romero, orÃ©gano, sal y pimienta; mezcla hasta integrar. Coloca los filetes en una charola o contenedor y Ãºntalos por ambos lados, aproximadamente 4 minutos de cada lado para un tÃ©rmino medio, y los espÃ¡rragos estÃ©n suaves por fuera y firmes por dentro. \r\nSirve caliente y disfruta. ', 30, 648, 'Carnes', 'Plato fuerte', 'Comida', '', 'Comida diaria', 4, 'Media', 'ProteÃ­nas 30 g\r\nLÃ­pidos 43.5 g\r\nColesterol 95.2 mg\r\nAcidos Grasos Saturados 14.2 g\r\nMonoinsaturados 21.7 g\r\nPoliinsaturados 2 g', '', NULL, NULL),
(19, 'Sandwich de aguacate y jamÃ³n de pavo', 0x6d6564696f73616e64776963686170705f446575554f62632e6a7067, '2 rebanadas de pan de caja\r\n1/4 pieza de aguacate\r\n1 rebanada de jamÃ³n de pavo', 'Unta el aguacate en el pan tostado, rellena el sandwich de jamÃ³n de pavo y las hojas verdes de tu agrado. \r\nCorta por la mitas y disfruta una entre comidas.', 10, 25, 'Carnes', 'Plato fuerte', 'Almuerzo', '', 'Picnic', 1, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g.', '', NULL, NULL),
(20, 'Shots de galleta con dulce de leche', 0x73686f7473446547616c6c657461426c6f672e6a7067, 'Para la masa\r\n1 taza de mantequilla a temperatura ambiente\r\n1/3 taza de azÃºcar\r\n1/2 taza de azÃºcar morena\r\n1 pieza de yema de huevo\r\n2 cucharaditas de extracto de vainilla\r\n2 1/2 tazas de harina\r\n1 pizca de sal\r\n2/3 taza de chispas de chocolate semi amargo fundido\r\nPara el relleno\r\n1/2 taza de chocolate semi-amargo fundido\r\n4 cucharadas de dulce de leche\r\n1/4 taza de leche descremada\r\n2 cucharadas de leche descremada\r\n1 cucharadita de vainilla Las semillas', 'Para la masa\r\nAcrema la mantequilla junto con el azÃºcar en tu batidora con el aditamento de pala, hasta que obtengas un color pÃ¡lido y una textura esponjosa. \r\nRaspa los bordes del tazÃ³n, agrega la yema y la vainilla e incorpora por completo.\r\nBaja la velocidad de la batidora, aÃ±ade la harina y la sal y bate hasta que se forme una masa. RetÃ­rala del tazÃ³n, colÃ³cala sobre tu superficie de trabajo ligeramente enharinada, agrÃ©gale las chispas de chocolate y amasa con movimiento suaves para incorporarlas.\r\nDivide la masa en 2 porciones y extiende cada una entre dos hojas de papel estrella, hasta obtener Â½ cm de grosor; colÃ³calas en charolas y refrigera por al menos 30 minutos.\r\nPrecalienta tu horno a 180 ÂºC. \r\nEngrasa ligeramente 12 moldes individuales especiales para este tipo de postre o utiliza una charola para muffins altos.\r\nRetira la masa del refrigerador y corta 12 cÃ­rculos de masa con ayuda de un cortador circular, del diÃ¡metro del fondo de los moldes. Corta el resto de la masa en tiras de 2 a 4 cm de ancho.\r\nColoca los cÃ­rculos de masa al fondo de los moldes y rellena el perÃ­metro con las tiras de masa; de modo que al centro queden completamente huecos. Presiona las tiras de masa entre si para evitar que se abran al momento de hornear. Corta el excedente de masa de los moldes. \r\nColoca los moldes en una charola y lleva a hornear de 12 a 17 minutos, hasta que los bordes doren ligeramente; no los pierdas de vista para evitar que se pasen.\r\nRetira del horno y deja enfriar por completo en una rejilla.\r\n \r\nPara el relleno\r\nDesmolda las galletas y agrega una cucharada de chocolate fundido dentro una de las galletas; gÃ­rala para que las paredes internas se impregnen con chocolate y voltÃ©ala sobre el tazÃ³n con el chocolate para retirar el exceso; repite este paso con el resto de las galletas y refrigera hasta que el chocolate se torne firme.\r\nCombina en una olla chica el dulce de leche con el resto de los ingredientes y calienta hasta que el dulce se disuelva. Deja enfriar completamente y refrigera hasta el momento de servir.\r\nSirve el dulce lÃ­quido dentro de los vasitos de galleta y comparte. Disfruta de inmediato.\r\n', 90, 50, 'Bebidas', 'Postre', 'Comida', '', 'Especial', 12, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(21, 'ColaciÃ³n de chÃ­a con mango', 0x707564696e636869615f6b5852483333672e6a7067, '2 cucharadas de chÃ­a\r\n1/2 taza de leche de almendras\r\n1/4 taza de mango', 'Mezcla la chÃ­a con la leche de almendras y el mango picado y deja reposar por dos horas antes de comerlo. Disfruta entre comidas. ', 5, 0, 'Ensaladas', 'Botana', 'Merienda', '', 'Comida diaria', 2, 'Media', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(22, 'Flan de plÃ¡tano', 0x666c616e5f706c6174616e6f2e6a7067, 'Para el caramelo\r\n1/4 taza de azÃºcar\r\nPara el flan\r\n4 piezas de huevo\r\n5 piezas de yema de huevo\r\n1 taza de leche condensada\r\n1 taza de leche evaporada\r\n1/2 taza de leche descremada\r\n2 piezas de plÃ¡tano tabasco picado, sin semillas\r\n60 gramos de queso crema\r\n2 cucharadas de fÃ©cula de maÃ­z\r\n1 cucharadita de extracto de vainilla', 'Para el caramelo\r\nColoca el azÃºcar en un sartÃ©n con antiadherente y calienta a fuego bajo hasta formar un caramelo claro. Cubre el fondo de un molde chico para flan y deja enfriar.\r\n\r\nPara el flan\r\nPrecalienta tu horno a 160ÂºC.\r\nLicÃºa todos los ingredientes hasta integrar. Reposa la preparaciÃ³n para que la espuma desaparezca. Llena el molde para flan con la mezcla, cÃºbrelo con papel aluminio y pÃ¡salo a una bandeja o refractario hondo para horno. AÃ±ade agua caliente dentro de la bandeja o refractario hondo para horno. AÃ±ade agua caliente dentro de la bandeja hasta cubrir 3/4 partes de altura del molde. Hornea a 160ÂºC hasta que el centro del flan estÃ© firme; por 40minutos, aproximadamente. una vez listo, retira del horno, deja enfriar y refrigera el flan por al menos una hora. Sirve frÃ­o. ', 35, 197, 'Postres y dulces', 'Postre', 'Comida', '', 'Comida diaria', 12, 'Media', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(23, 'Sopa casera de pasta con calabacitas', 0x736f70615f63616c6162617a612e6a7067, '1 cucharada de aceite de canola\r\n1/4 pieza de cebolla finamente picada\r\n2 dientes de ajo finamente picados\r\n4 piezas de tomate (jitomate) escaldados sin piel y sin semillas\r\n2 cucharadas de pasta de tomate\r\n200 gramos de municiÃ³n La ModernaÂ®\r\n2 piezas de calabacita baby en rodajas asadas\r\n1 pizca de sal\r\n1 pizca de pimienta\r\n4 cucharadas de requesÃ³n', 'Calienta el aceite en una olla mediana y saltea la cebolla por unos minutos hasta que suavice. Agrega el ajo y cocina por 2 minutos mÃ¡s. Pasa a tu licuadora y procesa junto con los tomates y una taza de caldo de vegetales hasta obtener una salsa homogÃ©nea. Regresa la salsa a la olla y agrega el resto del caldo y la pasta de tomates. Revuelve muy bien y permite que hierva. integra la pasta y cocina por 12 minutos mÃ¡s. Agrega las calabaceas asadas y aumenta el sabor con sal y pimienta negra molida. Sirve en platos soperos y disfruta con un poco de requesÃ³n. ', 30, 163, 'Sopas', 'Entrada', 'Comida', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(24, 'Hotdogs con chiles toreados', 0x32382d686f742d646f672d732d6c756b6f6d2e6a7067, '4 piezas de salchicha res\r\n2 rebanadas de tocino de pavo picado\r\n1/2 pieza de cebolla morada fileteada\r\n2 piezas de chile serrano limpios y en julianas\r\n1/2 pieza de limÃ³n sin semillas (el jugo)\r\n2 cucharaditas de salsa inglesa\r\n3 rebanadas de queso amarillo\r\n4 piezas de pan para hot dog integral\r\n1 al gusto de mostaza\r\n1 al gusto de salsa catsup reducida en azÃºcar', 'Marca las salchichas con cortes diagonales con ayuda de un cuchillo bien afilado, sin cortarlas por completo; como si estuvieras marcando la letra â€œwâ€ en todo lo largo de la salchicha. \r\nAsa las salchichas en un sartÃ©n caliente hasta que doren y estÃ©n bien cocinadas. Reserva caliente.\r\nCocina el tocino en otro sartÃ©n hasta que dore. Agrega ahÃ­ mismo la cebolla y los chiles serranos; saltea hasta que la cebolla transparente. AÃ±ade jugo de limÃ³n, salsa inglesa y queso amarillo. Baja el fuego y cocina moviendo constantemente para integrar los sabores y permitir que el queso se funda.\r\nCalienta los panes para hotdog y agrega una salchicha en cada pan. Agrega encima la mezcla de chiles toreados con queso fundido y disfruta con las salsas de tu preferencia si lo deseas.', 25, 30, 'Carnes', 'Plato fuerte', 'Comida', '', 'Fin de semana', 6, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(25, 'Pay de limÃ³n vegano', 0x7061796c696d6f6e2e6a7067, 'Para la base\r\n1 1/4 tazas de galletas estilo Graham, molidas\r\n1/4 taza de aceite de coco a temperatura ambiente\r\nPara el relleno\r\n7 piezas de limÃ³n con semillas (limÃ³n real)\r\n1/4 taza de aceite de coco fundido\r\n1 taza de nuez de la India naturales, remojadas en agua la noche previa (escurridas)\r\n1/3 taza de miel de agave\r\n3/4 taza de leche de coco\r\nPara decorar\r\n1 lata de crema de coco entera, refrigerada sin mover por al menos 8 horas\r\n1 cucharadita de miel de agave\r\n4 cucharaditas de coco rallado tostado\r\n2 piezas de limÃ³n amarillo en medias lunas\r\n2 cucharadas de ralladura de limÃ³n amarillo', 'Para la base\r\n\r\nPrecalienta tu horno a 180ÂºC y llena con capacillos una charola para 12 muffins.\r\nMuele las galletas en tu procesador de alimentos o licuadora, hasta obtener un polvo fino. PÃ¡salas a un tazÃ³n y combina con el aceite de coco, hasta integrar y humedecer las galletas. \r\nReparte las galletas en los capacillos y aplana con ayuda de la base de un vaso de vidrio.\r\nHornea las bases por 10 minutos o hasta dorar; retira del horno y permite enfriar por completo.\r\n \r\nPara el relleno\r\n\r\nRalla la cÃ¡scara de algunos limones hasta obtener 1 cucharada de ralladura. CÃ³rtalos en mitades y exprÃ­melos hasta obtener Â½ taza de jugo.\r\nColoca los productos de limÃ³n y el resto de los ingredientes en tu licuadora y procesa a velocidad alta, hasta obtener una consistencia cremosa y homogÃ©nea. Rectifica el sabor con un poco de miel de ser necesario.\r\nVierte esta mezcla sobre las bases horneadas, con los capacillos dentro del molde ya frÃ­o; golpea el molde sobre tu mesa de trabajo para retirar cualquier burbuja de aire y alisar las superficies. Ralla un poco mÃ¡s de piel de limÃ³n sobre los pays y refrigera por al menos 2 horas, o hasta que el relleno estÃ© firme.\r\n \r\nPara decorar\r\n\r\nRetira la lata de leche de coco de tu refrigerador cuando los pays estÃ©n firmes y Ã¡brela con cuidado de no agitarla.\r\nRetira los sÃ³lidos de la lata con ayuda de una cuchara y colÃ³calos en el tazÃ³n de tu batidora. AÃ±ade vainilla y miel de agave y bate a mÃ¡xima velocidad, hasta que esponje y doble su tamaÃ±o, como si se tratara de crema batida.\r\nDecora los pays de limÃ³n con la crema batida de coco, coco rallado, medias lunas de limÃ³n y  ralladura. Comparte y disfruta.', 50, 266, 'Postres y dulces', 'Postre', 'Merienda', '', 'Fin de semana', 12, 'Media', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(26, 'Ensalada de jaiba', 0x544f5354414441532d44452d454e53414c4144412d44452d4a414942415f363335583336302e6a7067, '', 'Para las manzanas\r\nColoca en una olla agua, vinagre, sal, azÃºcar y pimientas. Calienta a fuego alto, revolviendo constantemente hasta disolver los polvos. Retira del fuego, deja enfriar y vierte dentro de un frasco con tapa. Agrega los cubos de manzana y deja reposar por al menos 4 horas dentro de refrigeraciÃ³n para que las manzanas se curtan.\r\n \r\nPara la mayonesa\r\nLicÃºa en procesador o licuadora: garbanzos, agua de garbanzo, ajo, mostaza, jugo de limÃ³n, sal y pimienta hasta que todos los ingredientes estÃ©n incorporados y no haya grumos. AÃ±ade aceite vegetal y licÃºa por 1 minuto. Vierte el aceite de oliva y licÃºa otro minuto mÃ¡s o hasta que los aceites estÃ©n integrados y tengas una textura espesa y cremosa. Incorpora el chipotle cuando obtengas esta textura y vuelve a procesar hasta incorporar; reserva en un frasco en refrigeraciÃ³n. \r\n \r\nPara la ensalada\r\nCalienta el aceite en un sartÃ©n y saltea los chÃ­charos hasta que tomen un tono verde intenso y suavicen. Aumenta su sabor con sal, pimienta y jugo de limÃ³n. Retira del sartÃ©n para enfriar por completo y detener la cocciÃ³n.\r\nMezcla en un tazÃ³n la pulpa de cangrejo con los chÃ­charos y 3 cucharadas de mayonesa alternativa.\r\nEmplata la ensalada con ayuda de un molde rectangular; colÃ³calo en un plato extendido y agrega una porciÃ³n de la ensalada de jaiba. Presiona bien para que mantenga la forma y desmolda. Decora encima con las manzanas encurtidas y berros. \r\nDisfruta de inmediato.', 30, 40, 'Pescados y mariscos', 'Botana', 'Cena', '', 'Fin de semana', 0, 'Dificil', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(27, 'Tortitas de papa con pico de gallo', 0x746f7274697461735f706170612e6a7067, 'Para el pico de gallo\r\n3 piezas de tomate (jitomate) sin semillas y en cubos chicos\r\n1/2 pieza de cebolla picada\r\n2 piezas de chile serrano sin semillas y picados\r\n3 cucharadas de albahaca lavada, desinfectada y picada\r\n2 cucharadas de jugo de limÃ³n\r\n1/2 cucharada de aceite de oliva\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\nPara las tortitas\r\n6 piezas de papa grandes\r\n1/4 pieza de cebolla finamente picada\r\n3 cucharadas de perejil lavado, desinfectado y picado\r\n1 pieza de huevo batido\r\n2/3 taza de pan molido\r\n1 pizca de sal\r\n1 pizca de pimienta\r\n2 cucharadas de aceite de canola', 'Para el pico de gallo\r\nCombina todos los ingredientes en un tazÃ³n y reserva.\r\n \r\nPara las tortitas\r\nColoca las papas calientes en un tazÃ³n grande y machÃ¡calas con un pisa purÃ©. Agrega cebolla, perejil, huevo, pan molido, sal, pimienta y mezcla muy bien hasta obtener una consistencia compacta y manejable.\r\nArma 12 tortitas con tus manos y frÃ­elas en un sartÃ©n con el aceite caliente .Permite que se doren por ambos lados.\r\nSirve caliente y disfruta con el pico de gallo.', 25, 261, 'Legumbres y potajes', 'Plato fuerte', 'Comida', '', 'Comida diaria', 6, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(28, 'Tacos de minilla', 0x7461636f735f6d696e696c6c612e6a7067, '2 cucharadas de aceite de oliva\r\n1/2 pieza de cebolla picada\r\n1 diente de ajo picado\r\n2 piezas de tomate (jitomate) escalfados, sin semillas y picados\r\n1 cucharada de azÃºcar\r\n2 hojas de laurel\r\n400 gramos de pescado blanco picado\r\n2 cucharadas de perejil las hojas\r\n2 cucharadas de pasas picadas\r\n1 cucharada de alcaparras en mitades\r\n4 piezas de aceitunas en rodajas\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\n8 piezas de tortillas de maÃ­z\r\n2 piezas de limones en cuartos\r\n1 al gusto de salsa roja', 'Calienta en una olla el aceite y suda ligeramente la cebolla y el ajo sin dejar que cambien de color. integra tomate, azÃºcar y laurel, meuve constantemente por 2 minutos o hasta que la preparaciÃ³n cambie de color; debe pasar del rojo vivo al rojo pÃ¡lido. Agrega el pescado junto con el resto de los ingredientes  cocina la manilla a fuego medio hasta que hierva. Baja la flama y sigue cocinando por 10 minutos mÃ¡s sin dejar de mover para evitar que se pegue. calienta las tortillas en un comal y arma los tacos con la manilla caliente. sirve y disfruta con jugo de limÃ³n y salsa al  gusto. ', 20, 361, 'Carnes', 'GuarniciÃ³n', 'Desayuno', '', 'Fin de semana', 4, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(29, 'Rollo de pollo familiar relleno de arroz', 0x526f6c6c6f4465506f6c6c6f426c6f672e6a7067, 'Para el rollo\r\n4 piezas de pechuga de pollo semi aplanadas\r\n1 pizca de sal pimienta negra molida\r\n1 pizca de pimienta negra\r\n1 manojo de acelgas lavadas y desinfectadas (5 a 6 hojas)\r\n1 1/2 tazas de arroz integral\r\n1/2 taza de Hummus natural\r\nPara servir\r\n4 piezas de tomate (jitomate) pochados, en cuartos (calientes)\r\n2 dientes de ajo asados y picados\r\n3 cucharadas de hoja de albahaca lavadas, desinfectadas y ligeramente picadas\r\n2 cucharaditas de aceite de oliva\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\n1 1/2 cucharadas de aceite de aguacate', 'Para el rollo\r\nEmpareja las orillas de las pechugas de pollo, cortando los excedentes para lograr que todas tengan un tamaÃ±o similar; espolvorÃ©alas con sal y pimienta. Acomoda y extiende las pechugas en una sola capa, sobre un rectÃ¡ngulo grande de papel encerado, con el que las envolverÃ¡s para formar el rollo.\r\nSepara los tallos de las hojas de acelga y colÃ³calas sobre las pechugas de pollo; descarta los tallos.\r\nDistribuye encima de las acelgas el arroz, aÃ±ade hummus y finalmente la zanahoria rallada.\r\nForma el rollo de pollo, envolviendo las pechugas dentro del plÃ¡stico, logrando que todo el relleno quede al centro y sin dejar que el plÃ¡stico se envuelva junto con este. Aprieta el rollo como si estuvieras envolviendo un caramelo y ata los extremos para evitar que se deshaga y las pechugas no se mojen al momento de la cocciÃ³n.\r\nColoca el rollo en una olla grande, aÃ±ade agua hasta cubrirlo, tapa y cocina de 30 a 40 minutos, hasta que el pollo cambie de color y estÃ© firme. Dale vuelta al rollo durante este proceso para una cocciÃ³n uniforme; aÃ±ade mÃ¡s agua en la olla si se llegarÃ¡ a consumir.\r\nRetira el rollo del agua cuando estÃ© bien cocinado y deja enfriar ligeramente .\r\n \r\nPara servir\r\nColoca los tomates pochados aÃºn calientes en un tazÃ³n grande y pÃ­salos con ayuda de un pisa papas, hasta obtener un purÃ© con tropiezos. AÃ±ade ajo, albahaca, aceite de oliva, sal y pimienta y revuelve bien; pon a calentar esta la salsa en una olla chica a fuego bajo.\r\nCalienta el aceite de aguacate en un sartÃ©n amplio o plancha y sella el rollo de pollo por todos sus lados, hasta que dore.\r\nCorta el rollo en rodajas semi gruesas para servir y compartir y disfruta con la salsa de tomates y la ensalada de tu preferencia. ', 40, 90, 'Carnes', 'GuarniciÃ³n', 'Merienda', '', 'Comida diaria', 6, 'Sencilla', '', '', NULL, NULL),
(30, 'Jugo de naranja, fresa, pingÃ¼ica y guayaba', 0x6a75676f5f6e6172616e6a615f66726573615f70696e67756963612e6a7067, '1 1/2 tazas de agua\r\n1 taza de jugo de naranja reciÃ©n exprimido\r\n3 piezas de fresas lavadas y desinfectadas\r\n1 cucharada de pingÃ¼ica\r\n1 cucharada de miel de agave (opcional)\r\n1 pieza de guayaba sin semillas\r\n1/2 taza de alfalfa lavada y desinfectada', 'LicÃºa todos los ingredientes hasta incorporar y sirve de inmediato. ', 20, 18, 'Jugos y licuados', 'Entrada', 'Almuerzo', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(31, 'Coliflor rostizada con glaseado de durazno y chile', 0x636f6c69666c6f725f676c6173656164612e676966, 'Para el glaseado\r\n1 cucharada de aceite de oliva\r\n1/4 pieza de cebolla finamente picada\r\n3 piezas de durazno en medias lunas o Â¾ de taza de chabacanos deshidratados, en mitades\r\n1 pieza de chile morita sin semillas y picado\r\n1 cucharadita de pÃ¡prika\r\n1 cucharadita de pimienta negra reciÃ©n molida\r\n1/2 taza de vinagre balsÃ¡mico\r\n1/3 taza de agua\r\n4 cucharadas de miel de agave o de abeja\r\nPara la coliflor\r\n1 pieza de coliflor grande, limpia, entera y blanqueada\r\n1/4 taza de hoja de cilantro lavadas. desinfectadas y ligeramente picadas\r\n1/4 taza de hierbabuena lavada, desinfectada y ligeramente picada\r\n4 cucharadas de almendras tostadas y ligeramente picadas', 'Para el glaseado\r\nCalienta el aceite en una olla y cocina la cebolla, hasta que transparente. \r\nIncorpora los chabacanos, mueve constantemente y permite que tomen un tono dorado. Aumenta el sabor con chile morita, pÃ¡prika y pimienta; cocina por un par de minutos mÃ¡s. AÃ±ade vinagre, agua y miel. Baja el fuego y hierve por 10 minutos, o hasta que los lÃ­quidos reduzcan y tomen una consistencia de jarabe.\r\n \r\nPara la coliflor\r\nPrecalienta tu horno a 200ÂºC.\r\nColoca la coliflor en un refractario rectangular y bÃ¡Ã±ala con el glaseado de chabacano; asegÃºrate de que se cubra perfectamente, distribuyendo el glaseado con ayuda de una cuchara.\r\nHornea la coliflor de 30 a 40 minutos, hasta que estÃ© suave al centro y haya tomado un tono dorado. Una vez lista retira del horno y deja reposar 10 minutos.\r\nEspolvorea la coliflor rostizada con las hierbas y las almendras y lleva hasta tu mesa para disfrutar.', 0, 140, 'Ensaladas', 'Plato fuerte', 'Cena', '', 'Comida diaria', 6, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(32, 'Creme bruleÃ© de frambuesas', 0x6372656d655f6272756c655f636f636f2e676966, '2 tazas de leche de coco\r\n1 taza de frambuesas lavadas y desinfectadas\r\n4 piezas de yema de huevo\r\n3 cucharadas de miel de abeja\r\n1 pieza de vaina de vainilla (las semillas)\r\n1/2 taza de coco rallado picado', 'Precalienta tu horno a 160 ÂºC.\r\nLicua la leche de coco con las frambuesas hasta incorporar. Pasa la leche a una olla mediana y calienta a fuego medio, moviendo constantemente hasta que comience a hervir. Retira inmediatamente del fuego.\r\nMientras tanto, bate en un tazÃ³n yemas de huevo con miel de abeja y semillas de vainilla. \r\nAgrega al tazÃ³n aproximadamente 1 taza de la leche de coco caliente, sin dejar de batir y virtiendo poco a poco, hasta integrar por completo.\r\nJunta la mezcla de huevos con la leche sobrante, revuelve muy bien con un batidor globo y por Ãºltimo incorpora las hojas de albahaca.\r\nReparte la mezcla en ramequines y hornÃ©alos en baÃ±o marÃ­a de 35 a 40 minutos o hasta que estÃ©n ligeramente firmes.\r\nRetira del horno, deja enfriar completamente y refrigera por al menos 2 horas.\r\nDecora las creme bruleÃ© justo antes de servir; agrega coco rallado y quema o brulea con ayuda de un soplete de cocina, para formar una especie de costra.\r\nSirve y disfruta.', 50, 157, 'Postres y dulces', 'Botana', 'Desayuno', '', 'Comida diaria', 6, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(33, 'Paletas de mandarina, chÃ­a y jamaica', 0x50616c657461732d64652d6d616e646172696e612c2d636869612d792d6a616d616963615f30332e6a7067, '12 piezas de mandarina (3 tazas de jugo + 1/2 taza de gajos)\r\n1 1/2 cucharadas de chÃ­a\r\n1/2 taza de flores de jamaica hidratadas\r\n0 al gusto de chile piquÃ­n', 'Corta 11 mandarinas en mitades y exprime el jugo; conserva en una jarra.\r\nPela perfectamente la Ãºltima mandarina, saca los gajos, cÃ³rtalos en mitades y agrÃ©galos al jugo. Incorpora semillas de chÃ­a y flores de jamaica; revuelve bien.\r\nReparte la mezcla en 8 moldes para paleta y congela de 2 a 3 horas o hasta que estÃ©n completamente firmes.\r\nDisfruta con chile piquÃ­n al gusto.', 250, 60, 'Helados', 'Postre', 'Merienda', '', 'Fin de semana', 8, 'Media', 'ProteÃ­nas 1.4 g\r\nLÃ­pidos 1.4 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0.2 g\r\nPoliinsaturados 0.9 g', '', NULL, NULL),
(34, 'Ensalada de garbanzos con pure de zanahoria y frut', 0x67617262616e7a6f735f66727574612e6a7067, 'Para la vinagreta\r\n2 cucharadas de aceite de oliva\r\n1/2 cucharada de vinagre de vino tinto\r\n1/2 cucharadita de pÃ¡prika molida\r\n1 pizca de sal y pimienta negra molida\r\nPara la ensalada\r\n2 tazas de garbanzos cocinados en agua sin sal, escurridos y pelados\r\n12 piezas de zanahoria sin piel en cuadros medianos\r\n1 cucharada de aceite de oliva\r\n2 cucharaditas de pÃ¡prika\r\n1 pizca de sal y pimienta negra molida\r\n1/2 pieza de naranja sin semillas (el jugo)\r\n1/2 taza de verdolagas chicas, limpias, lavadas y desinfectadas\r\n1/2 taza de berros limpios, lavados y desinfectados\r\n1/2 taza de fresas chicas, lavadas y desinfectadas\r\n1/2 taza de moras azules lavadas y desinfectadas\r\n2 cucharadas de ajonjolÃ­ negro, tostado\r\n1/4 taza de brotes de betabel lavados y desinfectados', 'Para la vinagreta\r\n\r\nCombina todos los ingredientes en tazÃ³n y mezcla con un batidor de globo hasta formar una emulsiÃ³n. Reserva.\r\n \r\nPara la ensalada\r\n\r\nPrecalienta tu horno a 200 ÂºC.\r\nColoca los garbanzos y las zanahorias en una charola para horno, baÃ±a con aceite de oliva y espolvorea con pÃ¡prika, sal y pimienta.\r\nHornea los vegetales por aproximadamente 15 minutos, hasta que los garbanzos estÃ©n crujientes y las zanahorias rosticen. \r\nDeja enfriar los garbanzos saliendo del horno y pasa las zanahorias a tu procesador de alimentos. Agrega el jugo de naranja y procesa hasta formar un purÃ© suave y homogÃ©neo. Cuela el purÃ© si deseas una textura mÃ¡s tersa.\r\nColoca la vinagreta en un tazÃ³n grande y agrega el sobrante de garbanzos verdolagas y berros; revuelve para integrar todos los sabores.\r\nMonta la ensalada en un plato semi profundo o extendido; forma una lÃ­nea al centro del plato con el purÃ© de zanahoria y acomoda encima, en forma de fila, la mezcla de vegetales del tazÃ³n y los frutos rojos. Decora con ajonjolÃ­, brotes y disfruta de inmediato.', 20, 330, 'Legumbres y potajes', 'GuarniciÃ³n', 'Cena', '', 'Comida diaria', 4, 'Media', 'ProteÃ­nas 10.3 g\r\nLÃ­pidos 16.2 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 1.9 g\r\nMonoinsaturados 9.2 g\r\nPoliinsaturados 1.8 g', '', NULL, NULL),
(35, 'Barritas de semillas', 0x62617272697461735f73656d696c6c61732e676966, '1 taza de avena tostada\r\n1/2 taza de semillas de girasol tostadas\r\n3 cucharadas de chÃ­a\r\n1/4 taza de amaranto tostado\r\n1/2 taza de mantequilla de cacahuate casera\r\n1 pizca de canela en polvo', '\r\nColoca todos los ingredientes en un tazÃ³n y revuelve muy bien hasta integrar por completo.\r\nExtiende la masa en un molde cuadrado con papel encerado y presiÃ³nala hasta que la parte superior de la masa estÃ© lisa.\r\nRefrigera por 3 horas, corta en barritas y disfruta.', 10, 151, 'Legumbres y potajes', 'Botana', 'Almuerzo', '', 'Comida diaria', 12, 'Sencilla', 'ProteÃ­nas 6.6 g\r\nLÃ­pidos 11.2 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 1.6 g\r\nMonoinsaturados 3.4 g\r\nPoliinsaturados 5 g', '', NULL, NULL),
(36, 'Postre de galleta con helado de yogurt casero y pu', 0x506f73747265646567616c6c6574612e6a7067, '\r\nPara las galletas\r\n2 1/2 piezas de plÃ¡tano tabasco\r\n1 cucharada de miel de abeja\r\n3/4 taza de yogurt griego sin grasa\r\n1 cucharada de jugo de limÃ³n\r\nPara las galletas\r\n8 rebanadas de pasta hojaldre frÃ­os (5 x 12 cm)\r\n1 cucharada de aceite de coco fundido o mantequilla\r\n1 cucharada de azÃºcar mascabado\r\nPara el pudÃ­n de chocolate\r\n1/2 pieza de aguacate maduro en cubos\r\n1/2 pieza de plÃ¡tano tabasco maduro en rodajas\r\n2 cucharadas de cocoa en polvo sin azÃºcar\r\n1 cucharada de miel de agave\r\n1/2 cucharadita de miel de agave\r\n1 pizca de sal\r\n1 lata de agua de coco\r\nPara el armado\r\n4 piezas de frambuesas lavadas, desinfectadas y en mitades\r\n1 cucharada de azÃºcar glass (para decorar)', 'Para el helado\r\nPela los plÃ¡tanos, cÃ³rtalos en cuartos y colÃ³calos en una charola con papel encerado. Cubre con plÃ¡stico auto adherible y congela de 4 a 12 horas, hasta que estÃ©n firmes.\r\nColoca los plÃ¡tanos congelados junto con el resto de ingredientes en tu procesador de alimentos o licuadora y procesa hasta obtener una consistencia pesada y homogÃ©nea. Conserva en tu congelador hasta el momento de usar.\r\n \r\nPara las galletas\r\nPrecalienta tu horno a 200 ÂºC.\r\nColoca los rectÃ¡ngulos de pasta de hojaldre sobre una charola de aluminio para horno ligeramente engrasada. Coloca sobre los rectÃ¡ngulos otra charola del mismo tamaÃ±o (para evitar que inflen y mantengan su forma) y hornea de 20 a 30 minutos, hasta que doren y estÃ©n crujientes. Retira del horno una vez listos, barniza las galletas con mantequilla fundida y espolvorÃ©alas con azÃºcar mascabado; deja enfriar.\r\n \r\nPara el pudÃ­n\r\nColoca en tu procesador todos los ingredientes menos las semillas de cacao y la menta. Procesa hasta obtener una consistencia muy cremosa y homogÃ©nea. Agrega un poco de agua de coco de ser necesario.\r\n \r\nPara el armado\r\nForma sÃ¡ndwiches con las galletas, agregando al centro de 1 a 2 cucharadas de helado de yogurt y unas frambuesas. Agrega encima de estos sÃ¡ndwiches 1 cucharada del pudÃ­n de chocolate y termina decorando con mÃ¡s frambuesas y azÃºcar glass.\r\nSirve de inmediato y comparte.', 50, 150, 'Postres y dulces', 'Postre', 'Cena', '', 'Fin de semana', 4, 'Dificil', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(37, 'Mantequilla de cacahuate casera', 0x6d616e74657175696c6c615f6361636168756174652e6a7067, '2 1/2 tazas de cacahuates pelados\r\n1 cucharada de aceite de coco fundido\r\n1 pizca de sal', 'Tuesta los cacahuates en un sartÃ©n, hasta que doren.\r\nReserva media taza de cacahuates, coloca el resto dentro de tu procesador de alimentos junto con el aceite de coco y la sal. Procesa a pulsos hasta que comience a formarse una pasta, enseguida deja encendido el procesador hasta obtener una consistencia cremosa y homogÃ©nea.\r\nPica los cacahuates que reservaste, intÃ©gralos a la mantequilla y revuelve muy bien.\r\nPasa la mantequilla a una frasco de vidrio y conserva en refrigeraciÃ³n hasta por 2 semanas.', 30, 106, 'Postres y dulces', 'Botana', 'Cena', '', 'Picnic', 500, 'Sencilla', 'ProteÃ­nas 4.5 g\r\nLÃ­pidos 9 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 1.8 g\r\nMonoinsaturados 3.8 g\r\nPoliinsaturados 2.9 g', '', NULL, NULL),
(38, 'Huevos con jamÃ³n', 0x687565766f732d706172612d656c2d6465736179756e6f2e6a7067, 'Para el muffin\r\n6 rebanadas de pechuga de pavo Natural ZwanÂ®\r\n6 piezas de huevo\r\n0 cantidad necesaria de aceite en aerosol\r\n1 pizca de pimienta negra molida\r\nPara servir\r\n1 pieza de aguacate rebanado\r\n0 al gusto de Salsa de molcajete, al gusto\r\n1 cucharada de brotes de betabel lavados y desinfectados', 'Para el muffin\r\nPrecalienta tu horno a 180ÂºC.\r\nCorta las rebanadas de Pechuga de Pavo Natural ZwanÂ® en cuadros chicos. Bate los huevos en un tazÃ³n, agrega los cuadros de jamÃ³n y mezcla hasta integrar.\r\nRocÃ­a una charola para 6 muffins con aceite en aerosol y llena con la mezcla de huevo. Espolvorea los muffins con pimienta negra molida y hornea de 20 a 22 minutos o hasta que estÃ©n completamente cocinados y ligeramente dorados.\r\n \r\nPara servir\r\nSirve los muffins calientes en platos, acompaÃ±a con aguacate, salsa roja de molcajete y brotes mixtos. Comparte y disfruta de inmediato. ', 30, 116, 'Huevos', 'Plato fuerte', 'Desayuno', '', 'Comida diaria', 6, 'Sencilla', 'ProteÃ­nas 9 g\r\nLÃ­pidos 8.5 g\r\nColesterol 186.1 mg\r\nAcidos Grasos Saturados 0.6 g\r\nMonoinsaturados 1.9 g\r\nPoliinsaturados 0.9 g', '', NULL, NULL),
(39, 'Crepas de coco sin gluten de duraznos a la parrill', 0x6372657061735f647572617a6e6f2e6a7067, 'Para las crepas\r\n4 cucharadas de harina de coco\r\n4 piezas de huevo\r\n3/4 taza de leche de coco entera\r\n1 pizca de sal\r\n1/4 cucharadita de canela en polvo\r\n1/4 cucharadita de vaina de vainilla (las semillas)\r\n1 cucharada de aceite de coco\r\nPara el relleno\r\n2 piezas de durazno chicos en medias lunas\r\n1 cucharadita de vinagre balsÃ¡mico\r\n1 cucharadita de romero fresco, finamente picado\r\n2 cucharaditas de miel de agave', 'Para las crepas\r\nCierne la harina de coco en un tazÃ³n. AÃ±ade los huevos uno a uno, batiÃ©ndolos perfectamente hasta integrar con la mezcla. \r\nVierte lentamente la leche de coco y conforme sigues batiendo, hasta incorporar.\r\nAumenta el sabor de la masa con sal, canela y vainilla y dÃ©jala reposar por al menos 30 minutos para que la harina absorba el lÃ­quido.\r\nBarniza con aceite de coco un sartÃ©n para crepas o un sartÃ©n amplio con antiadherente caliente y agrega de 2 a 3 cucharadas de la masa; esparce perfectamente sobre la superficie del sartÃ©n con ayuda de una espÃ¡tula, hasta formar un circulo de 14 cm de diÃ¡metro. Cocina de 3 a 4 minutos, hasta que la base dore. Dale la vuelta y continua cocinando por un par de minutos mÃ¡s.\r\nReserva las crepas cocinadas unas sobre otras y repite con el resto de las porciones.\r\n \r\nPara el relleno\r\nColoca los duraznos en un tazÃ³n y agrega vinagre, romero y miel. Revuelve bien para impregnar todo el sabor en los duraznos y cocÃ­nalos en tu parrilla caliente, ligeramente engrasada, hasta que las lÃ­neas se marquen en los duraznos.\r\nSirve las crepas con los duraznos parrillados y baÃ±a con un poco de los lÃ­quidos restantes en el sartÃ©n.', 50, 198, 'Postres y dulces', 'Postre', 'Merienda', '', 'Especial', 4, 'Media', 'ProteÃ­nas 8.5 g\r\nLÃ­pidos 14 g\r\nColesterol 186.1 mg\r\nAcidos Grasos Saturados 7.7 g\r\nMonoinsaturados 3.9 g\r\nPoliinsaturados 1.7 g', '', NULL, NULL),
(40, 'Fajitas de pollo', 0x66616a697461735f706f6c6c6f5f706f6d69656e746f732e6a7067, 'Para la marinada\r\n1/2 taza de yogurt\r\n2 cucharaditas de jengibre picado\r\n1 diente de ajo picado\r\n1/4 cucharadita de comino molido\r\n1/2 cucharadita de chile de Ã¡rbol seco, picado\r\n1 pizca de sal\r\n1 pizca de pimienta\r\nPara las fajitas\r\n1 pieza de pechuga de pollo deshuesada y sin piel, en fajitas\r\n1 cucharada de aceite de ajonjolÃ­\r\n1/2 cucharada de aceite de canola\r\n1 pieza de pimiento rojo en julianas\r\n1 pieza de pimiento verde en julianas\r\n1 pieza de pimiento naranja en julianas', 'Para la marinada\r\nMezcla todos los ingredientes en un tazÃ³n hasta incorporar; reserva. \r\n\r\nPara las fajitas\r\nAgrega 3/4 partes de la marinada en un tazÃ³n y agrega las fajitas de pollo; refrigera por 15 minutos para que tomen todo el sabor. Transcurrido el tiempo, escurre el exceso de marinada, calienta los aceites en un sartÃ©n y sella las fajitas hasta que doren. Agrega los pimientos y saltea constantemente hasta que suavicen; por 5 minutos mÃ¡s, aproximadamente. Sirve caliente y disfruta con el sobrante de la marinada como salsa. ', 40, 164, 'Carnes', 'GuarniciÃ³n', 'Comida', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 18.1 g\r\nLÃ­pidos 6.7 g\r\nColesterol 40.4 mg\r\nAcidos Grasos Saturados 1 g\r\nMonoinsaturados 2.6 g\r\nPoliinsaturados 2.1 g', '', NULL, NULL),
(41, 'Rollos de hojaldre con queso oaxaca', 0x526f6c6c69746f7320646520686f6a616c647265206465206a616dc3b36e2073657272616e6f20636f6e20717565736f20792073616c616d692e6a7067, 'Para los rollos\r\n1/2 taza de chorizo firme en medias lunas delgadas\r\n300 gramos de pasta hojaldre\r\n2 cucharadas de harina\r\n1 1/2 tazas de queso oaxaca\r\n1 pieza de chile jalapeÃ±o limpio y en julianas\r\n1/4 taza de hoja de cilantro lavadas y desinfectadas\r\n1 pizca de pimienta negra molida\r\n1 pieza de huevo batido con 2 cucharadas de agua\r\nPara servir\r\n1 al gusto de salsa picante\r\n1/2 pieza de aguacate en rebanadas delgadas\r\n4 cucharadas de hoja de cilantro lavado, desinfectado y ligeramente picado', 'Precalienta tu horno a 180 ÂºC.\r\nCocina el chorizo en un sartÃ©n caliente, hasta que dore; escurre el exceso de grasa y reserva.\r\nExtiende la pasta de hojaldre en tu superficie de trabajo ligeramente enharinada. Corta un rectÃ¡ngulo de 40 x 50 cm aproximadamente y 0.5 cm de grosor. Extiende sobre la pasta el queso, el chorizo cocinado, el chile jalapeÃ±o y las hojas de cilantro; deja espacio en uno de los extremos para poder cerrar el rollo perfectamente.\r\nBarniza las orillas de la masa con huevo y enrolla el hojaldre como si estuvieras haciendo sushi; envuelve por completo el relleno, de modo que quede entre las capas de masa.\r\nColoca el rollo relleno sobre una charola con papel encerado y mete a tu conge por 10 minutos. Retira y divide el rollo en 8 partes iguales. \r\nAcomoda los roles dentro de un refractario rectangular y barniza la superficie con el huevo batido.\r\nHornea de 15 a 20 minutos o hasta que tomen un tono dorado uniforme e inflen.\r\n \r\nPara servir\r\nSirve los rollos de queso saliendo del horno; decora con salsa, aguacate y hojas de cilantro. Comparte y disfruta', 35, 120, 'Pastas y pizzas', 'Plato fuerte', 'Comida', '', 'Especial', 8, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(42, 'Galletas de lenteja', 0x67616c6c657461735f6c656e74656a61732e6a7067, 'Para las galletas\r\n1 taza de amaranto tostado\r\n3/4 taza de harina\r\n1 1/2 cucharaditas de polvo para hornear\r\n1 1/2 cucharaditas de cardamomo molido\r\n1 pizca de sal\r\n1 pieza de huevo a temperatura ambiente\r\n2 cucharadas de aceite de coco fundido\r\n1 cucharadita de extracto de vainilla\r\n1/2 taza de miel de agave\r\n3/4 taza de lentejas cocinadas en agua sin sal (escurridas)\r\nPara el untable\r\n1/2 taza de berros fresco, lavados, desinfectados y blanqueados\r\n3/4 taza de edamames congelados, descongelados (calientes)\r\n1/2 diente de ajo asado\r\n1 1/2 cucharadas de aceite de ajonjolÃ­\r\n2 cucharadas de jugo de limÃ³n\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida', 'Para las galletas\r\nCombina en un tazÃ³n el amaranto junto con harina integral, polvo para hornear, cardamomo y sal. \r\nBate en otro tazÃ³n el huevo con el aceite de coco y la vainilla. Vierte la miel y bate nuevamente hasta incorporar perfectamente. Agrega la mezcla de amaranto y revuelve hasta integrar. Finalmente aÃ±ade las lentejas y mezcla en forma envolvente con ayuda de una pala de silicÃ³n.\r\nCubre el tazÃ³n y refrigera por al menos 30 minutos.\r\nPrecalienta tu horno a 160 ÂºC.\r\nForma 12 galletas tomando porciones con ayuda de una cuchara y extendiÃ©ndolas en una charola con papel encerado.\r\nHornea de 12 a 15 minutos. Retira del horno y deja enfriar 15 minutos sobre la charola antes de pasarlas a una rejilla para enfriar.\r\n \r\nPara el untable\r\nProcesa todos los ingredientes en tu licuadora o procesador, hasta obtener una textura homogÃ©nea y cremosa; de ser necesario agrega un poco de agua para lograr la consistencia.\r\nDisfruta las galletas con este untable y comparte.', 60, 174, 'Postres y dulces', 'Botana', 'Cena', '', 'Fin de semana', 12, 'Dificil', 'ProteÃ­nas 3.9 g\r\nLÃ­pidos 5.2 g\r\nColesterol 17.7 mg\r\nAcidos Grasos Saturados 2.7 g\r\nMonoinsaturados 0.9 g\r\nPoliinsaturados 0.7 g', '', NULL, NULL),
(43, 'Pollo agridulce con salsa de piÃ±a', 0x616c697461732d64652d706f6c6c6f2d656e2d73616c73612d6167726964756c63652e6a7067, '1 cucharada de aceite de ajonjolÃ­\r\n3 piezas de cebolla cambray en cuartos\r\n2 piezas de zanahoria en rebanadas sesgadas\r\n2 tallos de apio en rebanadas sesgadas\r\n2 tazas de jÃ­cama en cubos medianos\r\n4 cucharadas de mermelada de piÃ±a reducida en azÃºcar\r\n1 cucharada de pulpa de tamarindo\r\n2 cucharadas de salsa de pescado\r\n1 pieza de pechuga de pollo en cubos medianos\r\n1 cucharadita de aceite de canola\r\n2 cucharaditas de fÃ©cula de maÃ­z\r\n1/2 taza de agua\r\n1 cucharada de salsa picante oriental\r\n1 cucharada de jengibre finamente rallado\r\n2 tallos de cebolla cambray finamente picados\r\n1 cucharada de ajonjolÃ­ mixto, tostado', 'Calienta el aceite de ajonjolÃ­ en un wok o sartÃ©n profundo y saltea los vegetales junto con la jÃ­cama, hasta que tomen un tono mÃ¡s vivo y hayan suavizado ligeramente. Retira los vegetales del wok y reserva.\r\nMezcla en un tazÃ³n mermelada, pulpa de tamarindo y salsa de pescado. Integra perfectamente y pasa por esta mezcla los cubos de pollo.\r\nCalienta el aceite de canola en el wok y cocina el pollo hasta que cambien de color y doren ligeramente. \r\nDisuelve la fÃ©cula en el agua e incorpora al wok junto con la salsa picante y el jengibre. Deja a fuego alto durante 2 minutos o hasta que el lÃ­quido espese. Regresa los vegetales al wok, cocina por 1 minuto mÃ¡s y espolvorea tallos de cebolla cambray y ajonjolÃ­ mixto.\r\nSirve de inmediato y disfruta.', 15, 60, 'Carnes', 'Botana', 'Desayuno', '', 'Especial', 4, 'Sencilla', 'ProteÃ­nas 150 g\r\nLÃ­pidos 2 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0.3 g\r\nPoliinsaturados 2 g', '', NULL, NULL),
(44, 'InfusiÃ³n de naranja con arÃ¡ndanos', 0x696e667573696f6e5f6e6172616e6a615f6172616e64616e6f2e6a7067, '2 tazas de agua\r\n1 taza de naranja (la piel)\r\n1 taza de arÃ¡ndanos deshidratados\r\n1 pieza de anÃ­s estrella\r\n2 ramas de menta las vadas y desinfectadas\r\n1 taza de jugo de naranja reciÃ©n exprimido', 'CÃ³loca el agua en una olla y aÃ±ade piel de naranja, arÃ¡ndanos, anÃ­s y menta. Hierve a fuego bajo por 2 minutos, retira del fuego y deja infusionar por 10min. AÃ±ade el jugo de naranja a la infusiÃ³n y sirve caliente o rÃ­a. ', 0, 104, 'Bebidas', 'Botana', 'Comida', '', 'Picnic', 4, 'Sencilla', 'ProteÃ­nas 6 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(45, 'Brownies gÃ¼eros de mantequilla', 0x62726f776e6965732e6a7067, '1 lata de aceite en aerosol\r\n1/2 taza de mantequilla sin sal fundida\r\n3/4 taza de azÃºcar mascabado\r\n1 pieza de huevo\r\n1 cucharadita de extracto de vainilla\r\n1/2 taza de mantequilla de cacahuate\r\n1 pizca de sal\r\n1 taza de harina\r\n1/2 taza de plÃ¡tano tabasco en rodajas delgadas, congeladas', 'Precalienta tu horno a 180 ÂºC y forra un refractario cuadrado para horno con papel encerado y engrasa ligeramente con aceite en aerosol.\r\nCombina en un tazÃ³n la mantequilla fundida con el azÃºcar hasta incorporar. Agrega el huevo y la vainilla; bate perfectamente.\r\nAgrega la mantequilla de cacahuate y mezcla hasta estar seguro que todos los ingredientes estÃ¡n bien incorporados.\r\nAÃ±ade la sal y la harina y vuelve a mezclar hasta incorporar. Integra las rodajas de plÃ¡tano y mezcla de manera envolvente, con ayuda de una espÃ¡tula de silicÃ³n.\r\nTransfiere la masa al molde que preparaste; alisa la superficie con una espÃ¡tula.\r\nHornea de 20 a 25 minutos, o hasta que al insertar un palillo al centro, salga limpio.\r\nDeja enfriar saliendo del horno, desmolda y corta en cuadros grandes. Comparte y disfruta', 15, 110, 'Postres y dulces', 'Plato fuerte', 'Desayuno', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(46, 'Pescado con salsa de papaya dulce', 0x63713564616d2e7765622e313238302e313238302e6a706567, '4 filetes del pescado de tu preferencia\r\n1 taza de papaya pelada y picada en trocitos\r\n2 tazas de yogur natural\r\n3 cucharadas de miel de abeja\r\nSal y pimienta al gusto\r\nAceite vegetal', '1. Barniza los filetes con aceite, sazona con sal y pimienta y frÃ­elos hasta que estÃ©n cocidos; retira del fuego.\r\n2. En la misma sartÃ©n calienta un poco de aceite, aÃ±ade la papaya y cuando empiece a deshacerse, retira del fuego.\r\n3. LÃ­cuala con el yogur y la miel hasta obtener una mezcla homogÃ©nea, vierte en un recipiente y reserva.\r\n4. Barniza los filetes con la salsa de papaya y sirve. ', 60, 20, 'Pescados y mariscos', 'Plato fuerte', 'Comida', '', 'Especial', 4, 'Media', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL),
(47, 'Pescado a la cacerola', 0x63616365726f6c612e6a7067, '6 filetes del pescado de tu preferencia\r\n1/2 barrita de mantequilla\r\n1 cebolla rebanada\r\n1 pimiento rojo cortado en tiras delgadas\r\n4 calabazas rebanadas\r\n2 tazas de ramitos de brÃ³coli\r\n3/4 de taza de crema\r\n3/4 de taza de vino blanco\r\n1 cucharadita de pimienta negra\r\nSal y pimienta al gusto\r\nAceite vegetal', '1. Calienta la mantequilla con un chorrito de aceite, frÃ­e la cebolla y el pimiento hasta que la cebolla estÃ© transparente.\r\n2. Incorpora las verduras, revuelve para impregnarlas, agrega el vino, la pimienta negra y la crema y cocina hasta que suelte el hervor; retira.\r\n3. Sazona los filetes con sal y pimienta y frÃ­elos en aceite hasta que estÃ©n cocidos (la carne se separa en capitas al picarlas con un tenedor); retira del fuego. BaÃ±a los filetes con la salsa y acompaÃ±a con las verduras.', 90, 70, 'Pescados y mariscos', 'Plato fuerte', 'Cena', '', 'Comida diaria', 6, 'Media', 'ProteÃ­nas 0 g\r\nLÃ­pidos 0 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0 g\r\nMonoinsaturados 0 g\r\nPoliinsaturados 0 g', '', NULL, NULL);
INSERT INTO `recetas` (`idReceta`, `nombreReceta`, `imagen`, `ingredientes`, `pasos`, `tiempoPreparacion`, `kilocalorias`, `tipoAlimento`, `tipoPlatillo`, `comida`, `nacionalidad`, `ocasion`, `porciones`, `dificultad`, `informacionNutrimental`, `tipsReceta`, `calificacionReceta`, `anuncio`) VALUES
(48, 'Coctel de camarones con fresa', 0x63616d61726f6e657346726573612e6a7067, '20 camarones medianos, cocidos\r\n1 taza de fresas rebanadas\r\n1/2 taza de catsup\r\n1 cucharada de mayonesa\r\n2 cucharadas de pureÌ de fresa\r\n2 cucharadas de aceite de oliva\r\n2 cucharadas de jugo de limoÌn\r\nSalsa Tabasco', '1. Coloca en copas los camarones y las fresas.\r\n2. Combina los ingredientes restantes y sirve con los camarones en copas.', 40, 140, 'Pescados y mariscos', 'Plato fuerte', 'Cena', '', 'Especial', 6, 'Sencilla', 'ProteÃ­nas 20 g\r\nLÃ­pidos 20 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 130 g\r\nMonoinsaturados 10.1 g\r\nPoliinsaturados .8 g', '', NULL, NULL),
(49, 'Coctel Moscow Mole', 0x636f6374656c4d756c652e6a7067, '1 oz de ron oscuro\r\nÂ½ de jugo de limÃ³n\r\nRefresco de cola\r\nHielo al gusto', '1. Agrega la onza de ron con el jugo de limÃ³n dentro del vaso con hielo y mÃ©zclalo bien.\r\n2. Agrega el refresco de cola.\r\n3. Si quieres darle un toque mÃ¡s fresco; decÃ³ralo con una rodaja de limÃ³n. ', 5, 0, 'Bebidas', 'Botana', 'Cena', '', 'Especial', 1, 'Sencilla', '', '', NULL, NULL),
(51, 'Salsa de almeja', 0x616c6d656a612e6a7067, '1 taza de almejas picadas\r\n1 taza de crema baja en grasa\r\n2 cucharadas de cebollÃ­n picado\r\n2 cucharaditas de salsa inglesa\r\n2 cucharadas de purÃ© de tomate\r\nPimienta al gusto\r\nGalletas saladas', '1. Mezcla las almejas con la crema, el cebollÃ­n, la salsa inglesa y el purÃ© de tomate hasta integrarlos; sazona con pimienta.\r\n2. Vierte en un tazÃ³n, cubre con plÃ¡stico autoadherible y refrigera 30 minutos antes de servir.', 20, 60, 'Pures y cremas', 'Botana', 'Cena', '', 'Fiesta', 10, 'Sencilla', '', '', NULL, NULL),
(52, 'Pierna de cerdo rellena de nuez', 0x706965726e612e6a7067, '1 pierna de cerdo de 1.200 kg aprox.\r\n150 g de nuez picada\r\n150 g de almendras picadas\r\n150 g de avellanas picadas\r\n150 g de cacahuates picados\r\n2 tazas de vino blanco\r\nSal y pimienta al gusto\r\nAceite vegetal\r\n200 g de queso de cabra\r\n2 tazas de leche\r\n1 paquete de 190 g de queso crema\r\nSal y pimienta al gusto', '1. En un tazÃ³n revuelve la nuez, la almendra, la avellana y el cacahuate; reserva.\r\n2. Con un cuchillo afilado haz un corte profundo a lo largo de la carne pero sin traspasarla, sazona con sal y pimienta y rellena con las nueces; enrolla la carne apretadamente y amÃ¡rrala con hilo cÃ¡Ã±amo.\r\n3. FrÃ­ela en una cacerola con aceite para sellarla y hasta que dore por todos lados.\r\n4. AcomÃ³dala en un refractario engrasado y bÃ¡Ã±ala con 2 tazas de agua y el vino.\r\n5. Hornea, en horno precalentado, durante 2 horas a 180Â°C o hasta que la carne estÃ© cocida.\r\n6. Para hacer la salsa: licua todos los ingredientes hasta obtener una mezcla homogÃ©nea; vacÃ­a en una salsera y reserva a temperatura ambiente hasta que sea el momento de servir.', 240, 95, 'Carnes', 'Plato fuerte', 'Cena', '', 'Especial', 20, 'Dificil', '', '', NULL, NULL),
(53, 'Pavo relleno al vino blanco', 0x7061766f2e6a7067, '1 pavo de 4 a 6 kg\r\n3/4 de litro de vino blanco\r\n1/2 taza de miel de abeja\r\n1/4 de taza de jugo de limoÌn\r\n1/2 taza de jugo de naranja\r\n1 cucharadita de ajo en polvo\r\n1 cucharadita de cebolla en polvo\r\n1/2 cucharadita de tomillo en polvo\r\n1 cucharada de consomeÌ de pollo en polvo\r\n2 cucharadas de vinagre blanco\r\n1/4 de taza de salsa de soya\r\nPara el relleno\r\n350 g de carne molida de cerdo\r\n350 g de jamoÌn picado\r\n1/4 de cebolla picada\r\n2 dientes de ajo picados\r\n1/2 pimiento morroÌn rojo picado\r\n3 jitomates pelados, sin semillas y picados\r\n1 taza de pasas\r\n1 taza de almendras peladas\r\n1 cucharadita de jugo sazonador\r\n1 cucharadita de salsa inglesa\r\nSal y pimienta al gusto\r\nAceite vegetal', '1. Mezcla el vino blanco con la miel, los jugos, el ajo, la cebolla, el tomillo y el consomeÌ en polvo, el vinagre y la salsa de soya.\r\n2. Lava el pavo, inyeÌctale la preparacioÌn anterior por diferentes partes y deÌjalo reposar 24 horas dentro del refrigerador; baÌnÌƒalo o inyeÌctalo varias veces en ese lapso.\r\n3. Para hacer el relleno: en poco aceite friÌe la cebolla junto con el ajo y el pimiento hasta que esteÌn acitronados.\r\n4. Incorpora el jitomate, cuando cambie de color, anÌƒade la carne y el jamoÌn y cocina hasta que la carne casi esteÌ cocida (mueve para deshacer los grumos).\r\n5. Agrega las pasas, las almendras, el jugo sazonador, la salsa inglesa, sal y pimienta; cocina 5 minutos a fuego bajo; retira de la estufa.\r\n6. Rellena el pavo con lo anterior, forra las piernas y las alas con papel aluminio, ponlo en una pavera y cubre con aluminio.\r\n7. Hornea, en horno precalentado, durante 5 horas a 160Â°C; quita el aluminio y hornea 20 minutos maÌs a 180Â°C o hasta que dore la superficie.  ', 350, 110, 'Carnes', 'Plato fuerte', 'Cena', '', 'Especial', 20, 'Dificil', '', '', NULL, NULL),
(54, 'Sincronizadas de pollo con salsa martajada', 0x73696e63726f6e697a6164615f64655f706f6c6c6f5f615f6c615f70617272696c6c612e6a7067, 'Para la salsa\r\n3 piezas de tomate verde\r\n2 dientes de ajo\r\n1/4 pieza de cebolla en trozos\r\n1 pieza de chile morita limpio e hidratado\r\n3 cucharadas de hoja de cilantro lavadas y desinfectadas\r\n1 pizca de sal y pimienta negra molida\r\n\r\nPara las sincronizadas\r\n1 pieza de pechuga de pollo Mezquite, cocinada segÃºn las instrucciones de su empaque\r\n8 piezas de tortillas de harina integral\r\n1 1/2 tazas de queso chihuahua rallado\r\n1/2 taza de granos de elote amarillos\r\n1 cucharada de mantequilla sin sal\r\n\r\nPara servir\r\n2 cucharadas de crema baja en grasa\r\n2 cucharadas de cebollÃ­n fresco, lavado, desinfectado y picado', 'Para la salsa\r\nAsa en un comal los vegetales y el chile, hasta que suavicen y cambien completamente de color. Retira el chile en cuanto comience a desprender su aroma, para evitar que se queme y amargue la salsa.\r\nPasa los ingredientes asados a un molcajete o mortero, agrega cilantro, sal y pimienta y martaja hasta integrar y obtener la textura de tu preferencia. Reserva.\r\n\r\nPara las sincronizadas\r\nCorta la Pechuga cocinada en lÃ¡minas delgadas y arma las sincronizadas de una tortilla, rellenando con pollo, queso y granos de elote. \r\nDobla y cocina las sincronizadas en un sartÃ©n o comal caliente con un poco de mantequilla, hasta que doren por ambos lados y el queso se funda.\r\n\r\nPara servir\r\nCorta las sincronizadas en mitades, decora con crema y cebollÃ­n y disfruta con la salsa martajada.', 20, 25, 'Carnes', 'Plato fuerte', 'Almuerzo', '', 'Comida diaria', 6, 'Media', 'ProteÃ­nas 11.6 g\r\nLÃ­pidos 11.7 g\r\nColesterol 30.8 mg\r\nAcidos Grasos Saturados 6.5 g\r\nMonoinsaturados 3.6 g\r\nPoliinsaturados 0.9 g', '', NULL, NULL),
(55, 'Pollo con vegetales y couscous', 0x7665676574616c65732e6a7067, '2 cucharadas de aceite de oliva\r\n2 dientes de ajo rebanados\r\n1 pieza de cebolla morada chica, en cuadros medianos\r\n1 pieza de pimiento rojo en cuadros medianos\r\n1 pieza de pimiento amarillo en cuadros medianos\r\n1 pieza de pimiento verde en cuadros medianos\r\n1 1/2 tazas de cous cous cocinado segÃºn las instrucciones de su empaque\r\n1 pizca de sal y pimienta negra molida\r\n1 cucharadita de tomillo seco molido\r\n1 cucharadita de perejil seco molido\r\n3 piezas de pechuga de pollo', 'Calienta el aceite en un sartÃ©n y cocina el ajo hasta que suavice. Agrega el resto de los vegetales y saltea por 2 minutos constantemente para que suavicen.\r\nAgrega el cous cous al sartÃ©n, revuelve bien y aumenta el sabor con sal, pimienta, tomillo y perejil; cocina por 2 minutos mÃ¡s.\r\nColoca las Pechugas Mezquite en un recipiente apto para microondas y calienta por 3 minutos en mÃ¡xima potencia. Una vez listas corta las pechugas den rebanadas sesgadas y coloca encima de una cama del salteado de vegetales y cous cous. Comparte y disfruta.', 20, 319, 'Carnes', 'Plato fuerte', 'Comida', '', 'Comida diaria', 6, 'Media', 'ProteÃ­nas 24.3 g\r\nLÃ­pidos 16.1 g\r\nColesterol 58.1 mg\r\nAcidos Grasos Saturados 3.5 g\r\nMonoinsaturados 9.3 g\r\nPoliinsaturados 2.7 g', '', NULL, NULL),
(56, 'Ensalada de duraznos con menta', 0x656e73616c64612d6361657361722e6a7067, '2 cucharaditas de aceite de ajonjolÃ­\r\n2 piezas de durazno grandes, en trozos grandes irregulares\r\n2 tallos de apio rebanados en diagonales o rombos\r\n2 cucharadas de tallos de cebolla cambray finamente rebanados\r\n1 taza de tomate (jitomate) cherry en mitades\r\n4 piezas de rÃ¡bano cambray, en rodajas delgadas\r\n1/2 taza de menta hojas grandes, lavadas y desinfectadas\r\n2 cucharaditas de aceite de oliva\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\n1/4 taza de nuez de la India tostadas\r\n1 pieza de manzana verde en medias lunas delgadas', '1. Calienta el aceite de ajonjolÃ­ en un sartÃ©n y saltea los duraznos junto con los tallos de apio y de cebolla, hasta que doren ligeramente; aproximadamente de 2 a 3 minutos.\r\n2. Pasa los duraznos a un tazÃ³n grande y deja enfriar ligeramente. Incorpora el resto de los ingredientes y revuelve para incorporar sabores.\r\n3. Sirve de inmediato y disfruta.', 10, 0, 'Ensaladas', 'Botana', 'Cena', '', 'Picnic', 4, 'Sencilla', '', '', NULL, NULL),
(57, 'Burritos de pollo al chipotle', 0x6275727269746f732d64652d706f6c6c6f2e6a7067, 'Para el adobo\r\n2 piezas de chile chipotle adobado, sin semillas\r\n1/4 taza de tallos de cilantro lavados y desinfectados\r\n1/2 pieza de cebolla asada\r\n1/2 taza de tomate (jitomate) deshidratados (sin aceite)\r\n1/4 taza de vinagre de manzana\r\nPara los burritos\r\n1 pieza de pechuga de pollo limpia, semi aplanada\r\n1 lata de aceite en aerosol\r\n4 piezas de tortillas de harina integral grandes\r\n1/2 taza de frijoles bayos refritos\r\n1/2 pieza de aguacate rebanado\r\n2 cucharadas de hoja de cilantro lavadas y desinfectadas\r\n2 cucharadas de queso cotija desmoronado', 'Para el adobo\r\nLicua todos los ingredientes hasta obtener un adobo terso y homogÃ©neo. Agrega 1 o 2 cucharadas de agua en caso de ser necesario, para obtener la consistencia deseada.\r\n \r\nPara los burritos\r\nBarniza la pechuga de pollo con el adobo; puedes dejarla marinar por algunos minutos dentro de tu refrigerador si lo deseas. \r\nCocina el pollo adobado en tu parrilla caliente y ligeramente engrasada con aceite en aerosol, hasta que las lÃ­neas se marquen y estÃ© bien cocinada al centro; aproximadamente 5 minutos por lado. DÃ©jala reposar dos minutos cuando este lista y cÃ³rtala en rebanadas sesgadas y semi delgadas.\r\nCalienta las tortillas en un comal o sartÃ©n grande, Ãºntalas con frijoles bayos y acomoda encima una porciÃ³n de pollo adobado. Agrega aguacate, cilantro y queso Cotija y dobla en forma de burritos; repite con el resto de las porciones.\r\nCorta en mitades, sirve de inmediato y disfruta', 50, 30, 'Carnes', 'Botana', 'Merienda', '', 'Picnic', 2, 'Media', '', '', NULL, NULL),
(58, 'Nuggets al horno con cÃ¡tsup', 0x4e7567676574732d64652d706f6c6c6f2d636173657261732d342e6a7067, 'Para la cÃ¡tsup\r\n1 taza de purÃ© de tomate (jitomate)\r\n3 cucharadas de miel de abeja\r\n1/2 taza de vinagre blanco\r\n1 cucharada de orÃ©gano seco\r\n1 cucharadita de cebolla en polvo\r\n1 pizca de ajo en polvo\r\n1 pizca de sal y pimienta negra molida\r\n2 piezas de chile morita , limpios y asados\r\n1 cucharadita de aceite de aguacate\r\n1/4 taza de tallo de cilantro lavados, desinfectados y picados\r\nPara los nuggets\r\n1 paquete de Nugget de Pollo TysonÂ®\r\n1 cucharada de aceite de canola\r\n2 piezas de zanahoria grandes, en bastones\r\n1 pieza de pepino en bastones\r\n2 piezas de tallo de apio , en bastones\r\n1 pieza de jÃ­cama pequeÃ±a, en bastones', 'Para la cÃ¡tsup \r\nLicÃºa todos los ingredientes menos el aceite y los tallos de cilantro, hasta que estÃ©n perfectamente incorporados. \r\nCalienta el aceite en una olla chica con antiadherente, agrega los ingredientes licuados y cocina a fuego bajo por aproximadamente 25 minutos moviendo ocasionalmente, hasta que la cÃ¡tsup reduzca y tengas una consistencia espesa. EnfrÃ­a y agrega los tallos de cilantro. Reserva. \r\n\r\nPara nuggets\r\nBarniza los Nuggets de Pollo TysonÂ® con la cÃ¡tsup casera que reciÃ©n preparaste. \r\nCalienta el aceite en un sartÃ©n mediano y cocina los nuggets de 3 a 5 minutos de cada lado, hasta que obtengan un tono dorado uniforme.\r\nSÃ­rvelos calientes y acompaÃ±a con los bastones de vegetales y cÃ¡tsup casera. Comparte y disfruta.', 40, 503, 'Carnes', 'Plato fuerte', 'Almuerzo', '', 'Comida diaria', 6, 'Sencilla', 'ProteÃ­nas 20.3 g\r\nLÃ­pidos 29.1 g\r\nColesterol 184.3 mg\r\nAcidos Grasos Saturados 6.6 g\r\nMonoinsaturados 14.4 g\r\nPoliinsaturados 7.2 g', '', NULL, NULL),
(59, 'Ensalada de frijoles con tofu y vegetales', 0x746f66752e6a7067, '3 tazas de frijoles mixtos cocinados en agua sin sal y escurridos\r\n1 taza de tofu firme en cubos chicos\r\n2 piezas de tomate (jitomate) sin semillas, en cubos chicos\r\n1 taza de granos de elote amarillo\r\n1 pieza de aguacate en cubos medianos\r\n4 piezas de rÃ¡bano lavados, desinfectados y rebanados', 'Mezcla todos los ingredientes en un tazÃ³n e incorpora con cuidado para no deshacer el aguacate. Sirve de inmediato y disfruta.', 10, 0, 'Ensaladas', 'Botana', 'Merienda', '', 'Fin de semana', 6, 'Sencilla', '', '', NULL, NULL),
(60, 'Fusilli con salsa de tinta de calamar', 0x667573696c6c695f73616c73615f63616c616d61722e6a7067, '2 litros de agua\r\n1 cucharada de sal de grano\r\n200 gramos de fusilli La ModernaÂ®\r\n2 rebanadas de tocino de cerdo ahumado\r\n1 diente de ajo picado\r\n1 pieza de echalote picado\r\n1 cucharadita de jengibre rallado\r\n1 pieza de chile de Ã¡rbol seco, picado\r\n100 gramos de pulpo baby precocinados, troceados\r\n1 taza de pimiento mixtos, en julianas\r\n1 taza de piÃ±a en cubos medianos\r\n1 cucharadita de azÃºcar\r\n1/4 taza de vino blanco\r\n1/4 taza de caldo de pescado o vegetales sin sal\r\n2 sobres de tinta de calamar (30ml)\r\n1 pizca de pimienta negra molida', 'Calienta el agua junto con la sal en una olla alta hasta que hierva.\r\nInmediatamente agrega la pasta y cocÃ­nala hasta que estÃ© al dente; revisa los tiempos de cocciÃ³n marcados en el empaque.\r\nEscurre y reserva. Calienta un sartÃ©n profundo, coloca el tocino y dÃ³ralo bien hasta que suelte toda su grasa. Agrega ajo, echalote, jengibre y chile de Ã¡rbol. Mezcla constantemente para que cambie de color, sin dorar. Integra los pulpos a la mezcla y cocina por 5 minutos. AÃ±ade los pimientos, la piÃ±a y espolvorea el azÃºcar.\r\nVierte el vino y deja hervir a fuego medio hasta que el lÃ­quido reduzca. Agrega el caldo de pescado junto con al tinta de calamar.\r\nRevuelve hasta incorporar y cocina por 5 minutos a fuego bajo para que los sabores se incorporen. AÃ±ade la apsta al sartÃ©n, mezcla bien y calienta por 2 minutos. Sirve de inmediato y disfruta.', 45, 198, 'Ensaladas', 'GuarniciÃ³n', 'Merienda', '', 'Comida diaria', 4, 'Dificil', 'ProteÃ­nas 12.4 g\r\nLÃ­pidos 3.4 g\r\nColesterol 22.6 mg\r\nAcidos Grasos Saturados 0.8 g\r\nMonoinsaturados 1 g\r\nPoliinsaturados 0.4 g', '', NULL, NULL),
(61, 'Pasta con salsa boloÃ±esa', 0x657370616775657469732d73616c73612d626f6c6f6e6573612e6a7067, '1 cucharada de aceite de oliva\r\n150 gramos de carne molida de res\r\n1 cucharada de mantequilla sin sal (opcional)\r\n2 dientes de ajo rebanados\r\n1 cucharada de perejil lavado, desinfectado y picado\r\n1 cucharada de albahaca lavada, desinfectada y picada\r\n1/2 pieza de cebolla finamente picada\r\n6 piezas de tomate (jitomate) escalfados y picados\r\n1 pieza de pimiento rojo picado\r\n1 taza de champiÃ±ones finamente rebanados\r\n1 cucharada de cÃºrcuma molida\r\n1/4 taza de caldo de res sin sal\r\n1 pizca de sal\r\n1 pizca de pimienta negra molida\r\n1 rama de orÃ©gano fresco\r\n200 gramos de espagueti', '1. Calienta el aceite en un sartÃ©n y cocina la carne molida hasta que cambie completamente de color. Retira del sartÃ©n y reserva. \r\n2. FundÃ© la mantequilla y dora ligeramente el ajo con el perejil y la albahaca. Agrega la cebolla y cocina moviendo constantemente hasta que tome un tono transparente. \r\nIncorpora los tomates, los pimientos y los hongos y cocina de 5 a 8 minutos, hasta que suavicen por completo. \r\n3. AÃ±ade el caldo y la carne cocinada que reservaste y deja hervir a fuego bajo; aumenta el sabor con sal, pimienta, tomillo y orÃ©gano. \r\n4. Cocina la salsa hasta que los lÃ­quidos reduzcan a la mitad. Incorpora la pasta, revuelve bien para impregnarla con todo el sabor y sirve.', 90, 90, 'Pastas y pizzas', 'Entrada', 'Comida', '', 'Comida diaria', 8, 'Media', 'ProteÃ­nas 20 g\r\nLÃ­pidos 0.10 g\r\nColesterol 3.2 mg\r\nAcidos Grasos Saturados 10 g\r\nMonoinsaturados 5 g\r\nPoliinsaturados 2.3 g', '', NULL, NULL),
(62, 'Fetuccine', 0x666574756363696e65636f6e626163616c616f2e6a7067, '2 litros de agua\r\n1 pizca de sal\r\n200 gramos de fettuccine\r\n1 cucharada de mantequilla sin sal\r\n1/2 cucharada de aceite de oliva\r\n1/2 pieza de cebolla en cuadros chicos\r\n2 dientes de ajo finamente picados\r\n2 piezas de tomate (jitomate) escalfados y picados\r\n1 cucharada de curry amarillo en pasta\r\n1 taza de crema para batir\r\n1/4 taza de caldo de pescado o vegetales, sin sal\r\n2 tazas de bacalao limpio, desalado y desmenuzado\r\n1/2 taza de aceitunas verdes sin hueso, en mitades\r\n2 cucharadas de perejil lavado, desinfectado y picado', '1. Calienta el agua junto con la sal en una olla alta hasta que hierva.\r\n2. Inmediatamente agrega el Fettuccine La ModernaÂ® y cocinalo hasta que este en su punto (suave por fuera y firme por dentro); revisa los tiempos de cocciÃ³n marcados en el empaque. Escurre y reserva. Funde la mantequilla en un sartÃ©n junto con el aceite de oliva, agrega ajo y cebolla, y cocina hasta que transparenten.\r\n3. Incorpora los tomates y deja por 3 minutos, aproximadamente, hasta que suavicen. Integra la pasta de curry al sartÃ©n y revuelve con los vegetales. Vierte los lÃ­quidos, baja el fuego y cocina moviendo regularmente hasta que comience a hervir. AÃ±ade el bacalao a la salsa junto con las aceitunas y revuelve bien. Cocina por 5 minutos mÃ¡s, e incorpora la pasta Revuelve bien, calienta por un minuto y aumenta el sabor con perejil. Sirve de inmediato y disfruta.', 0, 386, 'Pastas y pizzas', 'Botana', 'Desayuno', '', 'Comida diaria', 6, 'Sencilla', '', '', NULL, NULL),
(63, 'Rollos de lasaÃ±a con espinacas y queso', 0x726f6c6c6f736c6173616e612e6a7067, 'Para el relleno\r\n2 cucharadas de aceite de oliva\r\n2 dientes de ajo finamente picados\r\n200 gramos de carne molida de res\r\n50 gramos de carne molida de cerdo\r\n2 tazas de espinaca baby lavadas y desinfectadas\r\n1/2 taza de queso ricotta\r\n1 pizca de pimienta negra molida\r\nPara el armado\r\n2 litros de agua e puraÂ®\r\n12 piezas de pasta para lasaÃ±a\r\n1 1/2 tazas de salsa de tomate para pasta reducida en sodio\r\n1/2 taza de queso mozarella rallado', 'Para el relleno\r\n1. Calienta en un sartÃ©n y saltea cebolla y ajo sin dejar de mover hasta que comiencen a suavizar. Agrega las carnes molidas y sigue moviendo hasta que cambien completamente de color. Retira del sartÃ©n y pasa a un tazÃ³n; deja enfriar. Agrega las espinacas y el queso al tazÃ³n con la carne y revuelve para integrar; aumenta el sabor con pimienta; reserva.\r\n\r\nPara el armado\r\n1. Precalienta tu horno a 180Â°C.\r\n2. Calienta el agua e puraÂ® en una olla hasta que hierva y cocina una a una las lÃ¡minas para lasaÃ±a, hasta que suavicen. Arma los rollos extendiendo las lÃ¡minas sobre tu superficie de trabajo y agrega de una a dos cucharadas de relleno encima. Enrolla las lÃ¡minas pe pasta y coloca los rollos en un refractario para horno. BÃ¡Ã±alos con la salsa de tomate y cubre con queso mozzarella. Hornea de 10 a 15 minutos y sirve saliendo del horno. Comparte y disfruta.', 40, 526, 'Pastas y pizzas', 'Plato fuerte', 'Desayuno', '', 'Especial', 4, 'Sencilla', 'ProteÃ­nas 25.2 g\r\nLÃ­pidos 22.2 g\r\nColesterol 64.2 mg\r\nAcidos Grasos Saturados 5.6 g\r\nMonoinsaturados 8.9 g\r\nPoliinsaturados 1.3 g', '', NULL, NULL),
(64, 'Canoas de calabacita con pasta y ejote', 0x63616e6f61735f70617374612e6a7067, 'Para la pasta\r\n1 litro de agua\r\n1 pizca de sal\r\n100 gramos de lengÃ¼ita\r\n\r\nPara las canoas\r\n4 piezas de calabacitas largas\r\n1 cucharada de aceite de canola\r\n1 diente de ajo picado\r\n1 taza de ejotes finamente rebanados\r\n1/2 taza de granos de elote amarillo', 'Para la pasta\r\nCalienta el agua junto con la sal en una olla alta hasta que hierva. Inmediatamente agrega la Pasta LengÃ¼ita y cocÃ­nalo hasta que este en su punto(suave por fuera y firme por dentro); revisa los tiempos de cocciÃ³n marcados en el empaque. Escurre y reserva.\r\n\r\nPara las canoas\r\nPrecalienta tu horno 180Â°C.\r\nCorta las calabacitas en mitades transversales y retira la pulpa del centro para dejarlas huevas para rellenar. Pica la pulpa y reserva. Calienta el aceite en un sartÃ©n y saltea el ajo, ejote, elote y pulpa de calabacita por 4 minutos, o hasta que los vegetales doren ligeramente y tomen un tono intenso. \r\nIncorpora el queso, la Pasta LengÃ¼ita y la pimienta y cocina por 2 minutos mÃ¡s. Rellena las calabacitas con la preparaciÃ³n anterior y hornea por 15 minutos, o hasta que las calabacitas suavicen. \r\nRetira del horno y decora las canoas de calabacita colocando una rebanada triangular de queso manchego en un palillo largo, como si se tratarÃ¡ de la vela.\r\nSirve de inmediato y comparte.', 30, 298, 'Ensaladas', 'Botana', 'Merienda', '', 'Comida diaria', 4, 'Media', 'ProteÃ­nas 15.9 g\r\nLÃ­pidos 17.5 g\r\nColesterol 48 mg\r\nAcidos Grasos Saturados 9 g\r\nMonoinsaturados 2.2 g\r\nPoliinsaturados 1.1 g', '', NULL, NULL),
(65, 'Sopa de zanahoria y coliflor', 0x736f70615f7a616e61686f7269615f636f6c69666c6f722e6a7067, '2 cucharadas de aceite de coco\r\n6 piezas de zanahoria en rodajas\r\n2 tazas de coliflor en ramitos\r\n1/2 pieza de cebolla picada\r\n2 dientes de ajo finamente picados\r\n2 cucharadas de curry amarillo en polvo\r\n1/2 pieza de naranja sin semillas\r\n1/2 pieza de chile de Ã¡rbol seco sin semillas y finamente picado\r\n4 tazas de caldo de vegetales sin sal\r\n2 cucharadas de perejil lavado, desinfectado y picado\r\n3 cucharadas de yogurt griego sin grasa\r\n1 pizca de pimienta negra molida', '1. Calienta el aceite en una olla y cocina las zanahorias, la coliflor, la cebolla y los ajos por 10 minutos, hasta que los vegetales suavicen ligeramente y la cebolla tome un tono translucido. Agrega el curry y revuelve; enseguida incorpora el jugo de la naranja y el chile de Ã¡rbol. Revuelve bien y deja cocinar por un minuto.\r\n2. AÃ±ade el caldo, tapa y cocina por 10 minutos a fuego bajo o hasta que la zanahoria suavice por completo.\r\n3. Pasa el contenido de la olla al vaso de tu licuadora, deja enfriar ligeramente y licÃºa hasta obtener una textura espesa y homogÃ©nea.\r\n4. Regresa la sopa a la olla donde la cocinaste y caliÃ©ntala a fuego medio por 5 minutos sin dejar de mover.\r\nSirve caliente en vasitos tequileros y decora perejil y pimienta negra. Comparte y disfruta', 35, 163, 'Sopas', 'Botana', 'Comida', '', 'Comida diaria', 4, 'Media', 'ProteÃ­nas 6 g\r\nLÃ­pidos 5.6 g\r\nColesterol 3 mg\r\nAcidos Grasos Saturados 1.3 g\r\nMonoinsaturados 2.2 g\r\nPoliinsaturados 1.1 g', '', NULL, NULL),
(66, 'Arroz glutinoso', 0x6172726f7a5f676c7574696e6f736f5f6b6977692e6a7067, '*1/2 taza de arroz glutinoso remojado en agua la noche anterior\r\n*1/2 taza de crema de coco.\r\n*3 piezas de hojas de limÃ³n.\r\n*1 cantidad necesaria de agua tibia.\r\n*2 cucharadas de azÃºcar.\r\n*1/4 taza de coco rallado.\r\n*1 pieza de kiwi en cuadrados.\r\n*1 pieza de tÃ© de limÃ³n bulbo.\r\n*1 pieza de mango manila en cuadros.', '1. Drena el agua del remojo del arroz y colÃ³calo en un colador. EjuÃ¡galo bajo un chorro de agua frÃ­a hasta que el agua salga transparente.\r\n2. Envuelve el arroz dentro de un paÃ±o de algodÃ³n, limpio y hÃºmedo y colÃ³calo dentro de una vaporera. Agrega agua hasta el nivel que indique tu vaporera, sin que toque el trapo ni el arroz y cocina al vapor por 30 o 40 minutos hasta que estÃ© suave.\r\n3. Combina en una olla la crema de coco con las hojas de limÃ³n, el bulbo de lemon grass ligeramente machacado y el azÃºcar. Calienta a fuego medio hasta hervir.\r\n4. Pasa el arroz cocinado a un tazÃ³n y bÃ¡Ã±alo con la salsa de coco que acabas de preparar.\r\n5. Toma porciones de arroz con ayuda de cucharas y dÃ¡les forma cÃºbica.\r\n6. Pasa los cubos de arroz glutinoso por coco rallado para cubrirlos perfectamente. SÃ­rvelos en un platÃ³n y decÃ³ralos con mango y kiwi. Disfruta.', 60, 202, 'Arroces', 'GuarniciÃ³n', 'Comida', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 2 g\r\nLÃ­pidos 12.6 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 11 g\r\nMonoinsaturados 0.5 g\r\nPoliinsaturados 0.3 g', '', NULL, NULL),
(67, 'Arroz blanco', 0x4172726f7a2d76657264652d64652d6368696c652d706f626c616e6f2e6a7067, '1 cucharada de aceite de canola\r\n1/2 pieza de cebolla finamente picada\r\n1 taza de arroz remojado y escurrido\r\n2 tazas de agua\r\n2 piezas de chile poblano limpios, escalfados y en rajas\r\n1/2 taza de granos de elote', '1. Calienta el aceite en una arrocera, sartÃ©n u olla extendida. Suda la cebolla y agrega el arroz. Cocina a fuego medio, moviendo constantemente hasta que el arroz tome un tono opaco y los granos se despeguen fÃ¡cilmente entre sÃ­. \r\n2. Agrega los granos de elote y mezcla con el arroz; aÃ±ade agua y chile poblano, tapa y deja cocinar por aproximadamente 15 o 20 minutos a fuego lento o hasta que el arroz estÃ© bien cocinado y el agua se haya evaporado.\r\n3. Deja reposar 5 minutos el arroz una vez listo para que esponje. Sirve y disfruta.', 40, 193, 'Arroces', 'Entrada', 'Comida', '', 'Comida diaria', 4, 'Sencilla', 'ProteÃ­nas 4 g\r\nLÃ­pidos 4.4 g\r\nColesterol 0 mg\r\nAcidos Grasos Saturados 0.3 g\r\nMonoinsaturados 2.2 g\r\nPoliinsaturados 1.1 g', '', NULL, NULL),
(68, 'Arroz con brÃ³coli', 0x6172726f7a42726f636f6c6c692e6a7067, '1 taza de arroz jazmÃ­n\r\n1 cucharada de aceite de canola\r\n2 tazas de agua\r\n1 tallo de tÃ© de limÃ³n\r\n1 cucharada de aceite de coco\r\n1 pizca de sal\r\n1/2 taza de agua\r\n1/2 taza de crema de coco\r\n1/4 pieza de brÃ³coli en ramitos, lavados, desinfectados y blanqueados\r\n1/4 pieza de coliflor en ramitos, lavados, desinfectados y blanqueados\r\n1 taza de nuez de la India tostada y troceada\r\n4 cucharadas de curry verde en pasta\r\n1/2 taza de albahaca', 'Para el arroz\r\n1. Enjuaga el arroz bajo agua frÃ­a corriente, hasta que el agua salga completamente transparente. Escurre bien.\r\n2. FrÃ­e el arroz en una olla con el aceite caliente, moviendo constantemente, hasta que tome un color opaco y los granos se despeguen entre si.\r\n3. Agrega el agua y el tallo de tÃ© limÃ³n, previamente aplastado con el mango de un cuchillo para que libere todo su sabor.\r\n4. Cocina tapado a fuego medio hasta que hierva; retira la tapa, baja el fuego y deja hasta que el agua se consuma por completo y el arroz estÃ© bien cocinado. Reserva caliente.\r\n\r\nPara el curry\r\n1. Funde a fuego medio el aceite de coco en un sartÃ©n, agrega la pasta de curry y sal, cocina por 1 minuto moviendo regularmente. AÃ±ade agua y crema de coco; mezcla hasta que el curry se incorpore por completo.\r\n2. Agrega los vegetales y cocina por 3 minutos a fuego bajo hasta que estÃ©n bien cubiertos de curry. Retira del fuego y sirve porciones de arroz jazmÃ­n dentro de refractarios individuales, coloca encima una porciÃ³n de vegetales con curry y espolvorea nuez de la india, decora con una hoja de albahaca y disfruta.', 30, 405, 'Arroces', 'Entrada', 'Comida', '', 'Comida diaria', 8, 'Media', 'ProteÃ­nas 9.7 g\r\nLÃ­pidos 21.9 g\r\nColesterol 0 mg\r\nÃcidos Grasos Saturados 7 g\r\nMonoinsaturados 9.5 g\r\nPoliinsaturados 3.5 g', '', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socios`
--

CREATE TABLE `socios` (
  `idSocio` int(11) NOT NULL,
  `nombre` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `imagen` mediumblob NOT NULL,
  `mision` text COLLATE utf8_spanish2_ci NOT NULL,
  `vision` text COLLATE utf8_spanish2_ci NOT NULL,
  `politicas` text COLLATE utf8_spanish2_ci NOT NULL,
  `telefono1` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `telefono2` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `paginaOficial` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `facebook` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `twitter` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `canalYoutube` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `idSucursal` int(11) NOT NULL,
  `direccion` varchar(80) COLLATE utf8_spanish2_ci NOT NULL,
  `telefonos` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `gerente` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `idNegocioSu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipscocina`
--

CREATE TABLE `tipscocina` (
  `idTip` int(11) NOT NULL,
  `nombre` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `descripcion` text COLLATE utf8_spanish2_ci NOT NULL,
  `link` varchar(70) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `tipscocina`
--

INSERT INTO `tipscocina` (`idTip`, `nombre`, `descripcion`, `link`) VALUES
(3, 'Herramientas en la cocina', '8 increÃ­bles trucos con comida para sorprender a tus amigos y familiares Â¡dÃ©jales con la boca abierta!', 'https://www.youtube.com/embed/Zz9ELcVHM5w'),
(4, 'Secretos de salud', '10 trucos de cocina sana que deberÃ­as conocer', 'https://www.youtube.com/embed/XYQLcgzMt4w'),
(5, 'Ejercicios para aumentar glÃºteos', 'Ejercios para aumentar glÃºteos rÃ¡pidamente y sin grandes esfuerzos', 'https://www.youtube.com/embed/yGXwjAoQciQ'),
(6, '-l-jhgjgxb.nm', '.khkhggvjk', 'nhkfkhghjbkn');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(20) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellidos` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `edad` int(2) DEFAULT NULL,
  `sexo` varchar(10) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `localidad` varchar(25) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` varchar(25) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `pais` varchar(25) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo` varchar(40) COLLATE utf8_spanish2_ci NOT NULL,
  `nombreUsuario` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `contrasena` varchar(15) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombre`, `apellidos`, `edad`, `sexo`, `localidad`, `estado`, `pais`, `correo`, `nombreUsuario`, `contrasena`) VALUES
(9, NULL, NULL, 0, '', NULL, NULL, NULL, 'andy@gmail.com', 'Andy', 'sedeÃ±o'),
(10, NULL, NULL, 0, '', NULL, NULL, NULL, 'sosa_ame@hotmail.com', 'Jesus sosa', 'america'),
(17, NULL, NULL, 0, '', NULL, NULL, NULL, 'adela09@hotmail.com', 'Adela', 'guzman'),
(21, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'andrea_leon@hotmail.es', 'andy2163', 'andre'),
(22, 'admin', NULL, NULL, NULL, NULL, NULL, NULL, 'admin@admin.com', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `videorecetas`
--

CREATE TABLE `videorecetas` (
  `idVideoReceta` int(11) NOT NULL,
  `nombreVideoReceta` varchar(30) COLLATE utf8_spanish2_ci NOT NULL,
  `link` varchar(70) COLLATE utf8_spanish2_ci NOT NULL,
  `ingredientes` text COLLATE utf8_spanish2_ci NOT NULL,
  `tiempoPreparacion` int(4) NOT NULL,
  `kilocalorias` int(5) NOT NULL,
  `tipoAlimento` varchar(25) COLLATE utf8_spanish2_ci NOT NULL,
  `tipoPlatillo` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `comida` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `ocasion` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `porciones` varchar(2) COLLATE utf8_spanish2_ci NOT NULL,
  `dificultad` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `informacionNutrimental` text COLLATE utf8_spanish2_ci NOT NULL,
  `calificacionVideoReceta` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `videorecetas`
--

INSERT INTO `videorecetas` (`idVideoReceta`, `nombreVideoReceta`, `link`, `ingredientes`, `tiempoPreparacion`, `kilocalorias`, `tipoAlimento`, `tipoPlatillo`, `comida`, `ocasion`, `porciones`, `dificultad`, `informacionNutrimental`, `calificacionVideoReceta`) VALUES
(1, 'Arroz rojo', 'https://www.youtube.com/embed/dJV2CXRAnGw', '', 40, 90, 'Arroces', 'Botana', 'Comida', 'Comida diaria', '8', 'Sencilla', '', NULL),
(2, 'Ponche Mexicano', 'https://www.youtube.com/embed/j_FFvPE9jnY', '', 60, 60, 'Bebidas', 'Entrada', 'Cena', 'Especial', '16', 'Media', '', NULL),
(3, 'Chocolate espumoso', 'https://www.youtube.com/embed/pR-mhYmBeTw', '', 20, 120, 'Bebidas', 'Entrada', 'Desayuno', 'Fin de semana', '2', 'Sencilla', '', NULL),
(4, 'Helado casero', 'https://www.youtube.com/embed/DkGBSbe_dMA', '', 90, 90, 'Helados', 'Postre', 'Comida', 'Fiesta', '8', 'Media', '', NULL),
(5, 'Cheesecake', 'https://www.youtube.com/embed/tCcj5_77ZIs', '', 50, 85, 'Helados', 'Postre', 'Merienda', 'Fin de semana', '8', 'Media', '', NULL),
(6, 'Arroz integral', 'https://www.youtube.com/embed/JjyGpNvfHW8', '', 90, 60, 'Arroces', 'Entrada', 'Comida', 'Comida diaria', '6', 'Sencilla', '', NULL),
(7, 'Galletas con chispas de chocol', 'https://www.youtube.com/embed/ndU2dB0lJwg', '', 90, 60, 'Postres y dulces', 'Postre', 'Comida', 'Fin de semana', '6', 'Media', '', NULL),
(8, 'Costillas BBQ', 'https://www.youtube.com/embed/cWYRUJ7ZzAw', '', 120, 80, 'Carnes', 'Plato fuerte', 'Comida', 'Fin de semana', '6', 'Sencilla', '', NULL),
(9, 'Alitas Habanero', 'https://www.youtube.com/embed/LGCkF3XIb_k', '', 80, 60, 'Carnes', 'Plato fuerte', 'Merienda', 'Comida diaria', '6', 'Dificil', '', NULL),
(10, 'Camarones a la diabla', 'https://www.youtube.com/embed/K-LZTtWmMQg', '', 120, 250, 'Pescados y mariscos', 'Plato fuerte', 'Desayuno', 'Especial', '6', 'Dificil', '', NULL),
(11, 'Paella Mixta', 'https://www.youtube.com/embed/rFFRPqbOy-k', '', 150, 110, 'Arroces', 'Plato fuerte', 'Comida', 'Especial', '8', 'Dificil', '', NULL),
(12, 'Lasagna', 'https://www.youtube.com/embed/FYETTy3Byrk', '', 80, 70, 'Pastas y pizzas', 'Plato fuerte', 'Comida', 'Fin de semana', '6', 'Sencilla', '', NULL),
(13, 'Pizza', 'https://www.youtube.com/embed/RSwvcsbxRfE', '', 90, 110, 'Pastas y pizzas', 'Plato fuerte', 'Comida', 'Fin de semana', '8', 'Media', '', NULL),
(14, 'Pastel de carnes', 'https://www.youtube.com/embed/kyEZCnlu1Lo', '', 50, 50, 'Carnes', 'Plato fuerte', 'Cena', 'Comida diaria', '6', 'Media', '', NULL),
(15, 'Pastel de atÃºn', 'https://www.youtube.com/embed/i1kPcg5WCF0', '', 130, 30, 'Pescados y mariscos', 'Postre', 'Desayuno', 'Fin de semana', '8', 'Sencilla', '', NULL),
(16, 'Pastel de elote', 'https://www.youtube.com/embed/_8STkYmsM54', '', 100, 45, 'Postres y dulces', 'Postre', 'Merienda', 'Comida diaria', '8', 'Sencilla', '', NULL),
(17, 'Cheesecake sin horno', 'https://www.youtube.com/embed/1yfpVX1m3fA', '', 50, 90, 'Postres y dulces', 'Postre', 'Merienda', 'Picnic', '8', 'Media', '', NULL),
(18, 'Ensalada romÃ¡ntica', 'https://www.youtube.com/embed/NyfZf9mveLk', '', 20, 10, 'Ensaladas', 'Entrada', 'Merienda', 'Especial', '2', 'Sencilla', '', NULL),
(19, 'Ensalada noche buena', 'https://www.youtube.com/embed/AntghPmiHJA', '', 30, 30, 'Ensaladas', 'Postre', 'Cena', 'Especial', '12', 'Media', '', NULL),
(20, 'Ensalada de manzana', 'https://www.youtube.com/embed/mibrJUJK8rQ', '', 50, 70, 'Ensaladas', 'Postre', 'Cena', 'Especial', '', 'Sencilla', '', NULL),
(21, 'Pastel de 3 leches', 'https://www.youtube.com/embed/hTFrWGLqC-w', 'Para el pastel\r\n6 huevos\r\n2 tazas de harina de trigo \r\n1 taza de azucar\r\n2 cucharadas soperas de royal (polvo para hornear)\r\n1/2 taza de leche\r\n3 cucharadas soperas de extracto de vainilla\r\n\r\nPara crema de tres leches\r\n1 lata de leche condensada (la lechera)\r\n1 lata de leche evaporada (leche clavel)\r\n1/2 taza de crema de leche (Crema alpura Ã³ lala, crema Ã¡cida, natilla)\r\n1/2 taza de leche entera (leche de vaca)\r\n\r\nPara topping o crema de encima del pastel\r\n1/2 litro de crema previamente guardada en el congelador 40 minutos\r\n2 cucharadas copeteadas de azucar glass (todo se licÃºa)', 140, 92, 'Postres y dulces', 'Postre', 'Merienda', 'Fiesta', '8', 'Sencilla', '', NULL),
(22, 'PurÃ© de papa', 'https://www.youtube.com/embed/LaNyVktmQso', '', 60, 45, 'Pures y cremas', 'Entrada', 'Almuerzo', 'Comida diaria', '6', 'Media', '', NULL),
(23, 'Sopa de fideo', 'https://www.youtube.com/embed/INx1smKuqqo', '', 40, 65, 'Sopas', 'Entrada', 'Almuerzo', 'Comida diaria', '8', 'Sencilla', '', NULL),
(24, 'Churros azucarados', 'https://www.youtube.com/embed/fbj669Z5o6Y', '1 taza de harina\r\n67.5 gr de mantequilla o margarina\r\nmedia cucharadita cafetera de sal\r\n1 cucharada de canela en polvo\r\n1 taza de agua\r\n3 huevos\r\nazucar para espolvorear \r\naceite (mucho)', 55, 115, 'Postres y dulces', 'Postre', 'Merienda', 'Fiesta', '12', 'Media', '', NULL),
(25, 'Comprendio de botanas', 'https://www.youtube.com/embed/0LdpdQn2KNQ', '', 60, 70, 'Postres y dulces', 'Botana', 'Merienda', 'Fin de semana', '', 'Media', '', NULL),
(26, 'Donas Glaseadas', 'https://www.youtube.com/embed/YwRsGfTSfdI', '3 tazas de harina de trigo mÃ¡s la harina extra (3/4 de taza) 500 gramos + 100 gramos\r\n1/3 taza de azÃºcar (120 gramos de azÃºcar)\r\n5 gramos de sal (la puntita de una cucharada cafetera)\r\nLevadura:\r\nLevadura seca instantanea:\r\n2 cucharadas soperas Ã³ 2 sobres Ã³ 14 gramos\r\nLevadura fresca: \r\n2 cuadros de 22 gramos, Ã³ 44 gramos en total\r\n\r\ncasi una taza de leche (230 ml)\r\n1 huevo\r\n40 gramos de mantequilla\r\nAceite para freir\r\n\r\nCobertura de chocolate:\r\n200 gramos de trufas de chocolate (o cualquier chocolate)\r\n50 gr de mantequilla derretida\r\n5 cucharadas copeteadas de azÃºcar glass\r\nagua (poco mÃ¡s de 1 onza)\r\n\r\nCobertura de glaseado:\r\nAzucar glass + agua (puedes aÃ±adir colorantes vegetales en lugar de agua para donas de colores)\r\n\r\nRelleno de fresa:\r\nMermelada de fresa licuada (si es necesario agregar una poca de agua)\r\n\r\nAzucaradas:\r\nSÃ³lo azÃºcar, o azÃºcar con canela, o espolvoreadas con azÃºcar glass', 30, 85, 'Postres y dulces', 'Postre', 'Almuerzo', 'Comida diaria', '', 'Media', '', NULL),
(27, 'Pay Carlota', 'https://www.youtube.com/embed/pRKd8Nl0tvI', '', 30, 40, 'Postres y dulces', 'Botana', 'Desayuno', 'Fin de semana', '6', 'Sencilla', '', NULL),
(28, ',l-kjvhc', ' .khgfhjgxhj', ',ng,hgxchj,,', 4, 4, 'Arroces', 'Botana', 'Desayuno', 'Comida diaria', '4', 'Sencilla', 'ljhkhcg', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comentariosnegocios`
--
ALTER TABLE `comentariosnegocios`
  ADD PRIMARY KEY (`idUsuarioCoNe`,`idNegocioCoNe`),
  ADD KEY `idNegocioCoNe` (`idNegocioCoNe`);

--
-- Indices de la tabla `comentariosrecetas`
--
ALTER TABLE `comentariosrecetas`
  ADD PRIMARY KEY (`idUsuarioCoRe`,`idRecetaCoRe`),
  ADD KEY `idRecetaCoRe` (`idRecetaCoRe`);

--
-- Indices de la tabla `comentariosvideorecetas`
--
ALTER TABLE `comentariosvideorecetas`
  ADD PRIMARY KEY (`idUsuarioCoViRe`,`idVideoRecetaCoViRe`),
  ADD KEY `idVideoRecetaCoViRe` (`idVideoRecetaCoViRe`);

--
-- Indices de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD PRIMARY KEY (`idUsuarioFav`,`idRecetaFav`),
  ADD KEY `idRecetaFav` (`idRecetaFav`);

--
-- Indices de la tabla `menuusuario`
--
ALTER TABLE `menuusuario`
  ADD PRIMARY KEY (`idUsuarioMen`,`idRecetaMen`),
  ADD KEY `idRecetaMen` (`idRecetaMen`);

--
-- Indices de la tabla `negocios`
--
ALTER TABLE `negocios`
  ADD PRIMARY KEY (`idNegocio`);

--
-- Indices de la tabla `recetas`
--
ALTER TABLE `recetas`
  ADD PRIMARY KEY (`idReceta`),
  ADD KEY `anuncio` (`anuncio`);

--
-- Indices de la tabla `socios`
--
ALTER TABLE `socios`
  ADD PRIMARY KEY (`idSocio`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`idSucursal`),
  ADD KEY `index_idNegocioSu` (`idNegocioSu`);

--
-- Indices de la tabla `tipscocina`
--
ALTER TABLE `tipscocina`
  ADD PRIMARY KEY (`idTip`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `videorecetas`
--
ALTER TABLE `videorecetas`
  ADD PRIMARY KEY (`idVideoReceta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `negocios`
--
ALTER TABLE `negocios`
  MODIFY `idNegocio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `recetas`
--
ALTER TABLE `recetas`
  MODIFY `idReceta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=69;
--
-- AUTO_INCREMENT de la tabla `socios`
--
ALTER TABLE `socios`
  MODIFY `idSocio` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `idSucursal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipscocina`
--
ALTER TABLE `tipscocina`
  MODIFY `idTip` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
--
-- AUTO_INCREMENT de la tabla `videorecetas`
--
ALTER TABLE `videorecetas`
  MODIFY `idVideoReceta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comentariosnegocios`
--
ALTER TABLE `comentariosnegocios`
  ADD CONSTRAINT `comentariosNegocios_ibfk_1` FOREIGN KEY (`idUsuarioCoNe`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `comentariosNegocios_ibfk_2` FOREIGN KEY (`idNegocioCoNe`) REFERENCES `negocios` (`idNegocio`);

--
-- Filtros para la tabla `comentariosrecetas`
--
ALTER TABLE `comentariosrecetas`
  ADD CONSTRAINT `comentariosRecetas_ibfk_1` FOREIGN KEY (`idUsuarioCoRe`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `comentariosRecetas_ibfk_2` FOREIGN KEY (`idRecetaCoRe`) REFERENCES `recetas` (`idReceta`);

--
-- Filtros para la tabla `comentariosvideorecetas`
--
ALTER TABLE `comentariosvideorecetas`
  ADD CONSTRAINT `comentariosVideoRecetas_ibfk_1` FOREIGN KEY (`idUsuarioCoViRe`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `comentariosVideoRecetas_ibfk_2` FOREIGN KEY (`idVideoRecetaCoViRe`) REFERENCES `videorecetas` (`idVideoReceta`);

--
-- Filtros para la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD CONSTRAINT `favoritos_ibfk_1` FOREIGN KEY (`idUsuarioFav`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `favoritos_ibfk_2` FOREIGN KEY (`idRecetaFav`) REFERENCES `recetas` (`idReceta`);

--
-- Filtros para la tabla `menuusuario`
--
ALTER TABLE `menuusuario`
  ADD CONSTRAINT `menuUsuario_ibfk_1` FOREIGN KEY (`idUsuarioMen`) REFERENCES `usuarios` (`idUsuario`),
  ADD CONSTRAINT `menuUsuario_ibfk_2` FOREIGN KEY (`idRecetaMen`) REFERENCES `recetas` (`idReceta`);

--
-- Filtros para la tabla `recetas`
--
ALTER TABLE `recetas`
  ADD CONSTRAINT `recetas_ibfk_1` FOREIGN KEY (`anuncio`) REFERENCES `negocios` (`idNegocio`);

--
-- Filtros para la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD CONSTRAINT `sucursales_ibfk_1` FOREIGN KEY (`idNegocioSu`) REFERENCES `negocios` (`idNegocio`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
