create database exercicio_jogo;

use exercicio_jogo;

create table cidade(
idcidade int auto_increment not null,
nome varchar(100) not null,
time_idtime int not null,
primary key(idcidade));

create table jogo(
id_jogo int auto_increment not null,
equipe_casa varchar(100) not null,
equipe_visitante varchar(100) not null,
pontos_casa int not null,
pontos_visitante int not null,
data_ date not null,
primary key(id_jogo));

create table equipe(
idequipe int auto_increment not null,
primary key(idequipe));

create table tecnico(
idtecnico int auto_increment not null,
nome varchar(100) not null,
equipe_idequipe int not null,
primary key(idtecnico),
foreign key(equipe_idequipe) references equipe(idequipe));

create table jogador(
idjogador int auto_increment not null,
nome varchar(100) not null,
funcao varchar(100) not null,
equipe_idequipe int not null,
primary key(idjogador),
foreign key(equipe_idequipe) references equipe(idequipe));