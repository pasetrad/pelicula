create table tbl_categoria(
id_              number(11),
descripcion     varchar2(50)not null
);

create table tbl_pelicula(
codigo          number(11),
precio          number(11) not null,
id_categoria    number(11) not null,
formato4k       varchar2(1) not null,
nombre          varchar2(50) not null
);

alter table tbl_categoria add constraint cat_pk
primary key (id_);

alter table tbl_pelicula add constraint pel_pk 
primary key (codigo);

alter table tbl_pelicula add constraint catPel_fk
foreign key (id_categoria) references tbl_categoria (id_);


INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('1', 'Drama');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('2', 'Comedia');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('3', 'Romance');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('4', 'Acción');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('5', 'Ciencia Ficción');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('6', 'Fantasía');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('7', 'Terror');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('8', 'Musical');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('9', 'Suspenso');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('10', 'Bélico');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('11', 'Melodrama');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('12', 'Porno');
INSERT INTO TBL_CATEGORIA (ID_, DESCRIPCION) VALUES ('13', 'Animé');

/*Scripts de  taller 3  para realizar las consultas de prueba.

SELECT codigo,nombre,descripcion,precio,formato4k  FROM TBl_categoria cat join tbl_pelicula peli
on cat.ID_=peli.id_categoria ORDER BY codigo ASC;

SELECT codigo,nombre,descripcion,precio,formato4k  FROM TBl_categoria cat join tbl_pelicula peli
on cat.ID_=peli.id_categoria where cat.ID_=1 ORDER BY codigo ASC;

SELECT codigo,nombre,descripcion,precio,formato4k  FROM TBl_categoria cat join tbl_pelicula peli
on cat.ID_=peli.id_categoria where peli.codigo=2;

update tbl_pelicula  set nombre='Batman2', id_categoria=1, precio=500, formato4k='s' where codigo=3;

SELECT codigo,nombre,descripcion,precio,formato4k FROM TBl_categoria cat join tbl_pelicula peli 
on cat.ID_=peli.id_categoria ORDER BY codigo ASC;
*/