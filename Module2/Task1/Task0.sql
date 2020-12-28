CREATE DATABASE if not exists ListExpenses
  CHARACTER SET utf8
  COLLATE utf8_general_ci;

create table if not exists ListExpenses.receivers
(
num int, 
name varchar (255),
primary key (num)
);

create table if not exists ListExpenses.expenses 
(
	num int,
    paydate Date,
    receiver int,
    value decimal
    , primary key(num)
);

insert into ListExpenses.expenses (num, paydate, value, receiver) values 
(1, '2011-5-10',20000,1),
(2, '2011-5-10',94200.0,2),
(3, '2011-5-11',10000,3),
(4, '2011-5-11',12950,2)
;

