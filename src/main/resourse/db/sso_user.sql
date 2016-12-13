/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : anyi

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-12-13 19:55:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sso_user
-- ----------------------------
DROP TABLE IF EXISTS `sso_user`;
CREATE TABLE `sso_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `loginId` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `userName` varchar(100) DEFAULT NULL,
  `mobilePhone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `fk_role_id` int(10) NOT NULL,
  `loginNum` int(10) DEFAULT NULL,
  `lastLoginDate` datetime DEFAULT NULL,
  `fk_site_id` int(10) DEFAULT NULL,
  `isValide` int(1) DEFAULT '0' COMMENT '默认为0（有效），1代表无效',
  PRIMARY KEY (`id`),
  KEY `sso_siteId` (`fk_site_id`),
  KEY `sso_roleId` (`fk_role_id`),
  CONSTRAINT `sso_roleId` FOREIGN KEY (`fk_role_id`) REFERENCES `pe_role` (`id`),
  CONSTRAINT `sso_siteId` FOREIGN KEY (`fk_site_id`) REFERENCES `enum_const` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sso_user
-- ----------------------------
INSERT INTO `sso_user` VALUES ('5', '121', '121', '耿桥', '18233568804', 'gengqiaode@163.com', '1', '93', '2016-12-07 21:00:08', null, '0');
INSERT INTO `sso_user` VALUES ('7', '18233568805', '18233568805', '更改', '18233568805', '18233568805@qq.com', '1', '1', '2016-11-26 08:20:04', null, '0');
INSERT INTO `sso_user` VALUES ('8', '18600904909', '18600904909', '歌曲', '18600904922', 'gengqiaeeode@163.com', '1', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('9', '18233569807', '18233569807', '赵培', '17233569807', '18233569807@qq.com', '2', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('10', '18233569808', '18233569808', '更是', '18233569807', '18233569807@qq.com', '2', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('18', '15233389790', '15233389790', '测试', '15233389790', '15233389790@qq.com', '1', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('22', '18233568823', '18233568823', '测试', '18233568823', 'gengqiaode@163.com', '2', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('24', '18233568821', '18233568824', '测试', '18233568824', 'gengqiaode@163.com', '1', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('26', '18600904900', '18600904900', '耿桥测试', '18600904900', 'gengqiaode@163.com', '1', null, null, null, '0');
INSERT INTO `sso_user` VALUES ('27', '18233568908', '18233568908', '说到底', '18233568908', 'gengqiaode@163.com', '2', '1', '2016-12-07 15:28:44', null, '0');
