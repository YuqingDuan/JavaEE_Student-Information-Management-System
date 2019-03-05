/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80003
Source Host           : localhost:3306
Source Database       : stus

Target Server Type    : MYSQL
Target Server Version : 80003
File Encoding         : 65001

Date: 2019-03-05 18:43:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_stu
-- ----------------------------
DROP TABLE IF EXISTS `t_stu`;
CREATE TABLE `t_stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `address` varchar(31) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_stu
-- ----------------------------
INSERT INTO `t_stu` VALUES ('1', 'Stephen', '26', 'M', 'Canada');
INSERT INTO `t_stu` VALUES ('2', 'Tim', '18', 'M', 'U.S.A');
INSERT INTO `t_stu` VALUES ('3', 'Cindy', '22', 'F', 'China');
INSERT INTO `t_stu` VALUES ('4', 'Joseph', '36', 'M', 'Canada');
INSERT INTO `t_stu` VALUES ('5', 'Lucy', '23', 'F', 'China');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', 'admin');
INSERT INTO `t_user` VALUES ('2', 'zhangsan', '123');
INSERT INTO `t_user` VALUES ('3', 'lisi', '456');
