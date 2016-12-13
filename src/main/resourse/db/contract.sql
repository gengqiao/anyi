/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : anyi

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2016-12-13 19:55:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seq` varchar(50) NOT NULL COMMENT '项目编号',
  `registerDate` datetime NOT NULL COMMENT '登记日期',
  `client` varchar(255) DEFAULT NULL COMMENT '委托单位',
  `projectName` varchar(255) DEFAULT NULL COMMENT '项目名称',
  `contractAmount` double(10,0) DEFAULT NULL COMMENT '合同额',
  `receipted` double(10,0) DEFAULT NULL COMMENT '已收款',
  `containTax` varchar(10) DEFAULT NULL COMMENT '是否包含税',
  `preliminary` int(10) DEFAULT NULL COMMENT '预审单应填',
  `tianed` int(10) DEFAULT NULL COMMENT '已填',
  `paied` int(10) DEFAULT NULL COMMENT '已付',
  `balance` int(10) DEFAULT NULL COMMENT '结余',
  `paymentDate` varchar(255) DEFAULT NULL COMMENT '几次付款时间以及金额，以json的形式存储',
  `qualificationsDate` datetime DEFAULT NULL COMMENT '资质出具时间',
  `reportDate` datetime DEFAULT NULL COMMENT '报告出具时间',
  `contacts` varchar(100) DEFAULT NULL COMMENT '项目联系人',
  `contactsPhone` varchar(20) DEFAULT NULL COMMENT '联系方式',
  `jieqiaDate` datetime DEFAULT NULL COMMENT '接洽日期',
  `hetongDate` datetime DEFAULT NULL COMMENT '合同日期',
  `type` varchar(10) DEFAULT NULL COMMENT '表或书',
  `fk_user_id` int(10) DEFAULT NULL COMMENT '项目负责人',
  `receiveDate` datetime DEFAULT NULL COMMENT '接任务时间',
  `
collectingData` datetime DEFAULT NULL COMMENT '收集资料看现场时间',
  `monitorDate` datetime DEFAULT NULL COMMENT '监测时间',
  `analysisDate` datetime DEFAULT NULL COMMENT '工程分析完成时间',
  `gongcanDate` datetime DEFAULT NULL COMMENT '公参完成时间',
  `neishenDate` datetime DEFAULT NULL COMMENT '内审时间',
  `expertDate` datetime DEFAULT NULL COMMENT '专家会时间',
  `assessDate` datetime DEFAULT NULL COMMENT '评估意见出具时间',
  `scheduledDate` datetime DEFAULT NULL COMMENT '预定批复时间',
  `actualDate` datetime DEFAULT NULL COMMENT '实际批复时间',
  `getReplyDate` datetime DEFAULT NULL COMMENT '拿到批复报告存档时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
