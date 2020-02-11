CREATE TABLE if not exists products
(
    id          serial primary key,
    name        VARCHAR(100) NOT NULL,
    description VARCHAR(255) NOT NULL,
    quantity    INT          NOT NULL DEFAULT 0,
    created_on  TIMESTAMP    NOT NULL DEFAULT now()
);