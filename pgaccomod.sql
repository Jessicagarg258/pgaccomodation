create database pg_app;
use pg_app;

INSERT INTO owner (name, email, phone) VALUES ('Ramesh Kumar', 'ramesh@gmail.com', '9876543210');
INSERT INTO owner (name, email, phone) VALUES ('Jagan Kalam', 'kalamjaganmohan@gmail.com', '8978510368');
 
-- Add dummy owners
INSERT INTO owner (id, name, email, phone) VALUES 
(3, 'Suresh Patil', 'suresh.patil@gmail.com', '9123456780'),
(4, 'Anita Deshmukh', 'anita.deshmukh@gmail.com', '9988776655');
 
-- Add dummy PGs for Pune/Kharadi
INSERT INTO pg_place (id, registration_number, city, locality, rent_amount, built_up_area, available, visitor_count, owner_id) VALUES
(3, 'PG501', 'Pune', 'Kharadi', 8000.0, 200.0, true, 0, 3),
(4, 'PG502', 'Pune', 'Kharadi', 8500.0, 220.0, true, 0, 3),
(5, 'PG503', 'Pune', 'Kharadi', 9000.0, 250.0, true, 0, 4),
(6, 'PG504', 'Pune', 'Kharadi', 7500.0, 180.0, true, 0, 4);
 
-- Add dummy tenants
INSERT INTO tenant (id, name, age, email, city) VALUES
(1, 'Rohit Sharma', 25, 'rohit@gmail.com', 'Pune'),
(2, 'Priya Singh', 23, 'priya@gmail.com', 'Pune');