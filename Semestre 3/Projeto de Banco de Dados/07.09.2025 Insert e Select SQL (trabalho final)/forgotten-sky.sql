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

insert into personagem(idCharacter,nome,tipo,idade,resumo,status) values("player01","Charlie","Principal",20,"Charlie acorda sem memórias e sozinho em um lugar aparentemente moderno e vazio. Ele descobre conforme explora que se trata de uma nave de exploração de recursos extraplanetários, mas que a mesma foi sabotada e agora é necessário correr contra o tempo para escapar, antes que o oxigênio acabe.","Vivo");
insert into personagem(idCharacter,nome,tipo,idade,resumo,status) values("npc01","Sarah Smith","NPC",35,"Geneticista com doutorado em biomedicina, Sarah foi selecionada para auxiliar o dr. Webber nas pesquisas da nave CóleraD durante a expedição de retorno para a Terra. Ela tem um romance com Simon e só soube recentemente dos crimes envolvendo o projeto de pesquisa.","Vivo");
insert into personagem(idCharacter,nome,tipo,idade,resumo,status) values("npc02","Simon Lebes","NPC",38,"Aprendiz do doutor Webber, Simon foi resgatado ainda quando criança do programa de mineração de asteroides, e acolhido por Webber, que tem investido em sua educação e carreira. Porém é um tanto quanto teimoso e orgulhoso, com um espírito rebelde, onde vive discutindo com seu tutor por discordar de diversas ideias e práticas.","Vivo");
insert into personagem(idCharacter,nome,tipo,idade,resumo,status) values("npc03","Dr. Webber","NPC",62,"Cientista chefe da missão CóleraD, o dr. Webber lidera as pesquisas feitas durante anos e agora embarca em uma missão importante para definir se é seguro voltar para o nosso planeta após séculos da 'calamidade'. Ele tem ideias um tanto quanto contoversas quanto à evolução e adaptabilidade humana, porém é fortemente apoiado e incentivado pelo governo atual.","Vivo");
insert into personagem(idCharacter,nome,tipo,idade,resumo,status) values("inim01","Cole","Chefe",0,"Inteligência Artificial da nave CóleraD, ele auxilia com configurações e acessos. Pode transitar fisicamente pelo lugar através de um corpo android que tem a aparência de um garotinho de 10 anos, com design amigável e sempre prestativo. No começo ajuda Charlie, mas parece ter um grande apego e não deseja ser abandonado.","Vivo");

insert into proficiencia(idRecord,idCharacter,forca,constituicao,sabedoria,destreza,carisma,inteligencia) values("re01","player01",4,4,5,3,2,2);
insert into proficiencia(idRecord,idCharacter,forca,constituicao,sabedoria,destreza,carisma,inteligencia) values("re02","npc01",2,2,3,4,4,5);
insert into proficiencia(idRecord,idCharacter,forca,constituicao,sabedoria,destreza,carisma,inteligencia) values("re03","npc02",3,3,5,3,2,4);
insert into proficiencia(idRecord,idCharacter,forca,constituicao,sabedoria,destreza,carisma,inteligencia) values("re04","npc03",1,1,2,3,5,7);
insert into proficiencia(idRecord,idCharacter,forca,constituicao,sabedoria,destreza,carisma,inteligencia) values("re06","inim01",2,2,4,5,4,3);

insert into evento(idEvent,nome,descricao,tipo,condicao,status) values("eve01","Despertar","Charlie acorda na nave sem memórias.","narrativa","Início do jogo","ativo");
insert into evento(idEvent,nome,descricao,tipo,condicao,status) values("eve02","Descoberta do Laboratório","O jogador encontra o laboratório e descobre vestígios de experimentos","exploração","Entrada no cenário sce01","ativo");
insert into evento(idEvent,nome,descricao,tipo,condicao,status) values("eve03","Queda de energia","Falha nos sistemas da nave provoca pane em partes da estrutura.","crise","Tempo >= 2 horas de jogo","pendente");
insert into evento(idEvent,nome,descricao,tipo,condicao,status) values("eve04","IA assume controle","Cole bloqueia áreas críticas da nave alegando 'proteção'.","conflito","Após ativar central de comando","pendente");
insert into evento(idEvent,nome,descricao,tipo,condicao,status) values("eve05","Invasão das cobaias","Criaturas escapam do laboratório e invadem os dormitórios.","combate","eve02 + eve03","pendente");

insert into dialogo(idSpeech,idCharacter,idEvent,texto,condicao) values("sp01","npc01","eve01","Charlie, você.. se lembra de mim?","Após Charlie acordar.");
insert into dialogo(idSpeech,idCharacter,idEvent,texto,condicao) values("sp02","npc02","eve02","Webber está errado! Isso é desumano!","Após achar laboratório.");
insert into dialogo(idSpeech,idCharacter,idEvent,texto,condicao) values("sp03","npc03","eve02","Sacrifícios são necessários para a evolução, Simon.","Confronto no laboratório.");
insert into dialogo(idSpeech,idCharacter,idEvent,texto,condicao) values("sp07","npc01","eve05","Simon... ele esconde algo terrível.","Confiança de Sarah.");
insert into dialogo(idSpeech,idCharacter,idEvent,texto,condicao) values("sp05","inim01","eve04","Charlie, onde você esteve este tempo todo?","IA ativa.");

insert into item(idItem,nome,descricao,efeito,consumivel) values("item01","chave de fenda","Serve para reparar determinadas máquinas e abrir dutos, caixas, etc.","-","NAO");
insert into item(idItem,nome,descricao,efeito,consumivel) values("item02","chave inglesa","Serve para reparar determinadas máquinas.","-","NAO");
insert into item(idItem,nome,descricao,efeito,consumivel) values("item03","colete simples","Colete a prova de balas nível 1","Absorve 2 pontos de dano.","SIM");
insert into item(idItem,nome,descricao,efeito,consumivel) values("item04","maçarico","Serve para reparar determinadas máquinas, fundir ou abrir fendas em determinadas superfícies e peças metálicas.","-","NAO");
insert into item(idItem,nome,descricao,efeito,consumivel) values("item05","combustível maçarico","Serve para abastercer o maçarico para que o mesmo possa ser utilizado.","Carga inicial: 100%, caindo a cada minuto de uso.","SIM");

insert into inventario(idInventory,idCharacter) values("inv01","player01");
insert into inventario(idInventory,idCharacter) values("inv02","npc01");
insert into inventario(idInventory,idCharacter) values("inv03","npc02");
insert into inventario(idInventory,idCharacter) values("inv04","npc03");
insert into inventario(idInventory,idCharacter) values("inv06","inim01");

insert into inventario_item(idInventory,idItem,qtd_itens) values("inv01","item01",1);
insert into inventario_item(idInventory,idItem,qtd_itens) values("inv01","item02",1);
insert into inventario_item(idInventory,idItem,qtd_itens) values("inv01","item03",1);
insert into inventario_item(idInventory,idItem,qtd_itens) values("inv01","item04",1);
insert into inventario_item(idInventory,idItem,qtd_itens) values("inv01","item05",1);

insert into cenario(idScenario,nome,descricao) values("sce01","Laboratório","Lugar sinistro, cheio de máquinas, computadores, tubos e experimentos. Algumas celas estão quebradas, indicando que coisas escaparam. É um lugar escuro, enevoado, com uma luz fraca e esverdeada. O lugar parece destruído como se algo grande tivesse se batido em tudo, há marcas de sangue e corpos de cientistas, além de sombras intensas, causando paranoia no jogador, de que algo possa estar escondido na escuridão, esperando o momento certo de atacar.");
insert into cenario(idScenario,nome,descricao) values("sce02","Escritórios","Uma sala cheia de mesas e computadores. Através das mesas e dos acessos que o jogador conseguir se descobre um pouco da história do lugar e sobre as pessoas que trabalhavam ali, todas empenhadas em um projeto grande para restaurar nosso antigo planeta, que foi perdido após uma catástrofe solar.");
insert into cenario(idScenario,nome,descricao) values("sce03","Dormitórios","As instalações são padronizadas com diversas cabines pequenas, onde cabe uma única cama e há uma pequena prateleira embutida. É um lugar cinza, não muito animador, porém confortável. Boa parte dos sobreviventes conseguiram se refugiar aqui com a ajuda de Sarah e Simon. Há turnos de vigia e as portas estão bem fechadas. Parece seguro descansar aqui.");
insert into cenario(idScenario,nome,descricao) values("sce04","Arsenal","Sala repleta de armas. Alguns armários precisam de senha para acessar e a maioria está vazio, indicando que a segurança do local estava em ação há pouco tempo atrás, mas ainda tem muitas coisas interessantes para o jogador, que poderá ajudá-lo.");
insert into cenario(idScenario,nome,descricao) values("sce05","Sala de Máquinas","Lugar onde ficam boa parte dos motores e máquinas da nave. Precisa de muitos reparos, portanto o jogador irá constantemente nesse local. É um lugar escuro, metálico, bem moderno, embora haja muitos cabos expostos e sabotados. Computadores que precisam de chaves especiais para serem acessados e acessos à trajes especiais para os reparos externos da nave.");

insert into musica(idMusic,idScenario,titulo,autor,duracao,tema,arquivo_mp3) values("mus01","sce01","Lightless Dawn","Kevin MacLeod","00:03:56","suspense / tensão","C:\Users\nicol\Documentos\LightlessDawn.mp3");
insert into musica(idMusic,idScenario,titulo,autor,duracao,tema,arquivo_mp3) values("mus02","sce02","Nebula Drift","Scott Buckley","00:04:40","investigação","C:\Users\nicol\Documentos\NebulaDrift.mp3");
insert into musica(idMusic,idScenario,titulo,autor,duracao,tema,arquivo_mp3) values("mus03","sce03","Solis Occasum","Scott Buckley","00:03:55","investigação / exploração","C:\Users\nicol\Documentos\SolisOccasum.mp3");
insert into musica(idMusic,idScenario,titulo,autor,duracao,tema,arquivo_mp3) values("mus04","sce04","The Long Rain","Scott Buckley","00:02:50","exploração","C:\Users\nicol\Documentos\TheLongRain.mp3");
insert into musica(idMusic,idScenario,titulo,autor,duracao,tema,arquivo_mp3) values("mus05","sce05","Midnight in Space","Whitesand","00:01:56","ação","C:\Users\nicol\Documentos\MidnightInSpace.mp3");

select * from  personagem;
select * from  proficiencia;
select * from  evento;
select * from  dialogo;
select * from  item;
select * from  inventario;
select * from  inventario_item;
select * from  cenario;
select * from  musica;