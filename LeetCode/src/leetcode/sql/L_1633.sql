select distinct a.contest_id, round(count(a.user_id) / (select count(1) from Users) * 100, 2) as 'percentage'
from Register a
         left join Users b on a.user_id = b.user_id
group by a.contest_id
order by percentage desc, contest_id asc;