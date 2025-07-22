create database farmaceutica;

use farmaceutica;

create table farmacia(
CNPJ_farmacia numeric(14) not null,
nome_farmacia varchar(30) not null,
tel_farmacia numeric(13) not null,
end_farmacia varchar(50) not null,
primary key(CNPJ_farmacia));

create table produto(
cod_produto int not null auto_increment,
valor_produto decimal(8,2) not null,
qtd_produto int not null,
CNPJ_farmacia numeric(14) not null,
primary key(cod_produto),
foreign key(CNPJ_farmacia) references farmacia(CNPJ_farmacia));

create table farmaceutico(
RG_farmaceutico numeric(7) not null,
nome_farmaceutico varchar(30) not null,
CNPJ_farmacia numeric(14) not null,
primary key(RG_farmaceutico),
foreign key(CNPJ_farmacia) references farmacia(CNPJ_farmacia));