create table ideas_pool
(
	id               bigserial               not null
            constraint ideas_pool_pk
                primary key,
	name varchar(300) not null,
	description varchar(2000),
	author_name varchar(240) not null,
    author_profile_image_url text,
    likes int default 0,
	created_at timestamp not null,
	updated_at timestamp default CURRENT_DATE
);

create unique index ideas_pool_id_uindex
    on ideas_pool (id);
