create database consulta_medica;

use consulta_medica;

create table medico(
medcodigo int auto_increment not null,
mednome varchar(50) not null,
primary key(medcodigo));

create table paciente(
paccodigo int auto_increment not null,
pacnome varchar(50) not null,
primary key(paccodigo));

create table consulta(
concodigo int auto_increment not null,
medcodigo int not null,
paccodigo int not null,
primary key(concodigo),
foreign key(medcodigo) references medico(medcodigo),
foreign key(paccodigo) references paciente(paccodigo));

create table medicamento(
mdcodigo int auto_increment not null,
mdnome varchar(50) not null,
primary key(mdcodigo));

create table prescricao(
concodigo int not null,
mdcodigo int not null,
foreign key(concodigo) references consulta(concodigo),
foreign key(mdcodigo) references medicamento(mdcodigo));