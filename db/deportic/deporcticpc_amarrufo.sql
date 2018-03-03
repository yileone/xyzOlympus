CREATE DATABASE  IF NOT EXISTS `deportic` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `deportic`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: deportic
-- ------------------------------------------------------
-- Server version	5.6.38-log

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
-- Table structure for table `atleta`
--

DROP TABLE IF EXISTS `atleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atleta` (
  `atleta_id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `tipoSangre` varchar(45) NOT NULL,
  `manoHabil` varchar(45) NOT NULL,
  PRIMARY KEY (`atleta_id`),
  UNIQUE KEY `idpersona_UNIQUE` (`persona_id`),
  CONSTRAINT `fk_atleta_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atleta`
--

LOCK TABLES `atleta` WRITE;
/*!40000 ALTER TABLE `atleta` DISABLE KEYS */;
INSERT INTO `atleta` VALUES (1,2,'4',''),(2,1,'4','');
/*!40000 ALTER TABLE `atleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atletarutina`
--

DROP TABLE IF EXISTS `atletarutina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atletarutina` (
  `atletaRutina_id` int(11) NOT NULL,
  `rutina_id` int(11) NOT NULL,
  `atleta_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `observacion` longtext,
  PRIMARY KEY (`atletaRutina_id`),
  KEY `fk_table1_rutina1_idx` (`rutina_id`),
  CONSTRAINT `fk_table1_atleta1` FOREIGN KEY (`rutina_id`) REFERENCES `atleta` (`atleta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atletarutina`
--

LOCK TABLES `atletarutina` WRITE;
/*!40000 ALTER TABLE `atletarutina` DISABLE KEYS */;
/*!40000 ALTER TABLE `atletarutina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `catalogo`
--

DROP TABLE IF EXISTS `catalogo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `catalogo` (
  `catalogo_id` int(11) NOT NULL AUTO_INCREMENT,
  `tabla_id` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `valor_entero` int(11) DEFAULT '0',
  `valor_float` float DEFAULT '0',
  `valor_varchar` varchar(45) DEFAULT NULL,
  `valor_hora` time DEFAULT NULL,
  `valor_fecha` date DEFAULT NULL,
  `descripcion` longtext,
  PRIMARY KEY (`catalogo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catalogo`
--

LOCK TABLES `catalogo` WRITE;
/*!40000 ALTER TABLE `catalogo` DISABLE KEYS */;
INSERT INTO `catalogo` VALUES (3,1,'tipob',0,0,'','00:00:00','2018-07-02','descricion tipo b'),(4,1,'tipo a',0,0,'','00:00:00','2018-07-02','descipcion tipo a'),(5,2,'Telefono Casa',0,0,'','00:00:00','2018-07-02','Telefono Casa'),(6,3,'Masculino',0,0,'','00:00:00','2018-02-07','Masculino'),(7,3,'Femenino',0,0,'','00:00:00','2018-02-07','Femenino'),(8,4,'Zurdo',0,0,'','00:00:00','2018-02-07','Zurdo'),(9,5,'Chilena',0,0,'','00:00:00','2018-02-07','Chilena'),(10,6,'Sub 15',0,0,'Sub 15','00:00:00','2018-02-13','Sub 15'),(11,6,'sub 17',0,0,'sub 17','00:00:00','2018-02-13','sub 17'),(12,5,'Venezolana',0,0,NULL,NULL,NULL,'Venezolana');
/*!40000 ALTER TABLE `catalogo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `club` (
  `club_id` int(11) NOT NULL AUTO_INCREMENT,
  `razonSocial` varchar(45) NOT NULL,
  `logo` longblob,
  PRIMARY KEY (`club_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (1,'1234567890',NULL),(12,'123',NULL);
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `contacto_id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  `tipoContacto` int(11) DEFAULT NULL,
  `valor` longtext,
  PRIMARY KEY (`contacto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato` (
  `contrato_id` int(11) NOT NULL,
  `atleta_id` int(11) NOT NULL,
  `convenio_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `formaPago` int(11) DEFAULT NULL,
  `valorCuota` float DEFAULT NULL,
  `cantidadCuotas` int(11) NOT NULL,
  `equipo_id` int(11) NOT NULL,
  PRIMARY KEY (`contrato_id`),
  KEY `fk_contrato_convenio1_idx` (`convenio_id`),
  KEY `fk_contrato_equipo1_idx` (`equipo_id`),
  KEY `fk_contrato_atleta1` (`atleta_id`),
  CONSTRAINT `fk_contrato_atleta1` FOREIGN KEY (`atleta_id`) REFERENCES `atleta` (`atleta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_contrato_convenio1` FOREIGN KEY (`convenio_id`) REFERENCES `convenio` (`convenio_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_contrato_equipo1` FOREIGN KEY (`equipo_id`) REFERENCES `equipo` (`equipo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato_descuento`
--

DROP TABLE IF EXISTS `contrato_descuento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato_descuento` (
  `contratoDescuento_id` int(11) NOT NULL AUTO_INCREMENT,
  `contrato_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `funcionario_id` int(11) NOT NULL,
  `valor` float DEFAULT NULL,
  `porcentaje` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`contratoDescuento_id`,`funcionario_id`),
  KEY `fk_contrato_descuento_contrato1_idx` (`contrato_id`),
  KEY `fk_contrato_descuento_funcionario1_idx` (`funcionario_id`),
  CONSTRAINT `fk_contrato_descuento_funcionario1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_descuento_contrato` FOREIGN KEY (`contrato_id`) REFERENCES `contacto` (`contacto_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato_descuento`
--

LOCK TABLES `contrato_descuento` WRITE;
/*!40000 ALTER TABLE `contrato_descuento` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_descuento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato_extras`
--

DROP TABLE IF EXISTS `contrato_extras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato_extras` (
  `extra_id` int(11) NOT NULL,
  `contrato_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  `funcionario_id` int(11) NOT NULL,
  PRIMARY KEY (`extra_id`),
  KEY `fk_table1_contrato1_idx` (`contrato_id`),
  KEY `fk_contrato_extras_funcionario1_idx` (`funcionario_id`),
  CONSTRAINT `fk_extras_contrato` FOREIGN KEY (`contrato_id`) REFERENCES `contrato` (`contrato_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato_extras`
--

LOCK TABLES `contrato_extras` WRITE;
/*!40000 ALTER TABLE `contrato_extras` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato_extras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `convenio`
--

DROP TABLE IF EXISTS `convenio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `convenio` (
  `convenio_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `descripcion` longtext,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  PRIMARY KEY (`convenio_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convenio`
--

LOCK TABLES `convenio` WRITE;
/*!40000 ALTER TABLE `convenio` DISABLE KEYS */;
INSERT INTO `convenio` VALUES (1,'Plan A',50000,'plan basico','2018-02-27 20:04:40',NULL,NULL);
/*!40000 ALTER TABLE `convenio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenador`
--

DROP TABLE IF EXISTS `entrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrenador` (
  `entrenador_id` int(11) NOT NULL AUTO_INCREMENT,
  `desde` date NOT NULL,
  `hasta` date DEFAULT NULL,
  `persona_id` int(11) NOT NULL,
  `equipo_id` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  PRIMARY KEY (`entrenador_id`,`persona_id`,`equipo_id`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`persona_id`),
  UNIQUE KEY `equipo_idEquipo_UNIQUE` (`equipo_id`),
  KEY `fk_entrenador_Persona1_idx` (`persona_id`),
  KEY `fk_entrenador_equipo1_idx` (`equipo_id`),
  CONSTRAINT `fk_entrenador_Persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrenador_equipo1` FOREIGN KEY (`equipo_id`) REFERENCES `equipo` (`equipo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrenador`
--

LOCK TABLES `entrenador` WRITE;
/*!40000 ALTER TABLE `entrenador` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrenador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipo`
--

DROP TABLE IF EXISTS `equipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `equipo` (
  `equipo_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `categoria` int(11) NOT NULL,
  `club_id` int(11) NOT NULL,
  PRIMARY KEY (`equipo_id`),
  KEY `fk_equipo_club1` (`club_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipo`
--

LOCK TABLES `equipo` WRITE;
/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extras`
--

DROP TABLE IF EXISTS `extras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `extras` (
  `extra_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  PRIMARY KEY (`extra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extras`
--

LOCK TABLES `extras` WRITE;
/*!40000 ALTER TABLE `extras` DISABLE KEYS */;
/*!40000 ALTER TABLE `extras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `funcionario_id` int(11) NOT NULL AUTO_INCREMENT,
  `persona_id` int(11) NOT NULL,
  PRIMARY KEY (`funcionario_id`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`persona_id`),
  KEY `fk_funcionario_Persona1_idx` (`persona_id`),
  CONSTRAINT `fk_funcionario_Persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionario_persona` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historialfisico`
--

DROP TABLE IF EXISTS `historialfisico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialfisico` (
  `historialFisico_id` int(11) NOT NULL,
  `atleta_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `tallaCamisa` int(11) DEFAULT NULL,
  `tallaZapato` float DEFAULT NULL,
  `tallaPantalon` int(11) DEFAULT NULL,
  `porcGrasa` float NOT NULL,
  `porcMusculo` float NOT NULL,
  `imagen` longblob,
  `funcionario_id` int(11) NOT NULL,
  PRIMARY KEY (`historialFisico_id`),
  KEY `fk_historialFisico_atleta1_idx` (`atleta_id`),
  KEY `fk_historialFisico_funcionario1_idx` (`funcionario_id`),
  CONSTRAINT `fk_historialFisico_atleta1` FOREIGN KEY (`atleta_id`) REFERENCES `atleta` (`atleta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialFisico_funcionario1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialfisico`
--

LOCK TABLES `historialfisico` WRITE;
/*!40000 ALTER TABLE `historialfisico` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialfisico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historiallogros`
--

DROP TABLE IF EXISTS `historiallogros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historiallogros` (
  `historial_Logro_id` int(11) NOT NULL,
  `atleta_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `logro` longtext NOT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `competencia` varchar(45) DEFAULT NULL,
  `funcionario_id` int(11) NOT NULL,
  `torneo_id` int(11) NOT NULL,
  PRIMARY KEY (`historial_Logro_id`),
  KEY `fk_historialLogros_atleta1_idx` (`atleta_id`),
  KEY `fk_historialLogros_funcionario1_idx` (`funcionario_id`),
  KEY `fk_historialLogros_torneo1_idx` (`torneo_id`),
  CONSTRAINT `fk_historialLogros_atleta1` FOREIGN KEY (`atleta_id`) REFERENCES `atleta` (`atleta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialLogros_funcionario1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialLogros_torneo1` FOREIGN KEY (`torneo_id`) REFERENCES `torneo` (`torneo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historiallogros`
--

LOCK TABLES `historiallogros` WRITE;
/*!40000 ALTER TABLE `historiallogros` DISABLE KEYS */;
/*!40000 ALTER TABLE `historiallogros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historialmedico`
--

DROP TABLE IF EXISTS `historialmedico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historialmedico` (
  `historialMedico_id` int(11) NOT NULL,
  `atleta_id` int(11) NOT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `medicoTratante` varchar(45) DEFAULT NULL,
  `centroClinico` varchar(45) DEFAULT NULL,
  `tratamiento` longtext,
  `operacion` longtext,
  `reposoDesde` date DEFAULT NULL,
  `reposoHasta` date DEFAULT NULL,
  `fractura` varchar(45) DEFAULT NULL,
  `funcionario_id` int(11) NOT NULL,
  PRIMARY KEY (`historialMedico_id`),
  KEY `fk_historialMedico_atleta1_idx` (`atleta_id`),
  KEY `fk_historialMedico_funcionario1_idx` (`funcionario_id`),
  CONSTRAINT `fk_historialMedico_atleta1` FOREIGN KEY (`atleta_id`) REFERENCES `atleta` (`atleta_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialMedico_funcionario1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historialmedico`
--

LOCK TABLES `historialmedico` WRITE;
/*!40000 ALTER TABLE `historialmedico` DISABLE KEYS */;
/*!40000 ALTER TABLE `historialmedico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inscripcion` (
  `inscripcion_id` int(11) NOT NULL,
  `equipo_id` int(11) NOT NULL,
  `torneo_id` int(11) NOT NULL,
  PRIMARY KEY (`inscripcion_id`),
  KEY `fk_inscripcion_equipo1_idx` (`equipo_id`),
  KEY `fk_inscripcion_torneo1_idx` (`torneo_id`),
  CONSTRAINT `fk_inscripcion_equipo1` FOREIGN KEY (`equipo_id`) REFERENCES `equipo` (`equipo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_inscripcion_torneo1` FOREIGN KEY (`torneo_id`) REFERENCES `torneo` (`torneo_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagos`
--

DROP TABLE IF EXISTS `pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagos` (
  `pago_id` int(11) NOT NULL,
  `contrato_id` int(11) NOT NULL AUTO_INCREMENT,
  `fechaRegistro` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `monto` float DEFAULT NULL,
  `numeroCheque` varchar(45) DEFAULT NULL,
  `banco` varchar(45) DEFAULT NULL,
  `tdc` varchar(45) DEFAULT NULL,
  `efectivo` float DEFAULT NULL,
  `numerotransaccion` int(11) DEFAULT NULL,
  `transferencia` int(11) DEFAULT NULL,
  PRIMARY KEY (`pago_id`),
  KEY `fk_pago_contrato_idx` (`contrato_id`),
  CONSTRAINT `fk_pago_contrato` FOREIGN KEY (`contrato_id`) REFERENCES `contrato` (`contrato_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagos`
--

LOCK TABLES `pagos` WRITE;
/*!40000 ALTER TABLE `pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partido`
--

DROP TABLE IF EXISTS `partido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partido` (
  `partido_id` int(11) NOT NULL,
  `inscripcionLocal_id` int(11) NOT NULL,
  `inscripcionVisitante_id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `set1Local` int(11) DEFAULT NULL,
  `set2Local` int(11) DEFAULT NULL,
  `set3Local` int(11) DEFAULT NULL,
  `set4Local` int(11) DEFAULT NULL,
  `set5Local` int(11) DEFAULT NULL,
  `set1Visitante` int(11) DEFAULT NULL,
  `set2Visitante` int(11) DEFAULT NULL,
  `set3Visitante` int(11) DEFAULT NULL,
  `set4Visitante` int(11) DEFAULT NULL,
  `set5Visitante` int(11) DEFAULT NULL,
  `ganador` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`partido_id`),
  KEY `fk_partido_inscripcion1_idx` (`inscripcionLocal_id`),
  KEY `fk_partido_inscripcion2_idx` (`inscripcionVisitante_id`),
  CONSTRAINT `fk_partido_inscripcion1` FOREIGN KEY (`inscripcionLocal_id`) REFERENCES `inscripcion` (`inscripcion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_partido_inscripcion2` FOREIGN KEY (`inscripcionVisitante_id`) REFERENCES `inscripcion` (`inscripcion_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partido`
--

LOCK TABLES `partido` WRITE;
/*!40000 ALTER TABLE `partido` DISABLE KEYS */;
/*!40000 ALTER TABLE `partido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `persona_id` int(11) NOT NULL AUTO_INCREMENT,
  `rut` int(11) NOT NULL,
  `digitoVerificador` varchar(1) NOT NULL,
  `primerNombre` varchar(45) DEFAULT NULL,
  `segundoNombre` varchar(45) DEFAULT NULL,
  `primerApellido` varchar(45) DEFAULT NULL,
  `segundoApellido` varchar(45) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  `estadoCivil` int(11) DEFAULT NULL,
  `lugarNacimiento` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `fechaRegistro` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sexo` int(11) NOT NULL,
  `contacto_id` int(11) NOT NULL,
  PRIMARY KEY (`persona_id`),
  UNIQUE KEY `idpersona_unique` (`persona_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,1234567890,'2','Anthony','Jose','Marrufo','','2014-10-02',NULL,'Los Teques','9','2018-02-08 01:01:07',6,0),(2,9475892,'0','yisheng','','León','espinoza','2018-06-02',NULL,'santiago de chile','9','2018-02-09 19:57:41',6,0),(3,8668401,'2','Jose','R.','Leon','Vasquez','1969-04-17',NULL,'ñuñoa','9','2018-02-12 15:11:12',6,0);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante`
--

DROP TABLE IF EXISTS `representante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `representante` (
  `representante_id` int(11) NOT NULL AUTO_INCREMENT,
  `fechaInicio` date NOT NULL,
  `fechaFin` date DEFAULT NULL,
  `fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `persona_id` int(11) NOT NULL,
  `club_id` int(11) NOT NULL,
  PRIMARY KEY (`representante_id`,`persona_id`,`club_id`),
  UNIQUE KEY `idpersona_UNIQUE` (`persona_id`),
  KEY `fk_representante_persona_idx` (`persona_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `representante`
--

LOCK TABLES `representante` WRITE;
/*!40000 ALTER TABLE `representante` DISABLE KEYS */;
/*!40000 ALTER TABLE `representante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `rol_id` int(11) NOT NULL,
  `descripcion` longtext,
  `funcionario_id` int(11) DEFAULT NULL,
  `persona_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`rol_id`),
  KEY `fk_rol_funcionario1` (`funcionario_id`),
  CONSTRAINT `fk_rol_funcionario1` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`funcionario_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutina`
--

DROP TABLE IF EXISTS `rutina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rutina` (
  `rutina_id` int(11) NOT NULL AUTO_INCREMENT,
  `actividad` varchar(45) NOT NULL,
  `frecuencia` varchar(45) DEFAULT NULL,
  `tiempo` varchar(45) DEFAULT NULL,
  `descansoFrecuencia` varchar(45) DEFAULT NULL,
  `rutinaNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`rutina_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutina`
--

LOCK TABLES `rutina` WRITE;
/*!40000 ALTER TABLE `rutina` DISABLE KEYS */;
/*!40000 ALTER TABLE `rutina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socio`
--

DROP TABLE IF EXISTS `socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socio` (
  `socio_id` int(11) NOT NULL AUTO_INCREMENT,
  `club_id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL,
  PRIMARY KEY (`socio_id`,`club_id`,`persona_id`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`persona_id`),
  KEY `fk_socio_club1_idx` (`club_id`),
  KEY `fk_socio_Persona1_idx` (`persona_id`),
  CONSTRAINT `fk_socio_Persona1` FOREIGN KEY (`persona_id`) REFERENCES `persona` (`persona_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_socio_club1` FOREIGN KEY (`club_id`) REFERENCES `club` (`club_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socio`
--

LOCK TABLES `socio` WRITE;
/*!40000 ALTER TABLE `socio` DISABLE KEYS */;
/*!40000 ALTER TABLE `socio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla`
--

DROP TABLE IF EXISTS `tabla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabla` (
  `tabla_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` longtext,
  PRIMARY KEY (`tabla_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla`
--

LOCK TABLES `tabla` WRITE;
/*!40000 ALTER TABLE `tabla` DISABLE KEYS */;
INSERT INTO `tabla` VALUES (1,'TipoSangre','contiene los valores para los posibles tipos de sa'),(2,'TipoContactos','TipoContactos'),(3,'Sexo','contiene los tipos de sexo'),(4,'Lateralidad','contiene informacion si derecho o surdo'),(5,'Nacionalidades','Nacionalidades'),(6,'CategoriaEquipo','CategoriaEquipo');
/*!40000 ALTER TABLE `tabla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `torneo`
--

DROP TABLE IF EXISTS `torneo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `torneo` (
  `torneo_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` longtext,
  PRIMARY KEY (`torneo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `torneo`
--

LOCK TABLES `torneo` WRITE;
/*!40000 ALTER TABLE `torneo` DISABLE KEYS */;
INSERT INTO `torneo` VALUES (1,'San alselmo','Vitacura 3000'),(2,'sscc alameda','Alameda 3500');
/*!40000 ALTER TABLE `torneo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-27 18:45:07
