UNLOCK TABLES;

DROP TABLE IF EXISTS `account_tbl`;

CREATE TABLE `account_tbl` ( `id` int NOT NULL, `active` bit(1) DEFAULT NULL, `birthdate` datetime DEFAULT NULL, `email` varchar(255) DEFAULT NULL,`firstname` varchar(255) DEFAULT NULL,`lastname` varchar(255) DEFAULT NULL, PRIMARY KEY (`id`)) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
