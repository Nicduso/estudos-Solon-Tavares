create database logistica;
use logistica;

create table clientes(
id_do_cliente int auto_increment not null,
nome_da_empresa varchar(100) not null,
primary key(id_do_cliente));

create table endereco(
id_do_endereco int auto_increment not null,
id_do_cliente int not null,
rua varchar(250) not null,
cidade varchar(250) not null,
cep varchar(10) not null,
pais varchar(250) not null,
telefone varchar(14) not null,
primary key(id_do_endereco),
foreign key(id_do_cliente) references clientes(id_do_cliente));

create table pedidos(
numero_do_pedido int auto_increment not null,
id_do_cliente int not null,
data_do_pedido date not null,
data_do_despacho date not null,
primary key(numero_do_pedido),
foreign key(id_do_cliente) references clientes(id_do_cliente));

create table produtos(
numero_do_produto int auto_increment not null,
nome_do_produto varchar(50) not null,
quantidade_por_unidade int not null,
preco_unitario decimal(8,2) not null,
primary key(numero_do_produto));

create table itens(
numero_do_item int auto_increment not null,
numero_do_pedido int not null,
numero_do_produto int not null,
preco_unitario decimal(8,2) not null,
quantidade int not null,
primary key(numero_do_item),
foreign key(numero_do_pedido) references pedidos(numero_do_pedido),
foreign key(numero_do_produto) references produtos(numero_do_produto));