CREATE TABLE user_entity (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    avatar VARCHAR(255)
);


INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('michael.lawson@example.com', 'Michael', 'Lawson', 'https://reqres.in/img/faces/7-image.jpg');
INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('lindsay.ferguson@example.com', 'Lindsay', 'Ferguson', 'https://reqres.in/img/faces/8-image.jpg');
INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('tobias.funke@example.com', 'Tobias', 'Funke', 'https://reqres.in/img/faces/9-image.jpg');
INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('byron.fields@example.com', 'Byron', 'Fields', 'https://reqres.in/img/faces/10-image.jpg');
INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('george.edwards@example.com', 'George', 'Edwards', 'https://reqres.in/img/faces/11-image.jpg');
INSERT INTO user_entity (email, first_name, last_name, avatar) VALUES('rachel.howell@example.com', 'Rachel', 'Howell', 'https://reqres.in/img/faces/12-image.jpg');