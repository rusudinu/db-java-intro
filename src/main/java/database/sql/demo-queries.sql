CREATE TABLE demo_table (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);


INSERT INTO demo_table (name, age) VALUES ('John', 25);
INSERT INTO demo_table (name, age) VALUES ('Jane', 30);

SELECT * FROM demo_table;
