/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : anyi

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-12-13 19:55:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for enum_const
-- ----------------------------
DROP TABLE IF EXISTS `enum_const`;
CREATE TABLE `enum_const` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `code` int(10) NOT NULL,
  `namespace` varchar(100) NOT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enum_const
-- ----------------------------
