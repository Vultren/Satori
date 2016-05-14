LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
INSERT INTO `organization` VALUES (1,'C9 Data Systems',NULL,'Data Storage',NULL);
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `asset` WRITE;
/*!40000 ALTER TABLE `asset` DISABLE KEYS */;
INSERT INTO `asset` VALUES ('1', '5146', 'C-R-MAIN', '1', '10.201.176.1', '1', '2013-11-14 16:45:00', '2013-07-10 12:53:07', '12', 'Cisco Systems - 2921', '1', '1'), ('2', '354', 'C-R-SEC', '1', '10.201.177.1', '1', '2013-11-14 16:45:01', '2013-07-10 12:53:07', '12', 'Cisco Systems - 2921', '1', '1'), ('3', '9532', 'C-WALL-S', '1', '10.201.177.2', '1', '2013-11-14 16:45:01', '2013-07-10 12:53:07', '2', 'Cisco Systems - ASA 5520', '1', '2'), ('4', '9534', 'C-WALL-U', '1', '10.201.176.2', '1', '2013-11-14 16:45:01', '2013-07-10 12:53:07', '2', 'Cisco Systems - ASA 5520', '1', '2'), ('5', '5468', 'C-SW-S', '1', '10.201.177.254', '1', '2013-11-14 16:45:01', '2013-07-10 12:53:07', '3', 'Cisco Systems - Catalyst 6506-IOS', '1', '1'), ('6', '3418', 'C-S-M', '1', '10.201.177.22', '1', '2013-11-14 16:45:01', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('7', '6183', 'C-S-DB', '1', '10.201.177.23', '1', '2013-11-14 16:45:02', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '3'), ('8', '3579', 'C-S-W', '1', 'NULL', '1', '2013-11-14 16:45:02', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('9', '3584', 'C-S-W', '1', '10.201.177.25', '1', '2013-11-14 16:45:02', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('10', '3581', 'C-S-W', '1', '10.201.177.255', '1', '2013-11-14 16:45:03', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('11', '3580', 'C-S-W', '1', '10.201.177.0', '1', '2013-11-14 16:45:03', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('12', '3583', 'C-S-W', '1', '10.201.177.254', '1', '2013-11-14 16:45:03', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('13', '3582', 'C-S-W', '1', '10.201.177.1', '1', '2013-11-14 16:45:03', '2013-07-10 12:53:07', '6', 'NET-SNMP - Linux', '1', '2'), ('14', '86541', 'C', '1', '10.201.176.254', '1', '2013-11-14 16:45:04', '2013-07-10 12:53:07', '3', 'Cisco Systems - Catalyst 6506-IOS', '1', '1'), ('15', '86542', 'Dsgdsfh546d54hjdf6h581436g5hd1f3h52df13df52d13hfd52fh1dfhdruftj46dtf5d14thdherti65y;t6y5uedrte1d3ty5u1f3g2dry;t3ydr3t52e1t3drty.u13yhd2ty13dt.2y0.d0ydery21rt3uj2fg0udr.ry251tf.3uf.2g0hd.y2rt1dryrft4y1dtfy2hd1tud25ry4lr2t1u4drtyr,24y1uirftyufoemslapslma;ok', '1', '10.201.176.254', '1', '2013-11-14 16:45:04', '2013-07-10 12:53:07', '3', 'Cisco Systems - Catalyst 6506-IOS', '1', '1'), ('16', '86543', 'C-SW-U', '1', '10.201.176.254', '1', '2013-11-14 16:45:05', '2013-07-10 12:53:07', '3', 'Cisco Systems - Catalyst 6506-IOS', '1', '1'), ('17', '9.22337E+18', 'C-WS-FH', '1', '10.201.176.190', '1', '2013-11-14 16:45:05', '2013-07-10 12:53:07', '7', 'Dell Workstation', '1', '3'), ('18', '4521', 'C-WS-FH', '1', '10.201.176.190', '1', '2013-11-14 16:45:06', '2013-07-10 12:53:07', '7', 'Dell Workstation', '1', '3'), ('19', '64831', 'C-L-SB', '1', '10.201.176.187', '1', '2013-11-14 16:45:06', '2013-07-10 12:53:07', '7', 'Dell Latitude E6530', '1', '2'), ('20', '15835', 'C-L-FG', '1', '10.201.176.195', '1', '2013-11-14 16:45:06', '2013-07-10 12:53:07', '7', 'Dell Latitude E6530', '1', '2'), ('21', '9542', 'C-L-YY', '1', '10.201.176.180', '1', '2013-11-14 16:45:07', '2013-07-10 12:53:07', '7', 'Dell Latitude E6530', '1', '2'), ('22', '786523', 'C-L-ODR', '1', '10.201.176.185', '1', '2013-11-14 16:45:08', '2013-07-10 12:53:07', '7', 'Dell Latitude E6530', '1', '2'), ('23', '9999', 'C-WS-IN', '1', '10.201.176.200', '1', '2013-11-14 16:45:08', '2013-07-10 12:53:07', '7', 'Dell Workstation', '1', '3');
/*!40000 ALTER TABLE `asset` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,1, '2013-01-01 00:00:00', '2013-10-01 00:00:00', 'Y');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `partner` WRITE;
/*!40000 ALTER TABLE `partner` DISABLE KEYS */;
INSERT INTO `partner` VALUES (1,1,'');
/*!40000 ALTER TABLE `partner` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'24865 New Road',NULL,'Fairfax',46,'22039',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1,'N',333);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Eric','Walden',NULL,'',1);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `service_support_group` WRITE;
/*!40000 ALTER TABLE `service_support_group` DISABLE KEYS */;
INSERT INTO `service_support_group` VALUES (1,'C9 Data Systems Default Group','C9 Data Systems Default Group',1,'Y');
/*!40000 ALTER TABLE `service_support_group` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('1', 'C9 Data Systems Unknown', 'Unknown', 'C9 Data Systems Unknown', '2013-01-01 00:00:00', '2013-10-01 00:00:00', '1', '1', '6'), ('2', 'C9 Data Systems Web', 'Web', 'C9 Data Systems Web', '2013-01-01 00:00:00', '2013-01-01 00:00:00', '1', '1', '8'), ('3', 'C9 Data Systems Email', 'Email', 'C9 Data Systems Email', '2013-01-01 00:00:00', '2013-01-01 00:00:00', '1', '1', '2'), ('4', 'C9 Data Systems Storage', 'Storage', 'C9 Data Systems Storage', '2013-01-01 00:00:00', '2013-01-01 00:00:00', '1', '1', '3'), ('5', 'C9 Data Systems Security', 'Security', 'C9 Data Systems Security', '2013-01-01 00:00:00', '2013-01-01 00:00:00', '1', '1', '4');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

LOCK TABLES `service_asset_xref` WRITE;
/*!40000 ALTER TABLE `service_asset_xref` DISABLE KEYS */;
INSERT INTO `service_asset_xref` VALUES ('1', '1', '1', '75'), ('2', '2', '2', '75'), ('3', '3', '5', '75'), ('4', '4', '5', '75'), ('5', '5', '5', '75'), ('6', '6', '3', '75'), ('7', '7', '4', '75'), ('8', '8', '5', '75'), ('9', '9', '5', '75'), ('10', '10', '5', '75'), ('11', '11', '5', '75'), ('12', '12', '5', '75'), ('13', '13', '5', '75'), ('15', '15', '1', '75'), ('16', '16', '5', '75'), ('17', '17', '1', '75'), ('18', '18', '1', '75'), ('19', '19', '1', '75'), ('20', '20', '1', '75'), ('21', '21', '1', '75'), ('22', '22', '1', '75'), ('23', '23', '1', '75');
/*!40000 ALTER TABLE `service_asset_xref` ENABLE KEYS */;
UNLOCK TABLES;

/*!40000 ALTER TABLE `subservice_score` DISABLE KEYS */;
insert into subservice_score 
(service_id, organization_display_name, location, service_display_name, service_type_name, 
performance_score, availability_score, capacity_score, configuration_score, 
environmental_score, security_score, overall_score) 
select service_id, display_org, display_location, display_service, service_type_name, 
display_performance_num, display_availability_num, display_capacity_num, display_configuration_num, 
display_environmental_num, display_security_num, display_overall_num from display_tbl;
/*!40000 ALTER TABLE `subservice_score` ENABLE KEYS */;


LOCK TABLES `contact_info` WRITE;
/*!40000 ALTER TABLE `contact_info` DISABLE KEYS */;
INSERT INTO `contact_info` VALUES (1,5714411724,'eric.walden@1901group.com',1,2,NULL);
/*!40000 ALTER TABLE `contact_info` ENABLE KEYS */;
UNLOCK TABLES;
