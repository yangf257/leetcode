select university, difficult_level, count(b.question_id) / count(distinct b.device_id) as 'avg_answer_cnt'
from user_profile a,
     question_practice_detail b,
     question_detail c
where a.device_id = b.device_id
  and b.question_id = c.question_id
group by university, difficult_level;