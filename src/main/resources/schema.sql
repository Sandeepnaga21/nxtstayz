CREATE TABLE if not exists hotel(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    location VARCHAR(255),
    rating INT
);

CREATE TABLE if not exists room (
    id INT PRIMARY KEY AUTO_INCREMENT,
    roomNumber VARCHAR(255),
    type VARCHAR(255),
    price DOUBLE,
    FOREIGN KEY (hotelId) REFERENCES hotel(id)
);
