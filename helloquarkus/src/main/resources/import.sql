-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');

insert into equipe (nome, pais) values('Flamengo', 'Brasil');
insert into equipe (nome, pais) values('Real Madrid', 'Espanha');
insert into equipe (nome, pais) values('Manchester United', 'Inglaterra');
insert into equipe (nome, pais) values('PSG', 'França');
insert into equipe (nome, pais) values('Bayern de Munique', 'Alemanha');


insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(3, 'Michael Jordan', 50, 2.16, '258', 'Basquete');
insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(1, 'Pedro', 25, 1.85, '123', 'Futebol');
insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(2, 'Rafael Nadal', 36, 1.85, '457', 'Tenis');
insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(5, 'Giba', 46, 1.92, '222', 'Volei');
insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(4, 'Lionel Messi', 35, 1.69, '267', 'Futebol');
insert into Atleta (id_equipe, nome, idade, altura, cpf, esporte) values(4, 'Neymar Jr', 30, 1.74, '777', 'Futebol');

