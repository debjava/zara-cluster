drop table if exists zara_userdetails;
drop table if exists zara_user;

CREATE TABLE zara_user (
    userid BIGINT(20) NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL ,
    password VARCHAR(50) NOT NULL ,
    enabled TINYINT NOT NULL ,
    accountNonExpired TINYINT NOT NULL ,
    credentialsNonExpired TINYINT NOT NULL ,
    accountNonLocked TINYINT NOT NULL ,
    PRIMARY KEY (userid)
);

CREATE TABLE zara_userdetails (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    userid BIGINT(20) NOT NULL,
    username VARCHAR(50) NOT NULL ,
    authority VARCHAR(20) NOT NULL ,
    PRIMARY KEY (id),
    FOREIGN KEY (userid) REFERENCES zara_user (userid)
);

/*Sample Insert quries */
INSERT INTO zara_user (userid, username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES (1, 'miki', 'miki', 1, 1, 1, 1);
INSERT INTO zara_user (userid, username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES (2, 'piku', 'piku', 1, 1, 1, 1);
INSERT INTO zara_user (userid, username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) VALUES (3, 'deba', 'deba', 1, 1, 1, 1);


INSERT INTO zara_userdetails (id, userid, username, authority) VALUES (1, 1, 'miki', 'ROLE_USER');
INSERT INTO zara_userdetails (id, userid, username, authority) VALUES (2, 2, 'piku', 'ROLE_USER');
INSERT INTO zara_userdetails (id, userid, username, authority) VALUES (3, 3, 'deba', 'ROLE_ADMIN');
commit;

select * from zara_user;
select * from zara_userdetails;