
#Practicas DDL

#Crear la base de datos "elmacho"
/*create database elmacho;

#Crear la base de datos "morrita"
create schema morrita;

#Crear la base de datod "morro"
create database morro;*/

/*#Crear la base de datos "machotemalotecastigador"
create schema machotemalotecastigador;

#Borrar bases d datos "machotemalotecastigador", "morro" y "morrita"
drop database machotemalotecastigador;
drop schema morro;
drop database morrita;

#Utilizamos el uso de la database "elmacho"
use elmacho;

#Creamos tabla de productos
CREATE TABLE productos
(
	idProducto int primary key not null,
	nombreProducto varchar(30),
	precioProducto decimal,
	existencias int
);

use elmacho;
show databases;
show tables;
describe productos;

use morrita;
show databases;
show tables;

drop database elmacho;
drop database morrita;*/

CREATE DATABASE elmacho;
use elmacho;
create table empleados
(
	idEmpleado int primary key not null,
    nombreEmpleado varchar(30),
    apellidoEmpleado varchar(20),
    fechaNacimiento date,
    salario decimal
);

CREATE TABLE proyectos
(
	idProyecto int primary key not null,
    nombreProyecto varchar(30),
    duracionMeses int
);

CREATE TABLE asignacion_empleados_proyectos
(
	idAsignacion int primary key not null,
    idEmpleado int,
    idProyecto int,
    fechaAsignacion date,
    fechaTermino date
);

#Para eliminar el campo idEmpleado
alter table asignacion_empleados_proyectos
drop column idEmpleado;

#Para agregar el campo idEmpleado
alter table asignacion_empleados_proyectos
add column idEmpleado int not null;

#Creamos la llave foranea y se la asignamos a idEmpleado
alter table asignacion_empleados_proyectos
add foreign key (idEmpleado)
references empleados(idEmpleado);

#Creamos la llave foranea y se la asignamos a idProducto
alter table asignacion_empleados_proyectos
add foreign key (idProyecto)
references proyectos(idProyecto);

#CRUD de BD
#Create Read Update Delete
insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario)
values (101, "LaCeci", "Uyuyuy", "1983-01-01", 5000.0);

insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario)
values (102, "LaAura", "QuihuboleQueQue", "1981-01-01", 4000.0);

insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario)
values (103, "LaItzel", "HotDog", "1980-01-01", 3000.0);

insert into empleados (idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario)
values (104, "Ale", "Meg", "1980-01-01", 5000.0);

insert into empleados
values (105, "LaGabs", "Carnitas", "1985-01-01", 6000.0);

insert into empleados
values (106, "LaRotz", "It", "1983-01-01", 5500.0);

#Creamos los registros de proyectos
insert into proyectos
values (111, "Sistema de trafico Aereo", 24);

insert into proyectos
values (112, "CSM de mangas", 12);

insert into proyectos
values (113, "ERP de central de abastos", 18);

insert into proyectos
values (114, "CRM de seguros", 6);

#Asignamos los proyectos a los empleados
insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (221, 101, 111, "2018-01-01", "2018-02-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (222, 102, 111, "2018-02-01", "2018-06-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (223, 103, 112, "2018-06-01", "2018-07-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (224, 104, 113, "2018-01-01", "2018-02-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (225, 105, 114, "2018-12-01", "2018-12-19");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (226, 106, 114, "2018-10-01", "2018-12-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (227, 103, 112, "2018-01-15", "2018-08-20");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (228, 104, 111, "2018-01-01", "2018-02-01");

insert into asignacion_empleados_proyectos
(idAsignacion, idEmpleado, idProyecto, fechaAsignacion, fechaTermino)
values (229, 105, 113, "2018-05-01", "2018-02-01");

#01/11/2018
#Version muestra todos los campos
select * from empleados;

#Otra version que muestra todos los campos
describe empleados;

#Version larga y completa
select empleados.idEmpleado, empleados.nombreEmpleado, empleados.apellidoEmpleado, empleados.fechaNacimiento, empleados.salario
from empleados;

#Version comun
select idEmpleado, nombreEmpleado, apellidoEmpleado, fechaNacimiento, salario
from empleados;

#Version que solo muestra los nombres
select nombreEmpleado
from empleados;

#Mostrar el campo con un alias
select nombreEmpleado as 'Nombre del Esclavo Asalariado'
from empleados;

#Mostrar el/los campo con un alias y mostrar las que ganen mas de 5000
select nombreEmpleado as 'Nombre del Esclavo Asalariado', salario as 'Salario Esclavo'
from empleados
where salario>5000;

#Mostrar el/los campo con un alias ymostrar las que ganen entre 5000 y 6000
select nombreEmpleado as 'Nombre del Esclavo Asalariado', salario as 'Salario Esclavo'
from empleados
where (salario>=5000 and salario<=6000);

#Muestra el total de impuestos pagados (corresponde al 33% IEPS) de los salarios mejor pagados (entre 5000 y 6000 rupias)
select nombreEmpleado as 'Nombre del Esclavo Asalariado', salario*0.33 as 'Impuesto a pagar por el Esclavo'
from empleados
where (salario>=5000 and salario<=6000);

#Mostrar personas que NO ganen 5000
select nombreEmpleado as 'Nombre del Esclavo Asalariado', salario*0.33 as 'Impuesto a pagar por el Esclavo'
from empleados
where not salario=5000;

#Ordena los salario por descendencia
select * from empleados order by salario desc;

#Ordena los salario por ascendecia
select * from empleados order by salario asc;

select * from asignacion_empleados_proyectos;

#Muestra fecha de asignacion de los proyectos
select fechaAsignacion from asignacion_empleados_proyectos;

#Muestra fecha de asigancion de los proyectos sin repetir
select distinct fechaAsignacion from asignacion_empleados_proyectos;

#Muestra todos los empleados que su nombre comienza con la letra A
select * from empleados where nombreEmpleado like 'A%';

#Muestra todos los empleados que su nombre comienza ignorando dos primeros campos y luego busque con la letra A
select * from empleados where nombreEmpleado like '__A%';

#Muestra a los empleados donde el salario se encuentre entre 1000 y 3000
select * from empleados where salario between 1000 and 3000;

#Muestra los empleados donde el salario sean 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000 y 5500
select * from empleados where salario in(1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 5500);

#Muestra la cantidad de empleados contratados por la empresa
select count(*) as 'Cantidad de empleados' from empleados;

#Calculame la nomina a pagar este mes
select sum(salario) 'Salario del mes de los esclavos' from empleados;

#Dime quien gana menos
select nombreEmpleado, min(salario) as 'El salario mas bajo' from empleados;

#Dime quien gana mas
select nombreEmpleado, max(salario) as 'El salario mas bajo' from empleados;

#Dime cual es el promedio de paga entre mis empleados
select avg(salario) as 'Promedio pago' from empleados;

select * from empleados;

#Actualizar la fecha de nacimiento de todas
update empleados set fechaNacimiento='1980-01-01' where idEmpleado=101;

select * from asignacion_empleados_proyectos;

#Borrar elemento
delete from asignacion_empleados_proyectos where idAsignacion=229;