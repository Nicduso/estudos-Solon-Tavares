create database forgotten_sky;

use forgotten_sky;

create table personagem(
idCharacter varchar(8) not null,
nome varchar(20) not null,
tipo varchar(20) not null,
idade int not null,
resumo text not null,
status varchar(10) not null,
primary key(idCharacter));

create table proficiencia(
idRecord varchar(8) not null,
idCharacter varchar(8) not null,
forca int not null,
constituicao int not null,
destreza int not null,
carisma int not null,
sabedoria int not null,
inteligencia int not null,
primary key(idRecord),
foreign key(idCharacter) references personagem(idCharacter));

create table evento(
idEvent varchar(8) not null,
nome varchar(50) not null,
descricao text not null,
tipo varchar(20) not null,
condicao varchar(250) not null,
status varchar(10) not null,
primary key(idEvent));

create table dialogo( 
idSpeech varchar(8) not null,
idCharacter varchar(8) not null,
idEvent varchar(8) not null,
texto text not null,
condicao varchar(250) not null,
primary key(idSpeech),
foreign key(idCharacter) references personagem(idCharacter),
foreign key(idEvent) references evento(idEvent));

create table item( 
idItem varchar(8) not null,
nome varchar(50) not null,
descricao varchar(250) not null,
efeito varchar(250) not null,
consumivel varchar(10) not null,
primary key(idItem));

create table inventario(
idInventory varchar(8) not null,
idCharacter varchar(8) not null,
primary key(idInventory),
foreign key(idCharacter) references personagem(idCharacter));

create table inventario_item(
idInventory varchar(8) not null,
idItem varchar(8) not null,
qtd_itens int not null,
foreign key(idInventory) references inventario(idInventory),
foreign key(idItem) references item(idItem));

create table cenario(
idScenario varchar(8) not null,
nome varchar(50) not null,
descricao text not null,
primary key(idScenario));

create table musica(
idMusic varchar(8) not null,
idScenario varchar(8) not null,
titulo varchar(50) not null,
autor varchar(50) not null,
duracao time not null,
tema varchar(50) not null,
arquivo_mp3 blob not null,
primary key(idMusic),
foreign key(idScenario) references cenario(idScenario));
