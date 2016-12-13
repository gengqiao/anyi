/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : anyi

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-12-13 19:55:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pe_site
-- ----------------------------
DROP TABLE IF EXISTS `pe_site`;
CREATE TABLE `pe_site` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `webDomain` varchar(255) DEFAULT NULL,
  `webName` varchar(255) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pe_site
-- ----------------------------
