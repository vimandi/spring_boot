
ALTER TABLE customer MODIFY COLUMN id INT AUTO_INCREMENT;



-- Insert data into the customer table
INSERT INTO customer (id, first_name, last_name, email, address) VALUES
(1, 'John', 'Doe', 'john.doe@example.com', '123 Main St, Anytown, USA'),
(2, 'Jane', 'Smith', 'jane.smith@example.com', '456 Elm St, Othertown, USA'),
(3, 'Alice', 'Johnson', 'alice.johnson@example.com', '789 Oak St, Anycity, USA');

-- Insert data into the product table
INSERT INTO product (name, description, price, available_quantity) VALUES
('Laptop', 'High-performance laptop with SSD storage', 999.99, 10),
('Smartphone', 'Latest smartphone with advanced features', 699.99, 20),
('Headphones', 'Noise-canceling headphones with Bluetooth', 149.99, 30),
('Smartwatch', 'Fitness tracker and smartwatch combo', 199.99, 15);

-- Insert data into the orders table
INSERT INTO orders (customer_id, order_date, total_amount) VALUES
(1, '2024-02-08 13:00:00', 999.99),
(2, '2024-02-08 14:00:00', 849.98),
(3, '2024-02-08 15:00:00', 449.97);

-- Insert data into the order_item table
INSERT INTO order_item (order_id, product_id, quantity, unit_price) VALUES
(1, 1, 1, 999.99),
(2, 2, 1, 699.99),
(2, 3, 1, 149.99),
(3, 4, 2, 399.98);
