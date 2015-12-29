INSERT INTO person (
    first_name,
    last_name,
    email_address,
    street_address,
    city,
    state,
    zip_code
) VALUES (
    'John',
    'Smith',
    'fake1@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801'
), (
    'Jane',
    'Smith',
    'fake2@aquent.com',
    '123 Any St.',
    'Asheville',
    'NC',
    '28801'
);



Insert into client(
	name,
    street_address,
    city ,
    state ,
    zip_code , 
    phone_number ,
    uri 
)values(
	'Some Store',
	'123 Some Street',
	'Asheville',
	'Nc',
	'28801',
	'1111111111',
	'www.someAddress.com'
)



INSERT INTO associations(
	person_id, 
	client_id
)values(
	1,
	2
	

)
