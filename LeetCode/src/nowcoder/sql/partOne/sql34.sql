select a.device_id,
       a.university,
       count(b.question_id) as 'question_cnt', sum(if(b.result = 'right', 1, 0)) as 'right_question_cnt'
from user_profile a
         left join question_practice_detail b on a.device_id = b.device_id
    and b.date between '2021-08-01' and '2021-08-31'
where a.university = '复旦大学'
group by a.device_id;

-- 如果写在where中，是对连接好的表进行判断，如果是用user表left join question表，由于question表里没有4321用户的记录，
-- 那么连接好的表中的id为4321的用户是没有date值的，也就是date为空，所以在执行where b.date between '2021-08-01' and '2021-08-31'的时候会除掉4321这行记录，
-- 所以最后的结果里就没有这个id的记录啦！
-- 主要是要理解：
-- 1.先执行from，再执行where，where中的操作是对连接好的表的操作；
-- 2.a左连接b，对于a有而b没有的id，则连接好的表中的这些id的b相关的属性值为空。