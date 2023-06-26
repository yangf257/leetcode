select university, avg(question_cnt) as 'avg_question_cnt', avg(answer_cnt) as 'avg_answer_cnt'
from user_profile
group by university
having avg_question_cnt < 5
    or avg_answer_cnt < 20;

--聚合函数的筛选只能用having，不能用where