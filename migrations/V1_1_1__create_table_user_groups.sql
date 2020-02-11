CREATE TYPE user_type AS ENUM ('ADMIN', 'BUYER');
CREATE TABLE if not exists user_groups
(
    id         serial primary key,
    name       user_type NOT NULL,
    user_id    INT         NOT NULL,
    created_on TIMESTAMP   NOT NULL DEFAULT now(),
    FOREIGN KEY (user_id) REFERENCES users(id)
);