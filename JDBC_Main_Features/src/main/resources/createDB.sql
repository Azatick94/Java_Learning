DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    user_id        SERIAL PRIMARY KEY,
    first_name     VARCHAR(30) NOT NULL,
    secondary_name VARCHAR(30) NOT NULL,
    age            INTEGER     NOT NULL,
    phone_number   INTEGER     NOT NULL
);

INSERT INTO users (first_name, secondary_name, age, phone_number)
VALUES ('Azat', 'Burkhanov', 26, 34645324),
       ('Petr', 'Petrov', 27, 345345),
       ('Sidr', 'Sidrov', 30, 345);
