select count(distinct device_id) as 'did_cnt', count(question_id) as 'question_cnt'
from question_practice_detail
where date between '2021-08-01' and '2021-08-31';