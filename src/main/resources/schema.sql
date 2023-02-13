create table if not exists fighter (
    id identity,
    name varchar(50) not null,
    damagePerHit int not null,
    health int not null,
    resistance numeric not null,
    animeFrom varchar(50) not null,
    createdAt timestamp not null
);