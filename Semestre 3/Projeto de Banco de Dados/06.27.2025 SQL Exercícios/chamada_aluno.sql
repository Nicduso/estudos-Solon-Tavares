create database exercicio_chamada_aluno;

use exercicio_chamada_aluno;

create table aluno(
no_cartao varchar(100) not null,
nome varchar(100) not null,
primary key(no_cartao));

create table sala(
capacidade varchar(100) not null,
no_da_sala varchar(100) not null,
no_do_predio varchar(100) not null,
primary key(no_da_sala));

create table aula(
dia varchar(100) not null,
hora varchar(100) not null,
no_da_sala varchar(100) not null,
no_do_predio varchar(100) not null,
primary key(dia),
foreign key(no_da_sala) references sala(no_da_sala));

create table presenca(
dia varchar(100) not null,
hora varchar(100) not null,
no_cartao varchar(100) not null,
foreign key(dia) references aula(dia),
foreign key(no_cartao) references aluno(no_cartao));
