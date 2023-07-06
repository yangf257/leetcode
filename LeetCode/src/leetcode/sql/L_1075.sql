select a.project_id, round(sum(b.experience_years) / count(a.employee_id), 2) as 'average_years'
from Project a
         left join Employee b on a.employee_id = b.employee_id
group by a.project_id