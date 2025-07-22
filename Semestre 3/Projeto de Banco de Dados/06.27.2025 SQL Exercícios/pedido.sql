create database exercicio_pedido;

use exercicio_pedido;

create table VENDEDOR(
codigo_do_vendedor numeric(5) not null,
nome_do_vendedor varchar(50) not null,
endereco varchar(50) not null,
percentual_de_comissao decimal(5,2) not null,
primary key(codigo_do_vendedor));

create table CLIENTE(
codigo_cliente numeric(5) not null,
nome_do_cliente varchar(50) not null,
endereco_do_cliente varchar(50) not null,
limite_de_credito decimal(10,2) not null,
faturamento_acumulado decimal(10,2) not null,
primary key(codigo_cliente));

create table DEPOSITO(
codigo_do_deposito numeric(5) not null,
endereco_do_deposito varchar(50) not null,
primary key(codigo_do_deposito));

create table PEDIDO(
codigo_do_pedido numeric(5) not null,
codigo_do_cliente numeric(5) not null,
codigo_do_vendedor numeric(5) not null,
data_do_pedido date not null,
primary key(codigo_do_pedido),
foreign key(codigo_do_cliente) references CLIENTE(codigo_cliente),
foreign key(codigo_do_vendedor) references VENDEDOR(codigo_do_vendedor));

create table PECA(
codigo_da_peca numeric(5) not null,
preco_unitario_da_peca decimal(10,2) not null,
descricao_da_peca text not null,
quantidade_em_estoque int not null,
codigo_do_deposito numeric(5) not null,
primary key(codigo_da_peca),
foreign key(codigo_do_deposito) references DEPOSITO(codigo_do_deposito));

create table PEDIDO_PECA(
codigo_da_peca numeric(5) not null,
codigo_do_pedido numeric(5) not null,
qtd_de_pecas_solicitadas int not null,
preco_cotado_da_peca decimal(10,2) not null,
foreign key(codigo_da_peca) references PECA(codigo_da_peca),
foreign key(codigo_do_pedido) references PEDIDO(codigo_do_pedido));