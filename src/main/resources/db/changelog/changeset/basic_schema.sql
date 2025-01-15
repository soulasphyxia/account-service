create table if not exists public.user(
    id bigserial primary key,
    username varchar(32) not null,
    birthday date not null,
    description varchar(255) not null,
    email varchar(255) not null,
    password varchar(128) not null,
    created_at timestamptz not null default current_timestamp,
    updated_at timestamptz not null default current_timestamp
)