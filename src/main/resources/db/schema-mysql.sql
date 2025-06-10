-- empty init fileDROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user`
(
    `id`    BIGINT NOT NULL AUTO_INCREMENT,
    `name`  VARCHAR(255),
    `age`   INT,
    `email` VARCHAR(255),
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
