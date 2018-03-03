CREATE DATABASE  IF NOT EXISTS `fateon_new` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `fateon_new`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 45.7.229.159    Database: fateon_new
-- ------------------------------------------------------
-- Server version	5.6.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fateon_accion`
--

DROP TABLE IF EXISTS `fateon_accion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_accion` (
  `programa_id` varchar(32) NOT NULL,
  `programa_nombre` varchar(45) DEFAULT NULL,
  `programa_ubicacion` varchar(250) DEFAULT NULL,
  `programa_nemonico` varchar(45) DEFAULT NULL,
  `programa_regla` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`programa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_accion`
--

LOCK TABLES `fateon_accion` WRITE;
/*!40000 ALTER TABLE `fateon_accion` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_accion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_catalogo`
--

DROP TABLE IF EXISTS `fateon_catalogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_catalogo` (
  `catalogo_id` varchar(32) NOT NULL,
  `catalogo_tabla` varchar(32) DEFAULT NULL,
  `catalogo_id_tabla` varchar(32) DEFAULT NULL,
  `catalogo_nombre` varchar(45) DEFAULT NULL,
  `catalogo_valor_int` int(11) DEFAULT NULL,
  `catalogo_descripcion_varchar` varchar(45) DEFAULT NULL,
  `catalogo_valor_float` float DEFAULT NULL,
  `catalogo_valor_date` date DEFAULT NULL,
  `catalogo_valor_time` time DEFAULT NULL,
  PRIMARY KEY (`catalogo_id`),
  KEY `fk_catalogo_tabla_idx` (`catalogo_tabla`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_catalogo`
--

LOCK TABLES `fateon_catalogo` WRITE;
/*!40000 ALTER TABLE `fateon_catalogo` DISABLE KEYS */;
INSERT INTO `fateon_catalogo` VALUES ('1','sensor_entrada','1','TasaEntrada',0,'TasaEntrada',0,'2018-01-02','00:00:00'),('4028b8815fb73bc3015fb74a8cda0002','','4028b8815fb73bc3015fb74a8cbb0001','Venezuela',0,'Venezuela',0,'2018-01-02','00:00:00'),('4028b8815fb73bc3015fb74b41590003','','4028b8815fb73bc3015fb74a8cbb0001','Italia',0,'Italia',0,NULL,NULL),('4028b8815fdef909015fdefadde80001','Sistemas','4028b8815fdef909015fdefadd3c0000','IST',0,'IST',0,NULL,NULL),('4028b8815fe40dcf015fe40f3ab10000','Pais','4028b8815fb73bc3015fb74a8cbb0001','Chile',0,'Chile',0,'2018-07-02','00:00:00'),('4028b8815fe40dcf015fe411bb2b0001','Sistemas','4028b8815fdef909015fdefadd3c0000','OPEN2',0,'OPEN2',0,'2018-01-02','00:00:00'),('4028b8815fe41b73015fe41cc2dc0001','Tipo_Sistemas','4028b8815fe41b73015fe41cc29d0000','Transaccional',0,'Transaccion',0,'2018-06-02','00:00:00'),('4028b8815fe41b73015fe41d56f70003','Sucursales','4028b8815fe41b73015fe41d56f70002','Centro',0,'Centro',0,'2018-06-02','00:00:00'),('4028b8815fe41b73015fe41ec06b0005','Oficinas','4028b8815fe41b73015fe41ec05c0004','La Esquina',0,'La Esquina',0,'2018-01-02','00:00:00'),('4028b8815fe41b73015fe41f42e60007','Municipios','4028b8815fe41b73015fe41f42e60006','Santiago Marino',0,'Santiago Marino',0,'2018-06-02','00:00:00'),('4028b8815fe423e5015fe426e6530001','','4028b8815fb73bc3015fb74a8cbb0001','Peru',0,'Peru',0,'2018-06-02','00:00:00'),('4028b8815fe528e5015fe5297ecc0000','Paises','4028b8815fb73bc3015fb74a8cbb0001','Argentina',0,'Argentina',0,'2018-01-02','00:00:00'),('4028b881615dde6c01615de355c40004','CIudad','4028b881615dde6c01615de1cfa10002','Caracas',0,'Caracas',0,'2018-02-03','00:00:00'),('4028b881619c126401619c13801f0001','Mapa1','4028b881619c126401619c137f970000','Mapa1',0,'Mapa1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1a877d0005','','4028b881619c126401619c17d6350003','registro_varchar_1',0,'registro_varchar_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ad7a90006','','4028b881619c126401619c17d6350003','registro_varchar_2',0,'registro_varchar_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1aee910007','','4028b881619c126401619c17d6350003','registro_varchar_3',0,'registro_varchar_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1b104c0008','','4028b881619c126401619c17d6350003','registro_varchar_4',0,'registro_varchar_4',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1c841d0009','','4028b881619c126401619c17d6350003','registro_varchar_5',0,'registro_varchar_5',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ca006000a','','4028b881619c126401619c17d6350003','registro_int_1',0,'registro_int_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1cc23e000b','','4028b881619c126401619c17d6350003','registro_int_2',0,'registro_int_2',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ce0b4000c','','4028b881619c126401619c17d6350003','registro_int_3',0,'registro_int_3',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1e8ef0000d','','4028b881619c126401619c17d6350003','registro_int_5',0,'registro_int_5',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ec291000e','','4028b881619c126401619c17d6350003','registro_float_1',0,'registro_float_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ed9a9000f','','4028b881619c126401619c17d6350003','registro_float_2',0,'registro_float_2',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1ef4bc0010','','4028b881619c126401619c17d6350003','registro_float_3',0,'registro_float_3',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1f0fa70011','','4028b881619c126401619c17d6350003','registro_float_4',0,'registro_float_4',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1f2a2b0012','','4028b881619c126401619c17d6350003','registro_float_5',0,'registro_float_5',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1f67870013','','4028b881619c126401619c17d6350003','registro_date_1',0,'registro_date_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1f7ee10014','','4028b881619c126401619c17d6350003','registro_date_2',0,'registro_date_2',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1f93560015','','4028b881619c126401619c17d6350003','registro_date_3',0,'registro_date_3',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1fa5460016','','4028b881619c126401619c17d6350003','registro_date_4',0,'registro_date_4',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1fbc360017','','4028b881619c126401619c17d6350003','registro_date_5',0,'registro_date_5',0,'2018-02-15','00:00:00'),('4028b881619c126401619c1fef160018','','4028b881619c126401619c17d6350003','registro_datetime_1',0,'registro_datetime_1',0,'2018-02-15','00:00:00'),('4028b881619c126401619c2011570019','','4028b881619c126401619c17d6350003','registro_datetime_2',0,'registro_datetime_2',0,'2018-02-15','00:00:00'),('4028b881619c126401619c203124001a','','4028b881619c126401619c17d6350003','registro_datetime_3',0,'registro_datetime_3',0,'2018-02-15','00:00:00'),('4028b881619c126401619c20912e001b','','4028b881619c126401619c17d6350003','registro_datetime_4',0,'registro_datetime_4',0,'2018-02-15','00:00:00'),('4028b881619c126401619c20ac90001c','','4028b881619c126401619c17d6350003','registro_datetime_5',0,'registro_datetime_5',0,'2018-02-15','00:00:00'),('4028b881619c25c301619c28567c0000','','4028b881619c126401619c137f970000','Mapa2',0,'Mapa2',0,'2018-02-15','00:00:00'),('4028b881619c4bd801619c4d8bbd0000','','4028b8815fe41b73015fe41cc29d0000','Batch',0,'Batch',0,'2018-02-15','00:00:00'),('4028b88161a01ff80161a0207bc60000','','4028b881619c126401619c137f970000','Mapa3',0,'Mapa3',0,'2018-02-16','00:00:00'),('4028b88161a02c550161a02ccef50001','','4028b88161a02c550161a02cce990000','Regla1',0,'Regla1',0,'2018-02-16','00:00:00'),('4028b88161a030f50161a035f5a30026','','4028b881619c126401619c137f970000','mapa4',0,'mapa4',0,'2018-02-16','00:00:00');
/*!40000 ALTER TABLE `fateon_catalogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_mapa`
--

DROP TABLE IF EXISTS `fateon_mapa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_mapa` (
  `mapa_id` varchar(32) NOT NULL,
  `mapa_fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `mapa_tabla` varchar(32) NOT NULL,
  `mapa_campo` varchar(32) NOT NULL,
  `mapa_nombre_campo` varchar(45) NOT NULL,
  PRIMARY KEY (`mapa_id`),
  UNIQUE KEY `idx_mapa` (`mapa_campo`,`mapa_tabla`),
  KEY `fk_mapa_catalogo_idx` (`mapa_tabla`),
  CONSTRAINT `fk_mapa_catalogo` FOREIGN KEY (`mapa_tabla`) REFERENCES `fateon_tabla` (`tabla_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_mapa`
--

LOCK TABLES `fateon_mapa` WRITE;
/*!40000 ALTER TABLE `fateon_mapa` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_mapa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_origen`
--

DROP TABLE IF EXISTS `fateon_origen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_origen` (
  `origen_id` varchar(32) NOT NULL,
  `origen_nombre` varchar(45) DEFAULT NULL,
  `origen_modelo` varchar(32) DEFAULT NULL,
  `origen_mac` varchar(45) DEFAULT NULL,
  `origen_id_tipo` varchar(32) DEFAULT '0',
  `origen_id_sistema` varchar(32) DEFAULT '0',
  `origen_id_sucursal` varchar(32) DEFAULT '0',
  `origen_id_oficina` varchar(32) DEFAULT '0',
  `origen_id_municipio` varchar(32) DEFAULT '0',
  `origen_id_ciudad` varchar(32) DEFAULT '0',
  `origen_id_pais` varchar(32) DEFAULT '0',
  `origen_ip` varchar(45) DEFAULT '255.255.255.255',
  PRIMARY KEY (`origen_id`),
  KEY `fk_ciudad_catalogo_idx` (`origen_id_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='contiene las caracteristicas del origen de una señal de origen';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_origen`
--

LOCK TABLES `fateon_origen` WRITE;
/*!40000 ALTER TABLE `fateon_origen` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_origen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_registro`
--

DROP TABLE IF EXISTS `fateon_registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_registro` (
  `registro_id` varchar(32) NOT NULL,
  `registro_fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `registro_varchar_1` varchar(45) DEFAULT NULL,
  `registro_varchar_2` varchar(45) DEFAULT NULL,
  `registro_varchar_3` varchar(45) DEFAULT NULL,
  `registro_varchar_4` varchar(45) DEFAULT NULL,
  `registro_varchar_5` varchar(45) DEFAULT NULL,
  `registro_int_1` int(11) DEFAULT NULL,
  `registro_int_2` int(11) DEFAULT NULL,
  `registro_int_3` int(11) DEFAULT NULL,
  `registro_int_4` int(11) DEFAULT NULL,
  `registro_int_5` int(11) DEFAULT NULL,
  `registro_float_1` float DEFAULT NULL,
  `registro_float_2` float DEFAULT NULL,
  `registro_float_3` float DEFAULT NULL,
  `registro_float_4` float DEFAULT NULL,
  `registro_float_5` float DEFAULT NULL,
  `registro_date_1` date DEFAULT NULL,
  `registro_date_2` date DEFAULT NULL,
  `registro_date_3` date DEFAULT NULL,
  `registro_date_4` date DEFAULT NULL,
  `registro_date_5` date DEFAULT NULL,
  `registro_time_1` time DEFAULT NULL,
  `registro_time_2` time DEFAULT NULL,
  `registro_time_3` time DEFAULT NULL,
  `registro_time_4` time DEFAULT NULL,
  `registro_time_5` time DEFAULT NULL,
  `registro_datetime_1` timestamp NULL DEFAULT NULL,
  `registro_datetime_2` timestamp NULL DEFAULT NULL,
  `registro_datetime_3` timestamp NULL DEFAULT NULL,
  `registro_datetime_4` timestamp NULL DEFAULT NULL,
  `registro_datetime_5` timestamp NULL DEFAULT NULL,
  `sensor_id` varchar(32) DEFAULT NULL,
  `origen_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`registro_id`),
  KEY `fk_registro_origen_idx` (`origen_id`),
  KEY `fk_registro_sensor_idx` (`sensor_id`),
  CONSTRAINT `fk_registro_origen` FOREIGN KEY (`origen_id`) REFERENCES `fateon`.`fateon_origen` (`origen_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_registro_sensor` FOREIGN KEY (`sensor_id`) REFERENCES `fateon`.`fateon_sensor` (`sensor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_registro`
--

LOCK TABLES `fateon_registro` WRITE;
/*!40000 ALTER TABLE `fateon_registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_regla`
--

DROP TABLE IF EXISTS `fateon_regla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_regla` (
  `regla_id` varchar(32) NOT NULL,
  `regla_programa` varchar(32) DEFAULT NULL,
  `regla_catalogo` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`regla_id`),
  KEY `fk_regla_programa_idx` (`regla_programa`),
  KEY `fk_regla_catalogo_idx` (`regla_catalogo`),
  CONSTRAINT `fk_regla_catalogo` FOREIGN KEY (`regla_catalogo`) REFERENCES `fateon`.`fateon_catalogo` (`catalogo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_regla_programa` FOREIGN KEY (`regla_programa`) REFERENCES `fateon`.`fateon_accion` (`programa_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_regla`
--

LOCK TABLES `fateon_regla` WRITE;
/*!40000 ALTER TABLE `fateon_regla` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_regla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_sensor`
--

DROP TABLE IF EXISTS `fateon_sensor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_sensor` (
  `sensor_id` varchar(32) NOT NULL,
  `sensor_programa` varchar(32) DEFAULT NULL,
  `sensor_tabla` varchar(32) DEFAULT NULL,
  `sensor_nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`sensor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_sensor`
--

LOCK TABLES `fateon_sensor` WRITE;
/*!40000 ALTER TABLE `fateon_sensor` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_sensor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_tabla`
--

DROP TABLE IF EXISTS `fateon_tabla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_tabla` (
  `tabla_id` varchar(32) NOT NULL DEFAULT '',
  `tabla_nombre` varchar(45) DEFAULT NULL,
  `tabla_nemonico` varchar(45) DEFAULT NULL,
  `tabla_programa` varchar(45) DEFAULT NULL,
  `tabla_ubicacion_programa` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tabla_id`),
  UNIQUE KEY `tabla_nombre_UNIQUE` (`tabla_nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_tabla`
--

LOCK TABLES `fateon_tabla` WRITE;
/*!40000 ALTER TABLE `fateon_tabla` DISABLE KEYS */;
INSERT INTO `fateon_tabla` VALUES ('4028b8815fb73bc3015fb74a8cbb0001','Paises','Paises','Paises','Paises'),('4028b8815fdef909015fdefadd3c0000','Sistemas','TSistemas','generico','todos'),('4028b8815fe41b73015fe41cc29d0000','Tipo_Sistemas','Tipo_Sistemas','Tipo_Sistemas','Tipo_Sistemas'),('4028b8815fe41b73015fe41d56f70002','Sucursales','Sucursales','Sucursales','Sucursales'),('4028b8815fe41b73015fe41ec05c0004','Oficinas','Oficinas','Oficinas','Oficinas'),('4028b8815fe41b73015fe41f42e60006','Municipios','Municipios','Municipios','Municipios'),('4028b881615dde6c01615de1cfa10002','Ciudades','Ciudades','Ciudades','Ciudades'),('4028b881619c126401619c137f970000','MapaTabla','MapaTabla','',''),('4028b881619c126401619c17d6350003','MapaCampo','MapaCampo','',''),('4028b88161a02c550161a02cce990000','Reglas','TRegla','','');
/*!40000 ALTER TABLE `fateon_tabla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fateon_umbral`
--

DROP TABLE IF EXISTS `fateon_umbral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fateon_umbral` (
  `umbral_id` varchar(32) NOT NULL,
  `fateon_sensor_sensor_id` varchar(32) NOT NULL,
  `fateon_origen_origen_id` varchar(32) NOT NULL,
  `fateon_mapa_mapa_id` varchar(32) NOT NULL,
  `umbral` float NOT NULL,
  PRIMARY KEY (`umbral_id`),
  UNIQUE KEY `fk_umbral_unico` (`fateon_mapa_mapa_id`,`fateon_origen_origen_id`,`fateon_sensor_sensor_id`),
  KEY `fk_umbral_fateon_sensor1_idx` (`fateon_sensor_sensor_id`),
  KEY `fk_umbral_fateon_origen1_idx` (`fateon_origen_origen_id`),
  KEY `fk_umbral_fateon_mapa1_idx` (`fateon_mapa_mapa_id`),
  CONSTRAINT `fk_umbral_fateon_mapa1` FOREIGN KEY (`fateon_mapa_mapa_id`) REFERENCES `fateon`.`fateon_mapa` (`mapa_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_umbral_fateon_origen1` FOREIGN KEY (`fateon_origen_origen_id`) REFERENCES `fateon`.`fateon_origen` (`origen_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_umbral_fateon_sensor1` FOREIGN KEY (`fateon_sensor_sensor_id`) REFERENCES `fateon`.`fateon_sensor` (`sensor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fateon_umbral`
--

LOCK TABLES `fateon_umbral` WRITE;
/*!40000 ALTER TABLE `fateon_umbral` DISABLE KEYS */;
/*!40000 ALTER TABLE `fateon_umbral` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-19 21:13:33
