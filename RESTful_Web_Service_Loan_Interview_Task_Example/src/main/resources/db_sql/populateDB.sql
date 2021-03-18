
TRUNCATE TABLE black_list RESTART IDENTITY CASCADE ;
TRUNCATE TABLE loans RESTART IDENTITY CASCADE;
TRUNCATE TABLE persons RESTART IDENTITY CASCADE  ;
TRUNCATE TABLE countries RESTART IDENTITY CASCADE ;


-- inserting init data into tables
---------------------------
INSERT INTO persons (name, last_name)
VALUES ('Azat', 'Burkhanov'),
       ('Petr', 'Petrov'),
       ('Sidr', 'Sidrov');

INSERT INTO black_list (person_id)
VALUES (2),
       (3);

INSERT INTO loans (amount, term, person_id)
VALUES (1000000, 12, 1),
       (2000000, 24, 2),
       (3000000, 36, 3);

INSERT INTO countries (country)
VALUES ('Russia'),
       ('USA'),
       ('Canada');


