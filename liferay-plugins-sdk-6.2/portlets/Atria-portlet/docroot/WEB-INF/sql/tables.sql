create table vega_Contact (
	personId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	nickName VARCHAR(75) null,
	birthday DATE null,
	age INTEGER,
	friend BOOLEAN,
	relative BOOLEAN,
	image BLOB
);

create table vega_Foo (
	personId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	nickName VARCHAR(75) null,
	birthday DATE null,
	age INTEGER,
	friend BOOLEAN,
	relative BOOLEAN,
	image BLOB
);