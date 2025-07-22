create database generic_hardware;

use generic_hardware;

create table usuario(
id int auto_increment not null,
nome varchar(50) not null,
sobrenome varchar(50) not null,
email varchar(50) not null,
senha varchar(30) not null,
primary key(id));

create table hardware(
id int auto_increment not null,
hora time(6) not null,
consumo_agora varchar(45) not null,
consumo_dia float not null,
conta_pulso_litro bigint(20) not null,
nome varchar(45) not null,
primary key(id));

create table usuario_hardware(
id int auto_increment not null,
data_cadastro date not null,
numero_acesso int not null,
hardware_id int not null,
usuario_id int not null,
primary key(id),
foreign key(hardware_id) references hardware(id),
foreign key(usuario_id) references usuario(id));

create table consumo_dia(
id int auto_increment not null,
data_ date not null,
valor varchar(45) not null,
dia_da_semana varchar(45) not null,
hardware_id int not null,
primary key(id),
foreign key(hardware_id) references hardware(id));

create table flag(
id int auto_increment not null, 
hora tinyint(20) not null,
primary key(id));

create table hardware_flag(
id int auto_increment not null,
consumo_ultima_hora_valida varchar(45) not null,
zerou tinyint(1) not null,
data_ date not null,
volume_armazenamento varchar(45) not null,
hardware_id int not null,
flag_id int not null,
primary key(id),
foreign key(hardware_id) references hardware(id),
foreign key(flag_id) references flag(id));