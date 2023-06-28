select difficult_level, sum(if(result = 'right', 1, 0)) / count(b.question_id) as 'correct_rate'
from user_profile a
         right join question_practice_detail b on a.device_id = b.device_id
         left join question_detail c on b.question_id = c.question_id
where university = '浙江大学'
group by difficult_level
order by correct_rate asc;