select a.student_id, a.student_name, b.subject_name, count(c.subject_name) as 'attended_exams'
from Students a
         join Subjects b
         left join Examinations c on a.student_id = c.student_id
    and b.subject_name = c.subject_name
group by b.subject_name, a.student_id
order by a.student_id, b.subject_name