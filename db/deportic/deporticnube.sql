-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 45.7.229.159    Database: deportic
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
-- Table structure for table `Extras`
--

DROP TABLE IF EXISTS `Extras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Extras` (
  `idExtras` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idExtras`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Extras`
--

LOCK TABLES `Extras` WRITE;
/*!40000 ALTER TABLE `Extras` DISABLE KEYS */;
/*!40000 ALTER TABLE `Extras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atleta`
--

DROP TABLE IF EXISTS `atleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atleta` (
  `idatleta` int(11) NOT NULL AUTO_INCREMENT,
  `idpersona` int(11) NOT NULL,
  `tipoSangre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idatleta`),
  UNIQUE KEY `idpersona_UNIQUE` (`idpersona`),
  CONSTRAINT `fk_atleta_persona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atleta`
--

LOCK TABLES `atleta` WRITE;
/*!40000 ALTER TABLE `atleta` DISABLE KEYS */;
INSERT INTO `atleta` VALUES (1,2,'4'),(2,1,'4');
/*!40000 ALTER TABLE `atleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `atletarutina`
--

DROP TABLE IF EXISTS `atletarutina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `atletarutina` (
  `atleta_idatleta` int(11) NOT NULL,
  `rutina_idrutina` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `FechaRegistro` date NOT NULL,
  `FechaFin` date DEFAULT NULL,
  `observacion` longtext,
  `idatletarutina` int(11) NOT NULL,
  PRIMARY KEY (`atleta_idatleta`,`rutina_idrutina`,`idatletarutina`),
  KEY `fk_table1_rutina1_idx` (`rutina_idrutina`),
  CONSTRAINT `fk_table1_atleta1` FOREIGN KEY (`atleta_idatleta`) REFERENCES `atleta` (`idatleta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_table1_rutina1` FOREIGN KEY (`rutina_idrutina`) REFERENCES `rutina` (`idrutina`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idcatalogo` int(11) NOT NULL AUTO_INCREMENT,
  `idtabla` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `valor_entero` int(11) DEFAULT '0',
  `valor_float` float DEFAULT '0',
  `valor_varchar` varchar(255) DEFAULT NULL,
  `valor_hora` time DEFAULT NULL,
  `valor_fecha` date DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcatalogo`)
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
  `idclub` int(11) NOT NULL AUTO_INCREMENT,
  `razonSocial` varchar(45) NOT NULL,
  `logo` blob,
  PRIMARY KEY (`idclub`)
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
  `idcontacto` int(11) NOT NULL AUTO_INCREMENT,
  `idpersona` int(11) NOT NULL,
  `tipoContacto` int(11) DEFAULT NULL,
  `valor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idcontacto`)
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
  `atleta_idatleta` int(11) NOT NULL,
  `convenio_idconvenio` int(11) NOT NULL,
  `contratocol` varchar(45) NOT NULL,
  `FechaRegistro` date NOT NULL,
  `fechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `formaPago` varchar(45) DEFAULT NULL,
  `valorCuota` int(11) DEFAULT NULL,
  `cantidadCuotas` int(11) NOT NULL,
  `equipo_idEquipo` int(11) NOT NULL,
  PRIMARY KEY (`contratocol`),
  KEY `fk_contrato_convenio1_idx` (`convenio_idconvenio`),
  KEY `fk_contrato_equipo1_idx` (`equipo_idEquipo`),
  KEY `fk_contrato_atleta1` (`atleta_idatleta`),
  CONSTRAINT `fk_contrato_atleta1` FOREIGN KEY (`atleta_idatleta`) REFERENCES `atleta` (`idatleta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_contrato_convenio1` FOREIGN KEY (`convenio_idconvenio`) REFERENCES `convenio` (`idconvenio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_contrato_equipo1` FOREIGN KEY (`equipo_idEquipo`) REFERENCES `equipo` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idcontrato_descuento` int(11) NOT NULL AUTO_INCREMENT,
  `contrato_contratocol` varchar(45) NOT NULL,
  `funcionario_idfuncionario` int(11) NOT NULL,
  `valor` int(11) NOT NULL,
  `porcentaje` tinyint(4) NOT NULL,
  PRIMARY KEY (`idcontrato_descuento`,`funcionario_idfuncionario`),
  KEY `fk_contrato_descuento_contrato1_idx` (`contrato_contratocol`),
  KEY `fk_contrato_descuento_funcionario1_idx` (`funcionario_idfuncionario`),
  CONSTRAINT `fk_contrato_descuento_contrato1` FOREIGN KEY (`contrato_contratocol`) REFERENCES `contrato` (`contratocol`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_contrato_descuento_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `contrato_contratocol` varchar(45) NOT NULL,
  `Extras_idExtras` int(11) NOT NULL,
  `fechaRegistro` date DEFAULT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaVigencia` date DEFAULT NULL,
  `funcionario_idfuncionario` int(11) NOT NULL,
  PRIMARY KEY (`Extras_idExtras`,`funcionario_idfuncionario`),
  KEY `fk_table1_contrato1_idx` (`contrato_contratocol`),
  KEY `fk_contrato_extras_funcionario1_idx` (`funcionario_idfuncionario`),
  CONSTRAINT `fk_contrato_extras_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_table1_Extras1` FOREIGN KEY (`Extras_idExtras`) REFERENCES `Extras` (`idExtras`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_table1_contrato1` FOREIGN KEY (`contrato_contratocol`) REFERENCES `contrato` (`contratocol`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idconvenio` int(11) NOT NULL AUTO_INCREMENT,
  `nombreConvenio` varchar(45) DEFAULT NULL,
  `Valor` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `vigencia` date NOT NULL,
  PRIMARY KEY (`idconvenio`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `convenio`
--

LOCK TABLES `convenio` WRITE;
/*!40000 ALTER TABLE `convenio` DISABLE KEYS */;
INSERT INTO `convenio` VALUES (1,'Plan A',50000,'plan basico','2018-02-13');
/*!40000 ALTER TABLE `convenio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrenador`
--

DROP TABLE IF EXISTS `entrenador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrenador` (
  `identrenador` int(11) NOT NULL AUTO_INCREMENT,
  `desde` date NOT NULL,
  `hasta` date DEFAULT NULL,
  `Persona_idPersona` int(11) NOT NULL,
  `equipo_idEquipo` int(11) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`identrenador`,`Persona_idPersona`,`equipo_idEquipo`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`Persona_idPersona`),
  UNIQUE KEY `equipo_idEquipo_UNIQUE` (`equipo_idEquipo`),
  KEY `fk_entrenador_Persona1_idx` (`Persona_idPersona`),
  KEY `fk_entrenador_equipo1_idx` (`equipo_idEquipo`),
  CONSTRAINT `fk_entrenador_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrenador_equipo1` FOREIGN KEY (`equipo_idEquipo`) REFERENCES `equipo` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `id_equipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `club_idclub` int(11) NOT NULL,
  PRIMARY KEY (`id_equipo`),
  KEY `fk_equipo_club1` (`club_idclub`),
  CONSTRAINT `fk_equipo_club1` FOREIGN KEY (`club_idclub`) REFERENCES `club` (`idclub`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `Persona_idPersona` int(11) NOT NULL,
  `idfuncionario` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idfuncionario`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`Persona_idPersona`),
  KEY `fk_funcionario_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_funcionario_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_funcionario_persona` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idhistorialFisico` int(11) NOT NULL,
  `atleta_idatleta` int(11) NOT NULL,
  `FechaRegistro` date DEFAULT NULL,
  `altura` int(11) NOT NULL,
  `peso` int(11) NOT NULL,
  `tallaCamisa` int(11) DEFAULT NULL,
  `tallaZapato` int(11) DEFAULT NULL,
  `tallaPantalon` varchar(45) DEFAULT NULL,
  `porcGrasa` int(11) NOT NULL,
  `porcMusculo` int(11) NOT NULL,
  `imagen` blob,
  `funcionario_idfuncionario` int(11) NOT NULL,
  PRIMARY KEY (`idhistorialFisico`),
  KEY `fk_historialFisico_atleta1_idx` (`atleta_idatleta`),
  KEY `fk_historialFisico_funcionario1_idx` (`funcionario_idfuncionario`),
  CONSTRAINT `fk_historialFisico_atleta1` FOREIGN KEY (`atleta_idatleta`) REFERENCES `atleta` (`idatleta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialFisico_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `atleta_idatleta` int(11) NOT NULL,
  `FechaRegistro` date NOT NULL,
  `logro` longtext NOT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `competencia` varchar(45) DEFAULT NULL,
  `funcionario_idfuncionario` int(11) NOT NULL,
  `torneo_idtorneo` int(11) DEFAULT NULL,
  `idhistorialogro` int(11) NOT NULL,
  PRIMARY KEY (`idhistorialogro`),
  KEY `fk_historialLogros_atleta1_idx` (`atleta_idatleta`),
  KEY `fk_historialLogros_funcionario1_idx` (`funcionario_idfuncionario`),
  KEY `fk_historialLogros_torneo1_idx` (`torneo_idtorneo`),
  CONSTRAINT `fk_historialLogros_atleta1` FOREIGN KEY (`atleta_idatleta`) REFERENCES `atleta` (`idatleta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialLogros_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialLogros_torneo1` FOREIGN KEY (`torneo_idtorneo`) REFERENCES `torneo` (`idtorneo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `atleta_idatleta` int(11) NOT NULL,
  `FechaRegistro` date DEFAULT NULL,
  `medicoTratante` varchar(45) DEFAULT NULL,
  `centroClinico` varchar(45) DEFAULT NULL,
  `tratamiento` longtext,
  `operacion` longtext,
  `reposoDesde` date DEFAULT NULL,
  `reposoHasta` date DEFAULT NULL,
  `fractura` varchar(45) DEFAULT NULL,
  `funcionario_idfuncionario` int(11) NOT NULL,
  `idhistorialmedico` int(11) NOT NULL,
  PRIMARY KEY (`idhistorialmedico`),
  KEY `fk_historialMedico_atleta1_idx` (`atleta_idatleta`),
  KEY `fk_historialMedico_funcionario1_idx` (`funcionario_idfuncionario`),
  CONSTRAINT `fk_historialMedico_atleta1` FOREIGN KEY (`atleta_idatleta`) REFERENCES `atleta` (`idatleta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_historialMedico_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `equipo_idEquipo` int(11) NOT NULL,
  `torneo_idtorneo` int(11) NOT NULL,
  `idincripcion` int(11) NOT NULL,
  PRIMARY KEY (`idincripcion`),
  KEY `fk_inscripcion_equipo1_idx` (`equipo_idEquipo`),
  KEY `fk_inscripcion_torneo1_idx` (`torneo_idtorneo`),
  CONSTRAINT `fk_inscripcion_equipo1` FOREIGN KEY (`equipo_idEquipo`) REFERENCES `equipo` (`id_equipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_inscripcion_torneo1` FOREIGN KEY (`torneo_idtorneo`) REFERENCES `torneo` (`idtorneo`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `id_contrato` varchar(45) NOT NULL,
  `pagos` int(11) NOT NULL AUTO_INCREMENT,
  `FechaRegistro` date NOT NULL,
  `Monto` varchar(45) DEFAULT NULL,
  `numeroCheque` varchar(45) DEFAULT NULL,
  `banco` varchar(45) DEFAULT NULL,
  `tdc` varchar(45) DEFAULT NULL,
  `efectivo` int(11) NOT NULL DEFAULT '0',
  `numerotransaccion` int(11) DEFAULT NULL,
  `transferencia` int(11) DEFAULT NULL,
  PRIMARY KEY (`pagos`),
  KEY `fk_pagos_contrato1` (`id_contrato`),
  CONSTRAINT `fk_pagos_contrato1` FOREIGN KEY (`id_contrato`) REFERENCES `contrato` (`contratocol`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idpartido` int(11) NOT NULL,
  `inscripcion_idLocal` int(11) NOT NULL,
  `inscripcion_idVisitante` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` datetime DEFAULT NULL,
  `lugar` varchar(45) DEFAULT NULL,
  `partidocol` varchar(45) DEFAULT NULL,
  `set1Local` int(11) DEFAULT NULL,
  `set2Local` int(11) DEFAULT NULL,
  `set3Local` int(11) DEFAULT NULL,
  `set4Local` int(11) DEFAULT NULL,
  `set5Local` int(11) DEFAULT NULL,
  `set1Visitante` int(11) DEFAULT NULL,
  `set2Vistitante` int(11) DEFAULT NULL,
  `set3Visitante` int(11) DEFAULT NULL,
  `set4Visitante` int(11) DEFAULT NULL,
  `set5Visitante` int(11) DEFAULT NULL,
  `Ganador` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idpartido`),
  KEY `fk_partido_inscripcion1_idx` (`inscripcion_idLocal`),
  KEY `fk_partido_inscripcion2_idx` (`inscripcion_idVisitante`),
  CONSTRAINT `fk_partido_inscripcion1` FOREIGN KEY (`inscripcion_idLocal`) REFERENCES `inscripcion` (`idincripcion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_partido_inscripcion2` FOREIGN KEY (`inscripcion_idVisitante`) REFERENCES `inscripcion` (`idincripcion`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idpersona` int(11) NOT NULL AUTO_INCREMENT,
  `rut` int(11) NOT NULL,
  `digitoVerificador` varchar(45) NOT NULL,
  `primerNombre` varchar(45) DEFAULT NULL,
  `segundoNombre` varchar(45) DEFAULT NULL,
  `primerApellido` varchar(45) DEFAULT NULL,
  `segundoApellido` varchar(45) DEFAULT NULL,
  `fechaNac` date DEFAULT NULL,
  `estadoCivil` varchar(45) DEFAULT NULL,
  `lugarNacimiento` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `fechaRegistro` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `sexo` varchar(45) NOT NULL,
  `manoHabil` varchar(45) NOT NULL,
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `idpersona_unique` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,1234567890,'2','Anthony','Jose','Marrufo','','2014-10-02',NULL,'Los Teques','9','2018-02-08 01:01:07','6','8'),(2,9475892,'0','yisheng','','León','espinoza','2018-06-02',NULL,'santiago de chile','9','2018-02-09 19:57:41','6','8'),(3,8668401,'2','Jose','R.','Leon','Vasquez','1969-04-17',NULL,'ñuñoa','9','2018-02-12 15:11:12','6','8');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `representante`
--

DROP TABLE IF EXISTS `representante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `representante` (
  `idrepresentante` int(11) NOT NULL AUTO_INCREMENT,
  `fechaInicio` date NOT NULL,
  `fechaFin` date DEFAULT NULL,
  `fechaRegistro` date NOT NULL,
  `idpersona` int(11) NOT NULL,
  `idclub` int(11) NOT NULL,
  PRIMARY KEY (`idrepresentante`,`idpersona`,`idclub`),
  UNIQUE KEY `idpersona_UNIQUE` (`idpersona`),
  KEY `fk_representante_persona_idx` (`idpersona`),
  CONSTRAINT `fk_representante_persona` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idrol` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `funcionario_idfuncionario` int(11) DEFAULT NULL,
  `idpersona` int(11) DEFAULT NULL,
  PRIMARY KEY (`idrol`),
  KEY `fk_rol_funcionario1` (`funcionario_idfuncionario`),
  CONSTRAINT `fk_rol_funcionario1` FOREIGN KEY (`funcionario_idfuncionario`) REFERENCES `funcionario` (`idfuncionario`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idrutina` int(11) NOT NULL AUTO_INCREMENT,
  `Actividad` varchar(45) NOT NULL,
  `frecuencia` varchar(45) DEFAULT NULL,
  `tiempo` varchar(45) DEFAULT NULL,
  `descansoFrecuencia` varchar(45) DEFAULT NULL,
  `rutinaNombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idrutina`)
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
  `idsocio` int(11) NOT NULL AUTO_INCREMENT,
  `club_idclub` int(11) NOT NULL,
  `Persona_idPersona` int(11) NOT NULL,
  PRIMARY KEY (`idsocio`,`club_idclub`,`Persona_idPersona`),
  UNIQUE KEY `Persona_idPersona_UNIQUE` (`Persona_idPersona`),
  KEY `fk_socio_club1_idx` (`club_idclub`),
  KEY `fk_socio_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_socio_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_socio_club1` FOREIGN KEY (`club_idclub`) REFERENCES `club` (`idclub`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `idTabla` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTabla`)
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
  `idtorneo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idtorneo`)
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

-- Dump completed on 2018-02-19 19:39:15
