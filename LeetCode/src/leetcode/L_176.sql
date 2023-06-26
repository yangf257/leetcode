--不去重
select salary as 'SecondHighestSalary'
from Employee
order by salary desc limit 1,1;

--去重
select max(salary) as 'SecondHighestSalary'
from Employee
where salary < (select max(salary) from Employee);

select ifnull((select distinct salary from Employee order by salary desc limit 1, 1),null) as 'SecondHighestSalary';