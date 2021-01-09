-- 顶点表
CREATE TABLE `vertices` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '物理主键',
                            `properties` json DEFAULT NULL COMMENT '顶点属性，适应变化',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- 边表
CREATE TABLE `edges` (
                         `id` bigint NOT NULL,
                         `tail_vertex` bigint NOT NULL COMMENT '尾顶点',
                         `head_vertex` bigint NOT NULL COMMENT '头顶点',
                         `properties` json DEFAULT NULL COMMENT '属性',
                         `label` varchar(45) NOT NULL COMMENT '关系类型的标签',
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `vertices` (`tail_vertex`,`head_vertex`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;