create table game (
  id bigserial not null,
  name varchar(50) not null,
  description varchar(512),
  primary key (id)
);