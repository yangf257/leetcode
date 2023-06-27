select day (date) as 'day', count (*) as 'question_cnt'
from question_practice_detail
where date between '2021-08-01' and '2021-08-31'
group by day (date);