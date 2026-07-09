-- migrations para criar a coluna de divisao na tabela cadastro
alter table TB_CADASTRO
add column divisao VARCHAR(255);