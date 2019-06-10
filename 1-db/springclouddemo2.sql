/*
 Navicat Premium Data Transfer

 Source Server         : zsk
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : springclouddemo2

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 10/06/2019 10:43:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dept_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属数据库',
  PRIMARY KEY (`dept_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', 'springclouddemo2');
INSERT INTO `dept` VALUES (2, '人事部', 'springclouddemo2');
INSERT INTO `dept` VALUES (3, '财务部', 'springclouddemo2');
INSERT INTO `dept` VALUES (4, '市场部', 'springclouddemo2');
INSERT INTO `dept` VALUES (5, '运维部', 'springclouddemo2');

SET FOREIGN_KEY_CHECKS = 1;
