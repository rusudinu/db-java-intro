CREATE TABLE demo_table (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE another_demo_table (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    kids INT NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO demo_table (name, age) VALUES ('John', 25);
INSERT INTO demo_table (name, age) VALUES ('Jane', 30);

INSERT INTO another_demo_table (name, kids) VALUES ('John', 1);
INSERT INTO another_demo_table (name, kids) VALUES ('Jane', 5);

SELECT * FROM demo_table;

SELECT demo_table.name, demo_table.age, another_demo_table.kids
FROM demo_table
INNER JOIN another_demo_table;

SELECT demo_table.name, demo_table.age, another_demo_table.kids
FROM demo_table
INNER JOIN another_demo_table ON demo_table.name = another_demo_table.name;

DELETE FROM demo_table WHERE name = 'John';

DROP TABLE demo_table;
