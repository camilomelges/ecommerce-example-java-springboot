CREATE TABLE if not exists users
(
    id         serial primary key,
    name       VARCHAR(50)        NOT NULL,
    password   VARCHAR(50)        NOT NULL,
    email      VARCHAR(50) UNIQUE NOT NULL,
    created_on TIMESTAMP          NOT NULL DEFAULT now()
);