CREATE TABLE Contact (
    id INT PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    middleInitial VARCHAR(1),
    emails VARCHAR(500),
    dob DATE
);

CREATE TABLE PhoneNumber (
    id INT PRIMARY KEY,
    phoneNumber VARCHAR(20),
    phoneType   VARCHAR(10),
    contact_id INT,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);
CREATE TABLE Address (
    id INT PRIMARY KEY,
    street VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip VARCHAR(20),
    country VARCHAR(50),
    contact_id INT,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);
CREATE TABLE ContactGroup (
    id INT PRIMARY KEY,
    groupName VARCHAR(255),
    groupDescription VARCHAR(255),
    contact_id INT,
    FOREIGN KEY (contact_id) REFERENCES Contact(id)
);