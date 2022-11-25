create database mydb;
use mydb;
create table CUSTOMER ( Cust_id varchar(5) primary key, Fname varchar(15) not null, Lname varchar(15), Area char(2), Phone int(10));
insert into CUSTOMER VALUES
  ('A01','Ivan','Ross','SA', 6125467),
  ('A01','Ivan','Ross','SA', 6125467),
  ('A02','Vandana','Ray','MU', 5560379),
  ('A03','Pramada','Jauguste','DA', 4560389),
  ('A04','Basu','Navindi','BA', 6125401),
  ('A05','Ravi','Shridhar','NA', null),
  ('A06','Rukmini','Aiyer','GH', 5125274);

create table Movie (Mv_no int(5) primary key, Cust_id varchar(5), Title varchar(15) not null, Star varchar(15) not null, price int(10) between 100 and 250);
insert into CUSTOMER VALUES
  (1, 'A02','Bloody','JC',181),
  (2, 'A04','The Firm','TC',200),
  (3, 'A01','Pretty Woman','RG',151),
  (4, 'A06','Home Alone','MC',150),
  (5, 'A05','The Fugitive','MF',200),
  (6, 'A03','Coma','MD',200),
  (7, 'A02','Dracula','GO',150),
  (8, 'A06','Quick Change','BM',100),
  (9, 'A03','Gone with the Wind','CB',200),
  (10, 'A05','Carry on Doctor','LP',100);

alter table Movie add constraint fk_custId foreign key(Cust_id) references CUSTOMER(Cust_id);
select Title from Movie where price between 100 and 200;
select Cust_id from Movie where Star in(JC, TC, MC);
select * from Customer where price between 100 and 200;
select * from Customer where Fname like 'A%';
select Title from Movie where Price <= 180 and length (Title) = 6;
select Title, Price, Price +(Price*10)/100 as 'Incremented_Price from Movie;
select concat (Fname, concat('Stays in ', concat ('his phone no is ', concat(Phone)))) from CUSTOMER where Fname='Ivan';
alter table customer modify Fname varchar(25) not null;
select Fname from CUSTOMER  where phone=null;
select distinct Cust_id from CUSTOMER;
alter table Movie modify star varchar(6);
delete from Movie where Title='Bloody';
drop table CUSTOMER;
drop table Movie;
alter table Movie drop foreign key fk_custId; 