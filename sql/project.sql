CREATE TABLE project
(

	badgeid CHAR(4),
	code_project CHAR(4),
	name_project VARCHAR(50) NOT NULL,
	
	PRIMARY KEY(code_project),
	foreign key (badgeid) references developer(badgeid)

);
