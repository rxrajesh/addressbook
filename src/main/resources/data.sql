INSERT INTO Contact (id, firstName, lastName, middleInitial, emails, dob)
VALUES
    (1, 'John', 'Doe', 'A', 'john.doe@example.com,johndoe@gmail.com', '1990-01-01'),
    (2, 'Jane', 'Smith', 'B', 'jane.smith@example.com', '1995-05-15');

INSERT INTO Address (id, contact_id, street, city, state, zip, country) VALUES
(1, 1, '123 Main Street', 'Anytown', 'AnyState', '12345', 'USA'),
(2, 1, '456 Street 2 ', 'town2', 'MN', '9999', 'USA'),
(3, 2, '23  Main Street', 'Anytown', 'AnyState', '12346', 'USA'),
(4, 2, '23  Main Street', 'Anytown', 'AnyState', '12346', 'USA');

INSERT INTO ContactGroup (id, contact_id, groupName,groupDescription) VALUES
(1,1,'ALL','All contacts'),
(2,2,'ALL','All contacts');

INSERT INTO PhoneNumber (id, contact_id,phoneNumber,phoneType) VALUES
(1,1,'952-999-5656','CELL'),
(2,1,'666-888-9999', 'home'),
(3,2,'852-777-5656','CELL'),
(4,2,'866-222-9999', 'home');
