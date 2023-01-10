create database users;
use users;
create table registration(name varchar(40), age int, gender char(10), address varchar(100), 
mobile varchar(10), email varchar(40), username varchar(20),password varchar(15));

desc registration;

select * from registration;