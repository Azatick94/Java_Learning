CREATE TABLE IF NOT EXISTS customers(
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    first_name VARCHAR(50) not null ,
    last_name VARCHAR(100) not null ,
    address VARCHAR(1000) not null ,
    budget DECIMAL NOT NULL
);