select a.name
from Employee a
         left join Employee b on a.id = b.managerId
group by b.managerId
having count(b.managerId) >= 5