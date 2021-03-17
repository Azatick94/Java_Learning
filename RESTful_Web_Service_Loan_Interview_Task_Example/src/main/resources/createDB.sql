DROP TABLE IF EXISTS loans;
DROP TABLE IF EXISTS persons;

-- creating tables
---------------------------
CREATE TABLE persons
(
    id SERIAL PRIMARY KEY,
    name      VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL
);

CREATE TABLE loans
(
    loan_id SERIAL PRIMARY KEY,
    amount  FLOAT NOT NULL,
    term INTEGER NOT NULL,
    person_id INTEGER,
    FOREIGN KEY (person_id) REFERENCES persons(id)
);

-- inserting init data into tables
---------------------------
INSERT INTO persons (name, last_name)
VALUES ('Azat', 'Burkhanov'),
       ('Petr', 'Petrov'),
       ('Sidr', 'Sidrov');

INSERT INTO loans (amount, term, person_id)
VALUES (1000000, 12, 1),
       (2000000, 24, 2),
       (3000000, 36, 3);