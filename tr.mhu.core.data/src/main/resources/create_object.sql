create table if not exists hi
(
	oid varchar(36) not null
		constraint hi_pk
			primary key,
	name varchar(50) not null,
	email varchar(50) not null,
	message text
);
