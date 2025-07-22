create database exercicio_clube_do_livro;

use exercicio_clube_do_livro;

create table CLIENTE(
cod_cliente int not null auto_increment,
nome varchar(100) not null,
telefone_1 varchar(15) not null,
telefone_2 varchar(15) not null,
email varchar(100) not null,
rua varchar(100) not null,
bairro varchar(100) not null,
cidade varchar(100) not null,
estado varchar(100) not null,
primary key(cod_cliente));

create table PESSOA_FISICA(
cpf varchar(15) not null,
rg varchar(15) not null,
cod_cliente int not null,
primary key(cpf),
foreign key(cod_cliente) references cliente(cod_cliente));

create table PESSOA_JURIDICA(
cnpj varchar(20) not null,
ie varchar(100) not null,
cod_cliente int not null,
primary key(cnpj),
foreign key(cod_cliente) references cliente(cod_cliente));

create table EDITORA(
cod_editora int not null auto_increment,
telefone_1 varchar(15) not null,
telefone_2 varchar(15) not null,
email varchar(100) not null,
nome_contato varchar(100) not null,
primary key(cod_editora));

create table PEDIDO(
cod_pedido int not null auto_increment,
cod_cliente int not null,
valor varchar(15) not null,
data_ date not null,
primary key(cod_pedido),
foreign key(cod_cliente) references cliente(cod_cliente));

create table LIVRO(
cod_livro int not null auto_increment,
cod_editora int not null,
valor varchar(15) not null,
ano_publicacao year not null,
categoria varchar(100) not null,
titulo varchar(100) not null,
nome_livro varchar(100) not null,
isbn varchar(100) not null,
autor varchar(100) not null,
primary key(cod_livro),
foreign key(cod_editora) references editora(cod_editora));

create table ITEM_PEDIDO(
cod_pedido int not null auto_increment,
cod_livro int not null,
qtd_pedido int not null,
valor_item varchar(15) not null,
foreign key(cod_pedido) references pedido(cod_pedido),
foreign key(cod_livro) references livro(cod_livro));

create table ESTOQUE(
cod_editora int not null,
cod_livro int not null,
qtd_estoque int not null,
foreign key(cod_livro) references livro(cod_livro),
foreign key(cod_editora) references editora(cod_editora));