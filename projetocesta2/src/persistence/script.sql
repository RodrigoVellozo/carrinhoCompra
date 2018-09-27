drop database if exists o;
create database o;
use o;

create table vitrine(
	idVitrine int primary key auto_increment,
	nome varchar(50),
	preco float, 
	imagem varchar(255)

);


insert into vitrine values(null, 'bola', 59, 'bola.jpg');
insert into vitrine values(null, 'caneleira', 80, 'caneleira.jpg');
insert into vitrine values(null, 'camisa', 30, 'camisa.jpg');
insert into vitrine values(null, 'protetor bucal', 50, 'protetor.jpg');
insert into vitrine values(null, 'luvas mma', 99, 'luvas.jpg');

select * from vitrine;


create table cliente(
	idCliente int primary key auto_increment,
	nome varchar(50),
	email varchar(50),
	logradouro varchar(250),
	bairro varchar(80),
	cidade varchar(80),
	estado varchar(2),
	cep varchar(50),
	numero varchar(15)
);


create table produto(
	idProduto int primary key auto_increment,
	nome varchar(50) unique,
	preco float, 
	imagem varchar(255)

);

create table venda(
	idVenda varchar(50),
	id_cliente int,
	id_produto int,
	primary key(idVenda, id_cliente, id_produto),
	preco double,
	data datetime,
	foreign key(id_cliente)references cliente(idCliente),
	foreign key(id_produto)references produto(idProduto)
);


insert into produto (idProduto,nome,preco,imagem) select idVitrine,nome,preco,imagem  from vitrine;

	
insert into cliente values(10, 'prima', 'prima@gmail.com', 'av automovel club', 'chapadao', 'rio de janeiro','rj','26582020','98765432');

insert into venda values('venda01',10,1,59, now() );
insert into venda values('venda01',10,2,80, now() );
select * from venda;










