-- employee list
insert into Employee(employee_id,first_name,last_name,email) values (1,'Mukesh','Kumar','mukesh@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (2,'Anand','Kumar','anand@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (3,'Dilip','Kumar','dilip@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (4,'Manikant','Kumar','manikant@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (5,'Rakesh','Kumar','rakesh@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (6,'Ayush','Kumar','ayush@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (7,'Gopal','Kumar','gopal@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (8,'Meena','Kumar','meena@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (9,'Mahesh','Kumar','mahesh@gmail.com');
insert into Employee(employee_id,first_name,last_name,email) values (10,'Aditya','Kumar','aditya@gmail.com');

--project list
insert into PROJECT(project_id,project_name,project_stage,description) values(1001,'Development','INPROGRESS',
'this prject is in building state.');
insert into PROJECT(project_id,project_name,project_stage,description) values(1002,'Production','COMPLETED',
'this prject is successfuly build.');
insert into PROJECT(project_id,project_name,project_stage,description) values(1003,'Critical Security','INPROGRESS',
'this prject is very critcal and on running state');
insert into PROJECT(project_id,project_name,project_stage,description) values(1004,'Future Risk','NOTSTARTED',
'this prject is going to launch in next build.');

--project employee mapping

insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1001,1);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1001,2);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1001,3);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1002,1);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1002,5);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1002,10);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1003,4);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1003,6);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1003,7);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1004,8);
insert into PROJECT_EMPLOYEE(project_id,employee_id) values (1004,9);
