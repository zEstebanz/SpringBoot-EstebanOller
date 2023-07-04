# Proyecto en SpringBoot de Esteban Oller

-- Creacion de la tabla de Usuario 
CREATE TABLE ejemplo2.usuarios ( 
 id BIGINT NOT NULL AUTO_INCREMENT , 
 nombre VARCHAR(40) NULL DEFAULT NULL , 
 apellido VARCHAR(40) NULL DEFAULT NULL , 
 telefono VARCHAR(40) NULL DEFAULT NULL , 
 email VARCHAR(255) NULL DEFAULT NULL , 
 password VARCHAR(40) NULL DEFAULT NULL , 
 PRIMARY KEY (id)) ENGINE = InnoDB;

 -- Creacion de la tabla de Servicio

 CREATE TABLE Servicio (
  id INT NOT NULL AUTO_INCREMENT,
  nombreServicio VARCHAR(255),
  precioServicio DECIMAL(10, 2),
  descripcionServicio VARCHAR(255),
  contenidoServicio TEXT,
  PRIMARY KEY (id)
);
