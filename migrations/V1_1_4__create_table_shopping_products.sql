CREATE TABLE if not exists shopping_products
(
    id          serial primary key,
    shopping_id INT       NOT NULL,
    product_id  INT       NOT NULL,
    quantity    INT       NOT NULL,
    created_on  TIMESTAMP NOT NULL DEFAULT now(),
    foreign key (shopping_id) references shoppings (id),
    foreign key (product_id) references products (id)
);