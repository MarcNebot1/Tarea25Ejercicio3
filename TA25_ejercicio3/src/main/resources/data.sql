DROP table IF EXISTS almacen;
DROP table IF EXISTS cajas;





create table almacen(
	id int  auto_increment PRIMARY KEY,
	lugar varchar(100),
	capacidad  int DEFAULT NULL
);

CREATE TABLE `cajas` (
  id int(5),
  contenido varchar(100) DEFAULT NULL,
  valor int DEFAULT NULL,
  almacen_id int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT almacen_fk FOREIGN KEY (almacen_id) REFERENCES almacen (id)
);



insert into almacen (lugar, capacidad) values('c/reus n10' ,123456789);
insert into almacen (lugar, capacidad) values('c/reus n11' ,99999999);
insert into almacen (lugar, capacidad) values('c/reus n12' ,12344444);
insert into almacen (lugar, capacidad) values('c/reus n13' ,34335444);
insert into almacen (lugar, capacidad) values('c/reus n14' ,5454353);
insert into almacen (lugar, capacidad) values('c/reus n15' ,125345349);

insert into cajas (id, contenido, valor, almacen_id) values (12345,'juguetes',122,1);
insert into cajas (id, contenido, valor, almacen_id)  values (54321,'piezas',345,2);
insert into cajas (id, contenido, valor, almacen_id)  values (13579,'cuadros',232,3);
insert into cajas (id, contenido, valor, almacen_id)  values (24681,'utensilios',334,4);
insert into cajas (id, contenido, valor, almacen_id)  values (23456,'herramientas',354,5);
insert into cajas (id, contenido, valor, almacen_id)  values (34567,'adornos',876,6);


