DROP TABLE IF EXISTS loans;
DROP TABLE IF EXISTS black_list;
DROP TABLE IF EXISTS persons;
DROP TABLE IF EXISTS countries;

-- creating tables
---------------------------
CREATE TABLE persons
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL
);

CREATE TABLE loans
(
    loan_id   SERIAL PRIMARY KEY,
    amount    FLOAT   NOT NULL,
    term      INTEGER NOT NULL,
    person_id INTEGER,
    FOREIGN KEY (person_id) REFERENCES persons (id)
);

CREATE TABLE countries
(
    id      SERIAL PRIMARY KEY,
    country VARCHAR(50) NOT NULL
);

CREATE TABLE black_list
(
    id        SERIAL PRIMARY KEY,
    person_id INTEGER NOT NULL,
    FOREIGN KEY (person_id) REFERENCES persons (id)
);

