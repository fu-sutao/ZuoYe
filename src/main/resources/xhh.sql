/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 16/08/2021 16:07:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xhh
-- ----------------------------
DROP TABLE IF EXISTS `xhh`;
CREATE TABLE `xhh`  (
  `tid` int(0) NOT NULL AUTO_INCREMENT,
  `tname` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tclass` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `tclassid` int(0) NULL DEFAULT NULL,
  `tage` int(0) NULL DEFAULT NULL,
  `tdate` date NULL DEFAULT NULL,
  `taddress` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`tid`) USING BTREE,
  INDEX `xhh`(`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xhh
-- ----------------------------
INSERT INTO `xhh` VALUES (10, '付苏涛', '办公室', 1, 23, '2021-03-02', '河南省周口市');
INSERT INTO `xhh` VALUES (11, '何晓月', '办公室', 1, 21, '2021-03-02', '河南省郑州市');
INSERT INTO `xhh` VALUES (12, '张梦茹', '办公室', 1, 21, '2021-03-01', '河南省洛阳市');
INSERT INTO `xhh` VALUES (13, '张萍萍', '宣传部', 2, 21, '2021-03-08', '河南省郑州市');
INSERT INTO `xhh` VALUES (14, '徐如月', '宣传部', 2, 23, '2021-03-22', '河南省郑州市');
INSERT INTO `xhh` VALUES (15, '陈志岩', '宣传部', 2, 21, '2021-03-02', '河南省郑州市');
INSERT INTO `xhh` VALUES (16, '谭慧颖', '纪检部', 3, 22, '2021-02-02', '河南省平顶山');
INSERT INTO `xhh` VALUES (17, '王梦召', '纪检部', 3, 22, '2021-02-02', '河南省平顶山');
INSERT INTO `xhh` VALUES (18, '唐小琴', '办公室', 1, 22, '2021-02-02', '河南省平顶山');
INSERT INTO `xhh` VALUES (19, '葛佳佳', '办公室', 1, 26, '2021-02-01', '河南省商丘市');
INSERT INTO `xhh` VALUES (20, '陈河东', '办公室', 1, 23, '2021-02-02', '河南省平顶山');

SET FOREIGN_KEY_CHECKS = 1;
