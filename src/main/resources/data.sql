CREATE TABLE Students (
  studentId_ CHAR(4),
  name_ VARCHAR (10)
);

INSERT INTO Students VALUES ('0001', 'Anna');
INSERT INTO Students VALUES ('0002', 'Damnit');
INSERT INTO Students VALUES ('0003', 'Charlie');
INSERT INTO Students VALUES ('0004', 'Bob');
INSERT INTO Students VALUES ('0005', 'Electric');

INSERT INTO FOO VALUES ('0001', 'Anna',11);

CREATE TABLE konosuba (
  card_id_ CHAR(4) PRIMARY KEY ,
  name_ VARCHAR (20),
  hp_ INT,
  atk_ INT,
  rec_ INT,
  sex_ BOOLEAN,
  race_ VARCHAR
);

INSERT INTO konosuba VALUES ('1882', 'Aqua', 3237, 1567, 427, 0, 'God');
INSERT INTO konosuba VALUES ('1883', 'Megumin', 2356, 1914, 483, 0, 'Human');
INSERT INTO konosuba VALUES ('1884', 'Kazuma', 3059, 1433, 454, 1, 'Human');
INSERT INTO konosuba VALUES ('1885', 'Darkness', 4297, 872, 484, 0, 'Human');
INSERT INTO konosuba VALUES ('1886', 'Wiz', 2591, 1669, 450, 0, 'Human');
INSERT INTO konosuba VALUES ('1887', 'Kyouya', 2692, 1558, 486, 1, 'Human');
INSERT INTO konosuba VALUES ('1888', 'Yunyun', 2710, 1542, 483, 0, 'Human');
INSERT INTO konosuba VALUES ('1889', 'Chris', 2914, 1352, 537, 0, 'Human');
INSERT INTO konosuba VALUES ('1890', 'Vanir', 1803, 2187, 445, 1, 'Demon');
INSERT INTO konosuba VALUES ('1891', 'Beldia', 1608, 2425, 378, 1, 'Demon');
INSERT INTO konosuba VALUES ('1892', 'Destroyer', 4366, 1545, 114, 1, 'Machina');
INSERT INTO konosuba VALUES ('1893', 'Luna', 2771, 1463, 522, 0, 'Human');
INSERT INTO konosuba VALUES ('1894', 'Eris', 2624, 1520, 358, 0, 'God');
INSERT INTO konosuba VALUES ('1895', 'WinterShogun', 1180, 1793, 371, 1, 'Demon');
INSERT INTO konosuba VALUES ('1896', 'LizardRunner', 2887, 1281, 168, 1, 'Beast');


CREATE TABLE ROLES(
    ID_ VARCHAR(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    NAME_ VARCHAR (255) NOT NULL,
    ATK_ INT,
    HP_ INT,
    CAREER_ VARCHAR (20),
);

INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('The Majestic Premier',99,589,'swordman');    -- //曹操
INSERT INTO Roles(name_,atk_,hp_,career_)  VALUES ('Brain of The Darkness',258,469,'adviser');  --   //司馬懿
INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('The Lion-Hearted King',88,555,'swordman');   -- //孫堅
INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('The Angel of Wrath',150,450,'swordman');     -- //孫尚香
INSERT INTO Roles(name_,atk_,hp_,career_)  VALUES ('The Lord of Virtue',80,699,'adviser');      --   //劉備
INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('The God of Battle',180,650,'swordman');      --  //關羽
INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('The Strength',199,632,'swordman');           --  //張飛
INSERT INTO Roles(name_,atk_,hp_,career_)  VALUES ('The Wizard of Fortune',500,500,'adviser');  --    //諸葛亮
INSERT INTO Roles(name_,atk_,hp_,career_) VALUES ('Violence Hurricane',230,1000,'swordman');    --   //呂布
