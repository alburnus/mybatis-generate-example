create database team;
create user teamuser with encrypted password 'secret';
grant all privileges on database team to teamuser;

-- CREATE TABLES
-- Team
CREATE TABLE public.team
(
  id SERIAL PRIMARY KEY,
  name character varying(255) COLLATE pg_catalog."default"
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.team
  OWNER to teamuser;

-- Teammate
CREATE TABLE public.teammate
(
  id SERIAL PRIMARY KEY,
  name character varying(255) COLLATE pg_catalog."default",
  team_id bigint,
  CONSTRAINT fko2eamonl4lewb1jsvvslmpmj8 FOREIGN KEY (team_id)
  REFERENCES public.team (id) MATCH SIMPLE
  ON UPDATE NO ACTION
  ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.teammate
  OWNER to teamuser;

INSERT INTO team (id, name) VALUES (1, 'TEAM A');
INSERT INTO team (id, name) VALUES (2, 'TEAM B');
INSERT INTO team (id, name) VALUES (3, 'TEAM C');
INSERT INTO team (id, name) VALUES (4, 'TEAM D');
INSERT INTO team (id, name) VALUES (5, 'TEAM E');


INSERT INTO teammate (id, name, team_id) VALUES (1, 'Adam', 1);
INSERT INTO teammate (id, name, team_id) VALUES (2, 'Ewa', 1);
INSERT INTO teammate (id, name, team_id) VALUES (3, 'Jasiu', 2);
INSERT INTO teammate (id, name, team_id) VALUES (4, 'Celina', 2);
INSERT INTO teammate (id, name, team_id) VALUES (5, 'Helga', 2);
