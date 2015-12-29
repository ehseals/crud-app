CREATE TABLE person (
    person_id integer IDENTITY,
    first_name varchar(50) NOT NULL,
    last_name varchar(50) NOT NULL,
    email_address varchar(50) NOT NULL,
    street_address varchar(50) NOT NULL,
    city varchar(50) NOT NULL,
    state varchar(2) NOT NULL,
    zip_code varchar(5) NOT NULL, 
   
);


create TABLE client(
	client_id integer IDENTITY,
    name varchar(50) NOT NULL,
    street_address varchar(50) NOT NULL,
    city varchar(50) NOT NULL,
    state varchar(2) NOT NULL,
    zip_code varchar(5) NOT NULL, 
    phone_number varchar(30) NOT NULL,
    uri varchar(75) NOT NULL

)

CREATE TABLE associations(
	person_id integer,
	client_id integer,
);