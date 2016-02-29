DROP TABLE IF EXISTS T_USER_INFO;
CREATE TABLE T_USER_INFO
(
   id        BIGINT NOT NULL AUTO_INCREMENT,
   USER_ACCOUNT  VARCHAR(20),
   USER_PASSWORD           VARCHAR(20),
   USE_NAME             VARCHAR(20),
   CREATE_BY            CHAR(32)             not null,
   CREATE_DATE          TIMESTAMP            not null,
   UPDATE_BY            CHAR(32),
   UPDATE_DATE          TIMESTAMP,
   VERSION              INTEGER              not null,
   PRIMARY KEY (id)
);