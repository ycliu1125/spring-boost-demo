CREATE TABLE Students (
  studentId_ CHAR(4),
  name_      VARCHAR(10)
);

INSERT INTO Students VALUES ('0001', 'Anna');
INSERT INTO Students VALUES ('0002', 'Damnit');
INSERT INTO Students VALUES ('0003', 'Charlie');
INSERT INTO Students VALUES ('0004', 'Bob');
INSERT INTO Students VALUES ('0005', 'Electric');

INSERT INTO BAR VALUES ('B-0001', 'Alvis');
INSERT INTO BAR VALUES ('B-0002', 'Elvin');
INSERT INTO BAR VALUES ('B-0003', 'Eve');
INSERT INTO BAR VALUES ('B-0004', 'Admin');

INSERT INTO FOO VALUES ('0001', 'Anna', 11, 'B-0001', NULL);
INSERT INTO FOO VALUES ('0002', 'Sui', 12, 'B-0002', '0001');
INSERT INTO FOO VALUES ('0003', 'Levis', 13, 'B-0003', '0001');
INSERT INTO FOO VALUES ('0004', 'Calvin', 14, 'B-0004', '0001');
INSERT INTO FOO VALUES ('0005', 'Kevin', 15, 'B-0001', '0001');
INSERT INTO FOO VALUES ('0006', 'JaTadore', 16, 'B-0002', '0001');

INSERT INTO FOO_BAR VALUES ('0001', 'B-0001');
INSERT INTO FOO_BAR VALUES ('0001', 'B-0002');
INSERT INTO FOO_BAR VALUES ('0001', 'B-0003');
INSERT INTO FOO_BAR VALUES ('0001', 'B-0004');
/*CREATE TABLE konosuba (
  card_id_ CHAR(4) PRIMARY KEY ,
  name_ VARCHAR (20),
  hp_ INT,
  atk_ INT,
  rec_ INT,
  sex_ BOOLEAN,
  race_ VARCHAR
);
*/
INSERT INTO konosubaskill VALUES ('001', 'Steal');
INSERT INTO konosubaskill VALUES ('002', 'Flood');
INSERT INTO konosubaskill VALUES ('003', 'Explosion');
INSERT INTO konosubaskill VALUES ('004', 'GetHurt');

INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1882', 'Aqua', 3237, 1567, 427, FALSE, 'God', '002', NULL,'https://goo.gl/irV27s');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1883', 'Megumin', 2356, 1914, 483, FALSE, 'Human', '003', '1882','https://goo.gl/hfxVYF');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1884', 'Kazuma', 3059, 1433, 454, TRUE, 'Human', '001', '1882','https://goo.gl/QoeCjr');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1885', 'Darkness', 4297, 872, 484, FALSE, 'Human', '004', '1882','https://goo.gl/bRkiEK');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1886', 'Wiz', 2591, 1669, 450, 0, 'Human', '003', '1882','https://goo.gl/Gj2tdQ');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1887', 'Kyouya', 2692, 1558, 486, TRUE, 'Human', '001', '1882','https://goo.gl/SqBHAa');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1888', 'Yunyun', 2710, 1542, 483, FALSE, 'Human', '003', '1882','https://goo.gl/MURB9w');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1889', 'Chris', 2914, 1352, 537, FALSE, 'Human', '002', '1882','https://goo.gl/kjPge9');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1890', 'Vanir', 1803, 2187, 445, TRUE, 'Demon', '001', NULL,'https://goo.gl/rL2NnV');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1891', 'Beldia', 1608, 2425, 378, TRUE, 'Demon', '004', '1890','https://goo.gl/tgGWV7');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1892', 'Destroyer', 4366, 1545, 114, TRUE, 'Machina', '003', '1890','https://goo.gl/zhM8Uk');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1893', 'Luna', 2771, 1463, 522, FALSE, 'Human', '004', '1890','https://goo.gl/ZqR8zU');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1894', 'Eris', 2624, 1520, 358, FALSE, 'God', '002', '1890','https://goo.gl/99rZMz');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1895', 'WinterShogun', 1180, 1793, 371, TRUE, 'Demon', '002', '1890','https://goo.gl/THKVyK');
INSERT INTO konosuba (card_id_, name_, hp_, atk_, rec_, sex_, race_, skill_id_, parent_, head_picture_)VALUES ('1896', 'LizardRunner', 2887, 1281, 168, TRUE, 'Beast', '001', '1890','https://goo.gl/z8s4Ba');

INSERT INTO card_skill_ VALUES ('1882', '001');
INSERT INTO card_skill_ VALUES ('1882', '002');
INSERT INTO card_skill_ VALUES ('1882', '003');
INSERT INTO card_skill_ VALUES ('1882', '004');

INSERT INTO skill_card_ VALUES ('001', '1884');
INSERT INTO skill_card_ VALUES ('001', '1887');
INSERT INTO skill_card_ VALUES ('001', '1890');
INSERT INTO skill_card_ VALUES ('001', '1896');

CREATE TABLE ROLES (
  id_     VARCHAR(20),
  name_   VARCHAR(255) NOT NULL,
  atk_    INT,
  hp_     INT,
  career_ VARCHAR(20)
);

INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('1', 'The Majestic Premier', 99, 589, 'swordman'); --曹操
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('2', 'Brain of The Darkness', 258, 469, 'adviser'); --司馬懿
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('3', 'The Lion-Hearted King', 88, 555, 'swordman'); --孫堅
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('4', 'The Angel of Wrath', 150, 450, 'swordman'); -- 孫尚香
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('5', 'The Lord of Virtue', 80, 699, 'adviser'); -- 劉備
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('6', 'The God of Battle', 180, 650, 'swordman'); -- 關羽
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('7', 'The Strength', 199, 632, 'swordman'); --張飛
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('8', 'The Wizard of Fortune', 500, 500, 'adviser'); --諸葛亮
INSERT INTO Roles (id_, name_, atk_, hp_, career_) VALUES ('9', 'Violence Hurricane', 230, 1000, 'swordman'); --呂布
