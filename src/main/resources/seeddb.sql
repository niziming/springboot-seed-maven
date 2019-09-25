/*
Navicat MySQL Data Transfer

Source Server         : localhost@root
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : seeddb

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2019-09-25 09:55:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(255) DEFAULT '用户名' COMMENT '用户名',
  `PASSWORD` varchar(255) DEFAULT '000000' COMMENT '密码',
  `NICKNAME` varchar(255) DEFAULT '昵称' COMMENT '昵称',
  `USERSTATUS` int(1) DEFAULT '1' COMMENT '用户状态',
  `ROLE` varchar(12) DEFAULT '普通用户' COMMENT '用户角色',
  `GENDER` char(2) DEFAULT '' COMMENT '用户性别',
  `AGE` int(3) DEFAULT '18' COMMENT '用户年龄',
  `DEPARTMENT` varchar(35) DEFAULT '部门' COMMENT '部门字典',
  `TOKEN` varchar(255) DEFAULT NULL COMMENT 'jwt的token',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', 'root', '昵称', '1', '管理员', '', '18', '部门', null);
INSERT INTO `user` VALUES ('2', 'ziming', 'ziming', '昵称', '1', '普通用户', '', '18', '部门', null);
