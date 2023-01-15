DROP TABLE IF EXISTS userdata;

CREATE TABLE user (
   id int unsigned AUTO_INCREMENT,
   name VARCHAR(20) NOT NULL,
   PRIMARY KEY(id)
  );

INSERT INTO names (id, name) VALUES (1, "saito");
INSERT INTO names (id, name) VALUES (2, "suzuki");
INSERT INTO names (id, name) VALUES (3, "sato");
