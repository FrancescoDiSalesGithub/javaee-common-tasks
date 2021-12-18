create table assignmentproject
(

	badgeid char(4),
	code_project char(4),
	
	foreign key(badgeid) references developer(badgeid),
	foreign key(code_project) references project(code_project)


);
