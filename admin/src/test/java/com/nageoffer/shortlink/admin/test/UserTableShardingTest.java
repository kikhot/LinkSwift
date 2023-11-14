package com.nageoffer.shortlink.admin.test;

public class UserTableShardingTest {

    public static final String SQL = "CREATE TABLE `t_user_%d` (\n" +
            "  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',\n" +
            "  `username` varchar(255) NOT NULL COMMENT '用户名',\n" +
            "  `password` varchar(512) DEFAULT NULL COMMENT '密码',\n" +
            "  `real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',\n" +
            "  `phone` varchar(128) DEFAULT NULL COMMENT '手机号',\n" +
            "  `mail` varchar(512) DEFAULT NULL COMMENT '邮箱',\n" +
            "  `deletion_time` bigint(20) DEFAULT NULL COMMENT '注销时间戳',\n" +
            "  `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
            "  `update_time` datetime DEFAULT NULL COMMENT '修改时间',\n" +
            "  `del_flag` tinyint(1) DEFAULT NULL COMMENT '删除标识  0：未删除  1：已删除',\n" +
            "  PRIMARY KEY (`id`) USING BTREE,\n" +
            "  UNIQUE KEY `index_unique_username` (`username`) USING BTREE COMMENT 'username唯一索引，数据库层面保证用户名不重复'\n" +
            ") ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;";

    public static void main(String[] args) {
        for (int i = 0; i < 16; i++) {
            System.out.printf((SQL) + "%n", i);
        }
    }
}
