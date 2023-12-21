CREATE DATABASE billeterie;

USE billeterie;

CREATE TABLE event_location(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
address VARCHAR(100),
capacity INT
);

CREATE TABLE event(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
date DATE,
id_event_location INT,
FOREIGN KEY (id_event_location) REFERENCES event_location (id)
);

CREATE TABLE customer(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100)
);

CREATE TABLE ticket(
id_customer INT NOT NULL,
id_event INT NOT NULL,
FOREIGN KEY (id_customer) REFERENCES customer (id),
FOREIGN KEY (id_event) REFERENCES event (id)
);

ALTER TABLE event
    ADD COLUMN price DECIMAL(6,2);

ALTER TABLE event
	ADD COLUMN ticket_sold INT;

-- DROP TABLE ticket;
-- DROP TABLE customer;
-- DROP TABLE event;
-- DROP TABLE event_location;

