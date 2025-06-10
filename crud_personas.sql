
Create database crud_personas;
-- base de datos
USE crud_personas;

-- tabla personas
CREATE TABLE IF NOT EXISTS personas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    fecha_nacimiento DATE,
    genero ENUM('Masculino', 'Femenino', 'Otro'),
    telefono VARCHAR(20)
);

USE crud_personas;
INSERT INTO personas (nombre, apellido, email, fecha_nacimiento, genero, telefono) VALUES
('Juan', 'Pérez', 'juan.perez@gmail.com', '1990-05-15', 'Masculino', '1234567890'),
('María', 'González', 'maria.gonzalez@gmail.com', '1988-11-22', 'Femenino', '0987654321'),
('Carlos', 'Ramírez', 'carlos.ramirez@gmail.com', '1995-03-10', 'Masculino', '5551112233'),
('Ana', 'López', 'ana.lopez@gmail.com', '1992-07-01', 'Femenino', '4449998877'),
('Pedro', 'García', 'pedro.garcia@gmail.com', '1985-09-28', 'Masculino', '3336667788');