CREATE DATABASE flota_etuchisa;
USE flota_etuchisa;

CREATE TABLE Persona (
  idPersona INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  correo VARCHAR(50) NOT NULL,
  numero_telefonico INT(9) NOT NULL,
  DNI INT(8) NOT NULL,
  edad INT(2) NOT NULL,
  tipo VARCHAR(20) NOT NULL,
  idAdministrador VARCHAR(7),
  idSupervisor VARCHAR(7),
  idConductor VARCHAR(7),
  INDEX idAdministrador_idx (idAdministrador),
  INDEX idSupervisor_idx (idSupervisor),
  INDEX idConductor_idx (idConductor)
  /*FOREIGN KEY (idAdministrador) REFERENCES Administrador(idAdministrador) 
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  FOREIGN KEY (idSupervisor) REFERENCES Supervisor(idSupervisor) 
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  FOREIGN KEY (idConductor) REFERENCES Conductor(idConductor) 
    ON DELETE SET NULL
    ON UPDATE CASCADE*/
);

CREATE TABLE Administrador (
  idAdministrador VARCHAR(7) PRIMARY KEY NOT NULL,
  contraseña VARCHAR(256) NOT NULL
);

CREATE TABLE Supervisor (
  idSupervisor VARCHAR(7) PRIMARY KEY NOT NULL,
  contraseña VARCHAR(256) NOT NULL,
  idAdministrador VARCHAR(7),
  CONSTRAINT fk_Supervisor_Administrador
    FOREIGN KEY (idAdministrador) REFERENCES Administrador(idAdministrador)
    ON DELETE SET NULL
    ON UPDATE SET NULL
);

CREATE TABLE Conductor (
  idConductor VARCHAR(7) PRIMARY KEY NOT NULL,
  contraseña VARCHAR(256) NOT NULL,
  idSupervisor VARCHAR(7),
  CONSTRAINT fk_Conductor_Supervisor
    FOREIGN KEY (idSupervisor) REFERENCES Supervisor(idSupervisor)
    ON DELETE SET NULL
    ON UPDATE SET NULL
);

ALTER TABLE flota_etuchisa.persona
ADD CONSTRAINT fk_idAdministrador
FOREIGN KEY (idAdministrador)
REFERENCES flota_etuchisa.administrador (idAdministrador)
ON DELETE SET NULL
ON UPDATE CASCADE,
ADD CONSTRAINT fk_idSupervisor
FOREIGN KEY (idSupervisor)
REFERENCES flota_etuchisa.supervisor (idSupervisor)
ON DELETE SET NULL
ON UPDATE CASCADE,
ADD CONSTRAINT fk_idConductor
FOREIGN KEY (idConductor)
REFERENCES flota_etuchisa.conductor (idConductor)
ON DELETE SET NULL
ON UPDATE CASCADE;

INSERT INTO Administrador (idAdministrador, contraseña)
VALUES ('A000001', 'administrador');

INSERT INTO Supervisor (idSupervisor, contraseña, idAdministrador)
VALUES ('S000001', 'supervisor', 'A000001');

INSERT INTO Conductor (idConductor, contraseña, idSupervisor)
VALUES ('C000001', 'conductor', 'S000001');

INSERT INTO Persona (nombre, apellido, correo, numero_telefonico, DNI, edad, tipo, idAdministrador, idSupervisor, idConductor)
VALUES ('Admin', 'Apellido Admin', 'admin@gmail.com', 123456789, 12345678, 30, 'Administrador', 'A000001', NULL, NULL);

INSERT INTO Persona (nombre, apellido, correo, numero_telefonico, DNI, edad, tipo, idAdministrador, idSupervisor, idConductor)
VALUES ('Supervisor', 'Apellido Supervisor', 'supervisor@gmail.com', 987654321, 87654321, 35, 'Supervisor', NULL, 'S000001', NULL);

INSERT INTO Persona (nombre, apellido, correo, numero_telefonico, DNI, edad, tipo, idAdministrador, idSupervisor, idConductor)
VALUES ('Conductor', 'Apellido Conductor', 'conductor@gmail.com', 555555555, 12312312, 25, 'Conductor', NULL, NULL, 'C000001');