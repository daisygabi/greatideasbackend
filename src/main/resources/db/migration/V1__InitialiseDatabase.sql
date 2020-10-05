create table ideas_pool
(
	id               bigserial               not null
            constraint ideas_pool_pk
                primary key,
	name varchar(300) not null,
	text varchar(2000),
	owner_name varchar(240) not null,
    owner_image text,
    likes int default 0,
    comments int default 0,
    image text,
	created_at timestamp not null,
	updated_at timestamp default CURRENT_DATE
);

create unique index ideas_pool_id_uindex
    on ideas_pool (id);
