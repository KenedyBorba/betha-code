create database escolaCode;

create schema escolaCodeBetha;

CREATE TABLE escolaCodeBetha.paises(
	id int,
	nome varchar(80),
	populacao int,
	constraint pk_paises primary key (id)
);

CREATE TABLE escolaCodeBetha.estados(
	id int,
	nome varchar(80),
	populacao int,
	constraint pk_estados primary key (id),
	i_paises INT,
	CONSTRAINT FK_ESTADOS_PAISES
		FOREIGN KEY (i_paises)
			REFERENCES escolaCodeBetha.paises (ID)
);

CREATE TABLE escolaCodeBetha.cidades(
	id int,
	nome varchar(80),
	populacao int,
	constraint pk_cidades primary key (id),
	i_estados INT,
	CONSTRAINT FK_CIDADES_ESTADOS
		FOREIGN KEY (i_estados) 
			REFERENCES escolaCodeBetha.estados (ID)
);

CREATE TABLE escolaCodeBetha.alunos(
	id int,
	nome varchar(80),
	matricula int,
    dataNascimento date,
    constraint pk_alunos primary key (id),
    i_cidades INT,
    CONSTRAINT FK_ALUNOS_CIDADES
		FOREIGN KEY (i_cidades)
			REFERENCES escolaCodeBetha.cidades (ID)
);

CREATE TABLE escolaCodeBetha.professores(
	id int,
	nome varchar(80),
    dataNascimento date,
	constraint pk_professores primary key (id),
	i_cidades INT,
	CONSTRAINT FK_PROFESSORES_CIDADES
		FOREIGN KEY (i_cidades)
			REFERENCES escolaCodeBetha.cidades (ID)
);

CREATE TABLE escolaCodeBetha.materias(
	id int,
	descricao varchar(80),
	constraint pk_materia primary key (id)
);

CREATE TABLE escolaCodeBetha.turmas(
	id int,
	descricao varchar(80),
	constraint pk_turmas primary key (id),
	i_professores int,
	i_materias int,
	constraint FK_TURMAS_PROFESSORES
		foreign key (i_professores) 
			references escolaCodeBetha.professores (ID),
	constraint FK_TURMAS_MATERIAS
		foreign key (i_materias) 
			references escolaCodeBetha.materias (ID)
);

CREATE TABLE escolaCodeBetha.frequencias(
	id int,
	data_aula date,
    presenca boolean,
    constraint pk_frequencias primary key (id),
	i_turmas int,
    i_alunos int,
	CONSTRAINT fk_frequencias_turmas
		FOREIGN KEY (i_turmas) 
			REFERENCES escolaCodeBetha.turmas(id),
	CONSTRAINT fk_frequencias_alunos
		FOREIGN KEY (i_alunos) 
			REFERENCES escolaCodeBetha.alunos(id)
);
-- fl_presenca -> usar fl na frente quando for boolean
-- ------------------------------------
insert into escolaCodeBetha.paises values 
(1, 'Brasil', 200000000),
(2, 'Estados Unidos', 210000000);
select * from escolaCodeBetha.paises;

insert into escolaCodeBetha.estados values 
('1', 'Santa Catarina', 2000000, 1),
('2', 'Texas', 2100000, 2);
select * from escolaCodeBetha.estados;

insert into escolaCodeBetha.cidades values 
(1, 'Criciuma', 200000, 1),
(2, 'Dallas', 210000, 2),
(3, 'Florianopolis', 5000, 1);
select * from escolaCodeBetha.cidades;

insert into escolaCodeBetha.alunos values 
(1, 'Claudio', 5, '2003-10-30',1),
(2, 'Fernando', 6, '2002-11-15',2),
(3, 'Eduardo', 7, '2002-12-15',2),
(4, 'Joao', 8, '2002-11-15',2),
(5, 'Uilian', 9, '2002-11-15',3),
(6, 'Sabrina', 10, '2002-02-15',3),
(7, 'Natalia', 11, '2002-01-15',3),
(8, 'Richard', 12, '2002-01-15',3);
select * from escolaCodeBetha.alunos;

insert into escolaCodeBetha.professores values 
(1, 'Roberto', '1980-09-20',1),
(2, 'Rogerio', '1988-10-15',2);
select * from escolaCodeBetha.professores;

insert into escolaCodeBetha.materias values 
(1, 'Geografia'),
(2, 'Matematica');
select * from escolaCodeBetha.materias;

insert into escolaCodeBetha.turmas values 
(1, 'A-310', 1,1),
(2, 'B-440', 2,2),
(3, 'B-450', 2,2);
select * from escolaCodeBetha.turmas;

insert into escolaCodeBetha.frequencias values 
(1,'2021-06-05', true, 1, 1),
(2,'2021-06-05', false, 2, 2);
select * from escolaCodeBetha.frequencias;
-- ------------------------------------
-- 1) Criar um SQL que traga todos os alunos de uma cidade especifica. 
select
	a.nome as alunos,
	a.i_cidades as cidades
from
	escolacodebetha.alunos as a
where
	i_cidades = 2;
-- ------------------------------------
-- 2) Criar um SQL que traga todas as turmas de um determinado professor.
select
	t.descricao as turma,
	t.i_professores as professor
from
	escolaCodeBetha.turmas as t
where
	i_professores = 2;
-- ------------------------------------
-- 3) Criar um SQL que traga a quantidade de alunos por cidade onde a popula��o
-- for menor que 10 mil habitantes.
select
	COUNT(a.i_cidades) as quantidade_alunos,
	c.nome as cidades
from
	escolaCodeBetha.alunos as a
join escolaCodeBetha.cidades as c on
	a.i_cidades = c.id
where
	c.populacao < 10000
group by
	c.id

-- 4) Criar um SQL que traga as datas de nascimento de professores e alunos juntos.
select
	nome,
	nascimento_professores
from
	(
	select
		nome,
		dataNascimento as nascimento_professores
	from
		escolacodebetha.professores as p
union all
	select
		nome,
		dataNascimento as nascimento_alunos
	from
		escolacodebetha.alunos as a ) as juntos

-- 5) Criar um SQL que traga o nome da cidade e o nome do aluno na mesma consulta.
select
	c.nome as nomes,
	a.nome as alunos
from
	escolacodebetha.cidades as c
join escolacodebetha.alunos as a on
	a.i_cidades = c.id

-- 6) Criar um SQL que traga a quantidade de alunos que compareceram e que n�o 
-- compareceram �s aulas, por turma e em uma data espec�fica.
select
	count(*) as quantidade_alunos,
	presenca
from
	escolacodebetha.frequencias
where
	i_turmas = 1
	and data_aula = '2021-06-05'
group by
	presenca