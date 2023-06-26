select a.device_id, a.question_id, a.result
from question_practice_detail a,
     user_profile b
where b.university = '浙江大学'
  and a.device_id = b.device_id;