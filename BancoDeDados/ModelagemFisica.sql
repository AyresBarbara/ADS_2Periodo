create database db_universidade;
use db_universidade;
create table tb_professores( 
`cpf_professor` varchar(11) not null, 
`nome_completo_professor` varchar(255) not null, 
`email_professor` varchar(100) not null,
`endereco_professor` varchar(255) not null,
`telefone_professor`varchar(11) not null,
PRIMARY KEY(`cpf_professor`)
);
create table `tb_alunos`(
`cpf_aluno` varchar(11) not null,
`nome_comnpleto_aluno` varchar(255) not null,
`email_aluno` varchar(100) not null,
`endereco_aluno` varchar(255) not null,
`data_nascimento_aluno`date not null,
`telefone_aluno` varchar(11) not null,
PRIMARY KEY(`cpf_aluno`)
);
create table tb_disciplinas(
`codigo_disciplina`varchar(10) not null,
`nome_disciplina` varchar(100) not null,
`carga_horaria_disciplina` int,
PRIMARY KEY (`codigo_disciplina`)
);
create table tb_avaliacao(
`cpf_aluno` varchar(11) not null,
`cpf_professor` varchar(11) not null,
`codigo_disciplina`varchar(10) not null,
`nota_avaliacao`decimal(10, 2),
`codigo_avaliacao`varchar(10) not null,
`data_avaliacao`date,
PRIMARY KEY (`codigo_avaliacao`),
FOREIGN KEY(`cpf_aluno`) references tb_alunos(`cpf_aluno`),
FOREIGN KEY(`cpf_professor`) references tb_professores(`cpf_professor`),
FOREIGN KEY(`codigo_disciplina`) references tb_disciplinas(`codigo_disciplina`)
ON DELETE CASCADE
);
create table tb_matricula(
`cpf_aluno` varchar(11) not null,
`codigo_disciplina`varchar(10) not null,
`codigo_matricula`varchar(10) not null,
`data_matricula`date not null,
primary key(`codigo_matricula`),
FOREIGN KEY(`cpf_aluno`) references tb_alunos(`cpf_aluno`),
FOREIGN KEY(`codigo_disciplina`) references tb_disciplinas(`codigo_disciplina`)
);