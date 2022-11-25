create database mydb;
use mydb;
create table CUSTOMER (
  Cust_id varchar(5), 
  Fname varchar(15), 
  Lname varchar(15), 
  Area char(2), 
  Phone int(10), 
  DOB date, 
  Payment numeric(6, 2)
);
insert into CUSTOMER VALUES
  ('A01', 'Ivan', 'Ross', 'SA', 6125467, 1986 - 01 - 15, 800.50), 
  ('A01', 'Ivan', 'Ross', 'SA', 6125467, 1986 - 01 - 15, 800.50), 
  ('A02', 'Vandana', 'Ray', 'MU', 5560379, 1987 - 12 - 20, 1000.70), 
  ('A03', 'Pramada', 'Jauguste', 'DA', 4560389, 1967 - 08 - 25, 800.50), 
  ('A04', 'Basu', 'Navindi', 'BA', 6125401, 1956 - 02 - 30, 860.00), 
  ('A05', 'Ravi', 'Shridhar', 'NA', null, 1989 - 02 - 15, 500.50), 
  ('A06', 'Rukmini', 'Aiyer', 'GH', 5125274, 1987 - 08 - 23, 1500.50);
desc CUSTOMER;
select * from CUSTOMER;
alter table CUSTOMER add New_Date date;
select New_Date from CUSTOMER;
update CUSTOMER set Phone = 3564737 where Cust_id = 'A02' and Cust_id = 'A04';
select * from CUSTOMER;
delete from CUSTOMER where Cust_id = 'A01' and Cust_id = 'A05';
truncate table CUSTOMER;
insert into CUSTOMER VALUES 
  ('C1', 'arnab', 'biswas', 'SA', 612467, 1986 - 01 - 15, 600.50), 
  ('C2', 'ankita', 'saha', 'SA', 61267, 1986 - 01 - 15, 500.50), 
  ('C3', 'arpita', 'mondal', 'MU', 55379, 1987 - 12 - 20, 600.70), 
  ('C4', 'sneha', 'das', 'DA', 45689, 1967 - 08 - 25, 700.50), 
  ('C5', 'payel', 'datta', 'BA', 612401, 1956 - 02 - 30, 760.00);
update CUSTOMER set Lname = 'Mondal' where Cust_id = 'C1';
delete from CUSTOMER where Fname = 'arnab';
