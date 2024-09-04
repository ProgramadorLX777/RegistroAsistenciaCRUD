-- Creación de Base de datos:
CREATE DATABASE registro_asistencia;

-- Usar Base de datos:
USE registro_asistencia;

-- Creación de Tabla Usuario:
CREATE TABLE usuarios(
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
    rut VARCHAR(15),
    nombre VARCHAR(30),
    apellido_paterno VARCHAR(50),
    apellido_materno VARCHAR(50),
    direccion VARCHAR(60),
    fono VARCHAR(15),
    fecha_nacimiento DATE,
    pass_usuario VARCHAR(30)

);

-- Creación de Tabla Reporte:
CREATE TABLE reportes(
    id_reporte INT PRIMARY KEY AUTO_INCREMENT,
    id_usuario_reporte INT,
    ingreso_trabajador BOOLEAN,
    fecha_actual DATE,
    hora_actual TIME,
    dias_atrasados INT,
    FOREIGN KEY(id_usuario_reporte) REFERENCES usuarios(id_usuario)
    
);
