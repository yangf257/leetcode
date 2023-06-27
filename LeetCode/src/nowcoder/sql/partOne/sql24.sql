select university, difficult_level, count(b.question_id) / count(distinct b.device_id)
from question_practice_detail b
         left join user_profile a on a.device_id = b.device_id
         left join question_detail c on b.question_id = c.question_id
where a.university = '山东大学'
group by difficult_level;