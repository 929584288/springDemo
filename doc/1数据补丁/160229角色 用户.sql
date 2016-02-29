
drop table if exists SYS_USER;

/*==============================================================*/
/* Table: SYS_USER                                              */
/*==============================================================*/
create table SYS_USER
(
   SYS_USER_ID          int not null auto_increment,
   LOGIN_ID             varchar(32) not null,
   IS_ADMIN             enum('Y','N'),
   USER_NAME            varchar(48) not null,
   USER_PSW             varchar(32) not null,
   USER_MOBILE          varchar(24),
   USER_TEL             varchar(24),
   USER_SEX_CODE        enum('0','1','2') not null,
   USER_EMAIL           varchar(32),
   REGISTER_DATE        timestamp default '0000-00-00 00:00:00',
      REG_ORG_ID           int,
   USER_ICON            varchar(60) not null,
   LAST_PSW_MISTAKE_TIME time not null,
   REMAIN_PSW_MISTAKE_TIMES int not null,
   IS_DELETE            enum('Y','N') not null,
   LAST_PSW_MODIFY_TIME time not null,
   LAST_BUY_TIME        timestamp not null,
   primary key (SYS_USER_ID)
)
drop table if exists SYS_ROLE;

/*==============================================================*/
/* Table: SYS_ROLE                                              */
/*==============================================================*/
create table SYS_ROLE
(
   SYS_ROLE_ID          int not null auto_increment,
   SYS_ROLE_NM          varchar(32) not null,
   ROLE_TYPE_CODE       enum('0','1','2','3',"4") not null,
   POSITION             int not null,
   SYS_ORG_ID           int not null,
   SCORE                int not null,
   primary key (SYS_ROLE_ID)
)

drop table if exists SYS_USER_ROLE_RELATIONSHIP;
/*==============================================================*/
/* Table: SYS_USER_ROLE_RELATIONSHIP                            */
/*==============================================================*/
CREATE TABLE SYS_USER_ROLE_RELATIONSHIP
(
   SYS_USER_ROLE_RELATIONSHIP_ID INT NOT NULL AUTO_INCREMENT,
   SYS_USER_ID          INT NOT NULL,
   SYS_ROLE_ID          INT NOT NULL,
   PRIMARY KEY (SYS_USER_ROLE_RELATIONSHIP_ID)
)



