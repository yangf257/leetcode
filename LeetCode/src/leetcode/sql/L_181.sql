select a.name as 'Employee'
from Employee a
where salary > (select salary from Employee b where b.id = a.managerId);


SELECT *
FROM Employee AS a,
     Employee AS b
WHERE a.ManagerId = b.Id
  AND a.Salary > b.Salary
;

