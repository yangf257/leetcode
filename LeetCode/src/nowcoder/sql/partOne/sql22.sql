select university, count(b.question_id) / count(distinct b.device_id) as 'avg_answer_cnt'
from user_profile a,
     question_practice_detail b
where a.device_id = b.device_id
group by university;