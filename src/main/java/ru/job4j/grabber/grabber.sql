create table rabbit (
	id SERIAL PRIMARY KEY,
	created_date BIGINT
);

create table post (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    text VARCHAR(255),
    link VARCHAR (255) UNIQUE ,
    created_date TIMESTAMP 
);