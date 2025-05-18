CREATE TABLE IF NOT EXISTS `product` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `brand` varchar(100) NOT NULL,
  `price` DOUBLE NOT NULL,
  `category` varchar(100) NOT NULL,
  `release_date` varchar(100) NOT NULL,
  `product_available` BOOLEAN NOT NULL,
  `stock_quantity` int NOT NULL
);