CREATE DATABASE exo1;

USE exo1;

CREATE TABLE student (
id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(150),
last_name VARCHAR(150),
classroom_nb INT,
graduation_date DATE
);

-- DROP TABLE student;

INSERT INTO student (first_name, last_name, classroom_nb, graduation_date)
VALUES
('John', 'Doe', 101, '2023-05-15'),
('Jane', 'Smith', 102, '2023-06-20'),
('Bob', 'Johnson', 103, '2023-07-10'),
('Alice', 'Williams', 101, '2023-08-25'),
('Charlie', 'Brown', 102, '2023-09-30');
