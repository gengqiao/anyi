/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : anyi

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-12-13 19:55:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pe_role
-- ----------------------------
DROP TABLE IF EXISTS `pe_role`;
CREATE TABLE `pe_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `isvalide` int(1) NOT NULL DEFAULT '0' COMMENT '默认为0（有效），1代表无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pe_role
-- ----------------------------
INSERT INTO `pe_role` VALUES ('1', '超级管理员', '0');
INSERT INTO `pe_role` VALUES ('2', '普通管理员', '0');
INSERT INTO `pe_role` VALUES ('3', '员工', '0');
