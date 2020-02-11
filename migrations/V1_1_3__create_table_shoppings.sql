CREATE TABLE if not exists shoppings
(
    id         serial primary key,
    user_id    INT       NOT NULL,
    billeted   BOOLEAN   NOT NULL DEFAULT false,
    created_on TIMESTAMP NOT NULL DEFAULT now(),
    foreign key (user_id) references users (id)
);