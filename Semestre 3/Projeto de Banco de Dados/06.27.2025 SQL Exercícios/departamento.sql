create database exercicio_cargo_departamento;

use exercicio_cargo_departamento;

create table escolaridade(
id_escolaridade int auto_increment not null,
descricao varchar(80) not null,
primary key(id_escolaridade));

create table cargo(
id_cargo int auto_increment not null,
nome varchar(80) not null,
salario double not null,
id_escolaridade int not null,
primary key(id_cargo),
foreign key(id_escolaridade) references escolaridade(id_escolaridade));

create table vinculo(
id_vinculo int auto_increment not null,
obs varchar(200) not null,
descricao varchar(80) not null,
primary key(id_vinculo));

create table servidor(
id_funcionario int auto_increment not null,
nome varchar(80) not null,
matricula varchar(15) not null,
data_nascimento date not null,
data_admissao date not null,
endereco varchar(80) not null,
bairro varchar(80) not null,
cidade varchar(80) not null,
cep varchar(15) not null,
uf char(2) not null,
telefone varchar(15) not null,
email varchar(80) not null,
senha varchar(15) not null,
id_cargo int not null,
id_vinculo int not null,
primary key(id_funcionario),
foreign key(id_cargo) references cargo(id_cargo),
foreign key(id_vinculo) references vinculo(id_vinculo));

create table funcao(
id_funcao int auto_increment not null,
nome varchar(80) not null,
descricao varchar(200) not null,
id_escolaridade int not null,
primary key(id_funcao),
foreign key(id_escolaridade) references escolaridade(id_escolaridade));

create table departamento(
id_departamento int auto_increment not null,
nome varchar(80) not null,
descricao varchar(200) not null,
primary key(id_departamento));

create table alocacao(
id_alocacao int auto_increment not null,
data_saida date not null,
data_inicio date not null,
id_departamento int not null,
id_funcionario int not null,
primary key(id_alocacao),
foreign key(id_departamento) references departamento(id_departamento),
foreign key(id_funcionario) references servidor(id_funcionario));

create table relacao_alocacao_funcao(
id_rel_aloc_funcao int auto_increment not null,
id_alocacao int not null,
id_funcao int not null,
primary key(id_rel_aloc_funcao),
foreign key(id_alocacao) references alocacao(id_alocacao),
foreign key(id_funcao) references funcao(id_funcao));