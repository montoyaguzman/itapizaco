CREATE DATABASE datos_almacenados_ws;

USE datos_almacenados_ws;

CREATE TABLE usuarios(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10) NOT NULL,
    nombre VARCHAR(60) NOT NULL,
    apellido VARCHAR(60) NOT NULL,
    direccion VARCHAR(80) NOT NULL,
    sexo VARCHAR(10) NOT NULL
);